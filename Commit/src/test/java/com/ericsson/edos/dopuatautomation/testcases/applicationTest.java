package com.ericsson.edos.dopuatautomation.testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ericsson.edos.dopuatautomation.base.TestBase;
import com.ericsson.edos.dopuatautomation.pages.EdosApplicationPage;
import com.ericsson.edos.dopuatautomation.pages.Edoslandingpage;
import com.ericsson.edos.dopuatautomation.pages.Edosloginpage;

public class applicationTest extends  TestBase{
	
	
	Edoslandingpage landingpage;
	Edosloginpage loginpage;
	EdosApplicationPage applicationpage;
    
	

	
	public applicationTest() {
		super();
		
	}
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp() throws InterruptedException
	{
		
		applicationpage= new EdosApplicationPage();
		landingpage = new Edoslandingpage();
		loginpage = new Edosloginpage();
	}
    
	
	/*TestMethod to Check title of Application Page is Correct*/
    @Test(priority=1)
	public void VerifyApplicationPage() throws InterruptedException 
    {
    Thread.sleep(10000);	
    String homepagetitle= applicationpage.VisibleOfHomePage();
    System.out.println("Title:"+ homepagetitle);
    Assert.assertEquals(homepagetitle, "Home");
	}
    
    /*TestMethod to Check text of EDOS-DP fullform of Application Page is Correct*/
    @Test(priority=2)
   	public void VerifyEdosDpLogo() throws InterruptedException 
    {
    Thread.sleep(2000);
   	String edostitle= applicationpage.VisibleOfEDOSDPtitle();
    Assert.assertEquals(edostitle, "Ericsson Design & Optimization Services Delivery Platform","EdosDp title not present");
   	}
	
    /*TestMethod to Click on Raster*/
    @Test(priority=3)
   	public void RasterClick() throws InterruptedException 
    {
    Thread.sleep(1000);
    applicationpage.ClickonRasterLink();
    Thread.sleep(1000);
    landingpage.ClickProceedButton();
    Thread.sleep(1000);
    loginpage.LoginInOne();
    Thread.sleep(1000);
   	}
    
    /*TestMethod to Click on TIV*/
    @Test(priority=4)
   	public void VerifyTIVLink() throws InterruptedException 
    {
    Thread.sleep(2000);
   	applicationpage.TIVLinkClick();
    Thread.sleep(2000);
   	landingpage.ClickProceedButton();
   	loginpage.SetUserName();
	Thread.sleep(2000);
	loginpage.SetPassword();
    Thread.sleep(2000);
    loginpage.ClickLoginForTIV();
	 Thread.sleep(2000);
   	}
	
	 @Test(priority=5)
   	public void VerifyCMPMDashboard() throws InterruptedException 
    {
    Thread.sleep(2000);
    applicationpage.clickonCMPMDashboard();
    Thread.sleep(2000);
    landingpage.ClickProceedButton();
    Thread.sleep(2000);
    loginpage.LoginInOne();
   	//String edostitle= applicationpage.VisibleOfEDOSDPtitle();
    //Assert.assertEquals(edostitle, "Ericsson Design & Optimization Services Delivery Platform","EdosDp title not present");
   	}
    
    /*TestMethod to Check text of EDOS-DP fullform of Application Page is Correct*/
   /* @Test(priority=3)
   	public void VerifyLandingPageProceedButtonTest() throws InterruptedException 
    {
    Thread.sleep(2000);
   	landingpage.ClickProceedButton();
   	Reporter.log("The application is proceeded to the Login Page");
   	}*/

	
    
}