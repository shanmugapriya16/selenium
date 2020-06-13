package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
		 
		 WebDriver d = new ChromeDriver();
		 
		 d.get("http://www.greenstechnologies.in/selenium-training.php");
		 
		 WebElement text = d.findElement(By.xpath("//h3[contains(text(),'Course']"));
String text2 = text.getText();

System.out.println(text2);
	
	
	}
	
}
