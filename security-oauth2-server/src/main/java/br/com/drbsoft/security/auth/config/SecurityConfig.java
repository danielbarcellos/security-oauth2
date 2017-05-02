package br.com.drbsoft.security.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Value("${ldap.user.search.filter}")
	private String ldapUserSearchFilter;
	
	@Value("${ldap.user.search.base}")
	private String ldapUserSearchBase;
	
	@Value("${ldap.manager.password}")
	private String ldapManagerPassword;
	
	@Value("${ldap.manager.dn}")
	private String ldapManagerDn;
	
	@Value("${ldap.url}")
	private String ldapUrl;
	
	@Autowired
	private LdapAuthoritiesPopulator ldapAuthoritiesPopulator;
	
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	
    	auth
		.ldapAuthentication()
			.ldapAuthoritiesPopulator(ldapAuthoritiesPopulator)
			.contextSource()
			.url(ldapUrl)
			.managerDn(ldapManagerDn)
			.managerPassword(ldapManagerPassword)
			.and()
			.userSearchBase(ldapUserSearchBase)
			.userSearchFilter(ldapUserSearchFilter);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}