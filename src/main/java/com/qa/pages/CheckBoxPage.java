package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CheckBoxPage extends TestBase{
	
	public CheckBoxPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//form[@id='checkboxes']")
	WebElement checkBox;
	
	//public 

}
