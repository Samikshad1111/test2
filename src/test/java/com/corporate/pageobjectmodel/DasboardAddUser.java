package com.corporate.pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasboardAddUser {
	
	@FindBy(xpath = "//input[@id='first-name']") private WebElement FNAME;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement LNAME;
	@FindBy(xpath = "//input[@id='email']") private WebElement EMAIL;
	@FindBy(xpath = "//input[@id='contact']") private WebElement CONTACT;
	@FindBy(xpath = "//input[@id='user-role']") private WebElement ROLE;
	@FindBy(xpath = "//div[@id='vs1__combobox']") private WebElement  DROPDOWN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ADDUSERbtn;
	@FindBy(xpath = "//button[@type='Cancel']") private WebElement CANCELbtn;
	@FindBy(xpath = "//div[@class='b-toaster b-toaster-top-right']") private WebElement  successmessg;
	
	

public DasboardAddUser (WebDriver driver) {
	{
		PageFactory.initElements(driver,this);
	}
}
public void Firstname(String fname) throws InterruptedException
{
	FNAME.sendKeys(fname);

Thread.sleep(2000);}

public void Lastname(String lname) throws InterruptedException
{
	LNAME.sendKeys(lname);;

Thread.sleep(2000);}
public void Email(String email) throws InterruptedException
{
	EMAIL.sendKeys(email);

Thread.sleep(2000);}
public void Contact(String Cnumber) throws InterruptedException
{
	CONTACT.sendKeys(Cnumber);

Thread.sleep(2000);}
public void Role() throws InterruptedException
{
	ROLE.click();

Thread.sleep(2000);
}
public void DROPdown()
{
	
	}
public void SUBMIT() throws InterruptedException
{
	ADDUSERbtn.click();

Thread.sleep(2000);}
public void CANCEL() throws InterruptedException
{
	CANCELbtn.click();

Thread.sleep(2000);}
}
