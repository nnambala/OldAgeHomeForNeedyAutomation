/*****************************************************************************************
 * @author by Nalini Nambala
 ******************************************************************************************/
package com.sforce.oldAgeHomeAutomation.page;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NpspLandingPage extends NpspLoginPage{

    //Page Object
	@FindBy(how = How.XPATH, using = "//div[@title='reccuringDonations']")
    private static WebElement recurringDonationObjectElem;
	
	
	/*should write for all the web elements in that page. we can use id, name, css, xpath
	linkText, partialLinktext to identify the elements.*/
	
	/**
	 * Constructor
	 * @param driver
	 */
	public NpspLandingPage(WebDriver driver) {
		super(driver);
	
	}

	/**
	 * Method to click on the  object
	 * @return
	 */
	public RecurringDonationsPage clickRecurringDonationsTab() {	
		clickOnTheElement(recurringDonationObjectElem);	
		return new RecurringDonationsPage(driver);
	}
	
	/**
	 * Method to check if the banner message is displayed
	 * @return
	 */
	public boolean isBannerMessageDisplayed() {
		boolean isTextMsgDisplayed = false;
		isTextMsgDisplayed = bannerMessageElem.isDisplayed();
		
		return isTextMsgDisplayed;
	}
	
	
	/**
	 * Methd to click on the home button
	 */
	public void clickOnHomeButton() {
		clickOnTheElement(homeButtonElem);
	}
	
}