package com.automation.demoQA;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBoxElements extends AbstractClass {

	@Test(priority = 1)
	public void VerifyTitle() throws InterruptedException {
		driver.get("https://demoqa.com/");
		driver.findElement(By.className("card-up")).click();

		String ExpectedResult = "ToolsQA";
		String ActualResult = driver.getTitle();

		assertEquals(ExpectedResult, ActualResult);
		System.out.println(ActualResult);

	}

	@Test(priority = 2)
	public void FillingAllDetailsOfTB() throws InterruptedException {
		//Open https://demoqa.com/ site
		driver.get("https://demoqa.com/");
		
		//Click on Forms Elements
		driver.findElement(By.className("card-up")).click();
		
		//Click on TetxtBox 
		driver.findElement(By.id("item-0")).click();
		
		WebElement findElementUserName = driver.findElement(By.id("userName"));
		findElementUserName.clear();
		findElementUserName.sendKeys("abcd efgh");
		
		WebElement findElementEmail = driver.findElement(By.id("userEmail"));
		findElementEmail.clear();
		findElementEmail.sendKeys("abcd@efgh.com");
		
		WebElement findElementCurrentAddress =driver.findElement(By.id("currentAddress"));
		findElementCurrentAddress.clear();
		findElementCurrentAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");
		
		WebElement findElementPermtAddress = driver.findElement(By.id("permanentAddress"));
		findElementPermtAddress.clear();
		findElementPermtAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");
		
		
		driver.findElement(By.id("submit"));
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void BlankUserName() throws InterruptedException {
		driver.get("https://demoqa.com/");
		driver.findElement(By.className("card-up")).click();
		driver.findElement(By.id("item-0")).click();
		

		WebElement findElementUserName = driver.findElement(By.id("userName"));
		findElementUserName.clear();
		findElementUserName.sendKeys(" ");
		
		WebElement findElementEmail = driver.findElement(By.id("userEmail"));
		findElementEmail.clear();
		findElementEmail.sendKeys("abc@gmail.com");
		
		WebElement findElementCurrentAddress =driver.findElement(By.id("currentAddress"));
		findElementCurrentAddress.clear();
		findElementCurrentAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");

		
		WebElement findElementPermtAddress = driver.findElement(By.id("permanentAddress"));
		findElementPermtAddress.clear();
		findElementPermtAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");
		
		driver.findElement(By.id("submit"));
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void EmailAddressWithoutFormat() throws InterruptedException {
		driver.get("https://demoqa.com/");
		driver.findElement(By.className("card-up")).click();
		driver.findElement(By.id("item-0")).click();
		
		WebElement findElementUserName = driver.findElement(By.id("userName"));
		findElementUserName.clear();
		findElementUserName.sendKeys("ABCD EFGH ");
		
		WebElement findElementEmail = driver.findElement(By.id("userEmail"));
		findElementEmail.clear();
		findElementEmail.sendKeys("abcgmail.com");
		
		
		WebElement findElementCurrentAddress =driver.findElement(By.id("currentAddress"));
		findElementCurrentAddress.clear();
		findElementCurrentAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");
		
		WebElement findElementPermtAddress = driver.findElement(By.id("permanentAddress"));
		findElementPermtAddress.clear();
		findElementPermtAddress.sendKeys("123 abcd, zdjfv, ajwerfbj");
		
		driver.findElement(By.id("submit"));
		Thread.sleep(1000);
	}
}

