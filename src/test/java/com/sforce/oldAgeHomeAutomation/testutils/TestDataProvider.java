

import org.testng.annotations.DataProvider;

import com.sforce.newHireWizard2Automation.utils.UIConstants;

/**
 * Data provider class which stores all the data providers
 * @author nreddynambala
 *
 */
public class TestDataProvider {

	@DataProvider
	public static Object[][] getVerifyClone() {
		Xls_Reader xls = new Xls_Reader(UIConstants.DATA_FILE_PATH);
		return ExcelReadWrite.getData("filename", xls);
	}
	
	
	
	
}
