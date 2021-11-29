package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		System.out.println("-----Header-----");
		List<WebElement> head = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement webElement : head) {
		System.out.println(webElement.getText());
		}
		System.out.println("------Row-------");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement r : row) {
			System.out.println(r.getText());
		}
		System.out.println("-------coloum---------");
		List<WebElement> coloum = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement col : coloum) {
			System.out.println(col.getText());
		}
		System.out.println("-------Specfic data------");
		WebElement specfic = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		System.out.println(specfic.getText());
			
		}
		
	
	}		
		
		
		
			
		
		
		
	


