package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	static WebDriver driver;
	
public static WebDriver getbrowser() {
System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
return driver;
}

public static void link(String url) {
	driver.get(url);

}

public static WebElement username(String values) {
	WebElement e  = driver.findElement(By.id(values));
	return e;

}

public static void pass(WebElement e, String values) {
e.sendKeys(values);

}
	
	
	
	
	
	
}
