package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.HoverPage;
import com.qa.pages.JavascriptAlertPage;

public class HoverPageTest extends TestBase{

	HomePage homePage;
	HoverPage hoverPage;
	
	public HoverPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		initialization(browser);
		homePage = new HomePage();
		hoverPage = new HoverPage();
		
	}
	
	@Test
	public void verifyMouseHoverFirstImageFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickHoverLink();
		hoverPage.mouseHoverFirstImage();
		String resultMessage = hoverPage.getFirstImageUsername();
		Assert.assertEquals(resultMessage, "name: user1");
		
	}
	
		
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}

}
