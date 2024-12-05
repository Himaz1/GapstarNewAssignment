package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class CheckBoxPage extends TestBase{
	
	@FindBy (xpath = "(//input[@type='checkbox'])[1]")
	WebElement checkBox;
	
	@FindBy (xpath = "//h3[contains(text(), 'Checkboxes')]")
	WebElement lbl_checkBoxHeading;
	
	
	public CheckBoxPage() throws IOException {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickCheckBox()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
	}
	
	public String getCheckBoxPageHeading()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_checkBoxHeading));
		return lbl_checkBoxHeading.getText();
	}

}
