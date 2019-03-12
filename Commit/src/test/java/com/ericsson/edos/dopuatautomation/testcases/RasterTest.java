package com.ericsson.edos.dopuatautomation.testcases;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ericsson.edos.dopuatautomation.base.TestBase;
import com.ericsson.edos.dopuatautomation.pages.EdosApplicationPage;
import com.ericsson.edos.dopuatautomation.pages.EdosRasterpage;
import com.ericsson.edos.dopuatautomation.pages.Edoslandingpage;
import com.ericsson.edos.dopuatautomation.pages.Edosloginpage;


public class RasterTest extends TestBase{


	Edoslandingpage landingpage;
	Edosloginpage loginpage;
	EdosApplicationPage applicationpage;
	EdosRasterpage rasterpage;



	public RasterTest() {
		super();

	}


	@BeforeTest(alwaysRun = true)
	public void setUp() throws InterruptedException
	{

		landingpage=new Edoslandingpage();
		loginpage= new Edosloginpage();
		applicationpage= new EdosApplicationPage();
		rasterpage = new EdosRasterpage();

	}

	@Test(priority=1)
	public void ValidtionofRasterPortal() throws InterruptedException {
		Thread.sleep(2000);
		String HomePageTitle = rasterpage.ValidateRasterHomePage();
		Reporter.log("The HomePage name is "+HomePageTitle);
		System.out.println("The HomePage name is "+HomePageTitle);
		Assert.assertEquals("GNP Rasters", HomePageTitle,"HomePage is matching");
		Reporter.log("Navigated to the correct Raster page");

		Thread.sleep(2000);
		String Pagename = rasterpage.ValidateRasterTitle();
		System.out.println("The Pagename name is "+Pagename);

		Thread.sleep(2000);
		String Layername = rasterpage.ValidateLayerPanelText();
		Reporter.log("The LayerPanel name is "+Layername);
		System.out.println("The LayerPanel name is "+Layername);
		Assert.assertEquals("Layers", Layername,"LayerPanel name is present");
		Reporter.log("Layer Panel is present in the Raster Page");

		Thread.sleep(2000);
		String Topologyname = rasterpage.ValidateTopologyText();
		Reporter.log("The default Layer name is "+Topologyname);
		System.out.println("The default layer name is "+Topologyname);
		Assert.assertEquals("Topology", Topologyname,"Topology name is present");
		Reporter.log("Topology Panel is present in the Raster Page");

		Thread.sleep(2000);
		String Startdate = rasterpage.ValidateStartDatePanelText();
		Reporter.log("The firt date panel name is "+Startdate);
		System.out.println("The firt date panel name is "+Startdate);
		Assert.assertEquals("Start", Startdate,"Start date pannel is present");
		Reporter.log("Start Date Panel is present in the Raster Page");

		Thread.sleep(2000);
		String Enddate = rasterpage.ValidateEndDatePanelText();
		Reporter.log("The last date panel name is "+Enddate);
		System.out.println("The last date panel name is "+Enddate);
		Assert.assertEquals("End", Enddate,"End date pannel is present");
		Reporter.log("End Date Panel is present in the Raster Page");

		Thread.sleep(2000);
		String SearchPanel = rasterpage.ValidateSearchPanelText();
		Reporter.log("The search panel is "+SearchPanel);
		System.out.println("The search panel is "+SearchPanel);
		Assert.assertEquals("Select topology element", SearchPanel,"Search pannel is present");
		Reporter.log("Search Panel is present in the Raster Page");

		Thread.sleep(2000);
		String DistanceTool = rasterpage.ValidateDistanceMeasurementText();
		Reporter.log("The measurement auxilary tool is "+DistanceTool);
		System.out.println("The measurement auxilary tool is "+DistanceTool);
		Assert.assertEquals("Show/Hide Ruler", DistanceTool,"Measurement Ruler is present");
		Reporter.log("Measurement Ruler is present in the Raster Page");

		Thread.sleep(2000);
		String LegendTool = rasterpage.ValidateRasterLegendText();
		Reporter.log("The Legend auxilary tool is "+LegendTool);
		System.out.println("The Legend auxilary tool is "+LegendTool);
		Assert.assertEquals("Show/Hide Legend", LegendTool,"Raster Legend is present");
		Reporter.log("Raster Legend is present in the Raster Page");

		Thread.sleep(2000);
		String ZoomInButton = rasterpage.ValidateZoomInButton();
		Reporter.log("The zooming button is "+ZoomInButton);
		System.out.println("The zooming button is "+ZoomInButton);
		Assert.assertEquals("Zoom In", ZoomInButton,"Zoom In Button is present");
		Reporter.log("Zoom In Button is present in the Raster Page");

		Thread.sleep(2000);
		String ZoomOutButton = rasterpage.ValidateZoomOutButton();
		Reporter.log("The zooming button is "+ZoomOutButton);
		System.out.println("The zooming button is "+ZoomOutButton);
		Assert.assertEquals("Zoom Out", ZoomOutButton,"Zoom Out Button is present");
		Reporter.log("Zoom Out Button is present in the Raster Page");
		Thread.sleep(2000);

		Thread.sleep(2000);
		String MapPanel = rasterpage.ValidateMapViewPanel();
		Reporter.log("The tag name for Map View Panel is "+MapPanel);
		System.out.println("The tag name for Map View Panel is "+MapPanel);
		Assert.assertEquals("canvas", MapPanel,"Map View Panel is present in the Raster Page");
		Reporter.log("Map View Panel is present in the Raster Page");

	}

