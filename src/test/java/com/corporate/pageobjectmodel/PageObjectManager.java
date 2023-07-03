package com.corporate.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
// factory design pattern
	//this class is responsible for creating object creation
	//add all pom class 
	
	public WebDriver driver;
	public signup signupPage;
	public loginusername loginpage;
	public loginotp otppage;
    public loginpassword passwordpage;
    public loginusername  usernamepage;
    public loginforgetpassword forgetpasswordpage;
    public DASHBOARD dashboardpage;
    public DashboardUser Userpage;
    public DashboardGroups Grouppage;
    public DashboardEditUser EDITUserpage;
    public DashboarDevicetemplate devicetemplatepage;
    public DashboardOrganization Organizationpage;
    public DashboardSetting Settingpage;
    public Dashboarduserprofile userprofilepage;
    public DashboardDevices devicespage;
    public DashboardDeviceInventory  DeviceInventoryPage;
    public DasboardAddUser Adduserpage;
    public DasboardAddDevicetype AddDevicetypepage;
    public DashboardNotification notificationpage;
public PageObjectManager(WebDriver driver) {
			{
				PageFactory.initElements(driver,this);
			}
		}
public signup getsignupPage()
{
	signupPage=new signup(driver);
	return signupPage;
	}

public loginusername getloginpage()
{
	loginpage=new loginusername(driver);
	return loginpage;
	}
// add all pom classes object

public loginotp getotppage()
{
	otppage=new loginotp(driver);
	return otppage;
	}


public loginpassword getpasswordpage()
{
	passwordpage=new  loginpassword(driver);
			return passwordpage;
	}



public   loginusername setusername()
{
	usernamepage=new loginusername(driver);
      return 	usernamepage;
}

public loginforgetpassword  getfogetpasswordpage()
{
    forgetpasswordpage =new loginforgetpassword(driver);
       return forgetpasswordpage;
}


public DASHBOARD getdashboard()
{
	dashboardpage=new DASHBOARD(driver);
        return dashboardpage;
}

public DashboardUser  getdashboarduserpage()
{
	Userpage=new DashboardUser(driver);
         return Userpage;
}
   
public DashboardGroups getgroupPage()
{ 
	Grouppage=new DashboardGroups(driver);

return Grouppage;
}

public DashboardEditUser getEDITUserpage()
{
	   EDITUserpage=new DashboardEditUser(driver);
	   return  EDITUserpage;
	}


public DashboarDevicetemplate getdevicetemplatepage()
{
	devicetemplatepage=new DashboarDevicetemplate(driver);
			return devicetemplatepage;
	
	}


public DashboardOrganization getOrganizationpage()
{
	Organizationpage=new 	DashboardOrganization(driver);
	return Organizationpage;
}

public DashboardSetting getSettingpage()
{
	Settingpage =new DashboardSetting(driver);
	 return Settingpage;
}

public Dashboarduserprofile getuserprofilepage()
{
	
	userprofilepage =new Dashboarduserprofile(driver);
	  return userprofilepage;
	}


public DashboardDevices getdevicespage()
{
	devicespage=new DashboardDevices(driver);
	return devicespage;
	
}

public DashboardDeviceInventory  getDeviceInventoryPage()
{
	DeviceInventoryPage=new DashboardDeviceInventory(driver);
	return DeviceInventoryPage;
	
	}


public DasboardAddUser getAdduserpage()
{
	Adduserpage=new	DasboardAddUser(driver);
	return Adduserpage;
	}

public DasboardAddDevicetype getAddDevicetypepage()
{
	AddDevicetypepage=new DasboardAddDevicetype(driver);
	return AddDevicetypepage;
	}

public DashboardNotification getnotificationpage()

{

    notificationpage=new DashboardNotification(driver);
    return notificationpage;
	
}


}