package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpassword {
@FindBy(xpath="//input[@id='login-password']") private WebElement password;
@FindBy(xpath="//div[@class='input-group-text']") private WebElement viewpassword;
@FindBy(xpath="//button[@type='submit']") private WebElement verify;
@FindBy(xpath="(//a[@class])[2]") private WebElement Forgotpassword; 


//ui xpath for password page

//ui elements on login page	
		//indhi logo
	@FindBy(xpath="(//h2[contains(text(),'indhi')])[1]") private WebElement  passw_img_Flag2;
	//title :Verification
	@FindBy(xpath="(//h2[contains(text(),'indhi')])[2]") private WebElement pass_header;//THE WELCOME TEST TO INDHI 
	// Enter your password to access your account 
	@FindBy(xpath="//p[contains(text(),'Enter your password')]") private WebElement pass_header2;
	//indhi header image
	@FindBy(xpath="//img[@src = '/img/login-v2.99da7e4e.svg']") private WebElement password_page_image;





public  loginpassword (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void PASS(String PASSctn)
{
	password.sendKeys(PASSctn);
	System.out.println("PASSWORD:"+PASSctn);
}

public void ViewPASSWORD() {
	viewpassword.click();
}

public void ctnbtn()
{
	verify.click();
}	


public void Clickverify() {
	Forgotpassword.click();
}

public void password_logo() {
	 passw_img_Flag2.isDisplayed();
	 }

public void passwordpageheader() {
	pass_header.isDisplayed();
}

public void PASSWORDPAGEHEADER() {
	pass_header2.isDisplayed();
}
public void  PASSWORDPAGEIMAGE() {
	password_page_image.isDisplayed();
}

}