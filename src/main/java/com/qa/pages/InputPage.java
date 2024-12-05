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

public class InputPage extends TestBase{

	@FindBy (xpath="//input[@type='number']")
	WebElement tf_number;
	
	@FindBy (xpath = "//h3[contains(text(), 'Inputs')]")
	WebElement lbl_inputPageHeading;
	
	public InputPage() throws IOException {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterValuesForNumber()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(tf_number)).sendKeys("87");
    }
	
	public String getInputPageHeading()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_inputPageHeading));
		return lbl_inputPageHeading.getText();
	}

}
