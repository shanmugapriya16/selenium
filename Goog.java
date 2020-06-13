package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goog {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.instagram.com/accounts/login/?hl=en)Login%20page");
	
	
	WebElement goo = d.findElement(By.name("username"));
	
	goo.sendKeys("Medavakkam");
	
	WebElement pass = d.findElement(By.name("password"));
	pass.sendKeys("123456");
	
	
	
	
}
}
