package com.down;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.name("firstname")).sendKeys("kaja");
		 
	     driver.findElement(By.name("lastname")).sendKeys("sharif");
		 
     	 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7358997770");
		
		 
		 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("kajamal@99005");
		 
		WebElement days = driver.findElement(By.id("day"));
		
		Select s = new Select(days);
		
		s.selectByValue("25");
		
		WebElement mon = driver.findElement(By.id("month"));
		
		Select d = new Select(mon);
		
		d.selectByIndex(6);
		
		WebElement yre = driver.findElement(By.id("year"));
		
		Select c = new Select(yre);
		
		c.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		boolean y = c.isMultiple();
		System.out.println("is multiple or not:"+ y);
		
		List<WebElement> options = d.getOptions();
		
		for (WebElement webElement : options) {
			 String text = webElement.getText();
			 System.out.println(text);
			
		
			
			
			
		}
		
		
		
	 
		 
	}

}
