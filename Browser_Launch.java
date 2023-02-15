package com.seleniumvja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.close();
	}

}
