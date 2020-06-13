package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver1.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.w3schools.com/html/html_tables.asp");
	 WebElement table = d.findElement(By.className("w3-example"));
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
	 for (int i = 0; i < 3; i++) {
		 
		 WebElement rw = rows.get(i);
		 /*String txt = rw.getText();
		 System.out.println(txt);*/
		 
		 
		List<WebElement> col = rw.findElements(By.tagName("td"));
		for (int j = 0; j < col.size(); j++) {
			WebElement colu = col.get(j);
			String text = colu.getText();
			System.out.println(text);
			/*if(text.equals("Austria")) {
				System.out.println("Row no: " +i);
				System.out.println("Column no: "+j);
			}*/
			
		}
	 }
		
	}
	
	
	}