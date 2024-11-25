package org.selnm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employ {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		
		WebElement txtName = driver.findElement(By.id("email"));
		
		txtName.sendKeys("shahul11@gmail.com");
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("123@ghj");
		
		WebElement btnClick = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnClick.click();
		
		
		
		driver.close();
		
		
		
	}
	
	
}
