package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contain {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	
	ChromeDriver d = new ChromeDriver();
	
	d.get("http://www.greenstechnologys.com/");
	
	WebElement para = d.findElement(By.xpath("//font[contains(text(),'nearly')]"));
	String text1 = para.getText();
	
	System.out.println(text1);
	
	
	WebElement last = d.findElement(By.xpath("//p[contains(text(),'focused')]"));
	String laspara = last.getText();
	
	System.out.println(laspara);
	
}
}
