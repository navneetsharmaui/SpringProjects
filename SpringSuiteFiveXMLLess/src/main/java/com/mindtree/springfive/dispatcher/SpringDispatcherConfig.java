/**
 * 
 */
package com.mindtree.springfive.dispatcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

/**
 * @author M1044357
 *
 */
@EnableWebMvc
@ComponentScan(basePackages="com.mindtree.springfive")
@Configuration
public class SpringDispatcherConfig implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolverA = new InternalResourceViewResolver();
		
		viewResolverA.setPrefix("/WEB-INF/jsp/");
		viewResolverA.setSuffix(".jsp");
		viewResolverA.setOrder(1);
		
		return viewResolverA;
	}
	
	@Bean
	public ResourceBundleViewResolver bundleViewResolver() {
		ResourceBundleViewResolver viewResolverB = new ResourceBundleViewResolver();
		
		viewResolverB.setBasename("config.views");
		viewResolverB.setOrder(0);
		return viewResolverB;
	}
}