	@Test(priority=2)
	public void ValidtionofTopologyLayer() throws InterruptedException {	 

		Thread.sleep(2000);
		rasterpage.ClickOnArrowButton();
		Thread.sleep(1000);
		Reporter.log("Clicked on the arrowicon to expand the Topology Layer");
		System.out.println("Clicked on the arrowicon to expand the Topology Layer");

		Thread.sleep(2000);
		String EyeDisable = rasterpage.ValidationOfEyeIconNotVisible();
		Thread.sleep(1000);
		if(EyeDisable.equalsIgnoreCase("eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye___TmGum")) {
			System.out.println("Eye Icon is disabled");
			Reporter.log("Eye Icon is disabled");
		}
		else {
			System.out.println("Eye Icon is still enabled");
			Reporter.log("Eye Icon is still enabled");
			Assert.fail("Eye Icon is still enabled");
		}

		Thread.sleep(2000);
		String EyeEnable = rasterpage.ValidationOfEyeIconVisible();
		Thread.sleep(1000);
		if(EyeDisable.equalsIgnoreCase("eButton__icon___1Gb-y styles__icon___3eFpL styles__icon-eye___TmGum")) {
			System.out.println("Eye Icon is Enabled");
			Reporter.log("Eye Icon is Enabled");
		}
		else {
			System.out.println("Eye ICon is still not enabled");
			Assert.fail("Eye Icon is still not enabled");
		}

		Thread.sleep(2000);
		int LayerType = rasterpage.ValidationOfLayerType();
		Thread.sleep(1000);
		Reporter.log("Total number of Topology Layer present is  "+LayerType);
		System.out.println("Total number of Topology Layer present is  "+LayerType);
		Thread.sleep(1000);
		if(LayerType==1) {
			System.out.println("Topology as a unique option to select is present in the Layer Type");
			Reporter.log("Topology as a unique option to select is present in the Layer Type");
		}
		else {
			System.out.println("Topology is not a unique option to select is present in the Layer Type");
			Reporter.log("Topology is not a unique option to select is present in the Layer Type");
			Assert.fail("Topology is not a unique option to select is present in the Layer Type");
		}

		Thread.sleep(2000);
		rasterpage.ValidateOnTopologyLayer();

		Thread.sleep(2000);
		boolean ApplyDeactivated = rasterpage.ValidateOnApplyButtonDeactivated();
		Thread.sleep(1000);
		if(ApplyDeactivated==true) {
			System.out.println("Apply Button is disabled");
			Reporter.log("Apply Button is disabled");
		}
		else {
			System.out.println("Apply Button is enabled");
			Reporter.log("Apply Button is enabled");
			Assert.fail("Apply Button is enabled");
		}


		Thread.sleep(2000);	  
		System.out.println("Size of the web element is "+rasterpage.getRowXCount());
		String str1[]=new String[rasterpage.getRowXCount()];
		String str2[]=new String[rasterpage.getRowYCount()];

		str1=rasterpage.RangeSlideValue();
		Thread.sleep(1000);
		str2=rasterpage.RangeSlidePointer();
		Thread.sleep(1000);

		for(int i=0;i<rasterpage.getRowXCount();i++) {
			if(!(str1[i]==str2[i])) {
				System.out.println("Slider is moved from "+str1[i]+" to "+str2[i]);
				Reporter.log("Slider is moved from "+str1[i]+" to "+str2[i]);
			}else {
				System.out.println("Slider is not moved");
				Reporter.log("Slider is not moved");
				Assert.fail("Slider is not moved");
			}
		}

		Thread.sleep(2000);
		rasterpage.ClickOnArrowButton();
		Thread.sleep(2000);
		System.out.println("Clicked on arrow icon and the layer is compacted");
		Reporter.log("Clicked on arrow icon and the layer is compacted");

		Thread.sleep(2000);
		boolean actualBasicText = rasterpage.ValidateBasicText();
		Thread.sleep(1000);
		if(actualBasicText==false) {
			System.out.println("Layer is compacted successfully");
			Reporter.log("Layer is compacted successfully");
		}
		else {
			System.out.println("Layer is not compacted");
			Reporter.log("Layer is not compacted");
			Assert.fail("Layer is not compacted");
		}
	}

