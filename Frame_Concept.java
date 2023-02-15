package com.seleniumvja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		//we can switch to frame by using id,index,webelement
		//16th line frame is found using id
		 driver.switchTo().frame("firstFr");
		 driver.findElement(By.name("fname")).sendKeys("Anusha");
		 driver.findElement(By.name("lname")).sendKeys("Velmurugan");
		 //as innerframe has no id in its frame, we used webelement here
		 WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		 driver.switchTo().frame(innerframe);
		 
		 driver.findElement(By.name("email")).sendKeys("anush@gmail.com");
		 //we cannot switch directly from frame to frame so default content is used--it works in a way such that "frame to web browser to frame"
		 //26 th line --> inner frame to parent frame
		 driver.switchTo().parentFrame();
		 //28 th line--> parent frame to main page
		 driver.switchTo().defaultContent();
		 
		 
	}

}
