package com.ama.springdemojavaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.ama.springdemojavaconfiguration")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	/******** add support to resolve ${...} properties for  Spring 4.2 and lower *********
	    @Bean
	    public static PropertySourcesPlaceholderConfigurer
	                    propertySourcesPlaceHolderConfigurer() {
	        
	        return new PropertySourcesPlaceholderConfigurer();
	    } 
	 */
	
	/*
	 *  Define method to expose bean ==> no component scan each bean will be defined individually 
	 *  
	 * */
	
    
	// Define bean for happy fortune service 
	@Bean 
	public FortuneService happyFortuneService( ) {
		return new HappyFortuneService();
	}
	
	// define bean for swim AND inject dependency by constructor 
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
