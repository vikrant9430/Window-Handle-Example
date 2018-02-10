package com.nine.batch.weekdays;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QASoftEarthWindowHandle {
	static String key = "webdriver.gecko.driver";
	static String value =  "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
			+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe";
	static WebDriver driver = null;
	static String url = "https://www.qasoftearth.com";


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		String win = driver.getWindowHandle();
		System.out.println(win);
		System.out.println(driver.getTitle());
		
		WebElement qasoft = driver.findElement(By.cssSelector("#tohash > i"));
		qasoft.click();
		
		Thread.sleep(5000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		WebElement element = wait.until(ExpectedConditions
				
		.elementToBeClickable((By.cssSelector("div.col-sm-4:nth-child(1) > div:nth-child(2) > h3:nth-child(1) > a:nth-child(1)"))));
		element.click();
		Thread.sleep(5000);
		
		Set<String> count = driver.getWindowHandles();
		System.out.println("Total tab in browser " + count);
		

	}

}
