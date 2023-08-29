package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutomation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
        
        // Step 1: Go to amazon.in and search for printers
        driver.get("https://www.amazon.in/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("printers");
        searchBox.submit();
        
        // Step 2: Select "Printers" from all brands
        WebElement allBrandsFilter = driver.findElement(By.linkText("Printers"));
        allBrandsFilter.click();
        
        // Define the sort options
        String[] sortOptions = {"Price: Low to High", "Avg. Customer Review", "Price: High to Low", "Newest Arrivals"};
        
        // Automate sorting for each option
        for (String option : sortOptions) {
            // Step 3: Select sort option "low to high" and select the first result
            Select sortDropdown = new Select(driver.findElement(By.cssSelector("select#s-result-sort-select")));
            sortDropdown.selectByVisibleText(option);
            
            // Wait for results to update
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Step 4: Click on the first result
            WebElement firstResult = driver.findElement(By.cssSelector("div[data-index='0'] h2 a"));
            firstResult.click();
            
            // Wait for the product page to load
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Navigate back to the search results page
            driver.navigate().back();
        }
        
        // Close the WebDriver
        driver.quit();
    }
}
