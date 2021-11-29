package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_option {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions s = new ChromeOptions();
		
		s.addArguments("incognito");
		
		WebDriver Driver = new ChromeDriver(s);
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.facebook.com//");
		
	    Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7358997770");
	    
	    Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kajamal@9905");
		
	    Driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(10000);
	    
	    TakesScreenshot sh = (TakesScreenshot) Driver;
	    
	    File source = sh.getScreenshotAs(OutputType.FILE);
	    
	    File Destination = new File ("H:\\eclipse workspace\\Testing_Selenium\\screenshots//pig1.png");
	    
	    FileUtils.copyFile(source,Destination);	
	     
				
	}

}
