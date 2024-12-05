package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CheckBoxPage;
import com.qa.pages.HomePage;

public class CheckBoxPageTest extends TestBase{
	HomePage homePage;
	CheckBoxPage checkBoxPage;
	
	public CheckBoxPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		initialization(browser);
		homePage = new HomePage();
		checkBoxPage = new CheckBoxPage();
		
	}
	
	@Test
	public void verifyCheckBoxFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickCheckBoxLink();
		String heading = checkBoxPage.getCheckBoxPageHeading();
		Assert.assertEquals(heading, "Checkboxes");
		checkBoxPage.clickCheckBox();
	}
	
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}

}
