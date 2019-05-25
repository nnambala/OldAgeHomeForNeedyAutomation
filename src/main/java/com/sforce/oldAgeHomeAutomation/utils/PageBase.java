package com.sforce.oldAgeHomeAutomation.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.log4j.Logger;

/**
 * @author Nalini
 * DATE :
 * Usauage:
 *
 */

public class PageBase {	

	protected WebDriver driver = null;
	protected Wait<WebDriver> wait = null;
	protected Wait<WebDriver> elementExistsWait = null;
	public static Properties CONFIG = null;

	// Default wait time
	protected static final int WAIT_TIME = 100;

	// Default poll interval
	protected static final int POLL_INTERVAL = 2;

	// Implicit wait time
	protected static final int IMPLICIT_WAIT_TIME = 10;
	// Wait time to check if an element exists
	protected static final int ELEMENT_EXISTS_WAIT_TIME = 10;

	// protected static final String VEIL_ID = "veil";
	protected static final String PRELOADER_ID = "loading_div";

	protected String env;

	//private static final Logger logger = LoggerFactory.getLogger(PageBase.class);

	public static Logger logger = Logger.getLogger(PageBase.class);
	
	static {

		if (CONFIG == null) {
			CONFIG = new Properties();
			try {
				FileInputStream	fs = new FileInputStream(UIConstants.UICONFIG_FILE_PATH);
				//logger.info("****Loading Config File...........***");
				try {
					CONFIG.load(fs);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	/**
	 * Constructor to initialize WebDriver and FluentWait objects using default wait
	 * time and poll interval. Also sets the implicit wait and initializes page
	 * elements using PageFactory.
	 * 
	 * @param driver
	 * @throws IOException
	 */

	public PageBase(WebDriver driver) {

		this.driver = driver;

		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);

		wait = new FluentWait<WebDriver>(driver).withTimeout(WAIT_TIME, TimeUnit.SECONDS)
				.pollingEvery(POLL_INTERVAL, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);

		elementExistsWait = new FluentWait<WebDriver>(driver).withTimeout(ELEMENT_EXISTS_WAIT_TIME, TimeUnit.SECONDS)
				.pollingEvery(POLL_INTERVAL, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);

		PageFactory.initElements(driver, this);
	}

	/**
	 * Constructor to initialize WebDriver and FluentWait objects using specified
	 * wait time and poll interval. Also sets the implicit wait and initializes page
	 * elements using PageFactory.
	 * 
	 * @param driver
	 */
	public PageBase(WebDriver driver, int waitTime, int pollInterval) {

		this.driver = driver;
		// env = System.getProperty("run.env");
		// System.out.println("env:" +env);
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

		wait = new FluentWait<WebDriver>(driver).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(pollInterval, TimeUnit.SECONDS).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);

		PageFactory.initElements(driver, this);
	}
	

	public String createImage(String fileName) {
		String newFilePath = "resources" + fileName;
		BufferedImage bi = null;
		File outputFile = new File(newFilePath);

		if (!outputFile.exists()) {
			try {
				bi = ImageIO.read(getClass().getResource(fileName));
				outputFile.mkdirs();
				ImageIO.write(bi, "JPEG", outputFile);
			} catch (IOException e) {
				//logger.error(e);
			} finally {
				if (bi != null) {
					bi.flush();
				}
			}
		}

		return newFilePath;
	}

	
public boolean elementExists(By locator) {
		
		boolean isUAEEncountered = false; 
		
	    try {
	    	elementExistsWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    } 
	    catch (UnhandledAlertException uae) {
	    	isUAEEncountered = true;
	    	handleUnhandledAlertException(uae);
		}
	    catch (Exception e) {
	    	logger.info("elementExists::Exception thrown::element does not exist");
	        return false;
	    }
	    
	    logger.info("Is UnhandledAlertException Encountered = " + isUAEEncountered);
	    if(isUAEEncountered) {
	    	elementExists(locator);
	    }
	    
	    logger.info("elementExists::Exception not thrown::element exists");
	    return true;
	}
	
	/**
	 * Read binary file from jar and create a physical file.
	 * 
	 * @param fileName
	 *            the name of the file preceded by "/".
	 * @return
	 */
	public File getBinaryFileFromJar(String fileName) {

		File targetFile = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			//logger.info("fileName = " + fileName);
			inputStream = getClass().getResourceAsStream(fileName);

			File outDir = new File("resources");
			outDir.mkdirs();
			targetFile = new File("resources" + fileName);
			targetFile.createNewFile();
			outputStream = new FileOutputStream(targetFile);

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
		} catch (FileNotFoundException e) {
			//logger.error(e);
		} catch (IOException e) {
			//logger.error(e);
		} finally {
			if (outputStream != null) {
				try {
					outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					//logger.error(e);
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					//logger.error(e);
				}
			}
		}
		return targetFile;
	}

	/**
	 * Waits for page to load by waiting for the veil element to disappear.
	 */
	public void waitForPageLoad(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	/**
	 * Waits for home page to load by waiting for the preloader element to
	 * disappear.
	 */
	public void waitForPreloaderToDisappear() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(PRELOADER_ID)));
	}

	/**
	 * Clicks on the page refresh button.
	 */
	public void pageRefresh() {
		driver.navigate().refresh();
		waitForPageLoad(2);
	}

	/**
	 * Common method to wait for presence of element located by specified locator.
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement waitForPresenceOfElemLocated(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * Common method to wait for visibility of specified element.
	 * 
	 * @param element
	 * @return
	 */
	public WebElement waitForVisibilityOfElem(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Common method to wait for visibility of element located by specified locator.
	 * 
	 * @param locator
	 * @return WebElement
	 */
	public WebElement waitForVisibilityOfElemLocated(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Common method to wait for invisibility of element located by specified
	 * locator.
	 * 
	 * @param locator
	 * @return boolean
	 */
	public boolean waitForInvisibilityOfElemLocated(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	/**
	 * Common method to wait for visibility of all elements specified.
	 * 
	 * @param elementList
	 * @return
	 */
	public List<WebElement> waitForVisibilityOfAllElem(List<WebElement> elementList) {
		return wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
	}


	/**
	 * Common method to wait for element located by specified locator to be enabled
	 * and clickable.
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement waitForElemToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Common method to find the relative element in a list of elements starting
	 * with parent element as root. <br/>
	 * <br/>
	 * Relative xpath should be of the format: <code>".//some/html/xpath"</code>
	 * e.g. <code>".//td[3]/div[1]/button/i"</code>.
	 * 
	 * @param parentElement
	 * @param relativeXpath
	 * @return WebElement
	 */
	public WebElement findRelativeElem(WebElement parentElement, String relativeXpath) {
		return waitForVisibilityOfElem(parentElement).findElement(By.xpath(relativeXpath));
	}

	/**
	 * Common method to check if an element is enabled.
	 * 
	 * @param element
	 * @return
	 */
	public boolean asw2	(WebElement element) {
		return waitForVisibilityOfElem(element).isEnabled();
	}

	public boolean isElementDisplayed(WebElement element) {
		return waitForVisibilityOfElem(element).isDisplayed();
	}

	/**
	 * Common method to clear a given text box and enter text in it.
	 * 
	 * @param element
	 * @param textToBeEntered
	 */
	public void enterInTextBox(WebElement element, String textToBeEntered) {
		waitForVisibilityOfElem(element).sendKeys(textToBeEntered);
	}

	public void clickOnTheElement(WebElement element) {
		waitForVisibilityOfElem(element).click();
	}

	/**
	 * Common method to select given visible text from the given drop down.
	 * 
	 * @param element
	 * @param visibleText
	 */
	public void selectByVisibleText(WebElement element, String visibleText) {
Select action = new Select(element);
		
		boolean result = false;
		int attempts = 0;
        while(attempts < 2) {
            try {
            	action.selectByVisibleText(visibleText);
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            	result =false;
            }
            attempts++;
        }
	}
	public void selectByDropdownIndex(WebElement element) {
		Select dropDown = new Select(waitForVisibilityOfElem(element));
		dropDown.selectByIndex(1);
	}
	
	/** selects the drop down values by value */
	public void selectDropDownByValue(WebElement element, String selectValue) {
		Select action = new Select(element);
		
		boolean result = false;
		int attempts = 0;
        while(attempts < 2) {
            try {
            	action.selectByValue(selectValue);
            	//action.selectByVisibleText(selectValue);
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            	result =false;
            }
            attempts++;
        }		
		}
	
	/** selects the drop down values by index */
	public void selectDropDownByIndex(WebElement element, int index) {

		Select action = new Select(element);
		action.selectByIndex(index);

	}

	/**
	 * Common method to get text
	 *
	 * @param element
	 * @return
	 */
	public String getTextValue(WebElement element) {
		String textReceived = waitForVisibilityOfElem(element).getText();
		//logger.info("Text Received : " + textReceived);
		return textReceived;
	}

	/**
	 * Clicks an invisible button like edit or delete buttons appearing on mouse
	 * hover.
	 * 
	 * @param buttonXpath
	 */
	public void clickInvisibleButton(String buttonXpath) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buttonXpath)));
		jsExecutor.executeScript("arguments[0].click();", button);
	}

	/**
	 * Clicks an invisible button like edit or delete buttons appearing on mouse
	 * hover.
	 * 
	 * @param button
	 *            the hidden button WebElement
	 */
	public void clickInvisibleButton(WebElement button) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", button);
	}


	private void handleUnhandledAlertException(UnhandledAlertException uae) {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert data: " + alertText);
			alert.dismiss();
		} catch (NoAlertPresentException nae) {
		}
	}

	

	public WebElement findElement(String xpathToBeReplaced, String replacableItem, String itemToReplace) {
		String replacedXpath = xpathToBeReplaced.replace(replacableItem, itemToReplace);
		return waitForVisibilityOfElemLocated(By.xpath(replacedXpath));
	}

	public List<WebElement> findElements(String xpathToBeReplaced, String replacableItem, String itemToReplace) {
		String replacedXpath = xpathToBeReplaced.replace(replacableItem, itemToReplace);
		return driver.findElements(By.xpath(replacedXpath));
	}

	
	/**
	 * Scroll the element into view.
	 * 
	 * @param locator
	 *            By
	 */
	public void scrollElementIntoView(By locator) {
		WebElement elementToScrollTo = waitForVisibilityOfElemLocated(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	}

	/**
	 * Scroll the element into view.
	 * 
	 * @param element
	 *            WebElement
	 */
	public void scrollElementIntoView(WebElement element) {
		WebElement elementToScrollTo = waitForVisibilityOfElem(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
		sleep(1000);
	}

	/**
	 * Scroll window right by x pixels and down by y pixels.
	 * 
	 * @param x
	 * @param y
	 */
	public void scrollBy(int x, int y) {
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(" + x + ", " + y + ");");
		sleep(1000);
	}
	public void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			
		}
	}

	/**
	 * Method to read ID value from the dashboard
	 * 
	 * @param infoBtnElem
	 * @param idValueElem
	 * @return
	 */
	public String getIdFromDashBoard(WebElement infoBtnElem, WebElement idValueElem) {
		waitForVisibilityOfElem(infoBtnElem).click();

		// Split Id value for example ID: 9ae00385984443088531d9c2c0c08b85
		String idVal = waitForVisibilityOfElem(idValueElem).getText();
		String[] idValue = idVal.split(": ");
		//logger.info("Id value is: " + idValue[1]);
		return idValue[1];
	}

	/**
	 * Moves the modal window up, down, left or right by (x,y) pixels.
	 * 
	 * @param windowDraggableHandleElem
	 * @param x
	 *            positive value to move right; negative to move left
	 * @param y
	 *            positive value to move down; negative to move up
	 */
	public void moveModalWindow(WebElement windowDraggableHandleElem, int x, int y) {

		Actions builder = new Actions(driver);
		builder.clickAndHold(windowDraggableHandleElem).moveByOffset(x, y).release(windowDraggableHandleElem);

		Action move = builder.build();
		move.perform();

		/
	}


	/**
	 * This method generates a random string which are required to generate
	 * unique name and email address
	 */
	public static String generateRandomString() {
		return RandomStringUtils.random(8, true, false);
	}
	
	public List<String> getDropdownValues(WebElement dropDownElem) {
		List<String> valuesList = new ArrayList<String>();
		sleep(5000);
	    Select se = new Select(dropDownElem);
	    for(int i=0 ;i<se.getOptions().size(); i++) {
	    	valuesList.add(se.getOptions().get(i).getAttribute("value"));
	    	logger.info(se.getOptions().get(i).getAttribute("value"));
	    	
	    }
	    
           return valuesList;
	}	
	
	
	
	/** Method to validate dropdown values */
	public boolean validateDropDownValues(List<String> actual, List<String> expected) {
		boolean result = false;
	
		Collections.sort(actual);
		Collections.sort(expected);
			result = actual.equals(expected);
			logger.info("result is: " +result);
		
		return result;
	}
	
	
	//Remove this method
	protected void openApplication(String URL) {

		driver.get(URL);
		
		waitForPageLoad(10000);
	driver.manage().window().maximize();

	}
	public void scrollVisibility(WebElement element) {
		Point pointObj = element.getLocation();
		int x = pointObj.getX();
		int y = pointObj.getY();
		logger.info("x value is: " + x);
		logger.info("y value is: " + y);
		scrollBy(x, y);
	}
	
	
}
