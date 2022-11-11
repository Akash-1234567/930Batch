package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
		this.driver = driver;		
	}
	
	public String verifyHomePage() throws InterruptedException
	{
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
	@FindBy(id = "logoutLink")
    private	WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}	
	
	public void logoutAction()
	{
		logoutButton.click();
	}
public WebElement getLogoutLink()
{
	
	return logoutButton;
}
}
