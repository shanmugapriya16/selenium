package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mailfb {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("http://www.amazon.in");
	
	WebElement search = d.findElement(By.id("twotabsearchtextbox"));
	
	Thread.sleep(2000);
	Actions a = new Actions(d);
	
	a.doubleClick(search).contextClick(search).build().perform();

	Robot r = new Robot();
	
	for(int i = 1;i<=2;i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	d.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement login = d.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
	login.click();
	WebElement flip = d.findElement(By.name("q"));
	Thread.sleep(5000);
	flip.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}
}
