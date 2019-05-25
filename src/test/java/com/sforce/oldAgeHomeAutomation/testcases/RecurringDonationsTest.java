
package com.sforce.oldAgeHomeAutomation.testcases;

public class RecurringDonationsTest extends TestBase {

	NpspLoginPage npspLoginPageObj = null;
	NpspLandingPage npspLandingPageObj = null;
	RecurringDonationsPage recurringDonationsPageObj = null;
	
	
	
	@Test(enabled = true, priority = 0, dataProvider = "getData", dataProviderClass = TestDataProvider.class)
	public void verifyCreateNewRecurringDonation(Hashtable<String, String> data) throws Exception {
		
		Xls_Reader xls = new Xls_Reader(UIConstants.DATA_FILE_PATH);
		if (ExcelReadWrite.isExecutable("donationsData", xls) && data.get("Runmode").equals("Y")) {
			logger.info("=========Test Case started=========");
			

			browserLaunch(PageBase.CONFIG.getProperty("PORTAL_URL"));
			npspLoginPageObj = new npspLoginPageObj(driver);
			npspLandingPageObj = npspLandingPageObj.npspLogin();
			newHireWizardHomePageObj = newHireLandingPageObj.clickRecurringDonationsTab();
			newHireWizardPageOneObj = newHireWizardHomePageObj.enterDetailsForNewRecurringDonation();

			
			// Assertions to check if the details in the summary details match with the pages
			Assert.assertTrue(actual, expected);
			Assert.assertEquals(actual, expected);

		} else {
			logger.info("No need to execute any thing.");
		}
		
		logger.info("=========Test Case started=========");
	}
	
	
	}