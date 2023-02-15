package com.seleniumvja;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		//methods---> accept()-ok,dismiss()-cancel,sendKeys()-to pass input value,getText().
		//Simple Alert
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		//Confirm alert
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("alert cancelled");
		//Prompt Alert
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("selenium");
		prompt.accept();
		driver.close();
		
	}

}
