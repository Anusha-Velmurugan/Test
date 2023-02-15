package com.seleniumvja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement cn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cn.click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fn.sendKeys("Aathi");
		
		WebElement sn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sn.sendKeys("Velmurugan");
		
		WebElement phn = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		phn.sendKeys("9767484103");
		
		WebElement pw = driver.findElement(By.id("password_step_input"));
		pw.sendKeys("123456");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("12");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2003");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
