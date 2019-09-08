package com.TestNG.programs;

import java.io.FileInputStream;
import java.util.*;

import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 extends LaunchBrowser {
	
	public  static String getValue(String key) throws Exception {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Testdata\\Configuration.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String browserType = prop.getProperty(key);
	return browserType;
	}
	


	@Test
	public void openURL() {
		driver.get("https://www.flipkart.com");
		System.out.println("open url");
	}

	@Test
	public void searchProduct() {
		System.out.println("search iphone");
	}

	@Test
	public void verifyProduct() {
		System.out.println("Verify product");
	}


	
}
