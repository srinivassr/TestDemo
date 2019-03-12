package com.ericsson.edos.dopuatautomation.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.ericsson.edos.dopuatautomation.base.Lib;
import com.ericsson.edos.dopuatautomation.base.TestBase;

public class QueryBuilderPage extends TestBase{

	//TC - 06 Query Builder: Searching for cell

	//WebElement for Query Builder
	@FindBy (xpath = "//span[text()='Query Builder']")
	WebElement QueryBuilderLink;
	
	//WebElement for Clicking on the Query Builder Filter Option
	@FindBy (xpath = "//a[contains(text(),'FILTERS')]")
	WebElement QBFilterOption;

	//WebElement for Clicking the cell of the Cluster Name
	@FindBy (xpath = "//a[@id='cboNEType_Arrow']")
	WebElement CellArrowClick;

	//WebElement for validating the Cell value from the dropdown list
	@FindBy (xpath = "//input[@name='cboNEType']")
	WebElement CellDropdownValue;

	//WebElement for selecting the Cell value from the dropdown list
	@FindBy (xpath = "//li[text()='Cell']")
	WebElement ClickOnCell;

	//WebElement for Clicking the cell value of the Cluster Name
	@FindBy (xpath = "//a[@id='cboCellSC_Arrow']")
	WebElement CellValueClick;

	//WebElement for Clicking the MOre Results of cell value of the Cluster Name
	@FindBy (xpath = "//div[@id='cboCellSC_MoreResultsBox']")
	WebElement CellValueMoreResultsClick;

	//WebElement for selecting the first cell name from the dropdown list
	@FindBy (xpath = "(//ul[@class='rcbList']/li[@class='rcbItem'])[1]")
	WebElement SelectCellName;

	//WebElement for Validating the text present in the ClusterNE Text area
	//@FindBy (xpath = "//input[@id='txtCells_ClientState']")
	@FindBy (xpath = "//textarea[@id='txtCells']")
	WebElement ClusterNETextArea;
	
	@FindBy (xpath = "(//input[contains(@id,'cboRawCounters_Input')])[1]")
    WebElement CounterDropDown;
    
    @FindBy (xpath = "//div[@class='k-grid-content']//table//tr//td[1]")
    WebElement KPIIncluded;
    
    @FindBy (xpath = "//a[@id='cboLevel_Arrow']")
    WebElement NetworkLevelArrowClick;
  
    @FindBy (xpath = "//div[@id='cboLevel_DropDown']//ul[@class='rcbList']//li[7]")
    WebElement ClusterLevelItemClick;
  
    @FindBy (xpath = " //a[@id='cboTimeAggr_Arrow']")
    WebElement AggregationLevelArrowClick;

    @FindBy (xpath = "//a[@id='cboRawCounters_Arrow']")
    WebElement CounterDropDownArrowClick;
  
    @FindBy (xpath = "//div[@id='cboRawCounters_MoreResultsBox']")
    WebElement CounterDropDownArrowClick2;


    @FindBy (xpath = "//a[@id='rdpSDate_popupButton']")
    WebElement StartDateCalenderbtn;
  
    @FindBy (xpath = "//a[@id='rdpEDate_popupButton']")
    WebElement EndDateCalenderbtn;
   
    @FindBy (xpath = "//table//tr//td[@class='rcSelected']/preceding-sibling::td[1]")
    WebElement StartDateselected;
  
    
    @FindBy (xpath = "//table//tr//td[@class='rcSelected']")
    WebElement DateSelected;
    
    @FindBy (xpath = "//input[@id='cboCellNE_Input']")
    WebElement SendEnodeName;
  
    
    @FindBy (xpath = "//textarea[@id='txtCells']")
    WebElement TextAreatext;
    
    @FindBy (xpath ="//input[contains(@id,'cboCellNE_Input')]")
    WebElement EnodeBdropdown;
    
    
    @FindBy (xpath = "//input[@id='cboCellSC_Input']")
    WebElement EnodeBTextbox;
  
    @FindBy (xpath = "//a[@id='cboCellNE_Arrow']")
    WebElement EnodeBArrownDownClick ;
    
