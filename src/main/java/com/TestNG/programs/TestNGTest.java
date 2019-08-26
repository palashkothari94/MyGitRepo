package com.TestNG.programs;

import org.testng.annotations.Test;

public class TestNGTest {
	
	@Test
	public void openBrowser() {
		System.out.println("open browser");
	}

	@Test
	public void openURL() {
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


	@Test
	public void closeBrowser() {
		System.out.println("close browser");
	}

}
