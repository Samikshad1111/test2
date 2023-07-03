package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardGroups {

	public DashboardGroups(WebDriver driver) {
		{
			PageFactory.initElements(driver,this);
		}
	}
}
