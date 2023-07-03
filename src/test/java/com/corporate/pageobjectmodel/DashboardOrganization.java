package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashboardOrganization {
	@FindBy(xpath="//span[contains(text(),'Your Organization')]") private WebElement  Organizationtitle ;
	// Add all other file for organization
	
	
	
	public   DashboardOrganization(WebDriver driver) {
	{
		PageFactory.initElements(driver,this);
	}
	}
	public void Organizationdetails() throws InterruptedException
	{ 
	String org=	Organizationtitle.getText();
	System.out.println(org);
	
	
	Thread.sleep(2000);
	}
}
