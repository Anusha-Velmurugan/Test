package com.seleniumvja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Dynamic_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("anusha");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@name='login']//preceding::input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[type$='t']")).click();
	}

}
