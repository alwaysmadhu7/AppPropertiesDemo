package com.appprop.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import static java.lang.System.*;
//Make use of static import

@SpringBootApplication
public class AppPropertiesDemoApplication {

	/*@Bean
	public SamplePropertiesByValue myBean() {
		return new SamplePropertiesByValue();
	}*/

/*
 * We've already defined @Confiration
 * 
 ***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'myCompanyProperties', defined in com.appprop.demo.AppPropertiesDemoApplication, could not be registered. A bean with that name has already been defined in file [D:\Pwc\AppPropertiesDemo\target\classes\com\appprop\demo\MyCompanyProperties.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	@Bean
	public MyCompanyProperties myCompanyProperties() {
		return new MyCompanyProperties();
	}*/
	
	/*@Bean
	public MyCompanyProperties myCompanyProperties() {
		return new MyCompanyProperties();
	}*/
	
	public static void main(String[] args) {
		/// SpringApplication.run(AppPropertiesDemoApplication.class, args);
	/*	ConfigurableApplicationContext applicationContext = SpringApplication.run(AppPropertiesDemoApplication.class,
				args);
		SampleProperties sampleProperties = applicationContext.getBean(SampleProperties.class);
		out.println(sampleProperties.toString());
		sampleProperties.getListMapObject();*/
		
	/*	SamplePropertiesByValue propertiesByValue=
		applicationContext.getBean(SamplePropertiesByValue.class);
		 out.println(propertiesByValue.toString());*/

		// ConfigurableApplicationContext applicationContext= SpringApplication.run(MyCompanyProperties.class, args);
		// MyCompanyProperties companyProperties=applicationContext.getBean(MyCompanyProperties.class);
		// out.println(companyProperties.toString());

		 ConfigurableApplicationContext applicationContext=SpringApplication.run(MyCompanyPropertiesMap.class, args);
		 MyCompanyPropertiesMap compnayPropertiesList= applicationContext.getBean(MyCompanyPropertiesMap.class);
		 out.println(compnayPropertiesList.toString());
		 
	}
}
