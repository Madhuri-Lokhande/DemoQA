package com.automation.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends AbstractClass {
	@Test
	public void RadioButtonOperation() throws InterruptedException {
		// Open https://demoqa.com/ site
		driver.get("https://demoqa.com/");

		// Click on Forms Elements
		driver.findElement(By.className("card-up")).click();

		// Click on TetxtBox
		driver.findElement(By.id("item-2")).click();
		Thread.sleep(1000);

		WebElement YesRadioButton = driver
				.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label"));

		System.out.println(YesRadioButton.isSelected());
		Thread.sleep(1000);
		
		YesRadioButton.click();
		
		Thread.sleep(1000);
		
		
		WebElement ImpressiveRadioButton = driver
				.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label"));
		ImpressiveRadioButton.click();

		Thread.sleep(1000);
		
		if(YesRadioButton.isSelected()) {
			System.out.println("Yes is selected");
		}else {
			System.out.println("Impressive is selected");
		}
		
		
	}
}
