package com.cucumber.framework.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;


public class PropertyOperations {
	static Properties prop = new Properties();
	
	public static String getPropertyValueByKey(String key)  {
		
		//1. load data from properties file
		String propFilePath = System.getProperty("user.dir")+"/src/main/resources/configfile/config.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(propFilePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//2. read data
		String value = prop.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			try {
				throw new Exception("Value is not specified for key: "+key+ "in properties file.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}
}