    @FindBy (xpath = "//a[@id='cboCellNE_MoreResultsBoxImage']")
    WebElement EnodeBMoreRsultArrowDown ;
  
    @FindBy (xpath = "//input[@id='Button1']")
    WebElement RefreshButton ;
    
    @FindBy (xpath = "(//div[contains(@class,'k-grid-content')])[1]")
    WebElement GridClick ;
    
    @FindBy (xpath = "//div[@id='kpiGrid']//div[@class='k-grid-content']")
    WebElement FiltredKGridTable;
  		
    @FindBy (xpath = "//div[@id='kpiGrid']//div[@class='k-grid-header-wrap k-auto-scrollable']//table//th")
    WebElement SecondFiltredKGridTableHeaders;
    
    @FindBy (xpath = "//div[@id='kpiGrid']//div[@class='k-grid-header-locked']//table//th")
    List<WebElement> FirstFiltredKGridTableHeaders;
    		
    @FindBy (xpath = "//div[@id='kpiGrid']//div[@class='k-grid-header']")
    List<WebElement>  KGridTableMainHeader;
    
    @FindBy (xpath = " //div[@id='kpiGrid']/div")
    List<WebElement> KGridTableMainHeaderCount;
 
    @FindBy (xpath = " //div[@id='kpiGrid']/div[@class='k-grid-content-locked']//tr")
    List<WebElement> KGridFirstTableRowCount;
    
    @FindBy (xpath = "//div[@id='kpiGrid']/div[@class='k-grid-content']//tr")
    List<WebElement> KGridSecondTableRowCount;
  

    @FindBy (xpath = "//div[@id='kpiGrid']//div[@class='k-grid-header-wrap k-auto-scrollable']//th")
    List<WebElement> KGridSecondTableHeaders;
    
    @FindBy (xpath = "//input[@id='rdpSDate_dateInput']")
    WebElement StartDate;
    
    @FindBy (xpath = "//input[@id='rdpEDate_dateInput']")
    WebElement EndDate;
    
    @FindBy (xpath = "//button[contains(text(),'Options')]")
    WebElement OptionsButton;
  
    @FindBy (xpath = "//ul//li//input[@id='btnExportDataToExcel']")
    WebElement ExportToExcelButton;
    
    @FindBy (xpath = "//ul//li//input[@id='btnExportDataToCSV']")
    WebElement ExportToCsvButton;
    
    @FindBy (xpath = "//ul//li//input[@id='btnExportXLS']")
    WebElement ExportToTemplateButton;
    
    @FindBy (xpath = "//input[@id='txtReportName']")
    WebElement ReportNameTxBox;
  
    @FindBy (xpath = "//td//a[@id='cboExistingReports_Arrow']")
    WebElement ExsistingReportDropDown;
  
    @FindBy (xpath = "//li[contains(text(),'Demo1')]")
    WebElement ExsistingReportName;
  
    
    
	/*Initializing all the WebElements*/
	public QueryBuilderPage() {
		PageFactory.initElements(driver , this);
	}

	Actions Act = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	public String CounternameForQB=Lib.getProperty(CONFIG_PATH, "CounternameQB");
	public String EnodeNameforQB=Lib.getProperty(CONFIG_PATH, "EnodeNameQB");
    
	public String SelectedDateis;
	public String StartDateArr[];
	public String EndDateArr[];
	List<String> FiltredTableVal;
	List<String> CounterAddedInTableHeader;
	List<String> StartDateSplitList;
	List<String> EndDateSplitList;
	
	public String ExportToExcelID="btnExportDataToExcel";
	public String ExportToCSVID="btnExportDataToCSV";
	public String ExportToTemplateID="btnExportXLS";
	//utilization

	//TC-06 - Query Builder: Searching for cell

	//Click on the Query Builder
	public void ClickQuerBuilderLink() {
		QueryBuilderLink.click();
	}

	//Expand the filter/OPtions Tab
	public void ClickQBFilterOption() {
		QBFilterOption.click();
	}

