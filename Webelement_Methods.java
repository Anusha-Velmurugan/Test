package com.seleniumvja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("anusha@gmail.com");
		
		WebElement pw = driver.findElement(By.id("pass"));
		String att2 = pw.getAttribute("id");
		System.out.println(att2);
		pw.sendKeys("1234");
		
		WebElement login = driver.findElement(By.name("login"));
		String att1 = login.getAttribute("value");
		System.out.println(att1);
		
		login.click();
		
		driver.close();
	}

}
