package com.test.postgresql.springbootpostgresql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	 @Bean
	    RestTemplate restTemplate() {
	        RestTemplate restTemplate = new RestTemplate();
	        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
	        return restTemplate;
	    }

	
}
