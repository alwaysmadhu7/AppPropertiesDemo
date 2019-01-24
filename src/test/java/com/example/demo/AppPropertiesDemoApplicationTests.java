package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.appprop.demo.MyCompanyPropertiesMap;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppPropertiesDemoApplicationTests {

	@Test
	public void testForMap() {
		MyCompanyPropertiesMap companyPropertiesMap=new MyCompanyPropertiesMap();
		Map<String,String> map =new HashMap<>();
		map.put("key1", "value1@gmail.com");
		map.put("key2", "value2@gmail.com");
		companyPropertiesMap.setMap(map);
		Assert.assertEquals(companyPropertiesMap, new MyCompanyPropertiesMap().getMap());
	}
	
	@Test
	public void testForBoolean() {
		Assert.assertTrue(true);
	}

}
