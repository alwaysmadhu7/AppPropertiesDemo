package com.appprop.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;

public class SamplePropertiesByValue {
	// @Value("${appprop.measure-unit}")
	 private String measureUnit;
	 //Allows appprop.timeunit, time-uint not time unit
	// @Value("${appprop.time-unit}")
	 private TimeUnit timeUnit;
	public String getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}
	@Override
	public String toString() {
		return "SamplePropertiesByValue [measureUnit=" + measureUnit + ", timeUnit=" + timeUnit + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
}
