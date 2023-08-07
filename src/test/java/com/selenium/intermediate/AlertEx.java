package com.selenium.intermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert confi=driver.switchTo().alert();
		
		Thread.sleep(2000);
		confi.accept();
		//conf.dismiss();


	}

}
