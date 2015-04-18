package com.stanfieldchaleyt.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
