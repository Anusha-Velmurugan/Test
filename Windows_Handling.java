package com.seleniumvja;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions ac= new Actions(driver);
		Robot rb = new Robot();
		
		WebElement minitv = driver.findElement(By.linkText("Amazon miniTV"));
		ac.contextClick(minitv).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement best = driver.findElement(By.linkText("Best Sellers"));
		ac.contextClick(best).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		ac.contextClick(customer).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		//return type set-->prints randomly,doesn't allow duplicates
		//get window handles prints the id of the web page
		//get title is used to print the title of each page
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("-----------------id----------------------");
		System.out.println(windowHandles);
		System.out.println("--------------------------------------------");
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String webTitle="Help - Amazon Customer Service";
		System.out.println("------------------------------------------------");
		Thread.sleep(2000);
		for (String id : windowHandles) {
			if (driver.switchTo().window(id).getTitle().equals(webTitle)) {
				System.out.println("cs");
				break;
			}
			
		}
		driver.quit();
	}

}
