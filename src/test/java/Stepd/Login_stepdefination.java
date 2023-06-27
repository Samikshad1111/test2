package Stepd;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.swing.ActionMap;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class Login_stepdefination {
	
		WebDriver driver;
		TextContextSetup  testcontextsetup;
		
		public Login_stepdefination(TextContextSetup  testcontextsetup) {
			this.testcontextsetup=testcontextsetup;
		}
		
			
			 @Given("^user login and webapplication$")
		public void login_corporate_app_as_admin() throws InterruptedException {
			System.out.println("Inside step:browser is open");
			String  projectpath=System.getProperty("user.dir");
			System.out.println(projectpath);
			System.getProperty("webdriverdriver.chromedriver",projectpath+"/src/test/resources/DRIVER/chromedriver.exe");
			testcontextsetup.driver = new ChromeDriver();
			//	System.getProperty("webdriverdriver.firefoxdriver",projectpath+"/src/test/resources/DRIVER/geckodriver.exe");
			//	driver= new FirefoxDriver();
			testcontextsetup.driver.manage().window().maximize();
			testcontextsetup.driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

			testcontextsetup.driver.navigate().to("https://app.indhi.io/");


			Thread.sleep(2000);
			testcontextsetup.driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dhi-siddhant");
			testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(2000);
				//click on try another method
				testcontextsetup.driver.findElement(By.xpath("//button[@type='button']")).click();
			
				Thread.sleep(2000);
				testcontextsetup.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Siddhant1!");
				Thread.sleep(2000);
				testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
				 Thread.sleep(5000);
		}


		


	//=============================================
	/*
	@When("user try  to switch account  as a devloper")
			    public void user_try_to_switch_account_as_a_devloper() throws Throwable {
				 
						//click on Switch To Developer
						driver.findElement(By.xpath("//div[@class='font-bold']")).click();
						Thread.sleep(5000);
						//switch to devloper dashboard
						WebElement devloper= driver.findElement(By.xpath("//span[contains(text(),'Switch To Developer')]"));
						Assert.assertEquals(true, devloper.isDisplayed());
						Actions actions=new Actions(driver);
						actions.moveToElement(devloper);
						actions.click().build().perform();
						//devloper.click();
						Thread.sleep(5000);
			 }


			    @Then("^user get redirected to devloper$")
			    public void user_get_redirected_to_devloper() throws Throwable {
			   
			    String act=driver.getCurrentUrl();
			    String exp="https://app.indhi.io/developer/home";
			    	Assert.assertEquals(act, exp);
			       
			    	
			    	
			    	}	
			    	
			    	
			    @And("^in template  create template  successfully$")
			    public void in_template_create_template_successfully() throws Throwable {
			    	
			    	WebElement devloper= driver.findElement(By.xpath("//span[contains(text(),'Templates')]"));
					Assert.assertEquals(true, devloper.isDisplayed());
					Actions actions=new Actions(driver);
					actions.moveToElement(devloper);
					actions.click().build().perform();
					//devloper.click();
					Thread.sleep(5000);
					WebElement create_template=driver.findElement(By.xpath("//button[contains(text(),'Create Template')]"));
					Assert.assertEquals(true,create_template.isDisplayed());
					actions.moveToElement(create_template);
					actions.click().build().perform();

					//enter template name
					WebElement rgekr=driver.findElement(By.xpath("//input[@name='templateName']"));
				Assert.assertEquals(true, rgekr.isDisplayed());
				boolean flagDisplayed= rgekr.isDisplayed();
				if(flagDisplayed==true)
					System.out.println("Element is displayed.");
				else
					System.out.println("Element is not displayed");
				
				
				rgekr.sendKeys("grgryery5yg");
					Thread.sleep(5000);
					System.out.println(driver.getCurrentUrl());
					// in widget click on "+"
					WebElement rgetyjkr=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					Assert.assertEquals(true, rgetyjkr.isDisplayed());
					rgetyjkr.click();
						Thread.sleep(5000);
						//enter widget name
						
						WebElement rgetnbmbyjkr= driver.findElement(By.xpath("//input[@placeholder='Widget Name']"));
						Assert.assertEquals(true,rgetnbmbyjkr.isDisplayed());
						rgetnbmbyjkr.sendKeys("dgrtyvh6y");
						Thread.sleep(5000);
						
						
						// click on  slot
					
								driver.findElement(By.xpath("(//input[@class='select__input'])[1]")).click();
					
					    
					    //select slot
					    
					    //SEELECT METHOD WILL NOT WORK FOR COMBO BOX
					 
					    int position=1;
						for(int i = 0; i <= position; i++){
					      
					        actions.sendKeys(Keys.DOWN).build().perform();
					        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
					       actions.sendKeys(Keys.ENTER).build().perform();
					       
					    
					    
						}
					    
						Thread.sleep(5000);
					    
						//enter widget type
						 driver.findElement(By.xpath("(//input[@class='select__input'])[2]")).click();
						   int Widgettype=1;
							for(int i = 0; i <= Widgettype; i++){
						       
						        actions.sendKeys(Keys.DOWN).build().perform();
						        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
						       actions.sendKeys(Keys.ENTER).build().perform();
						       WebElement rgghmngmhm= driver.findElement(By.xpath("(//div[@class='select__single-value css-yr46hd-singleValue'])[2]"));
						      System.out.println(rgghmngmhm.getText());
						    
						    
							}
						    
					
			    }
			    	
			  */  	
			    	
			 ///===================================

			    @And("^ try to control devices$")
			    public void try_to_control_devices() throws Throwable {

					
			    	
			   	 Thread.sleep(2000);
			   	 WebElement devices= driver.findElement(By.xpath("//input[@name='Devices']"));
			   		Thread.sleep(5000);
			   		

			   	 Assert.assertEquals(true, devices.isDisplayed());
			   	 devices.click();
			   	 Thread.sleep(5000);
			   	 System.out.println(driver.getCurrentUrl());

			   	 System.out.println("device button is displayed");
			   	 WebElement device=driver.findElement(By.xpath("//h5[contains(text(),'importTemplate')]"));
			   	 Assert.assertEquals(true, device.isDisplayed());
			   	 device.click();
			   	 Thread.sleep(2000);
			   	 System.out.println("print all list of device  is displayed");


			   	 Thread.sleep(2000);


			   	 List<String> singleList = new ArrayList<String>();

			   	 List<WebElement> GroupList = driver.findElements(By.xpath("//*[@class='truncate']"));

			   	 for (WebElement element : GroupList) {
			   	     singleList.add(element.getText());
			   	 }

			   	 for (int i = 0; i < singleList.size() - 1; i++) {

			   	     System.out.println(singleList.get(i));
			   	     driver.findElement(By.xpath("(//h6[@class='ml-4'])")).getText();


			   	    
			   	    
			   	 }

			   	 System.out.print(singleList.get(singleList.size() - 1));


			    }
			    

		//============================================================================================================================================
			
			@Given("Open web browser")
			public void open_web_browser() throws InterruptedException  {
				System.out.println("Inside step:browser is open");
				String  projectpath=System.getProperty("user.dir");
				System.out.println(projectpath);

				//System.getProperty("webdriverdriver.firefoxdriver",projectpath+"/src/test/resources/DRIVER/geckodriver.exe");
			//	driver= new FirefoxDriver();

				System.getProperty("webdriverdriver.chromedriver",projectpath+"/src/test/resources/DRIVER/chromedriver.exe");
				testcontextsetup.driver= new ChromeDriver();
				testcontextsetup.driver.manage().window().maximize();
				testcontextsetup.driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				testcontextsetup.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				

				
			}

			@And("Enter corporate url")
			public void enter_corporate_url() throws InterruptedException {
				testcontextsetup.driver.navigate().to("https://app.indhi.io/");
				Thread.sleep(2000);
			}

			@And("Enter username as (.*)$")
			public void enter_username_as_username(String username) {
				testcontextsetup.driver.getTitle();
				testcontextsetup.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			}
		
			@When("Click on sign in")
			public void click_on_sign_in() throws InterruptedException {
				testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();

				Thread.sleep(2000);
			}
			
			@Then("User get error messg")
			public void User_get_error_messg() throws InterruptedException {
				String  messg=testcontextsetup.driver.findElement(By.xpath("//*[@class='ltr:ml-2 rtl:mr-2']")).getText();
				System.out.println(messg);
				Thread.sleep(2000);
				
				
				
			}
			@Then("User  get redirect to otp page")
			public void user_get_redirect_to_otp_page() throws InterruptedException {
				testcontextsetup.driver.findElement(By.xpath("//label[contains(text(),'OTP')]")).isDisplayed();
				Thread.sleep(2000);
			}

			@And("Click on try another to login with password")
			public void click_on_try_another_to_login_with_password() throws InterruptedException {
				testcontextsetup.driver.findElement(By.xpath("//button[@type='button']")).click();
				Thread.sleep(2000);
			}




			@And("Enter password as (.*)$")
			public void enter_password_as_password(String password) throws InterruptedException {
				//Enter password
				testcontextsetup.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
				Thread.sleep(2000);
			}

			
			
			
			
			@When("User forget password and click on forget password")
			public void user_forget_password_and_click_on_forget_password() {
				testcontextsetup.driver.findElement(By.xpath("(//a[@class])[2]")).click();
			}

			@When("User get redirected to reset your password and enter (.*)$")
			public void user_get_redirected_to_reset_your_password_and_enter_email(String email) {
				testcontextsetup.driver.findElement(By.xpath("//input[@id='forgot-password--username']")).sendKeys(email);
			}

			@When("User click on send reset link")
			public void user_click_on_send_reset_link() {
				testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
			}
			@Then("User get error messg on invalid email")
			public void User_get_error_messg_on_invalid_email() throws InterruptedException {
				String  messg=testcontextsetup.driver.findElement(By.xpath("//div[@class='alert-body font-small-2']")).getText();
				System.out.println(messg);
				Thread.sleep(2000);
			}
			@When("Click on verify")
			public void click_on_verify() throws InterruptedException {
				//click on  submit
				testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				

			
				Thread.sleep(2000);
			}
			
			
			@Then("user get success messg")
			public void user_get_success_messg() throws InterruptedException {
				String  messg=testcontextsetup.driver.findElement(By.xpath("//div[@class='alert-body font-small-2']")).getText();
				System.out.println(messg);
				Thread.sleep(2000);
			}
			@Then("click on back to login")
			public void click_on_back_to_login() {
				testcontextsetup.driver.findElement(By.xpath("(//a[@class])[2]")).click();
			}
			@Then("quit browser")
			public void quit_browser() {
				testcontextsetup.driver.quit();
			}
			

			//======================CORPORATE======================================================================================================================
		
			/*@When("user try  to switch account  as a corporate")
		    public void user_try_to_switch_account_as_a_corporate() throws Throwable {
			 
					//click on Switch To Developer
					driver.findElement(By.xpath("//div[@class='font-bold']")).click();
					Thread.sleep(5000);
					//switch to devloper dashboard
					WebElement Corporates= driver.findElement(By.xpath("//span[contains(text(),'Switch To Corporate')]"));
					Assert.assertEquals(true, Corporates.isDisplayed());
					
					
					Actions actions=new Actions(driver);
					actions.moveToElement(Corporates);
					actions.click().build().perform();
					//Corporates.click();
					Thread.sleep(5000);
		 }


		    @Then("^user get redirected to corporate$")
		    public void user_get_redirected_to_corporate() throws Throwable {
		   
		    String act=driver.getCurrentUrl();
		    String exp="https://app.indhi.io/corporate/home";
		    		
		    	Assert.assertEquals(act, exp);
		    }*/
		//===================================REGISTRATION STEPS==============================================================================
			@When("to cretae new account click on cretaenewaccount")
			public void to_cretae_new_account_click_on_cretaenewaccount() {
			
				driver.findElement(By.linkText("Create an account")).click();
			}

			@And("user get redirectto registration page")
			public void user_get_redirectto_registration_page() {
			 System.out.println(driver.getCurrentUrl());
			}

			@And("Enter firstname as (.*)$")
			public void enter_firstname(String firstname) {
				//  Firstname min 1 max :40  char
		driver.findElement(By.id("register-firstname")).sendKeys(firstname);
			}

			@And("Enter lastname as (.*)$")
			public void enter_lastname(String lastname) {
				// lastname min 1 max :40  char
				driver.findElement(By.id("register-lastname")).sendKeys(lastname);
			}

			

		@And("Enter Email as (.*)$")
		public void enter_email_as_tester_dhitechnologies_org(String regemail) {
		    
		    driver.findElement(By.id("register-email")).sendKeys(regemail);
		}

			@And("Enter mobile as (.*)$")
			public void enter_mobile(String num) {
				driver.findElement(By.id("register-mobile")).sendKeys(num);
			}

			@And("Enter REGPASSWORD (.*)$")
			public void enter_reg_password(String regpassword) {
				driver.findElement(By.id("register-password")).sendKeys( regpassword);
			}

			@And("user select terms and conditon")
			public void user_select_terms_and_conditon() {
				driver.findElement(By.id("register-privacy-policy")).isSelected();
			}

			@When("User click on signup")
			public void user_click_on_signup() {
				driver.findElement(By.xpath("//button[@type='submit']")).click();
			}

			@Then("User recive Errormessage")
			public void user_recive_messg() throws InterruptedException {
				String  regerrormessg=driver.findElement(By.xpath("//div[@class='alert-body font-small-2']")).getText();
				System.out.println(regerrormessg);
				Thread.sleep(2000);
			}
			//=================================================================================================================
			
			
			
			
			
			@Then("User redirect to dashboard")
			public void user_redirect_to_dashboard() throws InterruptedException {
				
				testcontextsetup.driver.findElement(By.xpath("//h3[contains(text(),'Group List')]")).isDisplayed();
				Thread.sleep(1000);
				
				
			}
			@And("Wait Otp one time to end")
			public void wait_otp_one_time_to_end() throws InterruptedException {
				TimeUnit.MINUTES.sleep(2);
				
			}

			@Then("Click on  Resend otp")
			public void click_on_resend_otp() {
				//click on resend otp 1st time
						driver.findElement(By.xpath("(//a[@class])[2]")).click();
						System.out.println(driver.getCurrentUrl()); 
			}

			@And("Wait Otp second  time to end")
			public void wait_otp_second_time_to_end() throws InterruptedException {
				TimeUnit.MINUTES.sleep(2);
			}

			@Then("Click second time  on Resend otp")
			public void click_second_time_on_resend_otp() {
				//click on resend otp 2st time
				driver.findElement(By.xpath("(//a[@class])[2]")).click();
				System.out.println(driver.getCurrentUrl());
			}

			
			@And("user is on verify email page")
			public void user_is_on_verify_email_page() {
				driver.findElement(By.xpath("//h2[contains(text(),' Verify Email ')]")).isDisplayed();
			
			}
			
			
			
			
			






		//============================================================================================================



		@Then("user logout and quitebrowser")
		public void user_logout_and_quitebrowser() throws InterruptedException {
			//click on profile
			 testcontextsetup.driver.findElement(By.xpath("//div[@class='font-bold']")).click();
			Thread.sleep(5000);
			WebElement logout=  testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
			 Assert.assertEquals(true, logout.isDisplayed());
			 Actions actions = new Actions( testcontextsetup.driver);
			// logout.click();
			 actions.moveToElement(logout);
			 actions.click().build().perform();
			 testcontextsetup.driver.quit();
				
				 
				
		}
		
	}

		



