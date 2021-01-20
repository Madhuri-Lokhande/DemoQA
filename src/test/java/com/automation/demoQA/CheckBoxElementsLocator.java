package com.automation.demoQA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBoxElementsLocator extends AbstractClass {

	@Test
	public void CheckBoxLocator() throws InterruptedException {
		// Open https://demoqa.com/ site
		driver.get("https://demoqa.com/");

		// Click on Forms Elements
		driver.findElement(By.className("card-up")).click();

		// Click on TetxtBox
		driver.findElement(By.id("item-1")).click();
		
		boolean CheckIfSelected = driver.findElement(By.className("rct-title")).isSelected();
		
		//System.out.println(CheckIfSelected);
		
		driver.findElement(By.className("rct-checkbox")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]/svg")).click();
		Thread.sleep(1000);
	}
}
