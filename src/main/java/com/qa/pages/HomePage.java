package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy (xpath = "//a[@href='/checkboxes']")
	WebElement lnk_checkBox;
	
	@FindBy (xpath = "//a[@href='/dropdown']")
	WebElement lnk_dropDown;
	
	@FindBy (xpath = "//a[@href='/inputs']")
	WebElement lnk_input;
	
	@FindBy (xpath = "//a[@href='/javascript_alerts']")
	WebElement lnk_javaScriptAlert;
	
	@FindBy (xpath = "//a[@href='/hovers']")
	WebElement lnk_hover;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public CheckBoxPage clickCheckBoxLink() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(lnk_checkBox)).click();
        
        return new CheckBoxPage();
	}
	
	public DropDownPage clickDropDownLink() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(lnk_dropDown)).click();
        
        return new DropDownPage();
	}
	
	public InputPage clickInputLink() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(lnk_input)).click();
        
        return new InputPage();
	}
	
	public JavascriptAlertPage clickJavascriptAlertLink() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(lnk_javaScriptAlert)).click();
        
        return new JavascriptAlertPage();
	}
	
	public HoverPage clickHoverLink() throws IOException
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(lnk_hover)).click();
        
        return new HoverPage();
	}

}
