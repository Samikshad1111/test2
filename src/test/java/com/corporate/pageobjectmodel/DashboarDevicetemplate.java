package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashboarDevicetemplate {
	public 	WebDriver driver;
	// this class have pom of device template 
	//step defination:step_devicestemplate
	@FindBy(xpath="//span[contains(text(),'Device Template')]") private WebElement  CreateNewDevice  ;
	@FindBy(xpath="//span[contains(text(),'Create New Device Template')]") private WebElement  clickonCreateNewDevice  ;
	//enter device name
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement  devicename  ;
	//click on add feature
	@FindBy(xpath="//h5[contains(text(),'Add Feature')]") private WebElement  addfeature  ;
	//select slot
	@FindBy(name="feature-slot") private WebElement  selectslot;
	//enter featurename
	@FindBy(name="feature-name") private WebElement  featurename;
	@FindBy(name="feature-type") private WebElement  featuretype;
	@FindBy(xpath="//button[@type='submit']") private WebElement  clickonsubmit ;
	@FindBy(xpath="//div[@class='b-toaster b-toaster-top-right']") private WebElement  successmessg  ;
	
	@FindBy(xpath="") private WebElement details;
	@FindBy(xpath="") private WebElement delete;
	
	
	public  DashboarDevicetemplate(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void CLICKONDEVICETEMPLATE() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void view_device_type_details() throws InterruptedException
	{
		clickonCreateNewDevice.click();
	Thread.sleep(2000);
	}
	
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}public void delete_device_type() throws InterruptedException
	{
		CreateNewDevice.click();
	Thread.sleep(2000);
	}
	
	
	
}
