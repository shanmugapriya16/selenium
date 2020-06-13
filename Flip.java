package org.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flip {
 public static void main(String[] args) throws WebDriverException, InterruptedException {
	
	 System.setProperty("webdriver.gecko.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\geckodriver.exe");
	 
	 WebDriver d = new FirefoxDriver();
	 
	 d.get("https://www.flipkart.com/");
	 /*d.manage().timeouts().implicitlywait(30, TimeUnit.SECONDS);*/
	 
	WebElement clic = d.findElement(By.xpath("//a[@href=\"/account/login?ret=/\"]")); 
	
	 
	Thread.sleep(5000);
	
	 clic.click();
	 
	 Thread.sleep(5000);

	 
	 WebElement user = d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	 
	 d.manage().window().fullscreen();
	 user.sendKeys("priya@gmail.com");
	 
	 
	 
	 
}
	
	
}
