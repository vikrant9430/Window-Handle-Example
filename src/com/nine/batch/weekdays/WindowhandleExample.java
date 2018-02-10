package com.nine.batch.weekdays;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowhandleExample {
	static String key = "webdriver.gecko.driver";
	static String value =  "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
			+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe";
	static WebDriver driver = null;
	static String url = "http://seleniumwebdriverfaq.tumblr.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector(".blog-name")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String windowhandle : driver.getWindowHandles()){
			driver.switchTo().window(windowhandle);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
	}

}
}
