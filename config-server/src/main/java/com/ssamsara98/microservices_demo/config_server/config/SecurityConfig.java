package com.ssamsara98.microservices_demo.config_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
public class SecurityConfig {

	//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring()
//			.antMatchers("/actuator/**")
//			.antMatchers("/encrypt/**")
//			.antMatchers("/decrypt/**");
//		super.configure(web);
//	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web
			.ignoring()
			.antMatchers("/actuator/**")
			.antMatchers("/encrypt/**")
			.antMatchers("/decrypt/**");
	}
}
