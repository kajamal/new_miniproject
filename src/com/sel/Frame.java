package com.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		WebElement single = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		single.sendKeys("SINGLE FRAME");
		driver.switchTo().defaultContent();
		WebElement second = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		second.click();
		
		WebElement out = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(out);
		
		WebElement inn = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(inn);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MULTIPLE FRAMES");
	   
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		
		
	}
}
