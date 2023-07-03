package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginotp {
	//click on try another method
	@FindBy(xpath = "(//a[@class])[3]") private WebElement tryotp;
	//click on resend otp
	@FindBy(xpath = "(//a[@class])[2]") private WebElement resendOTP;
	//ui visible :title: Verify email
	@FindBy(xpath = "//h2[contains(text(),' Verify Email ')]") private WebElement verifyemail;
	
	//	indhi logo
	
	@FindBy(xpath="(//h2[contains(text(),'indhi')])[1]") private WebElement  img_Flag2;
	//ui visible :Enter the otp send to your email address 
	@FindBy(xpath="//p[contains(text(),' Enter the OTP sent to your email')]") private WebElement header_enteremailotp;
	
	
	
	
	
	public loginotp(WebDriver driver) {
		{
			PageFactory.initElements(driver, this);
		}
	}
		public void tam()
		{
			 tryotp.click();
			
			 
		}

		public void tryisdisplayed()
		{
			
			 tryotp.isDisplayed();
			 
		}
		public void ResendOTP()
		{
			
			resendOTP.click();
			if(resendOTP.isDisplayed())
			{
				resendOTP.click();
			}
			else
			{
				System.out.println("Resend otp is not  visible ");
			}
			
			 
		}
		public void titleisdisplayed()
		{
			
			verifyemail.isDisplayed();
			 
		}
		
		public void IndhiIMAGE()
		{
           img_Flag2.isDisplayed();

           System.out.println("LOGO IS VISIBLE : "+img_Flag2.isDisplayed());

		}
		
		public void header_emailotp()
		{
			header_enteremailotp.isDisplayed();

           System.out.println("LOGO IS VISIBLE : "+img_Flag2.isDisplayed());

		}
}
