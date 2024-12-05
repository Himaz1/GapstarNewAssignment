package com.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HoverPage extends TestBase{

	@FindBy (xpath="(//img[@src='/img/avatar-blank.jpg'])[1]")
	WebElement img_FirstImage;
	
	@FindBy (xpath="//h5[contains(text(), 'name: user1')]")
	WebElement lbl_nameUser1;
	
	public HoverPage() throws IOException {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void mouseHoverFirstImage()
	{
		Actions action = new Actions(getDriver());
		action.moveToElement(img_FirstImage).build().perform();
	}
	
	public String getFirstImageUsername()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lbl_nameUser1));
		return lbl_nameUser1.getText();
	}

}
