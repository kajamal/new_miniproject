package com.revision;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_script {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com//");
	driver.manage().window().maximize();
	
	JavascriptExecutor kj = (JavascriptExecutor) driver;
	kj.executeScript("document.getElementById('email').value='kajasharif9894.com';"); 
	kj.executeScript("document.getElementByxpath('//input[@type='password']').value='kajasharif9894.com';"); 

}
}