package com.ericsson.edos.dopuatautomation.pages;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.ericsson.edos.dopuatautomation.base.TestBase;

public class EdosRasterpage extends TestBase{

	//Declaration
	//---------TC-01--------//
	//Access GNP Raster Visualization

	//WebElemement for Rater Page Title validation	
	@FindBy (xpath="//div[text()='Raster Visualization']")
	WebElement RasterTitleText;

	//WebElemement for Layers Text validation	
	@FindBy (xpath="//div[text()='Layers']")
	WebElement LayersText;

	//WebElement for Topology Text validation
	@FindBy (xpath="//input[@value='Topology']")
	WebElement TopologyText;

	//WebElement for Start Date
	@FindBy (xpath="//div[text()='Start']")
	WebElement StartDateText;

	//WebElement for End Date
	@FindBy (xpath="//div[text()='End']")
	WebElement EndDateText;

	//WebElement for Selecting the Topology in search box
	@FindBy (xpath="//div[text()='Select topology element']")
	WebElement SelectTopologyText;

	//WebElement to click on the Ruler
	@FindBy (xpath="(//button[@class='mapControlsOverlay__map-button___pcrcy '])[1]")
	WebElement RulerClick;

	//WebElement for Measurement Ruler
	@FindBy (xpath="//span[contains(text(),' Ruler')]")
	WebElement RulerText;

	//WebElement to click on the Legend
	@FindBy (xpath="(//button[@class='mapControlsOverlay__map-button___pcrcy '])[2]")
	WebElement LegendClick;

	//WebElement for Raster Legend
	@FindBy (xpath="//span[contains(text(),'Show/Hide Legend')]")
	WebElement RasterLegendText;

	//WebElement for Zoom In Button
	@FindBy (xpath="//button[@title='Zoom In']")
	WebElement ZoomInButton;

	//WebElement for Zoom Out Button
	@FindBy (xpath="//button[@title='Zoom Out']")
	WebElement ZoomOutButton;

	//WebElement for Map View Pannel Validation
	@FindBy (xpath="//canvas[@class='mapboxgl-canvas']")
	WebElement MapViewPanel;

	//--------TC-02--------//
	//Expanding the Topology Layer

	//WebElement for Eye Icon
	@FindBy (xpath="(//div[@class='eButton__linked-button___3nenl'])[2]")
	WebElement EyeIcon;

	//Web Element to make the Eye Icon Visible
	@FindBy (xpath="//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye-solid___2Q-Y1']")
	WebElement EyeIconVisible;

	//Web Element to make the Eye ICon Invisible
	@FindBy (xpath="//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye___TmGum']")
	WebElement EyeIconNotVisible;

	//WebElement for Downward Eye Icon in Topology Layer
	@FindBy (xpath="(//div[@class='eButton__linked-button___3nenl'])[3]")
	WebElement ArrowIcon;

	//WebElement for clicking on the Topology Arrow
	@FindBy (xpath="(//span[@class='Select-arrow'])[1]")
	WebElement TopologyArrow;

	//WebElement for Selecting the topology from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Topology']")
	WebElement SelectTopology;

	//WebElement to validate the Apply button is deactivated or not
	@FindBy (xpath="//button[text()='Apply']")
	WebElement ApplyButton;

	//WebElement to select the Opacity Range
	@FindBy (xpath="//input[@id='topo-opacity']")
	WebElement OpacityRange;

	//WebElement to select the Site Scale Range
	@FindBy (xpath="//input[@id='sites-scale-factor']")
	WebElement SitesScaleRange;

	//WebElement to select the Sector Scale Range
	@FindBy (xpath="//input[@id='sectors-scale-factor']")
	WebElement SectorsScaleRange;

	//WebElement to validate the layer is compacted or not
	@FindBy (xpath="//div[text()='Basic']")
	WebElement BasicText;

	public int rowXCount;
	public int rowYCount;


