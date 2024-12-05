package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy (xpath = "//a[@href='/checkboxes']")
	WebElement lnk_checkBox;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckBoxLink()
	{
		lnk_checkBox.click();
	}

}
