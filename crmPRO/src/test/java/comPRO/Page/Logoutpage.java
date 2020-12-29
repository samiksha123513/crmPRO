package comPRO.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage 
{
	WebDriver driver=null;
	
	@FindBy(xpath="//div[@role='listbox']")
	WebElement settings ;
	
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement log_out ;

	public Logoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		settings.click();
		log_out.click();
	}
}
