package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardDevices {
// yet to devlop
	
	
	public DashboardDevices (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
