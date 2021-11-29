package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();
		
		Actions dr = new Actions(driver);
		
		WebElement starting_point = driver.findElement(By.id("draggable"));
		
		WebElement ending_point = driver.findElement(By.id("droppable"));
		
		dr.dragAndDrop(starting_point,ending_point).build().perform();
		
		
	}

}
