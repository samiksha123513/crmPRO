package comPRO.Test;
import org.testng.annotations.Test;

import comPRO.Page.Calendarpage;
import comPRO.Page.Loginpage;
import comPRO.Page.Logoutpage;

public class TC_001 extends TestBase1
{

	@Test(priority=1)
	public void LogInTest()
	{
		
		Loginpage home=new Loginpage(driver);
		home.LogIn(config.getName(),config.getPassword());
		//home.LogIn("pravinnaikwade121@gmail.com","Pravin8080");
		//home.Horizontal(config.getTitles());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void HorizontalTest()
	{
		Calendarpage Calendar=new Calendarpage(driver);
		Calendar.Horizontal(config.getTitles(),config.getDescription(),config.getlocation(),config.getReminder_Minutes());
	
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	@Test(priority=3)
	public void LogoutTest()
	{
		Logoutpage log=new Logoutpage(driver);
	}
	
	
	
}
