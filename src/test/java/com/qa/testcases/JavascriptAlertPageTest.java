package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.InputPage;
import com.qa.pages.JavascriptAlertPage;

public class JavascriptAlertPageTest extends TestBase{

	HomePage homePage;
	JavascriptAlertPage javascriptAlertPage;
	
	public JavascriptAlertPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		initialization(browser);
		homePage = new HomePage();
		javascriptAlertPage = new JavascriptAlertPage();
		
	}
	
	@Test
	public void verifyJSAlertFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickJavascriptAlertLink();
		javascriptAlertPage.clickJSAlert();
		String resultMessage = javascriptAlertPage.getYouSuccessfullyClickedAnAlertMessage();
		Assert.assertEquals(resultMessage, "You successfully clicked an alert");
	}
	
	@Test (priority = 1)
	public void verifyJSConfirmFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickJavascriptAlertLink();
		javascriptAlertPage.clickJSConfirm();
		String resultMessage = javascriptAlertPage.getYouClickedOkMessage();
		Assert.assertEquals(resultMessage, "You clicked: Ok");
	}
	
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}

}
