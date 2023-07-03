package com.corporate.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginusername {
	public 	WebDriver driver;
	//pageobjectmodel file for login 
	//decalation
	//to enter field on user name or email
		@FindBy(xpath="//input[@id='login-username']") private WebElement UNAME;
		//loginto button 
		@FindBy(xpath="//button[@type='submit']") private WebElement loginto;
	
//To click on sign up
		@FindBy(xpath="//button[@type='submit']") private WebElement createACCOUNT;
		@FindBy(xpath="//div[@class='alert-body font-small-2']") private WebElement RESPONSEMESSG;
		
	//ui elements on login page	
		//indhi logo
	@FindBy(xpath="(//h2[contains(text(),'indhi')])[1]") private WebElement  img_Flag2;
	//title :welcome to indhi
	@FindBy(xpath="(//h2[contains(text(),'indhi')])[2]") private WebElement img_welcome;//THE WELCOME TEST TO INDHI 
	//please sign in to account aand stat adventure
	@FindBy(xpath="//p[contains(text(),' Please sign-in ')]") private WebElement img_welcome3;
	//indhi header image
	@FindBy(xpath="//img[@src = '/img/login-v2.99da7e4e.svg']") private WebElement headerImage;
	//create account link
	@FindBy(linkText ="Create an account") private WebElement createaccount;	
	
		
		
		//initalization

public loginusername(WebDriver driver) {
			{
				this.driver=driver;
			}
		}
		
		
		//usage
public void setusername(String username)
		{
			UNAME.sendKeys(username);
			System.out.println("USERNAME:"+username);
		}
public void clicklogbtn()
		{
			//loginto.click();
			System.out.println("SIGNIN  BUTTON IS VISIBLE : "+loginto.isDisplayed());
			System.out.println("SIGNIN  BUTTON IS CLICKABLE  : "+loginto.isEnabled());
			loginto.click();
		}
		


public void responsemessg() throws InterruptedException
{
	String  messg=RESPONSEMESSG.getText();
	System.out.println(messg);
	Thread.sleep(2000);

	
}
public void IIMAGE()
			{
	img_Flag2.isDisplayed();

	System.out.println("LOGO IS VISIBLE : "+img_Flag2.isDisplayed());

			}



public void WELCOMETEXT()
{
	img_welcome.isDisplayed();
	String LINE1=img_welcome.getText();
	System.out.println("WELCOME TEXT ON LOGIN PAGE: "+LINE1);
}
public void WELCOMELINES()
{
	String LINE2=img_welcome3.getText();
	System.out.println("TEXT ON LOGIN PAGE: "+LINE2);
}
public void IMAGE2()
{
	headerImage.isDisplayed();
	
	System.out.println("IMAGE DISPLAYED: "+headerImage.isDisplayed());
}
public void CreateAccountLink()
{
	createaccount.click();
}

}
