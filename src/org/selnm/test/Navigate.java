package org.selnm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Navigation navigate = driver.navigate();
		
		navigate.to("https://www.flipkart.com/");
		navigate.to("https://www.facebook.com/");
		navigate.to("https://www.amazon.com/");
		
		
		//go back to previous web page
		navigate.back();
		
		navigate.forward();
		
		navigate.refresh();
		
		driver.quit();
		
		
		
		
		
		

	}

}
