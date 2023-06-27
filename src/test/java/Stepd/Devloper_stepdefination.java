package Stepd;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.*;
public class Devloper_stepdefination {


		WebDriver driver;
		TextContextSetup  testcontextsetup;
		public  Devloper_stepdefination(TextContextSetup  testcontextsetup) {
			this.testcontextsetup= testcontextsetup;
		}
		
		@When("user try  to switch account  as a devloper")
	    public void user_try_to_switch_account_as_a_devloper() throws Throwable {
		 
				//click on Switch To Developer
		 testcontextsetup.driver.findElement(By.xpath("//div[@class='font-bold']")).click();
				Thread.sleep(5000);
				//switch to devloper dashboard
				WebElement devloper= testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Switch To Developer')]"));
				Assert.assertEquals(true, devloper.isDisplayed());
				Actions actions=new Actions(testcontextsetup.driver);
				actions.moveToElement(devloper);
				actions.click().build().perform();
				//devloper.click();
				Thread.sleep(5000);
	 }


	    @Then("^user get redirected to devloper$")
	    public void user_get_redirected_to_devloper() throws Throwable {
	   
	    String act= testcontextsetup.driver.getCurrentUrl();
	    String exp="https://app.indhi.io/developer/home";
	    	Assert.assertEquals(act, exp);
	       
	    	
	    	
	    	}	
	    	
	    	
	    @And("^in template  create template  successfully$")
	    public void in_template_create_template_successfully() throws Throwable {
	    	
	    	WebElement devloper=  testcontextsetup.driver.findElement(By.xpath("//span[contains(text(),'Templates')]"));
			Assert.assertEquals(true, devloper.isDisplayed());
			Actions actions=new Actions( testcontextsetup.driver);
			actions.moveToElement(devloper);
			actions.click().build().perform();
			//devloper.click();
			Thread.sleep(5000);
			WebElement create_template= testcontextsetup.driver.findElement(By.xpath("//button[contains(text(),'Create Template')]"));
			Assert.assertEquals(true,create_template.isDisplayed());
			actions.moveToElement(create_template);
			actions.click().build().perform();

			//enter template name
			WebElement rgekr= testcontextsetup.driver.findElement(By.xpath("//input[@name='templateName']"));
		Assert.assertEquals(true, rgekr.isDisplayed());
		boolean flagDisplayed= rgekr.isDisplayed();
		if(flagDisplayed==true)
			System.out.println("Element is displayed.");
		else
			System.out.println("Element is not displayed");
		
		
		rgekr.sendKeys("grgryery5yg");
			Thread.sleep(5000);
			System.out.println( testcontextsetup.driver.getCurrentUrl());
			// in widget click on "+"
			WebElement rgetyjkr= testcontextsetup.driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			Assert.assertEquals(true, rgetyjkr.isDisplayed());
			rgetyjkr.click();
				Thread.sleep(5000);
				//enter widget name
				
				WebElement rgetnbmbyjkr=  testcontextsetup.driver.findElement(By.xpath("//input[@placeholder='Widget Name']"));
				Assert.assertEquals(true,rgetnbmbyjkr.isDisplayed());
				rgetnbmbyjkr.sendKeys("dgrtyvh6y");
				Thread.sleep(5000);
				
				
				// click on  slot
			
				 testcontextsetup.driver.findElement(By.xpath("(//input[@class='select__input'])[1]")).click();
			
			    
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
				 testcontextsetup.driver.findElement(By.xpath("(//input[@class='select__input'])[2]")).click();
				   int Widgettype=1;
					for(int i = 0; i <= Widgettype; i++){
				       
				        actions.sendKeys(Keys.DOWN).build().perform();
				        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
				       actions.sendKeys(Keys.ENTER).build().perform();
				       WebElement rgghmngmhm=  testcontextsetup.driver.findElement(By.xpath("(//div[@class='select__single-value css-yr46hd-singleValue'])[2]"));
				      System.out.println(rgghmngmhm.getText());
				    
				    
					}
				    
			
	    }
	}
