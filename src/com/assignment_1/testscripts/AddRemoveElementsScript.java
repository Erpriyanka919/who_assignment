package com.assignment_1.testscripts;


import org.testng.Reporter;
import org.testng.annotations.Test;
import com.assignment_1.generic.BaseTest;
import com.assignment_1.pompages.AddRemovePage;


public class AddRemoveElementsScript extends BaseTest
{
	AddRemovePage addremovepage = null;
	
	@Test
	public void tc_01_add_remove_elements()
	{
		addremovepage = new AddRemovePage(driver);
		
		try
		{
			addremovepage.clickOnAddButton();
			Reporter.log("Delete button is added");
			addremovepage.clickOnDeleteButton();
			addremovepage.verifyDeleteButtonRemoved();
			Reporter.log("Delete button is removed");
		}
		catch(Exception e)
		{
			
		}
	}

}


