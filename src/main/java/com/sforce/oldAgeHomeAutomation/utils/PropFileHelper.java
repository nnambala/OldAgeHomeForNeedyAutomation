package com.sforce.oldAgeHomeAutomation.utils;

import java.util.Properties;
import org.testng.internal.PropertiesFile;


public class PropFileHelper {	
	// system properties file for various environments
	private static final String systemPropFileName = System.getProperty("user.dir")+"//src//main//resources//uiconfig.properties";
	private static Properties systemProp = null;
	
	
	public Properties getSystemProp() {
		String filename = systemPropFileName;
		if(systemProp==null)
			systemProp = getPropertiesFromFileName(filename);
		
		loadSystemProp(filename, systemProp);
		
		return systemProp;
	}

	private void loadSystemProp(String filename, Properties prop) {
		
		if(System.getProperties().isEmpty())
			System.load(filename);
		else {
			System.getProperties().putAll(prop);
		}
	}

	/**
	 * Get properties file util method
	 * @param filename		- String, properties file name
	 * @return file name string
	 */
	public Properties getPropertiesFromFileName(String filename) {
		
		Properties prop = null;
		
		try{
			PropertiesFile propFile = new PropertiesFile(filename);
			prop = propFile.getProperties();
		} catch (Exception e) {	
			//Log.writeLog("Unable to read properties file, name: " + filename,"error");
			System.exit(1);
		}
		
		return prop;
	}
	
	public String getPropertyValue(Properties prop, String propName, String nullValue) {
		String retVal = null;
	
		try{
			retVal = prop.getProperty(propName).trim();
		} catch (Exception e) {
			retVal = nullValue;
		}
		return retVal;
	}
	
 	/**
 	 * Method to get username from jenkins job or properties file
 	 * if ui.admin.name is blank then get username from command line 
 	 */
 	public String getUserName(Properties prop){
 		String username = null;
 		try{
 			if(prop.getProperty("ui.admin.name") == null){
 				username = 	System.getProperty("username");
 			//	Log.writeLog("username : " + username, "info");
 			}
 			else
 				username = getPropertyValue(prop,"ui.admin.name", null);
 		}
 		catch(Exception e)
 		{
	 		//Log.writeLog("Invalid username", "info");
	 		e.printStackTrace();
 		}
 		return username;
 	}
 	public String getSFUserName(Properties prop){
 		String username = null;
 		try{
 				username = getPropertyValue(prop,"SF_USERNAME", null);
 		}
 		catch(Exception e)
 		{
	 		e.printStackTrace();
 		}
 		return username;
 	}


 	/**
 	 * Method to get password from jenkins job or properties file
 	 * if ui.admin.password is blank then get password from command line 
 	 */
 	public String getPassword(Properties prop){
 		String password = null;
 		try{
 			if(prop.getProperty("ui.admin.passwd") == null)
 				password = System.getProperty("password");
 			else
 				password = getPropertyValue(prop,"ui.admin.passwd", null);
 				//password = 	PasswordManager.doDecryption(getPropertyValue(prop,"ui.admin.passwd", null));
 		}
 		catch(Exception e){
 			//Log.writeLog("Invalid password", "info");
 			e.printStackTrace();
 		}
 		return password;
 	}
 	
 	public String getSFPassword(Properties prop){
 		String password = null;
 		try{
 				password = getPropertyValue(prop,"SF_PASSWORD", null);
 				}
 		catch(Exception e){
 		e.printStackTrace();
 		}
 		return password;
 	}
}
