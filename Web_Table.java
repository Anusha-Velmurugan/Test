package com.seleniumvja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		//while writing xpath like ((//table)[2]/tbody/tr/td) suppose if the table contains 12 data means it will show 1 of 12 
		System.out.println("-------------------------ALL DATA----------------------------------------");
		List<WebElement> all = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (WebElement allData : all) {
			System.out.println(allData.getText());
		}
		System.out.println("------------------------ROW DATA-----------------------------------");
		List<WebElement> row = driver.findElements(By.xpath("(//table)[2]/tbody/tr[3]/td"));//this xpath show you 1 of 3
		for (WebElement rData : row) {
           System.out.println(rData.getText());			
		}
		System.out.println("------------------------------COLUMN DATA----------------------------");
		List<WebElement> cData = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[3]"));//this xpath show you 1 of 3
		for (WebElement column : cData) {
			System.out.println(column.getText());
			
		}
		System.out.println("------------------------PARTICULAR DATA-----------------------------");
		List<WebElement> pdata = driver.findElements(By.xpath("(//table)[2]/tbody/tr[3]/td[3]"));//this xpath show you 1 of 1
		for (WebElement particular : pdata) {
			System.out.println(particular.getText());
			
		}
		driver.close();
	}

}
