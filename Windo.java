package org.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.flipkart.com/");

	WebElement login = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	login.click();
	WebElement search = d.findElement(By.name("q"));
	search.sendKeys("iphone cover 8");
	WebElement cli = d.findElement(By.xpath("//button[@class='vh79eN']"));
	cli.click();
	Thread.sleep(5000);
	WebElement iphone = d.findElement(By.xpath("//a[text()='Wellpoint Back Cover for Apple iPhone 8, Apple iPhone 7']"));
	iphone.click();
	String para = d.getWindowHandle();
	Set<String> all = d.getWindowHandles();
	System.out.println(para +"\n"+all);
	for(String x :all) {
		if(!x.equals(para)) {
			d.switchTo().window(x);
		}
		
	}
	

	
}
}
