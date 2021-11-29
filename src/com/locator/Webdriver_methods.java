package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		
	 WebElement email =Driver.findElement(By.id("email"));
	 
	 email.sendKeys("7358997770");
		
		WebElement pass =Driver.findElement(By.name("pass"));
		
		pass.sendKeys("kajamal@99005");
		
		boolean dis = email.isDisplayed();
		System.out.println(dis);
		
		boolean en = email.isEnabled();
		System.out.println(en);
		
		boolean sel = email.isSelected();
		System.out.println(sel);
	
		
		WebElement login = Driver.findElement(By.name("login"));
		login.click();
		
		
		
		
	}

}
