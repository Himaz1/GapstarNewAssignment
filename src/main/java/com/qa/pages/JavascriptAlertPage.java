package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class JavascriptAlertPage extends TestBase{

	@FindBy (xpath="//button[contains(text(), 'Click for JS Alert')]")
	WebElement btn_jsAlert;
	
	@FindBy (xpath="//p[@id='result' and contains(text(), 'You successfully clicked an alert')]")
	WebElement lbl_YouSuccessfullyClickedAnAlert;
	
	@FindBy (xpath="//button[contains(text(), 'Click for JS Confirm')]")
	WebElement btn_jsConfirm;
	
	@FindBy (xpath="//p[@id='result' and contains(text(), 'You clicked: Ok')]")
	WebElement lbl_YouClickedOk;
	
	@FindBy (xpath="//button[contains(text(), 'Click for JS Prompt')]")
	WebElement btn_jsPrompt;
	
		
	
	public JavascriptAlertPage() throws IOException {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickJSAlert()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(btn_jsAlert)).click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
	
	public String getYouSuccessfullyClickedAnAlertMessage()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_YouSuccessfullyClickedAnAlert));
		return lbl_YouSuccessfullyClickedAnAlert.getText();
	}
	
	public void clickJSConfirm()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(btn_jsConfirm)).click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
	
	public String getYouClickedOkMessage()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_YouClickedOk));
		return lbl_YouClickedOk.getText();
	}

}
