package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Dashboarduserprofile  {
@FindBy(xpath="(//a[@role='button'])[2]") private WebElement Profile;
@FindBy(xpath = "(//a[@role='menuitem'])[1]") private WebElement set;
@FindBy(xpath = "(//a[@role='menuitem'])[2]") private WebElement bill;
@FindBy(xpath = "(//a[@role='menuitem'])[3]") private WebElement faq ;
@FindBy(xpath = "(//a[@role='menuitem'])[4]") private WebElement logout;



public Dashboarduserprofile(WebDriver driver) {
{
	PageFactory.initElements(driver,this);
}
}
public void PROFILE() throws InterruptedException
{
Profile.click();


Thread.sleep(2000);}
public void SETTING() throws InterruptedException
{
set.click();

Thread.sleep(2000);
}
public void BILLING() throws InterruptedException
{
bill.click();

Thread.sleep(2000);}
public void FAQ() throws InterruptedException
{
faq.click();

Thread.sleep(2000);}
public void logout() throws InterruptedException
{
logout.click();

}}