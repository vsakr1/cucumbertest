package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo_2 {
	
	@Test
	public  void Demo_2() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\savakati\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	
		Thread.sleep(5000);
		
		//driver.manage().window().fullscreen();
		
		String Title=driver.getTitle();
		
		System.out.println(Title);

		String currenturl=driver.getCurrentUrl();
		
		System.out.println(currenturl);
		
		driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		
			
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vsakr2@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai1234.");
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		Thread.sleep(15000);
		
		driver.close();
		driver.quit();
		

		


		
		
		
		
		

	}

}
