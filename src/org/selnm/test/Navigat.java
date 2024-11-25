package org.selnm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.amazon.com");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();
		
		driver.quit();

	}

}
