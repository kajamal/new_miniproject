package com.revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Rev {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe" );
		
		ChromeOptions driver = new ChromeOptions();
		driver.addArguments("icognito");
		WebDriver s = new ChromeDriver();
		s.get("https://www.facebook.com//");
		s.manage().window().maximize();
		s.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	    String text = s.findElement(By.xpath("//div[contains(text(),'search')]")).getText();
	    System.out.println(text);
	    Thread.sleep(3000);
	    s.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("7358997770");
	    s.findElement(By.xpath("//button[@value='1']")).click();
	    Thread.sleep(5000);
	    s.navigate().back();
	    s.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	    Thread.sleep(3000);
	    WebElement date = s.findElement(By.xpath("//select[@id='day']"));
	    Select a = new Select(date);
	    a.selectByValue("5");
	    List<WebElement> da = a.getOptions();
	    for (WebElement webElement : da) {
	    	String text2 = webElement.getText();
	    	System.out.println(text2);
			
		}
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text2 = webElement.getText();
		System.out.println(text2);
			
		}
	}

}
