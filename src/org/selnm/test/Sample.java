package org.selnm.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	
	System.out.println(title);
	
	
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	
	//driver.quit();
	
	driver.close();
	
	
	
}
}
