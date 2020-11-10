package com.hst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBean {

	@Bean
	public BeanClass beanClass() {
		return new BeanClass();
	}
}
