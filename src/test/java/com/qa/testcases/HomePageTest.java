package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class HomePageTest extends TestBase{
	
	public HomePageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser)
	{
		initialization(browser);
		
	}
	
	@Test
	public void testPending()

	{
		
	}
	
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}
}
