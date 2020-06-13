package org.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Seleni {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		
		String u = driver.getCurrentUrl();
		
		System.out.println(u);
		
		String t = driver.getTitle();
		System.out.println(t);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
