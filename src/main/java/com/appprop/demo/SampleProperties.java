package com.appprop.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties("appprop")

/*@Configuration
@PropertySource("classpath:env.properties")
@ConfigurationProperties(prefix = "env")*/
public class SampleProperties {
	/*
	 * private String measureUnit; private TimeUnit timeUnit; private Date date;
	 */

	private String name;
	private List<String> supportmail = new ArrayList<>();
	public List<String> getSupportmail() {
		return supportmail;
	}

	public void setSupportmail(List<String> supportmail) {
		this.supportmail = supportmail;
	}

	public Map<String, String> getPrechecks() {
		return prechecks;
	}

	public void setPrechecks(Map<String, String> prechecks) {
		this.prechecks = prechecks;
	}

	private Map<String, String> prechecks=new HashMap<>();

	@Override
	public String toString() {
		return "SampleProperties [name=" + name + ", code=" + code + ", stack=" + stack + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	private String code;
	private String stack;

	public void getListMapObject() {
		// TODO Auto-generated method stub
		System.out.println(supportmail.parallelStream().toString());
		System.out.println(prechecks.entrySet().parallelStream().toString());
	}

}
