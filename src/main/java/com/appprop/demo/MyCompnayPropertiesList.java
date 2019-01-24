package com.appprop.demo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Past;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@Configuration
@ConfigurationProperties(prefix="app")
@PropertySource("classpath:application_mycompany.properties")
public class MyCompnayPropertiesList {
  private List<String> servers=new ArrayList<>();

public List<String> getServers() {
	return servers;
}

public void setServers(List<String> servers) {
	this.servers = servers;
}

@Override
public String toString() {
	return "MyCompnayPropertiesList [servers=" + servers + "]";
}
  
 
}
