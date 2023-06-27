package Stepd;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
	/*WebDriver driver;
	@Before("@DEVLOPER")
	public void BEFORESCENARIO() throws InterruptedException
	{
		System.out.println("this will run before scenario");
		System.out.println("Inside step:browser is open");
		String  projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		System.getProperty("webdriverdriver.chromedriver",projectpath+"/src/test/resources/DRIVER/chromedriver.exe");
		 driver = new ChromeDriver();
		//	System.getProperty("webdriverdriver.firefoxdriver",projectpath+"/src/test/resources/DRIVER/geckodriver.exe");
		//	driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("https://app.indhi.io/");


		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dhi-siddhant");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(2000);
			//click on try another method
			driver.findElement(By.xpath("//button[@type='button']")).click();
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Siddhant1!");
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(5000);
		}

	@After
	public void AFTERSCENARIO() throws InterruptedException
	{
		System.out.println("this will run after scenario");
		//click on profile
				driver.findElement(By.xpath("//div[@class='font-bold']")).click();
				Thread.sleep(5000);
				WebElement logout= driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
				 Assert.assertEquals(true, logout.isDisplayed());
				 Actions actions = new Actions(driver);
				// logout.click();
				 actions.moveToElement(logout);
				 actions.click().build().perform();
					 driver.quit();}
					 */
}
