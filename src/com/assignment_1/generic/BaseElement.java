package com.assignment_1.generic;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseElement
{
	
	public WebDriver driver = null;
	public WebDriverWait w = null;
	public Logger log = Logger.getLogger(BaseElement.class);
	
	public BaseElement(WebDriver driver)
	{
		this.driver = driver;					//initialising
	}

	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			log.info("Verify element visible : "+ele + " found");
		}
		catch (Exception e) 
		{
			log.error("Verify element visible : "+ele + " not found - "+e);
		}
	}
	
	
}
