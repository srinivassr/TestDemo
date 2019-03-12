package com.ericsson.edos.dopuatautomation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;

import com.ericsson.edos.dopuatautomation.base.TestBase;


public class EdosBouyguesPage extends TestBase {
	
	
	
	
	/*Inspecting WebElement for GNP Performance Portal*/	
	@FindBy (xpath = "//a[text()='REPORTS']")
	WebElement ReportsTab;
	
	@FindBy (xpath = "//a[text()='CHARTS']")
	WebElement ChartsTab;
	
	@FindBy (xpath = "//a[text()='CONFIG']")
	WebElement ConfigTab;
	
	@FindBy (xpath = "//a[text()='KPIS']")
	WebElement KpisTab;
	
	@FindBy (xpath = "//a[@id='filtersSlidein']//table//tbody//tr//td[contains(text(),'Filters/Options')]")
	WebElement FiltersOptionsTab;
	
	@FindBy (xpath = "//a[@id='filtersSlidein']//table//tbody//tr//td//label[@id='lblDateTime']")
	WebElement LatestData;
	
	@FindBy (xpath = "//span[text()='Config Reports']")
	WebElement clickConfigReports;
	
	
	@FindBy (xpath = "//span[text()='eNodeB UtranCell Configuration Advanced Master']")
	WebElement clickenodeBAdvancedMaster;
	


	/*Initializing all the WebElements*/
	public EdosBouyguesPage() {
	PageFactory.initElements(driver , this);
		}
	
    public static String mainWindow;
	
	public static void switchTabs(WebDriver driver) throws InterruptedException {
		mainWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> handles =driver.getWindowHandles();
		  for(String handle : handles) {
			  if(!handle.equals(mainWindow)) {
				  driver.switchTo().window(handle);
				  System.out.println(driver.getCurrentUrl().toString());
			  }
			  Thread.sleep(4000);
			  //driver.switchTo().window(mainWindow);
		  }
	}
	
	
	
	/*Method to get the Title of Bouygues Page*/
	public String VisibleOfBouygues() throws InterruptedException 
	{   
		Thread.sleep(10000);
		return driver.getTitle();
	}


	public String validateReportsTabText()
	{
		return ReportsTab.getText();
	}
	
	
	public String validateChartsTabText()
	{
		return ChartsTab.getText();
	}
	
	public String configTab()
	{
		return ConfigTab.getText();
	}
	
	public String KpisTab()
	{
		return KpisTab.getText();
	}
	
	
	public String FiltersOptionsTab()
	{
		return FiltersOptionsTab.getText();
	}
	
	public String LatestData()
	{
		
		return LatestData.getText();
	}
	
	public void clickonReportsTab()
	{
		ReportsTab.click();
	}
	
	public void clickonConfigReports()
	{
		clickConfigReports.click();
	}
	
	public void clickonUtranCellMaster()
	{
		clickenodeBAdvancedMaster.click();
	}
	
  

	
	
}
