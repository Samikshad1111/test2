package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashboardUser  {
//ADMIN CAN CHANGE ROLE OF MEMBER EDIT AND DELETE USER
	//FETCH USER  LIST WITH USER , EMAIL , ROLE , STATUS , ACTION 
	@FindBy(xpath = "(//span[contains(text(),'Add User')])[2]") private WebElement ADDUSER;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement FNAME;

	
	
	

public  DashboardUser(WebDriver driver) {
	{
		PageFactory.initElements(driver,this);
	}
}
public void Firstname() throws InterruptedException
{
	FNAME.click();

Thread.sleep(2000);}



	
}
