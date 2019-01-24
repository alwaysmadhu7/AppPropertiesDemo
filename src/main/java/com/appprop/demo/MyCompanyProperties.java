package com.appprop.demo;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "mycompany")
@PropertySource("classpath:application_mycompany.properties")
@Validated
public class MyCompanyProperties {

	/*@Bean
	MyCompanyProperties myCompanyProperties() {
		return new MyCompanyProperties();
	}*/

	@Length(min=2, max=30)
	private String name;
	private String domain;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MyCompanyProperties [name=" + name + ", domain=" + domain + ", location=" + location + "]";
	}

}
