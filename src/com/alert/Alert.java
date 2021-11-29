package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		System.out.println("****ALERT*******");
	     driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	    org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
        alert2.dismiss();
        
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        alert2.sendKeys("alert handling");
        String text = driver.switchTo().alert().getText();
        System.out.println("PROMPT BOX TEXT:"+text);
        Thread.sleep(5000);
        alert2.accept();
		
		
		
	
		

		
	    
	
		 
		
		
		
	}

}
