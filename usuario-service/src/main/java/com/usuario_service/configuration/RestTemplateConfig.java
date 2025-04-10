package com.usuario_service.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	@LoadBalanced  //En caso de usar balanceo de carga
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