	// Click on the cell name and validate the text of the cell
	public String ValidateOnCellValue() throws InterruptedException {
		CellArrowClick.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP);
		action.build().perform();
		Thread.sleep(2000);
		ClickOnCell.click();
		Thread.sleep(2000);
		return CellDropdownValue.getAttribute("value");

	}

	
	// Click on the cell name and validate the text of the cell
		public String ValidateOnLevelSelected(String SlectedLevel) throws InterruptedException {
			CellArrowClick.click();
			Thread.sleep(1000);
			/*Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP);
			action.build().perform();*/
			Thread.sleep(2000);
			StringBuilder s1= new StringBuilder();
			s1.append("//li[text()=");
			s1.append("'");
			s1.append(SlectedLevel);
			s1.append("'");
			s1.append("]");
			driver.findElement(By.xpath(s1.toString())).click();
			Thread.sleep(2000);
			return CellDropdownValue.getAttribute("value");

		}
	
	
	public String ValidateOnClusterField() throws InterruptedException {
		CellValueClick.click();
		Thread.sleep(1000);
		CellValueMoreResultsClick.click();
		Thread.sleep(5000);
		return SelectCellName.getText();
		
	}
	
	public void ClickOnClusterField() throws InterruptedException {
		Thread.sleep(1000);
		SelectCellName.click();
	}
	
	public String ValidateClusterNEText() throws InterruptedException {
		//ClusterNETextArea.click();
		Thread.sleep(3000);
		return ClusterNETextArea.getAttribute("value");
	}
	
	public void SendCounterName() throws InterruptedException {
	       
	       Thread.sleep(2000);
	       CounterDropDownArrowClick.click();
	       Thread.sleep(7000);
	       CounterDropDownArrowClick2.click();
	       Thread.sleep(10000);
	       GridClick.click();
	       Thread.sleep(2000);
	       CounterDropDown.click();
	       Thread.sleep(2000);
	       CounterDropDown.sendKeys(CounternameForQB);
	       Thread.sleep(10000);
	       Act.sendKeys(Keys.ENTER).build().perform();
	       
	}

	public boolean VerifyAddedCounter() {
	       String AddedKPIName;
	       boolean IsKpiAvailable=false;
	       AddedKPIName=KPIIncluded.getText().trim();
	       int KPIsTableSize=driver.findElements(By.xpath("//div[@class='k-grid-content']//table//tr")).size();
	       if(KPIsTableSize>0){
	              if(AddedKPIName.equals(CounternameForQB))
	              {
	                     
	                     System.out.println("The  Counter Added is available and Countername is:::"+AddedKPIName);
	                     Reporter.log("The  Counter Added is available and Countername is:::"+AddedKPIName);
	                     IsKpiAvailable=true;
	              }
	              
	       
	       }
	       else {
	              System.out.println("The KpiTable size is ::::"+KPIsTableSize  +"Hence no counter is added to the table");
	              Reporter.log("The KpiTable size is ::::"+KPIsTableSize+"Hence no counter is added to the table");
	       }
	       driver.manage().window().fullscreen();
	              return IsKpiAvailable;

	}


	public void SelectNetworkLevel() throws InterruptedException {
	       
	       Thread.sleep(2000);
	       NetworkLevelArrowClick.click();
	       Thread.sleep(2000);
	       /*ClusterLevelItemClick.click();*/
	       
	       int NLDropDownSize=driver.findElements(By.xpath("//div[@id='cboLevel_DropDown']//ul[@class='rcbList']//li")).size();
	       
	       for(int m=1;m<=NLDropDownSize;m++)
	       {
	              
	              WebElement ListItem =driver.findElement(By.xpath("//div[@id='cboLevel_DropDown']//ul[@class='rcbList']//li["+m+"]"));
	              String NLElementText=ListItem.getText();
	              if(NLElementText.trim().equals("Cluster Level"))
	              {
	              driver.findElement(By.xpath("//div[@id='cboLevel_DropDown']//ul[@class='rcbList']//li["+m+"]")).click();
	                     System.out.println("The Selected NE Elemnt is ::::"+NLElementText);
	                     Reporter.log("The Selected NE Elemnt is ::::"+NLElementText);
	                     break;
	              }
	       }
	       
	       
	}


	public void SelectAggreationLevel() throws InterruptedException {
	       Thread.sleep(2000);
	       AggregationLevelArrowClick.click();
	       Thread.sleep(2000);
	       /*ClusterLevelItemClick.click();*/
	       
	       int AggLevelDropDownSize=driver.findElements(By.xpath("//div[@id='cboTimeAggr_DropDown']//ul//li")).size();
	       
	       for(int n=1;n<=AggLevelDropDownSize;n++)
	       {
	              
	              WebElement AggListItem =driver.findElement(By.xpath("//div[@id='cboTimeAggr_DropDown']//ul//li["+n+"]"));
	              String AggElementText=AggListItem.getText();
	              if(AggElementText.trim().equals("Daily"))
	              {
	                     driver.findElement(By.xpath("//div[@id='cboTimeAggr_DropDown']//ul//li["+n+"]")).click();
	                     System.out.println("The Selected NE Elemnt is ::::"+AggElementText);
	                     Reporter.log("The Selected NE Elemnt is ::::"+AggElementText);
	                     break;
	              }
	       }
	}

	
	public void  SetDateSelection() throws InterruptedException {
		Thread.sleep(2000);
	    StartDateCalenderbtn.click();
	    Thread.sleep(2000);
	    DateSelected.click();
	    Thread.sleep(2000);
	    EndDateCalenderbtn.click();
	    Thread.sleep(2000);
	    DateSelected.click();
		
	}
	
	
	public void SendEnodeBValue() throws InterruptedException {
		
		
	     String SelectedLevelis=ValidateOnLevelSelected("eNodeB");
	     System.out.println("The Selected NeType Element is:::::"+SelectedLevelis);
	     Thread.sleep(3000);
	     TextAreatext.click();
	     Act.sendKeys(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).sendKeys(Keys.BACK_SPACE).build().perform();
	     Thread.sleep(2000);
        /* EnodeBArrownDownClick.click();*/
         Thread.sleep(8000);
        /* EnodeBMoreRsultArrowDown.click();
         Thread.sleep(8000);*/
         System.out.println("The  EnodeB is::: "+EnodeNameforQB);
        /* EnodeBMoreRsultArrowDown.click();
         Thread.sleep(8000);*/
         /*EnodeBArrownDownClick.click();
         Thread.sleep(2000);
         EnodeBdropdown.click();
         Thread.sleep(2000);
         EnodeBdropdown.clear();
         Thread.sleep(2000);
         EnodeBMoreRsultArrowDown.click();
         Thread.sleep(9000);
         EnodeBdropdown.sendKeys(EnodeNameforQB);
         EnodeBdropdown.clear();
         Thread.sleep(4000);*/
         /*EnodeBdropdown.sendKeys(EnodeNameforQB);*/
  
         StringBuilder StrforTA= new StringBuilder();
         StrforTA.append("document.getElementById('txtCells').value =");
         StrforTA.append("'");
         StrforTA.append(EnodeNameforQB);
         StrforTA.append("'");
         StrforTA.append(";");
        
         jse.executeScript(StrforTA.toString());
         
         
         /*StringBuilder Ste= new StringBuilder();
         Ste.append("document.getElementById('cboCellNE_Input').value =");
         Ste.append("'");
         Ste.append(EnodeNameforQB);
         Ste.append("'");
         Ste.append(";");
         JavascriptExecutor jse = (JavascriptExecutor) driver;
         jse.executeScript(Ste.toString());*/
         /*Act.sendKeys(EnodeNameforQB).build().perform();*/
      /*   Act.moveToElement(EnodeBdropdown).click().sendKeys(EnodeBdropdown, EnodeNameforQB).build().perform();*/
/*	     EnodeBdropdown.sendKeys(EnodeNameforQB);*/
	     /*Thread.sleep(12000);
	     Act.sendKeys(Keys.ENTER).build().perform();*/
	     Thread.sleep(9000);
	     System.out.println("The Selected EnodeB value in Textarea is:::"+TextAreatext.getAttribute("value"));
	     Thread.sleep(3000);
	     
	     StringBuilder StrforRname= new StringBuilder();
         StrforRname.append("document.getElementById('txtReportName').value =");
         StrforRname.append("'");
         StrforRname.append("Test123");
         StrforRname.append("'");
         StrforRname.append(";");
	     
         jse.executeScript(StrforRname.toString());
    /*     Thread.sleep(3000);
         ExsistingReportDropDown.click();*/
	}
	
	public String GetDateValues(String XpathForEle) {
		FiltredTableVal= new ArrayList<String>();
		/*String XPathFoeDatesis="//input[@id='rdpEDate_dateInput']"*/
		StringBuilder StrBForDate = new StringBuilder();
		StrBForDate.append("//input[@id='rdp");
		StrBForDate.append(XpathForEle);
		StrBForDate.append("Date_dateInput']");
		
		SelectedDateis =driver.findElement(By.xpath(StrBForDate.toString())).getAttribute("value").split(" ")[0];
		System.out.println("The Selected  is:::" +SelectedDateis);
		return SelectedDateis.toString();
	}
	
	

	
	
	
	
	public void GetTableValues(String Commonxpath) {
		
		
		int TrCount= driver.findElements(By.xpath(Commonxpath)).size();
		System.out.println("RowCount is:::"+TrCount);
		
		for(int r=1;r<=TrCount;r++)
		{
			List<WebElement> tddata = driver.findElements(By.xpath(Commonxpath+"["+r+"]//td"));
			int TdCount=tddata.size();
			System.out.println("Row composed of  "+TdCount+" Cells(td's)");
			
			for(int td=1;td<=TdCount;td++)
			{
				String TableValue=driver.findElement(By.xpath(Commonxpath+"["+r+"]"+"//td["+td+"]")).getText(); 
				System.out.println("The Table value of  "+r+"/st/nd/rd/th Row is::::"+TableValue);
				FiltredTableVal.add(TableValue);
			}
		}
		
	}
	
	
	public boolean ValidateCounterAvailInTabHeader() {
		CounterAddedInTableHeader= new ArrayList<String>();
		int Thcount=KGridSecondTableHeaders.size();
		boolean IsCounterNameAvailable=false;
		
		for(int th=1;th<=Thcount;th++)
		{
			String THval=driver.findElement(By.xpath("//div[@id='kpiGrid']//div[@class='k-grid-header-wrap k-auto-scrollable']//th["+th+"]")).getText();
		    System.out.println("The Table HeaderValue is:::" +THval);
		    CounterAddedInTableHeader.add(THval.trim());
		}
		
		if(CounterAddedInTableHeader.contains(CounternameForQB))
		{
			IsCounterNameAvailable=true;
		}
		return IsCounterNameAvailable;
		
	}
	
	
	public String  FormatDate(String FormatDate) {
		Date dt = new Date(FormatDate);
		String patternD="yyyy/MM/dd";
		SimpleDateFormat sdf= new SimpleDateFormat(patternD);
		System.out.println("Formatted Date is::::"+sdf.format(dt));
		return sdf.format(dt);
	}
	
	public boolean ValidateReportGeneratedForSelectedDays() throws InterruptedException {
		boolean finalStatus=false;
		boolean isDateAvailableinTable=false;
		String StartDateis; 
		String EndDateis; 
		boolean ThStatus=false;
		
		int MainTableColumnCount;
		int FirstTableRowCount;
		int SecondTableRowCount;
		String FirstTable="//div[@id='kpiGrid']//div[@class='k-grid-content-locked']//tr";
		String SecondTable="//div[@id='kpiGrid']//div[@class='k-grid-content']//tr";
		
		RefreshButton.click();
		Thread.sleep(4000);
		MainTableColumnCount=KGridTableMainHeaderCount.size();
		System.out.println("The Main Table Coloumn Count is :::::"+MainTableColumnCount);
		FirstTableRowCount=KGridFirstTableRowCount.size();
		System.out.println("The FirstTable Row Count  is :::::"+FirstTableRowCount);
		SecondTableRowCount=KGridSecondTableRowCount.size();
		System.out.println("The Second TableRow Count is :::::"+SecondTableRowCount);
	   
		
		StartDateis=GetDateValues("S");
		System.out.println("The Slected Start date is::::"+StartDateis);
		EndDateis=GetDateValues("E");
		System.out.println("The Slected End date is::::"+EndDateis);
		
		
	
		
		/*Date dt = new Date(StartDateis);
		 String patternD="yyyy/mm/dd";*/
	/*	sdf.format(StartDateis);
		SimpleDateFormat sdf= new SimpleDateFormat(patternD);*/
	  
		/*System.out.println("Formatted Start Date is::::"+sdf.format(dt));
		System.out.println("Formatted End Date is::::"+sdf.format(dt));*/
		
		String FormattedStartDateis=FormatDate(StartDateis);
		String FormattedEndDateis=FormatDate(EndDateis);
		System.out.println("Formatted Start  Date is::::"+FormattedStartDateis);
		System.out.println("Formatted End Date is::::"+FormattedEndDateis);
		
		if(MainTableColumnCount>0)
		{
			
			if(FirstTableRowCount>0 && SecondTableRowCount>0)
			{
				
				
				ThStatus=ValidateCounterAvailInTabHeader();
				if(ThStatus==false)
				{
					System.out.println("Counter:::"+ CounternameForQB +"  is not Available in the Table header");
				}
				else{
					System.out.println("Counter::::::"+ CounternameForQB +"  is  Available in the Table header");
				}
				GetTableValues(FirstTable);
				GetTableValues(SecondTable);
				for(String TablVal:FiltredTableVal )
				{
					System.out.println("The Final Table Values are:::::"+ TablVal);	
	
				
				}
				if(FiltredTableVal.contains(FormattedStartDateis) && FiltredTableVal.contains(FormattedEndDateis))
				{
					System.out.println("The Table listed contains the start::::" +FormattedStartDateis +"  & End Date::::::" +FormattedEndDateis );
					isDateAvailableinTable=true;
				}
				else
				{
					System.out.println("The Table listed Doesn't contains the start & End Date");
					isDateAvailableinTable=false;
				}
				
				
				if(ThStatus==true && isDateAvailableinTable==true)
				{
					finalStatus=true;
				}
				else
				{
					finalStatus=false;
				}
			}
			else{
			 finalStatus=false;
			}
			
			
			
		}
		return finalStatus;
	}
	
	
	
	public void GetExportBy(String ExportByValue) {
		StringBuilder StrBforExport= new StringBuilder();
		StrBforExport.append("//ul//li//input[@id=");
		StrBforExport.append("'");
		StrBforExport.append(ExportByValue);
		StrBforExport.append("'");
		StrBforExport.append("]");
		driver.findElement(By.xpath(StrBforExport.toString())).click();
	}
	
	
	
	
	
	public void ExportResult(String ExportBY) throws InterruptedException {
		
		
		
		
		
		OptionsButton.click();
		Thread.sleep(5000);
		
		switch (ExportBY.trim()) {
		case "Excel":
			GetExportBy(ExportToExcelID);
			System.out.println("Clicked on Export to Xls button");
			break;
		case "CSV":
			
			GetExportBy(ExportToCSVID);
			System.out.println("Clicked on Export to Csv button");
			break;
		case "Template":
			
			GetExportBy(ExportToTemplateID);
			System.out.println("Clicked on Export Template button");
			break;
		default:
			break;
		}
		
		
	}
	
public void SelectExisitingReports() throws InterruptedException {
	Thread.sleep(3000);
	ExsistingReportDropDown.click();
	Thread.sleep(3000);
	ExsistingReportName.click();
	Thread.sleep(5000);
	
	System.out.println("Selected Exsisting Report Name is:::"+driver.findElement(By.xpath("//input[@id='cboExistingReports_Input']")).getAttribute("value"));
}	
	
}