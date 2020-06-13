package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableheading {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver1.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement ta = d.findElement(By.className("w3-example"));
	
	
	
	List<WebElement> rows = d.findElements(By.tagName("tr"));
	int s = rows.size()/2;
	WebElement ele = rows.get(s);
	
	List<WebElement> col = d.findElements(By.tagName("td"));
	int cs = col.size()/2;
	WebElement data = col.get(cs);
	String txt = data.getText();
		System.out.println(txt);
		
	
	
}
}
