package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attri {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.facebook.com/");

	WebElement mail = d.findElement(By.id("email"));
	mail.sendKeys("priya@gmail.com");
	
	String att = mail.getAttribute("value");	
	System.out.println(att);
}
	
	
	
}
