package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DASHBOARD {
@FindBy(xpath="//span[contains(text(),'User')]") private WebElement user;
@FindBy(xpath="//span[contains(text(),'Groups')]") private WebElement group;
//loginto button 
@FindBy(xpath="(//span[contains(text(),'Inventory')])[2]") private WebElement inventory;

//To click on sign up
@FindBy(xpath="//span[contains(text(),'Devices')]") private WebElement devices;
@FindBy(xpath="//span[contains(text(),'Device Template')]") private WebElement devicetemplate;
@FindBy(xpath="//span[contains(text(),'Organization')]") private WebElement organization;
@FindBy(xpath="(//span[contains(text(),'Settings')])[2]") private WebElement setting;
@FindBy(xpath="(//a[@class='nav-link'])[2]") private WebElement darktheme;

@FindBy(xpath="//p[@class='user-name font-weight-bolder mb-0']") private WebElement dashboardusername;



public DASHBOARD(WebDriver driver) {
	{
		PageFactory.initElements(driver,this);
	}
}
public void User() throws InterruptedException
{
	user.click();

Thread.sleep(2000);

	}


		public void Groups() throws InterruptedException
		{
			group.click();
			Thread.sleep(2000);
		}
		public void Devices()
		{
devices.click();
		}
		
			public void Inventory() throws InterruptedException
			{
				inventory.click();
				Thread.sleep(2000);
			}
		
		

			public void Devicetemplate() throws InterruptedException
			{
				devicetemplate.click();
				Thread.sleep(2000);
			}

			public void Organization() throws InterruptedException
			{
				 organization.click();
					Thread.sleep(2000);
			}

			public void Setting() throws InterruptedException
			{
				setting.click();
				Thread.sleep(2000);
			}
			public void DARKTHEME() throws InterruptedException
			{
				 darktheme.click();
					Thread.sleep(2000);
			}
			public void DashboardUsername() throws InterruptedException
			{
				dashboardusername.getText();
				dashboardusername.isDisplayed();
					Thread.sleep(2000);
			}
		}
		
		
		