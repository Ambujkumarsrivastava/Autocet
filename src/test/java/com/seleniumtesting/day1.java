package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		String excpectedurl = driver.getCurrentUrl();

		String actualurl = "https://www.saucedemo.com/";

		if (excpectedurl.equals(actualurl)) {
			System.out.println("Page is correct");

		} else {
			System.out.println("Page is incorrect");
		}

		String expectedTitle = "Swag Labs";

		String actual = driver.getTitle();

		if (expectedTitle.equals(actual)) {
			System.out.println("Page is correct");
		} else {
			System.out.println("Page is incorrect");
		}

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");

		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.id("first-name"));
		ele2.sendKeys("Ambuj");
		
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("last-name"));
		ele3.sendKeys("Srivastava");
		
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("postal-code"));
		ele4.sendKeys("274304");
		
        driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("finish")).click();
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);

		
		
//		driver.navigate().back();
//
//		Thread.sleep(2000);
//
//		driver.navigate().forward();
//
//		Thread.sleep(2000);
//
//    	driver.navigate().refresh();
//		Thread.sleep(2000);

		
		
		driver.quit();
		
	}

}
