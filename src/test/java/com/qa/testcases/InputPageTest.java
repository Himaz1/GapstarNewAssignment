package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.lib.ExcelDataConfig;
import com.qa.pages.DropDownPage;
import com.qa.pages.HomePage;
import com.qa.pages.InputPage;

public class InputPageTest extends TestBase{

	HomePage homePage;
	InputPage inputPage;
	
	public InputPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) throws IOException
	{
		initialization(browser);
		homePage = new HomePage();
		inputPage = new InputPage();
		
	}
	
	@Test
	public void verifyInputFunctionality() throws IOException
	{
		homePage = new HomePage();
		homePage.clickInputLink();
		String heading = inputPage.getInputPageHeading();
		Assert.assertEquals(heading, "Inputs");
		inputPage.enterValuesForNumber();
	}
	
	@DataProvider(name = "numDetails")
    public Object[][] passNumDetails() throws Exception {
        
        ExcelDataConfig config = new ExcelDataConfig("D:\\gapstar\\GapstarAssignment\\src\\main\\java\\com\\qa\\testdata\\testData.xlsx");
        int rows = config.getRowCount(0);
        Object[][] arrNumDetails = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
        	arrNumDetails[i][0] = config.getData(0, i, 0); 
        	arrNumDetails[i][1] = config.getData(0, i, 1); 
        }
        return arrNumDetails;
    }
	
	@AfterMethod
	public void quit()
	{
		getDriver().quit();
	}

}
