package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_1 {
	private static WebDriver driver;
	
	@Test
	public void demo_1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\savakati\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.get("http://www.shop.demoqa.com");

		driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");

	  driver.quit();
		
		

	}

}