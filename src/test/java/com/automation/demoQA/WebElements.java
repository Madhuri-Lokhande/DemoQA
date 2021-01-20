package com.automation.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElements extends AbstractClass {
	@Test
	public void WebElementTest() throws InterruptedException {
		// Open https://demoqa.com/ site
		driver.get("https://demoqa.com/");

		// Click on Forms Elements
		driver.findElement(By.className("card-up")).click();

		// Click on TetxtBox
		driver.findElement(By.id("item-3")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("addNewRecordButton")).click();

		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.clear();

		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.clear();

		WebElement email = driver.findElement(By.id("userEmail"));
		email.clear();

		WebElement age = driver.findElement(By.id("age"));
		age.clear();

		WebElement salary = driver.findElement(By.id("salary"));
		salary.clear();

		WebElement department = driver.findElement(By.id("department"));
		department.clear();

		WebElement submitButton = driver.findElement(By.id("submit"));
		
		FirstName.sendKeys("John");
		LastName.sendKeys("Smith");
		email.sendKeys("Smith@gmail.com");
		age.sendKeys("28");
		salary.sendKeys("40000");
		department.sendKeys("Computer");
		submitButton.click();

		Thread.sleep(1000);

	}
	@Test
	public void BlankFirstName() throws InterruptedException {
		// Open https://demoqa.com/ site
		driver.get("https://demoqa.com/");

		// Click on Forms Elements
		driver.findElement(By.className("card-up")).click();

		// Click on TetxtBox
		driver.findElement(By.id("item-3")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("addNewRecordButton")).click();

		WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement LastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement age = driver.findElement(By.id("age"));
		WebElement salary = driver.findElement(By.id("salary"));
		WebElement department = driver.findElement(By.id("department"));
		WebElement submitButton = driver.findElement(By.id("submit"));
		
		FirstName.clear();
		LastName.clear();
		email.clear();
		age.clear();
		salary.clear();
		department.clear();

		LastName.sendKeys("Smith");
		email.sendKeys("Smith@gmail.com");
		age.sendKeys("28");
		salary.sendKeys("40000");
		department.sendKeys("Computer");
		submitButton.click();

		Thread.sleep(1000);
		
		String Fname=FirstName.getText();
		String Lname=LastName.getText();
		String emailf=email.getText();
		String agef=age.getText();
		String salaryf=salary.getText();
		String dept=department.getText();
		
		if(Fname.equals("")||Lname.equals("")||emailf.equals("")||agef.equals("")||salaryf.equals("")||dept.equals("")) {
			System.out.println("Fields can't be blank");
		}
		else {
			System.out.println("forms Successfull");
		}
	}
}
