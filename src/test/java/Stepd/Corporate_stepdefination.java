package Stepd;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Utils.TextContextSetup;
import io.cucumber.java.en.*;
public class Corporate_stepdefination {

		TextContextSetup  testcontextsetup;
		WebDriver driver;
		public  Corporate_stepdefination(TextContextSetup  testcontextsetup) {
			this.testcontextsetup=testcontextsetup;
		}
		
		@When("user try  to switch account  as a corporate")
	    public void user_try_to_switch_account_as_a_corporate() throws Throwable {
		 
				//click on Switch To Developer
			WebElement profile= testcontextsetup.driver.findElement(By.xpath("//div[@class='font-bold']"));
			Actions actions=new Actions(testcontextsetup.driver);
			actions.moveToElement(profile);
			actions.click().build().perform();
			//Corporates.click();
			Thread.sleep(5000);
				Thread.sleep(5000);
				//switch to devloper dashboard
				WebElement Corporates=testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Switch To Corporate')]"));
				Assert.assertEquals(true, Corporates.isDisplayed());
				
				
				
				actions.moveToElement(Corporates);
				actions.click().build().perform();
				//Corporates.click();
				Thread.sleep(5000);
	 }

	//=====================//Corporate dashboard==============================================================
	    @Then("^user get redirected to corporate$")
	    public void user_get_redirected_to_corporate() throws Throwable {
	   
	    String act=testcontextsetup.driver.getCurrentUrl();
	    String exp="https://app.indhi.io/corporate/home";
	    		
	    	Assert.assertEquals(act, exp);
	    }
	    
	    

