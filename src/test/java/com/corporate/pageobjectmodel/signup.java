package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
@FindBy(xpath="//input[@id='register-firstname']") private WebElement firstname;
@FindBy(xpath="//input[@id='register-lastname']") private WebElement lastname;

@FindBy(xpath="//input[@id='register-email']") private WebElement email;
@FindBy(xpath="//input[@id='register-mobile']") private WebElement mobileno;

@FindBy(xpath="//input[@id='register-password']") private WebElement PASSWord;

@FindBy(xpath="//div[@class='input-group-text']") private WebElement signup;

public signup (WebDriver driver) {
	{
		PageFactory.initElements(driver, this);
	}
}
public void FIRSTNAME(String Fname)
{
	firstname.sendKeys(Fname);}

public void LASTNAME(String Lname)
{
	lastname.sendKeys(Lname);}

public void EMAIL(String Email)
{
	email.sendKeys(Email);}

public void MOBILE(String MOB)
{
mobileno.sendKeys(MOB);}

public void PASSWORD(String Pass)
{
	PASSWord.sendKeys(Pass);}

public void SIGNUP(String signin)
{
	signup.click();
}
}