	@Test(priority=3)
	public void ValidtionofAddingRasterLayer() throws InterruptedException {	

		Thread.sleep(2000);
		rasterpage.ClickPlusIcon();

		Thread.sleep(2000);
		String defaultLayer  = rasterpage.ValidateDefaultLayerName();
		Reporter.log("The defalut layer name is "+defaultLayer);
		System.out.println("The defalut layer name is "+defaultLayer);
		Assert.assertEquals("Layer 2", defaultLayer,"The default layer name Layer 2 is present in the Raster Page");
		Reporter.log("The default layer name Layer 2 is present in the Raster Page");

		Thread.sleep(2000);
		String changedLayer  = rasterpage.ChangeDefaultLayerName();
		Reporter.log("The new layer name is "+changedLayer);
		System.out.println("The new layer name is "+changedLayer);
		Assert.assertEquals("Test Layer", changedLayer,"The new layer name Test Layer is present in the Raster Page");
		Reporter.log("The new layer name Test Layer is present in the Raster Page");

		Thread.sleep(2000);
		rasterpage.ClickRasterLayerArrow();

		Thread.sleep(2000);
		int LayerType = rasterpage.ValidationOfRasterLayerType();
		Thread.sleep(1000);
		Reporter.log("Total number of Raster Layer Type present is  "+LayerType);
		System.out.println("Total number of Raster Layer Type present is  "+LayerType);
		Thread.sleep(1000);
		if(LayerType==1) {
			System.out.println("Raster as a unique option to select is present in the Layer Type");
			Reporter.log("Raster as a unique option to select is present in the Layer Type");
		}
		else {
			System.out.println("Raster is not a unique option to select is present in the Layer Type");
			Reporter.log("Raster is not a unique option to select is present in the Layer Type");
			Assert.fail("Raster is not a unique option to select is present in the Layer Type");
		}

		Thread.sleep(2000);
		boolean ApplyDeactivated = rasterpage.ValidateOnApplyButtonDeactivated();
		Thread.sleep(1000);
		if(ApplyDeactivated==true) {
			System.out.println("Apply Button is disabled");
			Reporter.log("Apply Button is disabled");
		}
		else {
			System.out.println("Apply Button is enabled");
			Reporter.log("Apply Button is enabled");
			Assert.fail("Apply Button is enabled");
		}

		Thread.sleep(2000);
		rasterpage.SelectingTheRasterType();
		Thread.sleep(2000);

		Thread.sleep(2000);
		rasterpage.ClickRasterLayerArrow();
		
		Thread.sleep(2000);
		rasterpage.ClickRasterLayerArrow();

		Thread.sleep(2000);	  
		System.out.println("Size of the web element is "+rasterpage.getRowXCount());
		String str1[]=new String[rasterpage.getRowXCount()];
		String str2[]=new String[rasterpage.getRowYCount()];

		str1=rasterpage.RangeSlideValue();
		Thread.sleep(1000);
		System.out.println(str1);
		str2=rasterpage.RangeSlidePointer();
		Thread.sleep(1000);
		System.out.println(str2);

		for(int i=0;i<rasterpage.getRowXCount();i++) {
			if(!(str1[i]==str2[i])) {
				System.out.println("Color Opacity Slider is moved from "+str1[i]+" to "+str2[i]);
				Reporter.log("Color Opacity Slider is moved from "+str1[i]+" to "+str2[i]);
			}else {
				System.out.println("Color Opacity Slider is not moved");
				Reporter.log("Color Opacity Slider is not moved");
				Assert.fail("Color Opacity Slider is not moved");
			}
		}

		Thread.sleep(2000);
		rasterpage.SelectTheRasterOption();
		

		Thread.sleep(2000);
		rasterpage.ClickOnLayer2BinIcon();
		Thread.sleep(2000);
		System.out.println("Clicked on Layer 2 bin icon and the layer is deleted");
		Reporter.log("Clicked on Layer 2 bin icon and the layer is deleted");

		Thread.sleep(2000);
		boolean actualBasicText = rasterpage.ValidateBasicText();
		Thread.sleep(1000);
		if(actualBasicText==false) {
			System.out.println("Layer 2 is deleted successfully");
			Reporter.log("Layer 2 is deleted successfully");
		}
		else {
			System.out.println("Layer 2 is not deleted");
			Reporter.log("Layer 2 is not deleted");
			Assert.fail("Layer 2 is not deleted");
		}

		Thread.sleep(2000);
		rasterpage.ClickOnThePlusIcon();
		int LayerCount = rasterpage.ValidatingTheLayerCount();
		Thread.sleep(1000);
		Reporter.log("Total number of Layer present is  "+LayerCount);
		System.out.println("Total number of Layer present is  "+LayerCount);
		Thread.sleep(1000);
		if(LayerCount==6) {
			System.out.println("5 layers along with the default Topology layer is persent in Layers");
			Reporter.log("5 layers along with the default Topology layer is persent in Layers");
		}
		else {
			System.out.println("Incorrect count of layers are added");
			Reporter.log("Incorrect count of layers are added");
			Assert.fail("Incorrect count of layers are added");
		}

		Thread.sleep(2000);
		int EyeIconCount = rasterpage.ValidatingTheEyeIconCount();
		Thread.sleep(1000);
		Reporter.log("Total number of Layer visible is  "+EyeIconCount);
		System.out.println("Total number of Layer visible is  "+EyeIconCount);
		if(EyeIconCount==4) {
			System.out.println("The maximum number of visible raster layers is 3 and default Topology layer");
			Reporter.log("The maximum number of visible raster layers is 3 and default Topology layer");
		}
		else {
			System.out.println("Incorrect icons re visible");
			Reporter.log("Incorrect icons re visible");
			Assert.fail("Incorrect icons re visible");
		}

		Thread.sleep(2000);
		rasterpage.DeletingTheAddedLayers();
		Reporter.log("All the Raster Layers are deleted successfully");
		
		
	}



