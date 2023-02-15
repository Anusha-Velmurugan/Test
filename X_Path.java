package com.seleniumvja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	//email.sendKeys("anush@gmail.com");
	
	WebElement email1 = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
	email1.sendKeys("anush");
	
	//WebElement fp = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	//fp.click();
	
	WebElement fp1 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')] "));
	fp1.click();
	
	driver.close();
}

}
