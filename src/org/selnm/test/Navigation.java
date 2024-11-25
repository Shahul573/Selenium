package org.selnm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		WebElement txtSearchBox = driver.findElement(By.name("q"));
		
		txtSearchBox.sendKeys("Greens Technology",Keys.ENTER);
		
		//WebElement txtClick = driver.findElement(By.name("btnK"));
		//txtClick.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
