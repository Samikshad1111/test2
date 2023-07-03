package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDeviceInventory {
	//data (6 to 15)
@FindBy(xpath="//span[contains(text(),'Add Inventory')]") private WebElement Addinventory;
@FindBy(xpath="//input[@placeholder='Enter Name']")  private WebElement Name;
@FindBy(xpath="//input[@placeholder='Enter Model Number']") private WebElement  ModelNumber;
@FindBy(xpath="//input[@placeholder='Enter Serial Number']")private WebElement SerialNumber;
@FindBy(xpath="//input[@placeholder='Enter Firmware Version']")private WebElement  Firmware;
@FindBy(xpath="//input[@placeholder='Enter SSID']") private WebElement  SsID;
@FindBy(xpath="//input[@placeholder='Enter SSID Passkey']") private WebElement  SSIDPasskey;
@FindBy(xpath="//input[@placeholder='Enter Wifi MAC address']") private WebElement WifiMAC;
@FindBy(xpath="//input[@placeholder='Enter Wifi AP MAC address']") private WebElement APMAC;
@FindBy(xpath="//input[@placeholder='Enter BLE MAC address']") private WebElement BLEMAC ;
@FindBy(xpath="//input[@placeholder='Enter Hardware Version']") private WebElement  Hardware ;

@FindBy(xpath="//input[@placeholder='Enter Hardware Version']") private WebElement  devicetype;
@FindBy(xpath="//input[@placeholder='Enter Hardware Version']") private WebElement  chipset ;
@FindBy(xpath="//input[//button[@type='submit']]") private WebElement  invsubmit ;
public  DashboardDeviceInventory(WebDriver driver) {
{
	PageFactory.initElements(driver,this);
}
}
public void ADDINVENTOIRY() throws InterruptedException
{ Addinventory.click();

Thread.sleep(2000);}
/*
@FindBy(xpath="//span[contains(text(),'Add Inventory')]")).click();
.sendKeys("test");
.sendKeys("EC100");
.sendKeys("UZD0436TCPZ1X");
).sendKeys("0.1");
.sendKeys("TMA59YGXX3JXYDB33NR3XNMML0WL41FU");
.sendKeys("VV87510B94W48I4BYVHJV1318PE0BMPUN6XFDNOOMWOZACBCK0OXLIIPA1UYC7P");
.sendKeys("999999999999");
.sendKeys("78777887788");
.sendKeys("889900990099");
.sendKeys("0.1");*/
public void NAME(String name) throws InterruptedException
{ 
	Name.sendKeys(name);

Thread.sleep(2000);}

public void MODELNUMBER(String MODEL) throws InterruptedException
{ 
	ModelNumber.sendKeys(MODEL);

Thread.sleep(2000);}

public void SERIALNUMBER(String SERIALNO) throws InterruptedException
{
	SerialNumber.sendKeys(SERIALNO);

Thread.sleep(2000);
}
public void FIRMWARE(String firmware) throws InterruptedException
{
	Firmware.sendKeys(firmware);

Thread.sleep(2000);
}
public void SSID (String sid) throws InterruptedException
{
	SsID.sendKeys(sid);

Thread.sleep(2000);
}
public void SSIDPASSKEY (String ssidkey) throws InterruptedException
{
	SSIDPasskey.sendKeys(ssidkey);

Thread.sleep(2000);
}
public void WIFIMACID(String wifiId) throws InterruptedException
{
	WifiMAC.sendKeys( wifiId);

Thread.sleep(2000);
}
public void APMACID(String APmacid) throws InterruptedException
{
	APMAC.sendKeys( APmacid);

Thread.sleep(2000);
}

public void BLEMACID(String blemacId) throws InterruptedException
{
	BLEMAC.sendKeys(blemacId);

Thread.sleep(2000);
}

public void HARDWAREVERSION(String HV) throws InterruptedException
{
	Hardware.sendKeys(HV);

Thread.sleep(2000);
}
}
