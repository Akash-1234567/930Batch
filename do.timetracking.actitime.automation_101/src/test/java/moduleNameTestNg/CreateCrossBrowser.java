package moduleNameTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCrossBrowser {
   @Parameters("browser")
	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
	
	
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.google.com/");
	
	}
		
		
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
	WebDriver	driver = 	new FirefoxDriver();
	
	driver.get("https://www.google.com/");
		}
	}
	
	

}