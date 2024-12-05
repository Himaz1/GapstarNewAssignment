package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CheckBoxPage;
import com.qa.pages.DropDownPage;
import com.qa.pages.HomePage;

public class DropDownPageTest extends TestBase{
	
	HomePage homePage;
	DropDownPage dropDownPage;

	public DropDownPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		initialization(browser);
		homePage = new HomePage();
		dropDownPage = new DropDownPage();
		
	}
	
	@Test
	public void verifyCheckBoxFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickDropDownLink();
		String heading = dropDownPage.getDropDownPageHeading();
		Assert.assertEquals(heading, "Dropdown List");
		dropDownPage.selectValuesDropDown();
	}
	
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}

}
