package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DasboardAddDevicetype {
	//enter device name
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement  Devicename  ;
	//click on add feature
	@FindBy(xpath="//h5[contains(text(),'Add Feature')]") private WebElement  addfeature;
	//select slot
	@FindBy(name="feature-slot") private WebElement  selectslot;
	//enter featurename
	@FindBy(name="feature-name") private WebElement  featurename;
	@FindBy(name="feature-type") private WebElement  featureType;
	@FindBy(xpath="(//input[@type='text'])[3]") private WebElement  devicevalue ;
	@FindBy(xpath="//h5[contains(text(),'Add Setting')]") private WebElement  clickonsetting ;
	@FindBy(name="setting-name") private WebElement  Settingname;
	@FindBy(name="setting-desc") private WebElement  Settingdescription;
	@FindBy(name="setting-namespace") private WebElement  SETNAMESPACE;
	@FindBy(name="setting-value") private WebElement  SETVALUE;
	@FindBy(xpath="//button[@type='submit']") private WebElement  clickonsubmit ;
	@FindBy(xpath="//div[@class='b-toaster b-toaster-top-right']") private WebElement  successmessg  ;
	public  DasboardAddDevicetype(WebDriver driver) {
	{
		PageFactory.initElements(driver,this);
	}
	}
	
	

	public void CLICKONDEVICETEMPLATE(String devicename) throws InterruptedException
	{
		Devicename.sendKeys(devicename);
	Thread.sleep(2000);
	}
	public void ADDFeature() throws InterruptedException
	{ 
		addfeature.click();

	Thread.sleep(2000);
	}
	public void Selectslot(String Feature,String slot ) throws InterruptedException
	{ 
		selectslot.sendKeys(Feature);
		Select slotone = new Select(selectslot);
		//slotone.selectByVisibleText("S02");
		slotone.selectByVisibleText(slot);
	Thread.sleep(2000);
	}
	public void ADDFeaturename(String Featurename) throws InterruptedException
	{ 
		featurename.sendKeys(Featurename);

	Thread.sleep(2000);
	}
	public void ADDFeaturetype(String Featuretype,String type) throws InterruptedException
	{ 
		featureType.sendKeys(Featuretype);
		Select slotone = new Select(selectslot);
		//featuretype.selectByVisibleText("Color Device");
		featureType.selectByVisibleText(type);

	}
	
	public void ADDFeaturevalue(String Feature,String color) throws InterruptedException
	{ 
		
	//if
		{ 
			devicevalue.sendKeys(color);
		}
		//devicevalue.sendKeys(Feature);

	Thread.sleep(2000);
	}
	public void clickonsetting() throws InterruptedException
	{ 
		clickonsetting.click();


	}
	public void settingname(String setname) throws InterruptedException
	{ 
		Settingname.sendKeys(setname);

	
	}
	public void SettingDescription(String setdesp) throws InterruptedException
	{ 
		Settingdescription.sendKeys(setdesp);
	}
	public void Settingnamespace(String setnamespace) throws InterruptedException
	{ 
		SETNAMESPACE.sendKeys(setnamespace);

	}
	
	public void SettingValue(String Settingvalue) throws InterruptedException
	{ 
		SETVALUE.sendKeys(Settingvalue);
	}
	public void submit(String SUBMIT) throws InterruptedException
	{ 
		clickonsubmit.sendKeys(SUBMIT);
	}
	public void Messg(String messg) throws InterruptedException
	{ 
		successmessg.sendKeys(messg);
	}
}
