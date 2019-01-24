package com.appprop.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application_mycompany.properties")
@EnableAutoConfiguration
@ConfigurationProperties(prefix="mail")
public class MyCompanyPropertiesMap {
	private Map<String, String> map=new HashMap<>();

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "MyCompanyPropertiesMap [map=" + map + "]";
	}
	
	
	
}
