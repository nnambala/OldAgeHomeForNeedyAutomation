/******************************************************************************************
 * @author by Nalini Nambala
 ******************************************************************************************/
package com.sforce.oldAgeHomeAutomation.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//import com.sforce.NHWAutomation.utils.UIConstants;
import com.sforce.newHireWizard2Automation.utils.PageBase;

public class NpspLoginPage extends PageBase{

	//Page objects
	@FindBy(how = How.NAME, using = "username")
    private static WebElement userNameElem;
	
	@FindBy(how = How.ID, using = "password")
    private static WebElement passWordElem;
	
	@FindBy(how = How.ID, using = "Login")
    private static WebElement logInElem;
	
	@FindBy(how = How.XPATH, using = "//*[@id='error']")
    private static WebElement errorElem;

	/**
	 * Constructor
	 * @param driver
	 * @throws IOException
	 */
	public  NpspLoginPage(WebDriver driver) {
		super(driver);	
	}

	
	/**
	 * Method to login to portal, username and password should be given based on which sandbox the user wants to login to.
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public NpspLandingPage npspLogin() {
		enterInTextBox(userNameElem, CONFIG.getProperty("PORTAL_USERNAME"));
		enterInTextBox(passWordElem, CONFIG.getProperty("PORTAL_PASSWORD").trim());
		clickOnTheElement(logInElem);
		
		return new NewHireLandingPage(driver);
		
	}
	

}
