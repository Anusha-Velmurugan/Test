package com.seleniumvja;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Spoiler_Alert_(film)#/media/File:Spoiler_Alert_film_poster.png");
	Thread.sleep(3000);
	//initailising screenshot
	TakesScreenshot ts= (TakesScreenshot) driver;
	//calling method to take screenshot
	File sourse = ts.getScreenshotAs(OutputType.FILE);
	//setting path for the screenshot file
	File destination= new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Screenshot\\spoiler alert.png");
	//merging sorce and destination file
	FileUtils.copyFile(sourse, destination);
	
}

}
