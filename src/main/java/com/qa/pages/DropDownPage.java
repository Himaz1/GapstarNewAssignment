package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class DropDownPage extends TestBase{

	@FindBy (xpath="//select[@id='dropdown']")
	WebElement dd_dropDown;
	
	@FindBy (xpath = "//h3[contains(text(), 'Dropdown List')]")
	WebElement lbl_dropDownPageHeading;
	
	
	public DropDownPage() throws IOException {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void selectValuesDropDown()
	{
		Select dd = new Select(dd_dropDown);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(dd_dropDown)).click();
        dd.selectByValue("1");
        dd.selectByValue("2");
        
	}
	
	public String getDropDownPageHeading()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_dropDownPageHeading));
		return lbl_dropDownPageHeading.getText();
	}
	

}
