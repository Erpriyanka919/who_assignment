package com.assignment_1.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment_1.generic.BaseElement;


public class AddRemovePage extends BaseElement

{

  //Declarations
	@FindBy(xpath="//button[@onclick='addElement()']")
	private WebElement addButton;
	
	@FindBy(xpath="//button[@onclick='deleteElement()']")
	private WebElement removeButton;
	
  //Initialize
	public AddRemovePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
  //Utilization
	public void clickOnAddButton()
	{
		try
		{
			verifyElementPresent(addButton);
			addButton.click();
			log.info("clicked successfully on "+addButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+addButton+e);
		}
	}
	
	public void clickOnDeleteButton()
	{
		try
		{
			verifyElementPresent(removeButton);
			removeButton.click();
			log.info("Clicked successfully on "+removeButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+removeButton+e);
		}
	}
	
	public void verifyDeleteButtonRemoved()
	{
		try
		{
			verifyElementPresent(removeButton);
			log.info("Delete Button is Removed" +removeButton);
		}
		catch(Exception e)
		{
			log.error("clicked successfully is Not removed "+removeButton+e);
		}
	}
		
	}
	

