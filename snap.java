package org.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snap {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.snapdeal.com/");
	
	TakesScreenshot tk = (TakesScreenshot) d;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	System.out.println(src);
	 File desc = new File("E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Screenshot\\First.png");
	
	 FileUtils.copyFile(src, desc);
	 
	 
	 WebElement help = d.findElement(By.xpath("(//a[@class='dp-widget-link hookLink'])[3]"));
	 help.click();
	 
	 Thread.sleep(5000);
	 
	
	File src2 = tk.getScreenshotAs(OutputType.FILE);
	
	System.out.println(src2);
	
	
	File desc2 = new File("E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Screenshot\\second.png");
	FileUtils.copyFile(src2, desc2);
	
	
	WebElement login = d.findElement(By.xpath("(//a[contains(text(),'order')])[1]"));
	
	login.click();
	
	File scr3 = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(scr3);
	
File desc3 = new File("E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Screenshot\\fourth.png");
FileUtils.copyFile(scr3, desc3);
	
	System.out.println("completed");
}
	
	
	
	
}
