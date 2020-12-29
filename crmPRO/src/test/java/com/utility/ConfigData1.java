package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData1 {
	private Properties prope;

	public ConfigData1() {
		try{
			File f = new File(".//Config//Create.properties");
			FileInputStream fins = new FileInputStream(f);
			prope = new Properties();
			prope.load(fins);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getName() {
		return prope.getProperty("userName"); 
	}

	public String getPassword() {
		return prope.getProperty("passWord");
	}
	public String getUrl() {

		return prope.getProperty("url");
	}
	public String getTitles() 
	{
		return prope.getProperty("Title");
	}
//	public String getstartDate() 
//	{
//		return prope.getProperty("startDate");
//	}
//	public String getEndData()
//	{
//		return prope.getProperty("EndDate");
//	}
	public String getDescription()
	{
		return prope.getProperty("Description");
	}
	public String getlocation() {
		// TODO Auto-generated method stub
		return prope.getProperty("location");
		}
	public String getReminder_Minutes() {
		// TODO Auto-generated method stub
		return prope.getProperty("Reminder_Minutes");
		}
	
	
	
}
