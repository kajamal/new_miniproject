package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrpitExecutor {
	
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.in/");
	WebElement sc = driver.findElement(By.xpath("//a[text()='Mexico']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();", sc);
	
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-10000)");
	
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,5000)");
	
	}
	

}
