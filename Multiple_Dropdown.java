package com.seleniumvja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Vja\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	
	WebElement fruits = driver.findElement(By.id("fruits"));
	Select f = new Select(fruits);
	f.selectByIndex(1);
	
	WebElement heroes = driver.findElement(By.id("superheros"));
	Select h=new Select(heroes);
	h.selectByVisibleText("Ant-Man");
	h.selectByIndex(2);
	h.selectByValue("bp");
	h.selectByValue("ds");
	h.selectByVisibleText("Spider-Man");
	
	System.out.println("-----------------FIRST SELECTED OPTION------------------------------");
	System.out.println(h.getFirstSelectedOption().getText());
	
	System.out.println("----------------------ALL SELECTED OPTIONS-----------------------------");
	List<WebElement> allsel = h.getAllSelectedOptions();
	for (WebElement aso : allsel) {
		System.out.println(aso.getText());
	}
	
	
	System.out.println("--------------------ALL OPTIONS--------------------------------");
    List<WebElement> options = h.getOptions();
    for (WebElement ao : options) {
		System.out.println(ao.getText());
	}
    
    System.out.println("------------------IS MULTIPLE-------------------------------");
    System.out.println("Does super heroes is  multiple?:" + h.isMultiple());
    System.out.println("Does fruits is multiple?:"+ f.isMultiple());
    
    h.deselectAll();
    driver.close();
	}

    
}
