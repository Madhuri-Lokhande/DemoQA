/***For checking the broken links, you will need to do the following steps.

1. Collect all the links in the web page based on "a" and "img" tags.
2. Send HTTP request for the link and read HTTP response code.
3. Find out whether the link is valid or broken based on HTTP response code.
4. Repeat this for all the links captured.
*/

package com.automation.demoQA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
		
		//1. Get the list of all links and Images
		List<WebElement> linkslist=driver.findElements(By.tagName("a")); //find all the URLs using tagName
		linkslist.addAll(driver.findElements(By.tagName("img"))); //Add all images in linkslist
		
		//Get the Size of all links
		System.out.println("Size of full links and images ---->"+linkslist.size());
		
		List<WebElement> activelinks=new ArrayList<WebElement>();
		
		//2. Iterate linklist: Exclude all links that doesn't have any href attribute
		for(int i=0; i<linkslist.size();i++) {
			System.out.println(linkslist.get(i).getAttribute("href")); //Prints all links
			if(linkslist.get(i).getAttribute("href")!=null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) { //Check if links having href tag && if links are having href tag and it contains javascripts exclude those links
				activelinks.add(linkslist.get(i));
			}
		}
		
		//Get the size of active links
		System.out.println("Size of active link and images ---->"+activelinks.size());
		
		//3. Check the href url with HttpURLConnection API
		for(int j=0; j<activelinks.size();j++) {
			HttpURLConnection connection=(HttpsURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			
			//Prints the links with response
			System.out.println(activelinks.get(j).getAttribute("href")+ "--->"+response);
		}
		
	}

}