		@Given("Admin on dashboard")
		//not in use
		public void admin_on_dashboard() throws InterruptedException {
			//on corporate dashboard
			WebElement dashboard=testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]"));
			Assert.assertEquals(true, dashboard.isDisplayed());
		
		}

		@When("on dashboard admin click on  User")
		public void on_dashboard_admin_click_on_user() throws InterruptedException {
			WebElement User=testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'User')]"));
			Assert.assertEquals(true,User.isDisplayed());
			System.out.println(testcontextsetup.driver.getCurrentUrl());
			Actions actions=new Actions(testcontextsetup.driver);
			actions.moveToElement(User);
			actions.click().build().perform();
			Thread.sleep(1000);
		}

		@Then("admin get redirect to user page")
		public void admin_get_redirect_to_user_page() throws InterruptedException {
			 WebElement userlist= testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'User')]"));
		Assert.assertEquals(true,userlist.isSelected());
		
		}

		@When("on dashboard admin click on  group")
		public void on_dashboard_admin_click_on_group() throws InterruptedException {
			WebElement group=testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Groups')]"));
			Assert.assertEquals(true,group.isDisplayed());
			System.out.println(testcontextsetup.driver.getCurrentUrl());
			Actions actions =new Actions(testcontextsetup.driver);
			actions.moveToElement(group);
			actions.click().build().perform();
			Thread.sleep(1000);
		}

		@Then("admin get redirect to group page")
		public void admin_get_redirect_to_group_page() {
			System.out.println(testcontextsetup.driver.getCurrentUrl());
		}
			
















		//================================ADDUSER=================================================================

		@When("^admin   enter adduser details(.+), (.+) ,(.+),(.+),(.+)$")
	    public void admin_click_on_enter_adduser_details(String name,String lname,String EmaIL,String phonenumber,String password) throws Throwable {
			testcontextsetup.driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
			testcontextsetup.driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
			testcontextsetup.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmaIL);	
			testcontextsetup.driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
			testcontextsetup.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			testcontextsetup.driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			testcontextsetup.driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
			testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
			WebElement skjd=testcontextsetup.driver.findElement(By.xpath("//div[@type='danger']"));
			if(skjd.isDisplayed());
			{
				System.out.println(skjd);
				Thread.sleep(2000);
				testcontextsetup.driver.findElement(By.xpath("//button[@type='button']")).click();
			} 		
				
			Thread.sleep(5000);
			
			String act=testcontextsetup.driver.getCurrentUrl();
			String exp="https://app.indhi.io/corporate/user-list";
			Assert.assertEquals(act, exp);
		}
		

		@When("User click on add user")
		public void user_click_on_add_user() throws InterruptedException {
			Reporter.log("to verify element user on dashboard",true);
			testcontextsetup.driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();	
		Thread.sleep(5000);
			System.out.println(testcontextsetup.driver.getCurrentUrl());
			Thread.sleep(1000); 
		}

		@And("Admin  Enter firstname as (.*)$")
		public void admin_enter_firstname(String name) {
			testcontextsetup.driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
		}

		@And("Admin Enter Lastname as (.*)$")
		public void admin_enter_lastname(String lname) {
			testcontextsetup.driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);	
		}

		@And("Admin Enter Email as (.*)$")
		public void admin_enter_email(String EmaIL) {
			testcontextsetup.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmaIL);	
		}

		@And("Admin Enter phone number as (.*)$")
		public void admin_enter_phone_number(String phonenumber) {
			testcontextsetup.driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		}

		@And("Admin Enter User role")
		//NOT YET IMPLEMENTED ROLES
		public void admin_enter_user_role() throws InterruptedException {
			 driver.findElement(By.xpath("//input[@id='user-role']")).click();
			 driver.findElement(By.xpath("//div[@id='vs1__combobox']"));
				int roleposition = 5;
				for (int i=0; i<=roleposition;i++)
				{
					Actions actions=new Actions(driver);
					actions.sendKeys(Keys.DOWN).build().perform();
					actions.sendKeys(Keys.DOWN).build().perform();
					actions.sendKeys(Keys.DOWN).build().perform();
					actions.sendKeys(Keys.DOWN).build().perform();
					//Actions actions =new Actions(driver);
					actions.sendKeys(Keys.ENTER).build().perform();
				}
				Thread.sleep(5000);
		}

		@And("click on AddUser")
		public void click_on_add_user() throws InterruptedException {
			testcontextsetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(1000);
		}
		@And("click_on_CANCEL")
		public void click_on_CANCEL() throws InterruptedException {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(1000);
		}
		@Then("Admin recive success or error messg")
		public void admin_recive_success_or_error_messg() throws InterruptedException {
			String  messg=driver.findElement(By.xpath("//div[@class='b-toaster b-toaster-top-right']")).getText();
			System.out.println(messg);
			Thread.sleep(2000);
		}






		//=================================== INVENTORY==============================================================
	//here steps are broken into small as modules in corporate are complex 
	    // Individual complete inventory and template step defination are add seperately

		@Given("on dashboard admin click on  INVENTORY")
		public void on_dashboard_admin_click_on_inventory() {
			driver.findElement(By.xpath("(//span[contains(text(),'Inventory')])[2]")).click();
		}

		@Then("admin get redirect to Inventory page")
		public void admin_get_redirect_to_inventory_page() throws InterruptedException {
		Thread.sleep(2000);
		   System.out.println(driver.getCurrentUrl());
		}

		@When("User click on ADD INVENTORY")
		public void user_click_on_add_inventory() {
			 driver.findElement(By.xpath("//span[contains(text(),'Add Inventory')]")).click();
		}

		@When("Enter inventory Name as (.*)$")
		public void enter_inventory_name(String invname) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(invname);
		}

		@When("Enter inventory MODEL NUMBER as (.*)$")
		public void enter_inventory_model_number_model(String modelno) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Model Number']")).sendKeys(modelno);
		}

		@When("Enter inventory SERIAL NUMBER as (.*)$")
		public void enter_inventory_serial_number(String serialno) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Serial Number']")).sendKeys(serialno); 
		}

		@When("Enter inventory  FIRMWARE NUMBER as (.*)$")
		public void enter_inventory_firmware_number(String firmwareno) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Firmware Version']")).sendKeys(firmwareno);
		}

		@When("Enter inventory  SSID as (.*)$")
		public void enter_inventory_ssid(String ssid) {
			driver.findElement(By.xpath("//input[@placeholder='Enter SSID']")).sendKeys(ssid);
		}

		@When("Enter inventory SSID PASSKEY as (.*)$")
		public void enter_inventory_ssid_passkey(String ssidpasswkey) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter SSID Passkey']")).sendKeys(ssidpasswkey);
		}

		@When("Enter inventory WIFIMAC as (.*)$")
		public void enter_inventory_wifimac(String wifimac) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Wifi MAC address']")).sendKeys(wifimac);
		}

		@When("Enter inventory WIFIAPMAC as (.*)$")
		public void enter_inventory_wifiapmac(String wifiapmac) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Wifi AP MAC address']")).sendKeys(wifiapmac);
		}

		@When("Enter inventory BLE MAC as (.*)$")
		public void enter_inventory_ble_mac(String blewifimac) {
			driver.findElement(By.xpath("//input[@placeholder='Enter BLE MAC address']")).sendKeys(blewifimac);
		}

		@When("Enter inventory HARDWARE VERSION as (.*)$")
		public void enter_inventory_hardware_version(String hardware) {
			 driver.findElement(By.xpath("//input[@placeholder='Enter Hardware Version']")).sendKeys(hardware);
		}

		@When("Enter inventory  DEVICE TYPE")
		public void enter_inventory_device_type() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(500);
		    
		    driver.findElement(By.xpath("//div[@id='vs1__combobox']"));
			int devicetype = 5;
			for (int i=0; i<=devicetype;i++)
			{
				Actions actions=new Actions(driver);
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				//Actions actions =new Actions(driver);
				actions.sendKeys(Keys.ENTER).build().perform();
			}
		}

		@When("Enter inventory CHIPSET")
		public void enter_inventory_chipset() {
			driver.findElement(By.xpath("//div[@id='vs2__combobox']"));
			int chipset = 5;
			for (int i=0; i<=chipset;i++)
			{
				Actions actions=new Actions(driver);
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				actions.sendKeys(Keys.DOWN).build().perform();
				//Actions actions =new Actions(driver);
				actions.sendKeys(Keys.ENTER).build().perform();
			}
		}

		@When("admin click on add to Inventory")
		public void admin_click_on_add_to_inventory() throws InterruptedException {

			 driver.findElement(By.xpath("//input[//button[@type='submit']]")).click();
			 Thread.sleep(5000);
			
		}



		//============================================ADD DEVICES======================================================


		@Given("on dashboard admin click on TEMPLATE")
		public void on_dashboard_admin_click_on_template() throws InterruptedException {
			Thread.sleep(1000);
			WebElement kfjyv=testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Template')]"));
			kfjyv.click();
			WebElement kyfjyv=testcontextsetup.driver.findElement(By.xpath("//button[contains(text(),'Create Template')]"));
			kyfjyv.click();
		}

		/*
		@When("Admin click on Create new Device Template")
		public void admin_click_on_create_new_device_template() throws InterruptedException {
			Thread.sleep(1000);
			WebElement kfjv=testcontextsetup.driver.findElement(By.xpath("//button[contains(text(),'Create Template')]"));
			kfjv.click();
		}*/

		@And("Admin  Enter (.*)$")
		public void admin_enter_device_name(String deviecName) throws InterruptedException {
			
			WebElement djhc=testcontextsetup.driver.findElement(By.xpath("//input[@name='deviceType']"));
			djhc.sendKeys(deviecName);
			Thread.sleep(2000);
			Thread.sleep(2000);
		}

		@And("Admin click on Add features")
		public void admin_click_on_add_features() throws InterruptedException {
			 WebElement kfhjv=testcontextsetup.driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 kfhjv.click();
			Thread.sleep(2000);
		}

		@And("Admin Enter slot as (.*)$")
		public void admin_enter_slot_name(String slot ,String featurename) throws InterruptedException {
			
			testcontextsetup.driver.findElement(By.xpath("//input[@name='features[0].name']")).sendKeys(featurename);
			Thread.sleep(5000);
			Select slotone = new Select(testcontextsetup.driver.findElement(By.name("feature-slot")));

			slotone.selectByVisibleText(slot);
			System.out.println(slotone.getAllSelectedOptions());
			
		}

		@And("Admin select   feature type (.*)$")
		public void admin_select_feature_type(String devicetype,String devicedata) {
			Select featuretype = new Select(testcontextsetup.driver.findElement(By.name("feature-type")));
			featuretype.selectByVisibleText(devicetype);
			testcontextsetup.driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(devicedata);

		}

		@When("Admin click on create device type")
		public void admin_click_on_create_device_type() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}



		@Then("Admin recive Inventory success  or error messg")
		public void admin_recive_inventory_success_or_error_messg() throws InterruptedException {
			Thread.sleep(1000);
			 String  messg=testcontextsetup.driver.findElement(By.xpath("//div[@class='b-toaster b-toaster-top-right']")).getText();
			 System.out.println(messg); 
		}
	}
