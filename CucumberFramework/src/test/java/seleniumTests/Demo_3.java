package seleniumTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.*;

public class Demo_3{
	
	@Test
	public  void demo_3() throws InterruptedException {
	
	WebDriver driver;
	/*public WebDriver launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\testautomation-runtime\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}*/
	
	//public  void googletest() throws InterruptedException, IOException{
		
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\savakati\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();

	//extent.startReport();
	driver.get("https://www.google.com");
	

	
	//logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	Thread.sleep(5000);
	
	//driver.manage().window().fullscreen();
	
	String Title=driver.getTitle();
	
	
	System.out.println(Title);

	
	
	String currenturl=driver.getCurrentUrl();
	
	System.out.println(currenturl);
	
	driver.findElement(By.xpath("//div//input[@value='Google Search']")).isDisplayed();
	
	//test.log(LogStatus.FAIL, "Google Search Button is not displaying");
	
	//String hyperlink = "<a href = '"+captureScreenShot()+"'>"+message+"</a>";
   
   
	
	driver.findElement(By.xpath("//div/input[@title='Search']")).sendKeys("Selenium");
	
	driver.findElement(By.xpath("//div/input[@title='Search']")).submit();
	
	
	driver.close();
	driver.quit();
	


	
	
	
	

	}
	
	
}
