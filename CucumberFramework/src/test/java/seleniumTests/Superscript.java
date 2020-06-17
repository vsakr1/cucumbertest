package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superscript {
	
	WebDriver driver;
	
	public void launch_driver()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\savakati\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();

		
	}
	
	public void quit_driver()
	{
		
		driver.quit();
	}

}