	@Test(priority=4)
	public void ValidtionofDatePanel() throws InterruptedException {

		Thread.sleep(2000);
		rasterpage.ClickOnNewLayer();

		Thread.sleep(2000);
		rasterpage.SelectTheRasterType();
		System.out.println("Added a new Raster layer");
		Reporter.log("Added a new Raster layer");

		Thread.sleep(2000);
		String RasterStartTimeText = rasterpage.GetStartDate();
		System.out.println("Start date is "+RasterStartTimeText);

		Thread.sleep(2000);
		String RasterEndTimeText = rasterpage.GetEndDate();
		System.out.println("End date is "+RasterEndTimeText);

		Thread.sleep(2000);
		rasterpage.ClickOnRefreshButton();
		System.out.println("Clicked on the refresh button");
		Reporter.log("Clicked on the refresh button");

		Thread.sleep(2000);
		rasterpage.ClickOnLayer2BinIcon();
		System.out.println("Raster layer is deleted successfully");
		Reporter.log("Raster layer is deleted successfully");
		Thread.sleep(2000);
	}
	 
	@Test(priority=5)
	public void ValidationOfLegend() throws InterruptedException {

		Thread.sleep(2000);
		rasterpage.ClickOnNewLayer();

		Thread.sleep(2000);
		rasterpage.SelectTheRasterType();
		System.out.println("Added a new Raster layer");
		Reporter.log("Added a new Raster layer");

		Thread.sleep(2000);
		rasterpage.ClickOnLegendIcon();

		Thread.sleep(2000);
		String rasterLayertext = rasterpage.ValidateDefaultLayerName();
		String rasterLegendText = rasterpage.ValidateLegendText();
		if(rasterLayertext.equalsIgnoreCase(rasterLegendText)) {
			System.out.println("Raster layer is present in the Legend");
			Reporter.log("Raster layer is present in the Legend");
		}
		else {
			System.out.println("Raster layer is not present in the Legend");
			Reporter.log("Raster layer is not present in the Legend");
			Assert.fail("Raster layer is not present in the Legend");
		}

		Thread.sleep(2000);
		rasterpage.ClickOnLayer2BinIcon();
		Thread.sleep(2000);
	}

