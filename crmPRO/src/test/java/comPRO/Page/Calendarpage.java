package comPRO.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Calendarpage {
	WebDriver driver = null;
	
	@FindBy(xpath = "//span[text()='Calendar']")
	WebElement Calendar;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement New;

	@FindBy(name = "title")
	WebElement TitleTextbox;

	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input")
	 WebElement StartDate;
	
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]")
	 WebElement StartDate_Textbox;
	 
	 @FindBy(xpath = "//li[text()='01:00']")
		WebElement Time_Textbox;

	
	@FindBy(name = "category")
	WebElement Category;
	
	@FindBy(xpath = "//span[text()='Meeting']")
	WebElement meeting;

	@FindBy(name = "description")
	WebElement DescriptionTextbox;

	@FindBy(name = "location")
	WebElement locationTextbox;
	
	@FindBy(xpath = "//div[@class='ui toggle checkbox' ]")
	WebElement All_Day;
	
	@FindBy(name = "minutesBefore")
	WebElement Alert_Before;
	
	@FindBy(xpath = "//div[@aria-expanded='true']")
	WebElement AlertVia ;
	
//	@FindBy(xpath = "//span[text()='Email']")
//	WebElement Alert_Via ;
	
	@FindBy(name = "reminder_minutes")
	WebElement Reminder_minutes ;

	@FindBy(xpath = "//span[text()='Pravin Naikwade']")
	WebElement Assigned_To ;
	
	public Calendarpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Horizontal(String Title, String Description, String location,String Reminder_Minutes) {
		Calendar.click();
		New.click();
		TitleTextbox.sendKeys(Title);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 StartDate.click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println(StartDate);
		 
		 StartDate_Textbox.click();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Time_Textbox.click();
		 System.out.println(Time_Textbox);
		// endDate.click();
		// End_Date_Textbox.sendKeys(EndDate);
		Category.click();
		meeting.click();
		DescriptionTextbox.sendKeys(Description);
		locationTextbox.sendKeys(location);
		All_Day.click();
		Alert_Before.click();
		AlertVia.click();
		//Alert_Via.click();
		//driver.navigate().back();
		Reminder_minutes.sendKeys(Reminder_Minutes);
		Assigned_To.click();
	}
}