	public void setRowXCount() {
		this.rowXCount =driver.findElements(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input")).size();
	}

	public int RowXCount() {
		return rowXCount =driver.findElements(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input")).size();
	}

	public int RowYCount() {
		return rowYCount =driver.findElements(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input")).size();
	}

	public void setRowYCount() {
		this.rowYCount =driver.findElements(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input")).size();
	}

	public int getRowXCount() {
		return rowXCount;
	}

	public int getRowYCount() {
		return rowYCount;
	}

	//--------TC-03--------//
	//Adding a Raster layer

	//WebElement to click on + icon
	@FindBy (xpath="(//div[@class='eButton__linked-button___3nenl'])[1]")
	WebElement PlusIcon;

	//WebElement to validate whether the default layer name is Layer2
	@FindBy (xpath="//div[@class='jss2 jss38']/input")
	WebElement Layer2Text;

	//WebElement to click on the Arrow Icon of Layer2
	@FindBy (xpath="(//div[@class='eButton__linked-button___3nenl'])[6]")
	WebElement Layer2ArrowIcon;

	//WebElement for clicking on the Layer2 Arrow
	@FindBy (xpath="(//span[@class='Select-arrow'])[1]")
	WebElement LayerTypeDropdown;

	//WebElement for Selecting the Raster from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Raster']")
	WebElement SelectRaster;

	//WebElement for clicking on the Layer2 Arrow
	@FindBy (xpath="(//span[@class='Select-arrow'])[2]")
	WebElement RasterTypeDropdown;

	//WebElement for Selecting the Number of calls from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Number of calls']")
	WebElement NumberOfCalls;

	//WebElement for Selecting the Termination reasonss from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Termination reasons']")
	WebElement TerminationReasons;

	//WebElement for Selecting the Channel Quality Indicator from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Channel Quality Indicator']")
	WebElement ChannelQualityIndicator;

	//WebElement for Selecting the SINR PUSCH from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='SINR PUSCH']")
	WebElement SinrPusch;

	//WebElement for Selecting the SINR PUCCH from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='SINR PUCCH']")
	WebElement SinrPucch;

	//WebElement for Selecting the UL Throughputs from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='UL Throughput']")
	WebElement ULThroughput;

	//WebElement for Selecting the DL Throughput from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='DL Throughput']")
	WebElement DLThroughput;

	//WebElement for Selecting the DL Data Volume from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='DL Data Volume']")
	WebElement DlDataVolume;

	//WebElement for Selecting the UL Data Volum from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='UL Data Volume']")
	WebElement UlDataVolume;

	//WebElement for Selecting the Pilot Pollution from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Pilot Pollution']")
	WebElement PilotPollution;

	//WebElement for Selecting the Dominance from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Dominance']")
	WebElement Dominance;

	//WebElement for Selecting the Serving RSRP from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving RSRP']")
	WebElement ServingRSRP;

	//WebElement for Selecting the Serving RSRQ from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving RSRQ']")
	WebElement ServingRSRQ;

	//WebElement for Selecting the Serving RSRQ based on RSRP from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving RSRQ based on RSRP']")
	WebElement ServingRSRQBasedOnRSRP;

	//WebElement for Selecting the Serving DL RSSI from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving DL RSSI']")
	WebElement ServingDlRSSI;

	//WebElement for Selecting the Serving PCI from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving PCI']")
	WebElement ServingPCI;

	//WebElement for Selecting the Serving-Interference Delta RSRP from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving-Interference Delta RSRP']")
	WebElement DeltaRSRP;

	//WebElement for Selecting the Serving-Interference Delta RSRQ from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving-Interference Delta RSRQ']")
	WebElement DeltaRSRQ;

	//WebElement for Selecting the Serving-Interference Delta DL RSSI from the dropdown list
	@FindBy (xpath="//div[@class='Select-value']/span[text()='Serving-Interference Delta DL RSSI']")
	WebElement DeltaDLRSSI;

	//WebElement to make the Raster Eye Icon Visible
	@FindBy (xpath="(//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye-solid___2Q-Y1'])[2]")
	WebElement RasterEyeIconVisible;

	//Web Element to make the Raster Eye ICon Invisible
	@FindBy (xpath="(//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye___TmGum'])[2]")
	WebElement RasterEyeIconNotVisible;

	//WebElement to click on the Layer 2 Bin Icon
	@FindBy (xpath="//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-trashcan___2IV4K']")
	WebElement Layer2BinIcon;

	//WebElemnt to validate the new raster layers
	@FindBy (xpath="//input[@class='layerLabelInput__layerLabelInput___3yFXm']")
	WebElement LayersLabelInput;

	//WebElemnt to validate the Filter layer
	@FindBy (xpath="//div[text()='Filters']")
	WebElement FilterText;

	//WebElemnt to validate the Aggregation type layer
	@FindBy (xpath="//div[text()='Aggregation type']")
	WebElement AggregationTypeText;

	@FindBy (xpath="//div[@class='layerSelectionMenu__layer-menu-item-title___1WE4a']")
	WebElement LayerSelectionMenu;


	//--------TC-03--------//
	//Date Panel

	/*Private Fields*/
	private List<String> CssClass;
	private List<String> HoursSelected;

	@FindBy (xpath="(//input[@class='calendar__datePickerInput___AuvN3'])[1]")
	WebElement ClickStartDate;

	@FindBy (xpath="(//input[@class='calendar__datePickerInput___AuvN3'])[2]")
	WebElement ClickEndDate;

	//WebElement to click on the start date panel
	@FindBy (xpath="(//div[@class='react-datepicker__input-container'])[1]")
	WebElement DatePanelClick;

	@FindBy (xpath="(//input[@class='calendar__datePickerInput___AuvN3 react-datepicker-ignore-onclickoutside']")
	WebElement DatePanelText;

	@FindBy (xpath="//div[@class='toolbar__datepicker-refresh-btn-container___1Xvva']")
	WebElement RefreshButton;

	/*Inspecting WebElement for TIV StartHours*/	
	@FindBy (xpath = "(//ul[@class='react-datepicker__time-list']//li)")
	List<WebElement> StartHours;
	
	@FindBy (xpath="(//div[@class='Select-control'])[3]")
	WebElement ClickAggregationType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[3]//input")
	WebElement SelectAggregationType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[4]")
	WebElement ClickFilterCarrierType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[4]//input")
	WebElement SelectFilterCarrierType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[5]")
	WebElement ClickFilterQCIType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[5]//input")
	WebElement SelectFilterQCIType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[6]")
	WebElement ClickFilterMDTType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[6]//input")
	WebElement SelectFilterMDTType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[7]")
	WebElement ClickFilterIndoorType;
	
	@FindBy (xpath="(//div[@class='Select-control'])[7]//input")
	WebElement SelectFilterIndoorType;
	

	//--------TC-04--------//
	//Legend

	@FindBy (xpath="//div[@class='rasterLegend__raster-legend-header___blo9b']")
	WebElement LegendText;

	@FindBy (xpath="(//div[@class='Select-control'])[2]")
	WebElement ClickRasterType;


	@FindBy (xpath="(//div[@class='Select-control'])[2]//input")
	WebElement SelectRasterType;

	//--------TC-05--------//
	//Zoom In and Out Button

	//WebElement for Info button
	@FindBy (xpath="//button[@id='infoButton']")
	WebElement InfoButton;

	//WebElement for fetching the zoom values
	@FindBy (xpath="//div[@class='mapControlsOverlay__zoom___140pK']")
	WebElement ZoomValue;


	//Initialisation of the driver
	public EdosRasterpage(){
		PageFactory.initElements(driver, this);


	}


	//Utilisation

	//---------TC-01--------------------//
	//----------Access GNP Raster Visualization--------//
	public String ValidateRasterHomePage() {
		return driver.getTitle();
	}

	public String ValidateRasterTitle() {
		return RasterTitleText.getText();
	}

	public String ValidateLayerPanelText() {
		return LayersText.getText();
	}

	public String ValidateTopologyText() {
		return TopologyText.getAttribute("value");
	}

	public String ValidateStartDatePanelText() {
		return StartDateText.getText();
	}

	public String ValidateEndDatePanelText() {
		return EndDateText.getText();
	}

	public String ValidateSearchPanelText() {
		return SelectTopologyText.getText();
	}

	public String ValidateDistanceMeasurementText() throws InterruptedException {
		String tooltipText="";
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(RulerClick).clickAndHold(RulerClick).build().perform();
		Thread.sleep(2000);
		boolean isToolTipDisplayed = driver.findElement(By.xpath("//span[contains(text(),' Ruler')]")).isDisplayed();
		System.out.println("Is Tooltip displayed ? : " + isToolTipDisplayed);
		if (isToolTipDisplayed) {
			tooltipText = driver.findElement(By.xpath("//span[contains(text(),' Ruler')]")).getText();
			System.out.println("Tooltip Text:- " + tooltipText);

		}
		return tooltipText;
	}

	public String ValidateRasterLegendText() throws InterruptedException {
		String tooltipText="";
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(LegendClick).clickAndHold(LegendClick).build().perform();
		Thread.sleep(2000);
		boolean isToolTipDisplayed = driver.findElement(By.xpath("//span[contains(text(),'Show/Hide Legend')]")).isDisplayed();
		System.out.println("Is Tooltip displayed ? : " + isToolTipDisplayed);
		if (isToolTipDisplayed) {
			tooltipText = driver.findElement(By.xpath("//span[contains(text(),'Show/Hide Legend')]")).getText();
			System.out.println("Tooltip Text:- " + tooltipText);

		}
		return tooltipText;
	}

	public String ValidateZoomInButton() {
		return ZoomInButton.getAttribute("title");
	}

	public String ValidateZoomOutButton() {
		return ZoomOutButton.getAttribute("title");
	}

	public String ValidateMapViewPanel() {
		return MapViewPanel.getTagName();
	}

	//----------TC-02------------//
	//----------Topology Layer---------//

	//Click on the arrow down button
	public void ClickOnArrowButton() {
		ArrowIcon.click();
	}

	//Click on the Eye Icon to validate it is not visible
	public String ValidationOfEyeIconNotVisible() throws InterruptedException {
		EyeIconVisible.click();
		Thread.sleep(1000);
		return EyeIconNotVisible.getAttribute("class");
	}

	//Click on the Eye Icon to validate it is visible	
	public String ValidationOfEyeIconVisible() throws InterruptedException {
		EyeIconNotVisible.click();
		Thread.sleep(1000);
		return EyeIconVisible.getAttribute("class");
	}

	//Validation of Layer type from the dropdown, and it is be unique
	public int ValidationOfLayerType() {
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='Select-value']/span"));
		int totalElements = allElements.size();
		System.out.println("Total number of dropdown elements present on the web page is : "+totalElements);
		return totalElements;
	}

	//Validation on selecting the Topology Layer from the dropdown
	public void ValidateOnTopologyLayer() throws InterruptedException {
		TopologyArrow.click();
		Thread.sleep(1000);
		SelectTopology.click();
		Thread.sleep(1000);
	}

	//Validation on the Apply button deactivated or not	
	public boolean ValidateOnApplyButtonDeactivated() {
		if(ApplyButton.isEnabled()){
			return true;
		}
		else{
			return false;
		}
	}

	//Validation on range sliders for Opacity, Sites and Sectors

	public String[] RangeSlidePointer() throws InterruptedException {
		setRowYCount();
		String str[]=new String[rowYCount];
		System.out.println(rowYCount);
		for(int i=0;i<rowYCount;i++)
		{
			WebElement slider = driver.findElement(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input["+(i+1)+"]"));
			int width=slider.getSize().getWidth();
			Thread.sleep(1000);
			Actions move = new Actions(driver);
			Action action = move.dragAndDropBy(slider, ((width*25)/100), 0).build();
			Thread.sleep(1000);
			action.perform();
			Thread.sleep(2000);
			str[i]=slider.getAttribute("value");

		}
		return str;
	}
	public String[] RangeSlideValue() {
		setRowXCount();


		String str[]=new String[rowXCount];
		System.out.println(rowXCount);
		for(int i=0;i<rowXCount;i++)
		{
			WebElement xyz =driver.findElement(By.xpath("//div[@class='layerVisualizationMenu__visualization-controls___3pZs3']/form/input["+(i+1)+"]"));
			str[i]=xyz.getAttribute("value");
		}
		return str;
	}



	//Validate on to check whether the layer is compacted or not
	public boolean ValidateBasicText() {
		try{
			BasicText.isDisplayed();
			return true;
		}
		catch(NoSuchElementException e){
			return false;
		}
	}

	//----------TC-03------------//
	//----------Adding a Raster Layer---------//

	//Validate on clicking the + icon
	public void ClickPlusIcon() {
		PlusIcon.click();
	}
	//Validate on the default layer which is Layer2
	public String ValidateDefaultLayerName() {
		return Layer2Text.getAttribute("value");
	}

	//Validation on changing the default layer name 
	public String ChangeDefaultLayerName() throws InterruptedException {
		Thread.sleep(1000);
		Layer2Text.clear();
		Thread.sleep(1000);
		Layer2Text.sendKeys("Test Layer");
		Thread.sleep(1000);
		return Layer2Text.getAttribute("value");
	}

	//Validate on expanding the Raster Layer
	public void ClickRasterLayerArrow() {
		Layer2ArrowIcon.click();
	}

	//Validate on the Raster Layer Type from the dropdown, and it is be unique
	public int ValidationOfRasterLayerType() {
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='Select-value']/span"));
		int totalElements = allElements.size();
		System.out.println("Total number of dropdown elements present on the Raster Layer is : "+totalElements);
		return totalElements;
	}

	//Validate on selecting the Raster type from the dropdown
	public void SelectingTheRasterType() throws InterruptedException {

		Thread.sleep(1000);
		WebElement rasterName = driver.findElement(By.xpath("(//div[@class='Select-control'])[2]"));

		ArrayList<String> rasterelement1 = new ArrayList<String>();
		rasterelement1.add("Number of calls");
		rasterelement1.add("Termination reasons");
		rasterelement1.add("SINR PUSCH");
		rasterelement1.add("SINR PUCCH");
		rasterelement1.add("DL Data Volume");
		rasterelement1.add("UL Data Volume");
		rasterelement1.add("Pilot Pollution");
		rasterelement1.add("Dominance");
		
		ArrayList<String> rasterelement2 = new ArrayList<String>();
		rasterelement2.add("Channel Quality Indicator");
		rasterelement2.add("UL Throughput");
		rasterelement2.add("DL Throughput");
		rasterelement2.add("Serving RSRP");
		rasterelement2.add("Serving RSRQ");
		rasterelement2.add("Serving RSRQ based on RSRP");
		rasterelement2.add("Serving DL RSSI");
		rasterelement2.add("Serving PCI");
		rasterelement2.add("Serving-Interference Delta RSRP");
		rasterelement2.add("Serving-Interference Delta RSRQ");
		rasterelement2.add("Serving-Interference Delta DL RSSI");

		System.out.println("Validation of the 1 layer option ");
		Reporter.log("Validation of the 1 layer option ");
		
		for(String rastervalue1:rasterelement1) {
			Thread.sleep(2000);
			ClickRasterType.click();
			Thread.sleep(2000);
			SelectRasterType.sendKeys(rastervalue1);
			Thread.sleep(2000);
			SelectRasterType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			FilterText.click();
			Thread.sleep(2000);

			List<WebElement> layerText = driver.findElements(By.xpath("//div[@class='layerSelectionMenu__layer-menu-item-title___1WE4a']"));
			int countoflayers = layerText.size();
			System.out.println("The total layer count is "+countoflayers);
			for (WebElement optiontext:layerText) {
				String optiontext1 = optiontext.getText();
				System.out.println("The available option is "+optiontext1);
				Reporter.log("The available option is "+optiontext1);
			}
		}

		System.out.println("Validation of the 2 layer option ");
		Reporter.log("Validation of the 2 layer option ");
		
		for(String rastervalue2:rasterelement2) {
			Thread.sleep(2000);
			ClickRasterType.click();
			Thread.sleep(2000);
			SelectRasterType.sendKeys(rastervalue2);
			Thread.sleep(2000);
			SelectRasterType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			FilterText.click();
			Thread.sleep(2000);

			List<WebElement> layerText1 = driver.findElements(By.xpath("//div[@class='layerSelectionMenu__layer-menu-item-title___1WE4a']"));
			int countoflayers = layerText1.size();
			System.out.println("The total layer count is "+countoflayers);
			for (WebElement optiontext1:layerText1) {
				String optiontext2 = optiontext1.getText();
				System.out.println("The available option is "+optiontext2);
				Reporter.log("The available option is "+optiontext2);
			}
		}
	}

	//Click on the Raster Eye Icon to validate it is not visible
	public String ValidationOfRasterEyeIconNotVisible() throws InterruptedException {
		RasterEyeIconVisible.click();
		Thread.sleep(1000);
		return RasterEyeIconNotVisible.getAttribute("class");
	}

	//Click on the Raster Eye Icon to validate it is visible	
	public String ValidationOfRasterEyeIconVisible() throws InterruptedException {
		RasterEyeIconNotVisible.click();
		Thread.sleep(1000);
		return RasterEyeIconVisible.getAttribute("class");
	}
	
	//Selecting any of the filter and aggregation type of raster type
		public void SelectTheRasterOption() throws InterruptedException {

			Thread.sleep(2000);
			ClickRasterType.click();
			Thread.sleep(2000);
			SelectRasterType.sendKeys("Channel Quality Indicator");
			Thread.sleep(2000);
			SelectRasterType.sendKeys(Keys.ENTER);
			Reporter.log("Raster Layer is selected");
						
			Thread.sleep(2000);
			ClickAggregationType.click();
			Thread.sleep(2000);
			SelectAggregationType.sendKeys("Average");
			Thread.sleep(2000);
			SelectAggregationType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Reporter.log("Aggregation Type is selected");
			
			AggregationTypeText.click();
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
			action.build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			ClickFilterCarrierType.click();
			Thread.sleep(2000);
			SelectFilterCarrierType.sendKeys("2");
			Thread.sleep(2000);
			SelectFilterCarrierType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Reporter.log("Carrier Type is selected");
			
			Thread.sleep(2000);
			ClickFilterQCIType.click();
			Thread.sleep(2000);
			SelectFilterQCIType.sendKeys("QCI");
			Thread.sleep(2000);
			SelectFilterQCIType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Reporter.log("QCI is selected");
			
			Thread.sleep(2000);
			ClickFilterMDTType.click();
			Thread.sleep(2000);
			SelectFilterMDTType.sendKeys("Yes");
			Thread.sleep(2000);
			SelectFilterMDTType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Reporter.log("MDT is selected");
			
			Thread.sleep(2000);
			ClickFilterIndoorType.click();
			Thread.sleep(2000);
			SelectFilterIndoorType.sendKeys("Undetermined");
			Thread.sleep(2000);
			SelectFilterIndoorType.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			Reporter.log("Indoor/Outdoor is selected");
			
			ApplyButton.click();
			Thread.sleep(2000);
			ValidateOnApplyButtonDeactivated();
			boolean ApplyDeactivated = ValidateOnApplyButtonDeactivated();
			Thread.sleep(1000);
			if(ApplyDeactivated==false) {
				System.out.println("Apply Button is disabled");
				Reporter.log("Apply Button is disabled");
			}
			else {
				System.out.println("Apply Button is enabled");
				Reporter.log("Apply Button is enabled");
				//Assert.fail("Apply Button is enabled");
			}
			
			
		}

	//Click on the Layer 2 Bin Icon
	public void ClickOnLayer2BinIcon() {
		Layer2BinIcon.click();
	}

	//Click on the LayersIcon
	public void ClickOnThePlusIcon() throws InterruptedException {
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(1000);
		PlusIcon.click();
	}

	//Validate on total number the Layers added from the dropdown
	public int ValidatingTheLayerCount() {

		List<WebElement> layerElements = driver.findElements(By.xpath("//input[@class='layerLabelInput__layerLabelInput___3yFXm']"));
		int layersize = layerElements.size();
		System.out.println("Number of layers present inside the layer listbox is : "+ layersize);
		return layersize;
	}

	//Validate on total number the Eye Icon visible
	public int ValidatingTheEyeIconCount() {

		List<WebElement> eyeElements = driver.findElements(By.xpath("//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye-solid___2Q-Y1']"));
		int eyeIconsize = eyeElements.size();
		System.out.println("Number of layers present inside the layer listbox is : "+ eyeIconsize);
		return eyeIconsize;
	}

	//Deleting the added layers
	public void DeletingTheAddedLayers() {

		List<WebElement> eyeElements = driver.findElements(By.xpath("//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-trashcan___2IV4K']"));
		int eyeIconsize = eyeElements.size();
		System.out.println("Total deleting elements are "+eyeIconsize);
		for(int i=5;i>0;i--) {
			WebElement deleteButton = driver.findElement(By.xpath("(//i[@class='eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-trashcan___2IV4K'])["+(i)+"]"));
			deleteButton.click();
			System.out.println("Clicked on the delete button"+(i));
		}

	}

	//----------TC-04------------//
	//----------Date Panel---------//

	//Clicking on the add new layer

	public void ClickOnNewLayer() throws InterruptedException {
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(1000);
		Layer2ArrowIcon.click();

	}

	//Selecting any raster type
	public void SelectTheRasterType() throws InterruptedException {

		Thread.sleep(2000);
		ClickRasterType.click();
		Thread.sleep(2000);
		SelectRasterType.sendKeys("Number of");
		Thread.sleep(2000);
		SelectRasterType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		FilterText.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
		action.build().perform();
		Thread.sleep(2000);
		ApplyButton.click();
	}

	//Selecting the start date	
	public void GetDatesFromCalendar(String Val) throws InterruptedException {
		
		CssClass=new ArrayList<String>();
		String bXpath="(//div[@class='react-datepicker__week'])[";
		String aXpath="]//div[";


		String DayVlue=null;
		String CName=null;
		for(int rowNum=1;rowNum<=5;rowNum++)
		{
			for(int ColNum=1;ColNum<=7;ColNum++)
			{

				CName=driver.findElement(By.xpath(bXpath+rowNum+aXpath+ColNum+"]")).getAttribute("class");
				if(!(CName.contains("disabled"))){
					CssClass.add(CName);
					DayVlue=driver.findElement(By.xpath(bXpath+rowNum+aXpath+ColNum+"]")).getText();
					Reporter.log("The available Date is:" +DayVlue);
					System.out.println("The available Date is:" +DayVlue);
				}

				//System.out.println("The ClassName is:" +CName);
			}
		}

		for(String value:CssClass){

			if(!Val.equals("ROPP"))
			{
				
				if(Val.equals("Selected")){
					if(value.contains("datepicker__day--selected"))
					{
						driver.findElement(By.xpath("//div[contains(@class,'datepicker__day--selected')]")).click();
					}
				}
				if(Val.equals("today"))
				{
					if(value.contains("datepicker__day--today"))
					{
						driver.findElement(By.xpath("//div[contains(@class,'datepicker__day--today')]")).click();
					}
				}
			}
		}
		
		if(Val.equals("ROPP"))
		{
			System.out.println("Inside Rop Selectttt");
			for(String value:CssClass){
				
				//System.out.println("The ClassName is:"+value);
				
				if(value.contains("datepicker__day"))
				{
					
					driver.findElement(By.xpath("//div[contains(@class,'datepicker__day--today')]//preceding-sibling::div")).click();
				}
				
				
			}
			
		}
	}	
	public void GetHours(String Hs) throws InterruptedException {
		HoursSelected=new ArrayList<String>();
		int HSSize=StartHours.size();
		/*System.out.println("Before  the Loop  " + HSSize);*/
		for(int i=HSSize;i>=1;i--)
		{

			/*System.out.println("Into the Loop  " + i);*/
			Thread.sleep(5000);
			String Hval= driver.findElement(By.xpath("(//ul[@class='react-datepicker__time-list']//li)["+i+"]")).getText();
			HoursSelected.add(driver.findElement(By.xpath("(//ul[@class='react-datepicker__time-list']//li)["+i+"]")).getAttribute("class"));
			/*System.out.println("Hour val is" + Hval);*/
			HoursSelected.add(Hval);

		}



		for (String Havailable : HoursSelected) {

			if(!Havailable.contains("disabled"))
			{
				System.out.println("The ClassName is:"+Havailable);
				if(Hs.equals("Rop"))
				{
					driver.findElement(By.xpath("(//ul[@class='react-datepicker__time-list']//li)[13]")).click();
					break;
				}
				if(Hs.equals("Normal"))
				{
					driver.findElement(By.xpath("(//ul[@class='react-datepicker__time-list']//li)[11]")).click();
					break;
				}
			}
		}
	}

	public String GetStartDate() throws InterruptedException {			
		Thread.sleep(2000);
		ClickStartDate.click();
		Thread.sleep(2000);
		GetDatesFromCalendar("ROPP");
		Thread.sleep(2000);
		GetHours("Normal");
		Thread.sleep(2000);
		RasterTitleText.click();
		Thread.sleep(2000);
		String StartDate =ClickStartDate.getAttribute("value");
		Reporter.log("Start Date is:" + StartDate);
		System.out.println("Start Date is:" + StartDate  );

		return StartDate;

	}

	//Method to Click on  ENDDate Calendar*/		
	public String GetEndDate() throws InterruptedException {

		Thread.sleep(2000);
		ClickEndDate.click();
		Thread.sleep(2000);
		GetDatesFromCalendar("today");
		Thread.sleep(2000);
		GetHours("Rop");
		RasterTitleText.click();
		String Endate=ClickEndDate.getAttribute("value");
		Reporter.log("EndTime is:" +Endate);
		System.out.println("EndTime is:" +Endate  );

		return Endate;
	}



	public void SelectEndDate() throws InterruptedException {
	}

	//Clicking on refresh button
	public void ClickOnRefreshButton() {
		RefreshButton.click();
	}

	//----------TC-05------------//
	//----------Legend---------//

	//Click on the Legend Icon
	public void ClickOnLegendIcon() throws InterruptedException {
		Thread.sleep(1000);
		LegendClick.click();
	}

	public String ValidateLegendText() {
		return LegendText.getText();

	}

	//----------TC-06------------//
	//----------Zoom Control---------//

	//Clicking on the zoom In button
	public void ClickOnZoomIn() throws InterruptedException {
		Thread.sleep(1000);
		ZoomInButton.click();

	}

	//Clicking on the zoom Out button
	public void ClickOnZoomOut() throws InterruptedException {
		Thread.sleep(1000);
		ZoomOutButton.click();

	}

	public void ClickOnInfoButton() throws InterruptedException {
		InfoButton.click();
		Thread.sleep(2000);
	}
	public String ValidateZoomValues() throws InterruptedException {
		Thread.sleep(2000);
		return ZoomValue.getText();

	}
}

