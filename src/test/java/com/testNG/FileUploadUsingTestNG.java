package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingTestNG {

	@Test
	public void fileUpload() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//choose a file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Guest User\\Downloads\\javaatsyllabus.pdf");

		//upload a file

		driver.findElement(By.id("file-submit")).click();

		//vaslidation

		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("file upload successfull");
		}
		else
		{
			System.out.println("file not upload successfull");
		}
	}


}

