/*****************************************************************************************

 * @author by Nalini Nambala
 ******************************************************************************************/
package com.sforce.oldAgeHomeAutomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.apache.log4j.Logger;


public class RecurringDonationsPage extends NpspLandingPage{
	
	/**
	 * Constructor
	 * @param driver
	 */
	public  RecurringDonationsPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(how = How.XPATH, using = "//div[@title='RecurringDonations']")
    private static WebElement recurringDonationsPageHeadingElem;
	
	@FindBy(how = How.XPATH, using = "//div[@title='New']")
    private static WebElement newElem;
	
	@FindBy(how = How.XPATH, using = "//table[@class='detailList tabs']/tbody/tr[@class='last']/td[1]/a")
    private static WebElement organizationElem;
	
	@FindBy(how = How.ID, using = "p1")
    private static WebElement contactElem;
	
	@FindBy(how = How.XPATH, using = "")
    private static WebElement reccuringDonationsNameElem;
	
	@FindBy(how = How.XPATH, using = "")
    private static WebElement amountElem;
	
	public static Logger logger = Logger.getLogger(NewHireWizardHomePage.class);
	
	/**
	 * Method to check if the page header is displayed
	 * @return
	 */
	public boolean isPageHeaderDisplayed() {
		boolean isPageHeadingDisplayed = false;
		isPageHeadingDisplayed = isElementDisplayed(recurringDonationsPageHeadingElem);
		
		return isPageHeadingDisplayed;
	}
	

	/**
	 * Method to enter details in the recurring details dialog box
	 */
	
	public void enterDetailsForNewRecurringDonation() {
		//In these kind of UI interaction methods we can use selenium api's like sendkeys, click.
		//Select clause to select data from a drop down
		// check if any element is present or displayed to perform any operation on it
		//Actions drag and drop etc
	}

}
	
	