package com.Mini;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mini_project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","H:\\eclipse workspace\\Testing_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kajasharif9894@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("kamal@5555");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();        
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shirt = driver.findElement(By.xpath("//img[contains(@title, 'Faded')]"));
	    js.executeScript("arguments[0].scrollIntoView()", shirt);
	    WebElement quick = driver.findElement(By.xpath("//span[text()='Quick view']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(shirt).build().perform();
	    WebDriverWait w = new WebDriverWait(driver, 150);
	    w.until(ExpectedConditions.visibilityOf(quick));
	    a.moveToElement(quick).build().perform();
	    a.click(quick).build().perform();
	    Thread.sleep(3000);
	    WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
		    driver.switchTo().frame(frame);
		    Thread.sleep(5000);
		    WebElement cart = driver.findElement(By.xpath("//button[@name='Submit']"));
		    a.moveToElement(cart).build().perform();
		    a.click(cart).build().perform();
		    Thread.sleep(2000);
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")));
		    WebElement check = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		    a.moveToElement(check).build().perform();
		    a.click(check).build().perform();
		    Thread.sleep(1000);
		   driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[@id='HOOK_PAYMENT']/div[2]/div/p/a")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
		   Thread.sleep(3000);
		   WebElement end = driver.findElement(By.xpath("(//div[@id='center_column']/ul/li)[5]"));
			js.executeScript("arguments[0].scrollIntoView()",end);
		   Thread.sleep(6000);
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   File destination = new File("H:\\eclipse workspace\\Testing_Selenium\\screenshots\\pic2.png");
		   FileUtils.copyFile(source, destination);
		   
		   
		   
	}

}