	@Test(priority=6)
	public void ValidationOfZoomControl() throws InterruptedException {

		Thread.sleep(2000);
		rasterpage.ClickOnNewLayer();

		Thread.sleep(2000);
		rasterpage.SelectTheRasterType();
		System.out.println("Added a new Raster layer");
		Reporter.log("Added a new Raster layer");

		Thread.sleep(2000);
		rasterpage.ClickOnInfoButton();
		Thread.sleep(2000);
		String defautZoomValue = rasterpage.ValidateZoomValues().trim();
		System.out.println("defautZoomValue : "+defautZoomValue);
		String[] defaultZoomvalues=new String[1];
		defaultZoomvalues[0] = defautZoomValue.split("\\|")[0];
		System.out.println("The default zoom value is "+defaultZoomvalues[0]);
		Thread.sleep(2000);
		rasterpage.ClickOnZoomIn();
		System.out.println("Zoom In button is clicked");
		Thread.sleep(2000);

		String zoomInValue = rasterpage.ValidateZoomValues().trim();
		System.out.println("zoomInValue : "+zoomInValue);
		String[] zoomInvalues= new String[1];
		zoomInvalues[0] = zoomInValue.split("\\|")[0];
		System.out.println("The new zoom value is "+zoomInvalues[0]);

		if(!(defaultZoomvalues[0].equalsIgnoreCase(zoomInvalues[0]))) {
			System.out.println("New zoom level is added");
			Reporter.log("New zoom level is added");
		}
		else {
			System.out.println("Zoom in button did not perform its action");
			Reporter.log("Zoom in button did not perform its action");
			Assert.fail("Zoom in button did not perform its action");
		}

		Thread.sleep(2000);
		rasterpage.ClickOnZoomOut();
		System.out.println("Zoom Out button is clicked");
		Thread.sleep(2000);
		String zoomOutValue = rasterpage.ValidateZoomValues().trim();
		System.out.println("zoomOutValue : "+zoomOutValue);
		String[] zoomOutvalues= new String[1];
		zoomOutvalues[0] = zoomOutValue.split("\\|")[0];
		System.out.println("The new zoom value is "+zoomOutvalues[0]);
		if(defaultZoomvalues[0].equalsIgnoreCase(zoomOutvalues[0])) {
			System.out.println("Zoom level is reduced");
			Reporter.log("Zoom level is reduced");
		}
		else {
			System.out.println("Zoom Out button did not perform its action");
			Reporter.log("Zoom Out button did not perform its action");
			Assert.fail("Zoom Out button did not perform its action");
			Thread.sleep(5000);
			driver.close();
		}
	}

}

