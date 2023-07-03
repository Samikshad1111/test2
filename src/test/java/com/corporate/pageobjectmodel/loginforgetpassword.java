package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginforgetpassword {
	@FindBy(xpath="(//a[@class])[2]") private WebElement backtologin;
	
		@FindBy(xpath="(//h2[contains(text(),'indhi')])[1]") private WebElement  forgetimg_Flag2;

		@FindBy(xpath="//h4[contains(text(),' Forgot your Password?')]") private WebElement fogetpasswordtitle;
		@FindBy(xpath="//img[@src = '/img/forgot-password-v2.cdb8f691.svg']") private WebElement forgetheaderImage;
	@FindBy(xpath="//button[@type='submit']") private WebElement sendresetlink;
	@FindBy(xpath="//input[@id='forgot-password--username']") private WebElement forgotusernameemail;
	public  loginforgetpassword (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ENTEREMAIL(String setemail)
	{
		forgotusernameemail.sendKeys(setemail);
		System.out.println("PASSWORD:"+setemail);
	}
	public void CLICKRESENDLINK()
	{
		sendresetlink.click();
	}
	public void FORGETPAGEIMAGE()
	{
		forgetheaderImage.isDisplayed();
		
	}
	public void PAGELOGO()
	{
		 forgetimg_Flag2.isDisplayed();
		
	}
	
	public void CLICKONBACKTOLOGIN()
	{
		backtologin.click();
		
	}
	public void FOGETPAGETITLE()
	{
		fogetpasswordtitle.isDisplayed();
		
	}
}
