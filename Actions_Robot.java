package com.seleniumvja;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Robot {
 public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropable");
	//Actions-- mouse and keyboard actions
	//mouse based actions-->build(not mandatory) and perform(mandatory)  should be used
	//perform--> performs a sequence of actions
	Actions ac = new Actions(driver);
	//dragAndDrop
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement des = driver.findElement(By.id("droppable"));
	ac.dragAndDrop(src, des).build().perform();
	
	driver.navigate().to("https://www.amazon.in/");
	//move to element
	WebElement signin = driver.findElement(By.id("nav-link-accountList"));
	ac.moveToElement(signin).perform();
	//context click-->right click
	WebElement mobile = driver.findElement(By.linkText("Mobiles"));
	ac.contextClick(mobile).perform();
	//robot class
	Robot rb= new Robot();
	//keypress,keyrelease-->keyboard based actions
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	//doubleclick
	WebElement bsellers = driver.findElement(By.linkText("Best Sellers"));
	ac.doubleClick(bsellers).perform();
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Screenshot\\best sellers.png");
	FileUtils.copyFile(source, destination);
	 System.out.println("Best-sellers");
	 driver.navigate().back();
	 System.out.println("back to home page");

	
	driver.quit();
	
}
}
