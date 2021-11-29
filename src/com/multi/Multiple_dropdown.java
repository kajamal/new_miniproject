package com.multi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multi);
		
		s.selectByValue("2");
		
		s.selectByIndex(1);
		
		s.selectByVisibleText("Loadrunner");
		
		boolean h = s.isMultiple();
		System.out.println("is multiple or not ?");
		System.out.println("true or false:" +h);
		
		List<WebElement> all = s.getOptions();
		
		for (WebElement webElement : all) {
			
			String text = webElement.getText();
			System.out.println(text);
			
		}
		System.out.println("********************");
		
		List<WebElement> allsec = s.getAllSelectedOptions();
		for (WebElement webElement : allsec) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
	System.out.println("***********************");	
	WebElement allse = s.getFirstSelectedOption();
	System.out.println(allse.getText());
		
	
	}
	
}

	
	
	
