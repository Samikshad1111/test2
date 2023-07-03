package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardSetting {

	
	
	

public DashboardSetting (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
