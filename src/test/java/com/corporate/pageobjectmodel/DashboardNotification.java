package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardNotification {
	//not yet develope
	public  DashboardNotification(WebDriver driver) {
		{
			PageFactory.initElements(driver,this);
		}
	}
}
