package com.selenium.basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;	

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
