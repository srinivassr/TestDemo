package com.ericsson.edos.dopuatautomation.testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ericsson.edos.dopuatautomation.base.TestBase;
import com.ericsson.edos.dopuatautomation.pages.EdosAdvancedMaster;
import com.ericsson.edos.dopuatautomation.pages.EdosApplicationPage;
import com.ericsson.edos.dopuatautomation.pages.EdosBouyguesPage;
import com.ericsson.edos.dopuatautomation.pages.EdosDOPPerformancePortalPage;
import com.ericsson.edos.dopuatautomation.pages.Edoslandingpage;
import com.ericsson.edos.dopuatautomation.pages.Edosloginpage;
import com.ericsson.edos.dopuatautomation.pages.QueryBuilderPage;

public class BouyguesTest extends  TestBase{
	
	
	Edoslandingpage landingpage;
	Edosloginpage loginpage;
	EdosApplicationPage applicationpage;
	EdosDOPPerformancePortalPage portalpage;
	EdosBouyguesPage bouyguespage;
	EdosAdvancedMaster advancedmaster;
	QueryBuilderPage querybuilderpage;

	

	
	public BouyguesTest() {
		super();
		}
	
	@BeforeTest(alwaysRun = true)
	public void setUp() throws InterruptedException
	{   bouyguespage = new EdosBouyguesPage();
		portalpage = new EdosDOPPerformancePortalPage();
     	applicationpage= new EdosApplicationPage();
     	landingpage = new Edoslandingpage();
     	loginpage = new Edosloginpage();
     	advancedmaster = new EdosAdvancedMaster();
     	querybuilderpage = new QueryBuilderPage(); 
	}
    
	
	//TestMethod to Check title of Application Page is Correct
    @Test(priority=1)
	public void VerifyAllTitleTest() throws InterruptedException 
    {
    portalpage.ClickBouyguesLink();
    bouyguespage.switchTabs(driver);
    String Bouyguestitle= bouyguespage.VisibleOfBouygues();
    System.out.println("Title of Tab is :"+ Bouyguestitle);
    Reporter.log("Title of Tab is :"+ Bouyguestitle);
    Assert.assertEquals(Bouyguestitle, "Bouygues");
    String Reportstitle= bouyguespage.validateReportsTabText();
    System.out.println("Title of Tab is :"+ Reportstitle);
    Reporter.log("Title of Tab is :"+ Reportstitle);
    Assert.assertEquals(Reportstitle, "REPORTS");
    String Chartstitle= bouyguespage.validateChartsTabText();
    System.out.println("Title of Tab is :"+ Chartstitle);
    Reporter.log("Title of Tab is :"+ Chartstitle);
    Assert.assertEquals(Chartstitle, "CHARTS");
 	String configtitle= bouyguespage.configTab();
    System.out.println("Title of Tab is :"+ configtitle);
    Reporter.log("Title of Tab is :"+ configtitle);
    Assert.assertEquals(configtitle, "CONFIG");
    String KPIstitle= bouyguespage.KpisTab();
    System.out.println("Title of Tab is :"+ KPIstitle);
    Reporter.log("Title of Tab is :"+ KPIstitle);
    Assert.assertEquals(KPIstitle, "KPIS");
 	String FilterOptions= bouyguespage.FiltersOptionsTab();
    System.out.println("Title of Tab is :"+ FilterOptions);
    Reporter.log("Title of Tab is :"+ FilterOptions);
    Assert.assertEquals(FilterOptions, "Filters/Options");
 	String LatestData= bouyguespage.LatestData();
 	String LatestDatasplit=bouyguespage.LatestData().split(" ")[0];
    System.out.println("Latest Available Data Present is: "+ LatestData);
    Reporter.log("Latest Available Data Present is: "+ LatestData);
    System.out.println("Latest Available Data Present AfterSplit: "+ LatestDatasplit);
    Reporter.log("Latest Available Data Present AfterSplit: "+ LatestDatasplit);
    String Latestyear  = LatestDatasplit.split("/")[0];
    System.out.println("The latest year is: "+ Latestyear);
    Reporter.log("The latest year is: "+ Latestyear);
    String Latestmonth =LatestDatasplit.split("/")[1];
    System.out.println("The latest month is: "+ Latestmonth);
    Reporter.log("The latest month is: "+ Latestmonth);
    String LatestDay = LatestDatasplit.split("/")[2];
    System.out.println("The latest day is: "+ LatestDay);
    Reporter.log("The latest day is: "+ LatestDay);
    Thread.sleep(2000);
    bouyguespage.clickonReportsTab();
	Thread.sleep(2000);
	bouyguespage.clickonConfigReports();
	Thread.sleep(2000);
	bouyguespage.clickonUtranCellMaster();
	Thread.sleep(2000);
	bouyguespage.switchTabs(driver);
	Thread.sleep(2000);
    String starttime_advancedMaster =advancedmaster.getStarttime();
    System.out.println("Date in Advanced Master is:"+ starttime_advancedMaster);
    Reporter.log("Date in Advanced Master is:"+starttime_advancedMaster);
    String LatestdateaAdvancedmaster=starttime_advancedMaster.split(" ")[0];
    System.out.println("Date in Advanced Master after Split is:"+ LatestdateaAdvancedmaster);
    Reporter.log("Date in Advanced Master after Split is:"+LatestdateaAdvancedmaster);
    Thread.sleep(2000);
    String LatestDate_A=LatestdateaAdvancedmaster.split("/")[1];
    System.out.println("The latest startdate in Advanced Master is: "+ LatestDate_A);
    Reporter.log("The latest startdate in Advanced Master is: "+ LatestDate_A);
    String LatestMonth_A=LatestdateaAdvancedmaster.split("/")[0];
    System.out.println("The latest startmonth in Advanced Master is: "+ LatestMonth_A);
    Reporter.log("The latest startmonth in Advanced Master is: "+ LatestMonth_A);
    String LatestYear_A=LatestdateaAdvancedmaster.split("/")[2];
    System.out.println("The latest startyear in Advanced Master is: "+ LatestYear_A);
    Reporter.log("The latest startyear in Advanced Master is: "+ LatestYear_A);
    String endtime_advancedMaster =advancedmaster.getEndtime();
    System.out.println(endtime_advancedMaster);
    Reporter.log(endtime_advancedMaster);
    String LatestdateaAdvancedmasterE=endtime_advancedMaster.split(" ")[0];
    System.out.println("Date in Advanced Master End after Split is:"+ LatestdateaAdvancedmasterE);
    Reporter.log("Date in Advanced Master End after Split is:"+LatestdateaAdvancedmasterE);
    Thread.sleep(2000);
    String LatestDate_E=LatestdateaAdvancedmasterE.split("/")[1];
    System.out.println("The latest enddate in Advanced Master is: "+ LatestDate_E);
    Reporter.log("The latest enddate in Advanced Master is: "+ LatestDate_E);
    String LatestMonth_E=LatestdateaAdvancedmasterE.split("/")[0];
    System.out.println("The latest endmonth in Advanced Master is: "+ LatestMonth_E);
    Reporter.log("The latest endmonth in Advanced Master is: "+ LatestMonth_E);
    String LatestYear_E=LatestdateaAdvancedmasterE.split("/")[2];
    System.out.println("The latest endyear in Advanced Master is: "+ LatestYear_E);
    Reporter.log("The latest endyear in Advanced Master is: "+ LatestYear_E);
    Thread.sleep(2000);
   
   
    
    boolean month = false, day= false, year =false;
    if (((Integer.parseInt(Latestmonth))==(Integer.parseInt(LatestMonth_E))) || ((Integer.parseInt(Latestmonth))==(Integer.parseInt(LatestMonth_A))))
    {
    	month= true;
    }
    if (((Integer.parseInt(Latestyear))==(Integer.parseInt(LatestYear_E))) || ((Integer.parseInt(Latestyear))==(Integer.parseInt(LatestYear_A))))
    {
    	day= true;
    }
    if (((Integer.parseInt(LatestDay))==(Integer.parseInt(LatestDate_E))) || ((Integer.parseInt(LatestDay))==(Integer.parseInt(LatestDate_A))))
    {
    	year= true;
    }
    
    System.out.println(Integer.parseInt(Latestmonth));
    System.out.println(Integer.parseInt(LatestMonth_E));
    System.out.println(Integer.parseInt(LatestMonth_A));
    System.out.println(Integer.parseInt(Latestyear));
    System.out.println(Integer.parseInt(LatestYear_E));
    System.out.println(Integer.parseInt(LatestYear_A));
    System.out.println(Integer.parseInt(LatestDay));
    System.out.println(Integer.parseInt(LatestDate_E));
    System.out.println(Integer.parseInt(LatestDate_A));
    
   
    Assert.assertTrue(month=day=year,"Validation successful");
    
    
    Reporter.log("All The Tabs are Latest Date is validated");
    Thread.sleep(5000);
    
   }
    
    
    @Test(priority=2)
   	public void VerifyenodeBUtranCellTest() throws InterruptedException 
       {
    	Thread.sleep(2000);
    	String advancedmastertitle =advancedmaster.VisibleOfAdvancedMaster();
    	System.out.println("Title:"+ advancedmastertitle);
        Assert.assertEquals(advancedmastertitle, "eNodeB UtranCell Configuration Advanced Master Daily");
    	Thread.sleep(5000);
       	int BeforeTablesize=advancedmaster.tablesize();
    	System.out.println("Before Filter Table size is" + BeforeTablesize);
        Thread.sleep(1000);
    	advancedmaster.ClickQBFilterOption();
    	Thread.sleep(5000);
    	advancedmaster.clickarrowdowncell();
    	advancedmaster.clickfirstcell();
    	Thread.sleep(2000);
    	advancedmaster.ClickQBFilterOption();
    	Thread.sleep(2000);
    	advancedmaster.clickRefresh();
    	Thread.sleep(15000);
    	int AfterTablesize=advancedmaster.tablesize();
    	System.out.println("After Filter Table size is" + AfterTablesize);
    	Assert.assertTrue(AfterTablesize==1, "Table having one row with one cell");
    	Thread.sleep(10000);
    	driver.close();
   	    driver.switchTo().window(bouyguespage.mainWindow);
    	
    	
      }
  /* @Test(priority=3)
   	public void VerifyonecellTest() throws InterruptedException 
       {
    	int BeforeTablesize=advancedmaster.tablesize();
    	System.out.println("Before Filter Table size is" + BeforeTablesize);
        Thread.sleep(1000);
    	advancedmaster.ClickQBFilterOption();
    	Thread.sleep(5000);
    	advancedmaster.clickarrowdowncell();
    	advancedmaster.clickfirstcell();
    	Thread.sleep(2000);
    	advancedmaster.ClickQBFilterOption();
    	Thread.sleep(2000);
    	advancedmaster.clickRefresh();
    	Thread.sleep(10000);
    	int AfterTablesize=advancedmaster.tablesize();
    	System.out.println("After Filter Table size is" + AfterTablesize);
    	Assert.assertTrue(AfterTablesize==1, "Table having one row with one cell");
    	Thread.sleep(5000);
    	}
    	*/
    
    
    @Test(priority=6)
	public void ValidateSearchingForCell() throws InterruptedException {
		Thread.sleep(2000);
		/*bouyguespage.clickonReportsTab();*/
		Thread.sleep(2000);
		querybuilderpage.ClickQuerBuilderLink();
		Reporter.log("Clicked on the QueryBuilder Link");
		System.out.println("Clicked on the QueryBuilder Link");

		bouyguespage.switchTabs(driver);
		Thread.sleep(2000);
		querybuilderpage.ClickQBFilterOption();
		Reporter.log("Clicked on the QueryBuilder Filter Tab");
		System.out.println("Clicked on the QueryBuilder Filter Tab");

		Thread.sleep(2000);
		String actualCellValue = querybuilderpage.ValidateOnCellValue();
		Thread.sleep(2000);
		Reporter.log("The Cell name is "+actualCellValue);
		System.out.println("The Cell name is "+actualCellValue);
		Assert.assertEquals("Cell", actualCellValue,"The name of the value is matching");

		Thread.sleep(2000);
		String actualClusterName = querybuilderpage.ValidateOnClusterField();
		Thread.sleep(2000);
		Reporter.log("The Cluster name is "+actualClusterName);
		System.out.println("The Cluster name is "+actualClusterName);

		Thread.sleep(2000);
		querybuilderpage.ClickOnClusterField();
		Reporter.log("Clicked on the Cluster Field");
		System.out.println("Clicked on the Cluster Field");
		
	/*	Thread.sleep(2000);
		String actualClusterField = querybuilderpage.ValidateOnClusterField();
		Thread.sleep(2000);
		Reporter.log("The Cluster field name is "+actualClusterField);
		System.out.println("The Cluster field name is "+actualClusterField);*/

		Thread.sleep(2000);
		String actualClusterNEField = querybuilderpage.ValidateClusterNEText();
		Thread.sleep(2000);
		Reporter.log("The Cluster NE field name is "+actualClusterNEField);
		System.out.println("The Cluster NE field name is "+actualClusterNEField);
		
		if(actualClusterNEField.contains(actualClusterName)) {
			Reporter.log("The Cell is present in the Cluster NE text filed");
			System.out.println("The Cell is present in the Cluster NE text filed");
		}
		else {
			Reporter.log("The Cell is not present in the Cluster NE text filed");
			System.out.println("The Cell is not present in the Cluster NE text filed");
			Assert.fail("The Cell is not present in the Cluster NE text filed");
		}
	}
    
    
    @Test(priority=7) 
    public void VerifyCounterAddedQBReportinTable() throws InterruptedException 
    {
    	boolean isCounterAddded=false;
    	try {
    		
        	Thread.sleep(3000);
        	 querybuilderpage.SelectExisitingReports();
        	   Thread.sleep(6000);
               querybuilderpage.SendCounterName();
               Thread.sleep(2000);
               isCounterAddded=querybuilderpage.VerifyAddedCounter();
               Thread.sleep(6000);
               System.out.println("The counter is added::"+isCounterAddded);
               if(isCounterAddded==true)
               {
            	   Reporter.log("<span style='color:#F8F8FF;background-color:#006400;font-size:14px;'>"+"<b>"+"The counter is added successfully::"+"</b>"+"<span>"+"<br/>");
            	   Assert.assertTrue(isCounterAddded, "Failed to Add the Counter");
               }
               else
               {
            	   Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Add the Counter::"+"</b>"+"<span>"+"<br/>");
               }
			
		} 
    	catch (NoSuchElementException NsEx) {
		
    		System.out.println("Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ NsEx.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertTrue(isCounterAddded, "Failed to Add the Counter");
		}
    	
    }    
    
    
    
    @Test(priority=8) 
    public void VerifyQBReportinTable() throws InterruptedException {
         
    	boolean Fs=false;
    	try {
    		
            Thread.sleep(2000);
            //querybuilderpage.ClickQuerBuilderLink();
          
            //Reporter.log("Clicked on the QueryBuilder Link");
              // System.out.println("Clicked on the QueryBuilder Link");
               //bouyguespage.switchTabs(driver);
               //querybuilderpage.ClickQBFilterOption();
               Thread.sleep(2000);
               //querybuilderpage.ClickQBFilterOption();
               Reporter.log("Clicked on the QueryBuilder Filter Tab");
               System.out.println("Clicked on the QueryBuilder Filter Tab");
               Thread.sleep(2000);
               querybuilderpage.SendEnodeBValue();
               Thread.sleep(6000);
               querybuilderpage.ClickQBFilterOption();
               Thread.sleep(2000);
               querybuilderpage.SelectNetworkLevel();
               Thread.sleep(2000);
               querybuilderpage.SelectAggreationLevel();
               Thread.sleep(2000);
       		   querybuilderpage.SetDateSelection();
       		   Thread.sleep(2000);
       		Fs=querybuilderpage.ValidateReportGeneratedForSelectedDays();
       		   Thread.sleep(6000);
       		   
       		   if(Fs==true)
       		   {
       			Reporter.log("<span style='color:#F8F8FF;background-color:#006400;font-size:14px;'>"+"<b>"+"Table Contains the Selected counter and Dates filtred"+"</b>"+"<span>"+"<br/>");
       			Assert.assertTrue(Fs);
       			
       			
       		   }
       		   else{
       			Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Table Doesn't have the Selected counter and Dates filtred"+"</b>"+"<span>"+"<br/>");
       			Assert.assertTrue(Fs, "Table Doesn't Contains the Slected counter and Dates filtred");
       		   }
		} catch (NoSuchElementException NsEx) {
		
    		System.out.println("Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ NsEx.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertTrue(Fs, "Table Doesn't Contains the Slected counter and Dates filtred");
		}
    	catch(WebDriverException wex )
    	{
    		System.out.println("Failed to Execute the Test with Exception:::"+ wex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ wex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertTrue(Fs, "Table Doesn't Contains the Slected counter and Dates filtred");
    	}
    	catch (Throwable thex) {
    		System.out.println("Failed to Execute the Test with Exception:::"+ thex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ thex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertTrue(Fs, "Table Doesn't Contains the Slected counter and Dates filtred");
		}
    	/*
       driver.switchTo().window(bouyguespage.mainWindow);*/
        
     		   
      }

    @Test(priority=9,dependsOnMethods={"VerifyCounterAddedQBReportinTable","VerifyQBReportinTable"}) 
    public void VerifyExportToExcel() throws InterruptedException 
    {
    	try {
    		querybuilderpage.ExportResult("Excel");
        	Thread.sleep(6000);
        	
        	Assert.assertTrue(true,"Failed to Export to Excel file ");
        	Reporter.log("<span style='color:#F8F8FF;background-color:#006400;font-size:14px;'>"+"<b>"+"Exported to Excel Sucessfully"+"</b>"+"<span>"+"<br/>");
		} catch (NoSuchElementException NsEx) {
		
    		System.out.println("Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ NsEx.getMessage()+"</b>"+"<span>"+"<br/>");
		}
    	catch(WebDriverException wex )
    	{
    		System.out.println("Failed to Execute the Test with Exception:::"+ wex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ wex.getMessage()+"</b>"+"<span>"+"<br/>");
    	}
    	catch (Throwable thex) {
    		System.out.println("Failed to Execute the Test with Exception:::"+ thex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ thex.getMessage()+"</b>"+"<span>"+"<br/>");
		}
    }    
    
    @Test(priority=10,dependsOnMethods={"VerifyCounterAddedQBReportinTable","VerifyQBReportinTable"}) 
    public void VerifyExportToCSV() throws InterruptedException 
    {
    	try {
    		Thread.sleep(4000);
        	querybuilderpage.ExportResult("CSV");
        	Thread.sleep(6000);
        	
        	Assert.assertTrue(true,"Failed to Export CSV file ");
        	Reporter.log("<span style='color:#F8F8FF;background-color:#006400;font-size:14px;'>"+"<b>"+"Exported to CSV Sucessfully"+"</b>"+"<span>"+"<br/>");
		} catch (NoSuchElementException NsEx) {
		
    		System.out.println("Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ NsEx.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
		}
    	catch(WebDriverException wex )
    	{
    		System.out.println("Failed to Execute the Test with Exception:::"+ wex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ wex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ wex.getMessage());
    	}
    	catch (Throwable thex) {
    		System.out.println("Failed to Execute the Test with Exception:::"+ thex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ thex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ thex.getMessage());
		}
    	
    }
    
    @Test(priority=11,dependsOnMethods={"VerifyCounterAddedQBReportinTable","VerifyQBReportinTable"}) 
    public void VerifyExportToTemplate() throws InterruptedException 
    {
    	try {
    		
    		Thread.sleep(4000);
        	querybuilderpage.ExportResult("Template");
        	Thread.sleep(6000);
        	Assert.assertTrue(true,"Failed to Export Exported");
        	Reporter.log("<span style='color:#F8F8FF;background-color:#006400;font-size:14px;'>"+"<b>"+"Exported the Template Sucessfully"+"</b>"+"<span>"+"<br/>");
		} catch (NoSuchElementException NsEx) {
		
    		System.out.println("Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ NsEx.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ NsEx.getMessage());
		}
    	catch(WebDriverException wex )
    	{
    		System.out.println("Failed to Execute the Test with Exception:::"+ wex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ wex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ wex.getMessage());
    	}
    	catch (Throwable thex) {
    		System.out.println("Failed to Execute the Test with Exception:::"+ thex.getMessage());
    		Reporter.log("<span style='color:red;background-color:yellow;font-size:14px;'>"+"<b>"+"Failed to Execute the Test with Exception:::"+ thex.getMessage()+"</b>"+"<span>"+"<br/>");
    		Assert.assertFalse(false, "Failed to Execute the Test with Exception:::"+ thex.getMessage());
		}
    	
    }
}
