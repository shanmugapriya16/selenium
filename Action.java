package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver1.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("http://www.flipkart.com");
	WebElement login = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	login.click();
	
	WebElement fur = d.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[6]"));
	
	
	Actions a = new Actions(d);
	a.moveToElement(fur).perform();
	
	WebElement bean = d.findElement(By.xpath("//a[@title='Bean Bags']"));
	Thread.sleep(2000);
	bean.click();
	
	WebElement select = d.findElement(By.id("BEBE86AGFFUAGTZG"));
	Thread.sleep(2000);
	WebElement cart = d.findElement(By.xpath("(//div[@class='_1jA3uo'])[2]"));
	a.dragAndDrop(select, cart);
	
	
	
	
	
}
}
