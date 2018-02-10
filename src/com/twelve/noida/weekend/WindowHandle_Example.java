package com.twelve.noida.weekend;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumwebdriverfaq.tumblr.com/");
		
		String windowhandlevalue =  driver.getWindowHandle();
		System.out.println("Window Handle Value is: " + windowhandlevalue);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".blog-name")).click();
		Set<String> mulwindhanvalue = driver.getWindowHandles();
		System.out.println("Multiple Window Handle Value: " + mulwindhanvalue);
		
		for(String windowhandle : driver.getWindowHandles()){
			driver.switchTo().window(windowhandle);
			Thread.sleep(5000);
			System.out.println("Next Window Title : " + driver.getTitle());
			
		}
		
		
		
	}

}
