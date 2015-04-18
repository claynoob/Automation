package com.panerabread.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderingItems {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://delivery1-qarc.panerabread.com/#!/");
		driver.findElement(By.cssSelector(".rapid-pickup")).click();
		driver.findElement(By.cssSelector("#user")).sendKeys("chaley.tester");
		driver.findElement(By.cssSelector("#password")).sendKeys("bread3");
		driver.findElement(By.cssSelector(".pull-right")).click();
		driver.findElement(By.cssSelector("#cafeSearch")).sendKeys("02215");
		WebElement cafeResult = driver.findElement(By.cssSelector(".cafe-details:first-of-type"));
		cafeResult.findElement(By.cssSelector(".artisan-scroll > div:nth-child(1) > cafe:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector("div.ng-scope:nth-child(14) > placard:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > img:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.ng-scope:nth-child(11) > placard:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)")).click();
		WebElement findCheckoutButton = driver.findElement(By.cssSelector(".order-summary-body"));
		findCheckoutButton.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector(".btn-modal-close")).click();
		driver.findElement(By.cssSelector("#emailAddress")).sendKeys("chaley.stanfield@panerabread.com");
		driver.findElement(By.cssSelector("#phoneNumber")).sendKeys("9122372317");
		WebElement findPaymentInformation = driver.findElement(By.cssSelector("#payment-information"));
		findPaymentInformation.findElement(By.cssSelector(".btn-primary")).click();
		driver.quit();
	}

}
