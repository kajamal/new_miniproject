package com.ten.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
//	 driver.get("https://www.youtube.com/");
	 
	 driver.manage().window().maximize();
	 
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 driver.navigate().to("https://www.gmail.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 Thread.sleep(10000);
	 driver.navigate().refresh();
	 driver.close();

	 
	 
	
	  
	 

	 
	
	 

	}

}
