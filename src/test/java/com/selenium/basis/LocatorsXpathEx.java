package com.selenium.basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LocatorsXpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFgb']")).sendKeys("Learning Xpath");

	}

}
