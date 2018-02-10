package gr.noi.windowhandle.example;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle_Example {

	static String key = "webdriver.gecko.driver";
	static String value =  "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
			+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe";
	static WebDriver driver = null;
	static String url = "http://seleniumwebdriverfaq.tumblr.com";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty(key, value);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.navigate().to(url);
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[4]/div/a[1]/strong")).click();
		
		Set<String> count = driver.getWindowHandles();
		/*Collection<String> value = driver.getWindowHandles();*/
		int totalwindow = count.size();
		
		System.out.println("Window Handle Value:" + count) ;
		System.out.println("Total Window :" + totalwindow);
		
		for(String windowhandle : driver.getWindowHandles()){
			driver.switchTo().window(windowhandle);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			
			
		}
	}

}
