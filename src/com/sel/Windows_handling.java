package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in//");
		WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions ac = new Actions(driver);
		ac.contextClick(best).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		ac.contextClick(fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
        WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		ac.contextClick(Mobiles).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		 WebElement Customer = driver.findElement(By.xpath("//a[text()='Customer Service']"));
			
		ac.contextClick(Customer).build().perform();
			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> w = driver.getWindowHandles();
		
		for (String g : w) {
			
			String title = driver.switchTo().window(g).getTitle();
			
			System.out.println(title);
			
		}
		
		String s = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		
		for (String string : w) {
			
			if (driver.switchTo().window(string).getTitle().equals(s)) {
				
			System.out.println(s);
			}	
				else {
					
					driver.close();
					
				}
				
			}
			
		}
		
	
		
	
			
		
		
		
		
		
		
	}


