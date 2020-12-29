package comPRO.Page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver=null;
	

	@FindBy(css="#navbar-collapse > ul > li:nth-child(2) > a")
	WebElement signup;
	
	@FindBy(css="body > div.ui.middle.aligned.center.aligned.grid > div > a")
	WebElement Log_in_here;
	
	   
	@FindBy(name="email")
	WebElement userTextbox;
	
	@FindBy(name="password")
	WebElement PassWordTextbox;
	
	@FindBy(css="#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")
	WebElement LogIn;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void LogIn(String userName,String passWord )
	{
		signup.click();
		ArrayList<String> tabs2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Log_in_here.click();
		userTextbox.sendKeys(userName);
		PassWordTextbox.sendKeys(passWord);
		LogIn.click();
	}	
}
