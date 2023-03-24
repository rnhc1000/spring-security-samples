package com.jdriven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.data.repository.query.SecurityEvaluationContextExtension;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
public class QuerySecurityConfiguration {
	@Bean
	SecurityEvaluationContextExtension securityEvaluationContextExtension() {
		return new SecurityEvaluationContextExtension();
	}
}
