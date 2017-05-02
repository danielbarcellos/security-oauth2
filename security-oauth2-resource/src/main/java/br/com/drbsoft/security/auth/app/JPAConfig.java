package br.com.drbsoft.security.auth.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"br.com.drbsoft.security.auth.repository"})
@EntityScan(basePackages = {"br.com.drbsoft.security.auth.domain"})
@EnableSpringDataWebSupport
public class JPAConfig {
	
	
}
