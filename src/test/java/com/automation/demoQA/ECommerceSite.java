package com.automation.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceSite {
  @Test
	public void f() throws InterruptedException {
	  
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("sf-with-ul")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("replace-2x")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
		
		System.out.println(driver.getTitle()); //session ID is null because we are calling this statement after driver.quit()
	}
  public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
  }

