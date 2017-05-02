package br.com.drbsoft.security.auth.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import br.com.drbsoft.security.auth.common.LocalizedDefaultTokenServices;

@Configuration
@EnableResourceServer
public class OAuth2Config extends ResourceServerConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Value("${auth.uriPattern}")
	private String uriPattern;
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http
			.requestMatchers()
			.antMatchers(HttpMethod.GET, uriPattern)
			.antMatchers(HttpMethod.POST, uriPattern)
			.antMatchers(HttpMethod.PUT, uriPattern)
			.antMatchers(HttpMethod.DELETE, uriPattern)
			.and()
			.authorizeRequests()
			.antMatchers(HttpMethod.GET,uriPattern).access("#oauth2.hasScope('exibicao') and hasAnyRole('ROLE_COLABORACAO', 'ROLE_CONTROLE_TOTAL')")
			.antMatchers(HttpMethod.POST,uriPattern).access("#oauth2.hasScope('criacao') and hasAnyRole('ROLE_COLABORACAO', 'ROLE_CONTROLE_TOTAL')")
			.antMatchers(HttpMethod.PUT,uriPattern).access("#oauth2.hasScope('atualizacao') and hasAnyRole('ROLE_COLABORACAO', 'ROLE_CONTROLE_TOTAL')")
			.antMatchers(HttpMethod.DELETE,uriPattern).access("#oauth2.hasScope('exclusao') and hasAnyRole('ROLE_COLABORACAO', 'ROLE_CONTROLE_TOTAL')")
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
			.and()
			.authorizeRequests()
			.anyRequest()
			.permitAll()
			;
	}
	
	@EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled = true)
    public static class GlobalSecurityConfiguration extends GlobalMethodSecurityConfiguration {
    	public GlobalSecurityConfiguration() {
		}
        @Override
        protected MethodSecurityExpressionHandler createExpressionHandler() {
            return new OAuth2MethodSecurityExpressionHandler();
        }

    }
	
	@Override
	public void configure(final ResourceServerSecurityConfigurer config) {
		final DefaultTokenServices defaultTokenServices = new LocalizedDefaultTokenServices();
		defaultTokenServices.setTokenStore(tokenStore());
		config.tokenServices(defaultTokenServices);
	}
	
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
	    JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
	    converter.setSigningKey("123");
	    return converter;
	}
	
//	@Bean
//	@ConfigurationProperties("tokenStore.datasource")
//	public DataSource tokenStoreDataSource() {
//		 return tokenStoreDataSourceProperties().initializeDataSourceBuilder().build();
//	}
//	
//	@Bean
//	@ConfigurationProperties("tokenStore.datasource")
//	public DataSourceProperties tokenStoreDataSourceProperties(){
//		return new DataSourceProperties();
//	}

//	@Bean
//	public TokenStore tokenStore() {
//		return new JdbcTokenStore(dataSource);
//	}
	
	@Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }
}