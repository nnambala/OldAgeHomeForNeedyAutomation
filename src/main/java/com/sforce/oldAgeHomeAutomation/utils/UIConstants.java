/**
 * Constants.java files contain the xpath\css selectors for the web elements
 * @author vdodda
 * Updated By Apushkarna
 *
 */

package com.sforce.oldAgeHomeAutomation.utils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UIConstants {

	public static int pageLoadWaitDuration = 60;

	/** NHWQA Link */
	public static final String dreamjobCentralLink = "New Hire Wizard";

	public static final String PAGE_ONE_HEADING = "First, the basics.";

	public static final String SUMMARY_MSG = "Congrats, please confirm new hire and submit!";

	// public static final String dreamjobCentralLink = "New Hire Wizard - Dev";

	/** DJC Frame and Result frame in lookup */
	// public static final String DJC_FRAME = "djc_iframe";
	// public static final String DJC_FRAME = "itarget";
	public static final String DJC_FRAME = "itarget";

	// public static final String DJC_FRAME = "djc_iframe";
	// public static final String DJC_FRAME2 = "vfFrameId";
	public static final String RESULTS_FRAME = "resultsFrame";
	// public static final String RESULTS_FRAME = "searchFrame";

	/** File paths of config and Test data */
	public static String UICONFIG_FILE_PATH = System.getProperty("user.dir")
			+ "//src//main//resources//uiconfig.properties";

	public static String DATA_FILE_PATH = System.getProperty("user.dir")
			+ "//src//test//resources//NHWPortal_TestCases.xlsx";

	/*
	 * public static String DATA_FILE_PATH = System.getProperty("user.dir") +
	 * "//src//test//resources//NHWPortal_TestCases2.xlsx";
	 */

	/** Calender month values */
	public static final HashMap<String, String> monthByvalue;
	static {
		monthByvalue = new HashMap<String, String>();
		monthByvalue.put("1", "0");
		monthByvalue.put("2", "1");
		monthByvalue.put("3", "2");
		monthByvalue.put("4", "3");
		monthByvalue.put("5", "4");
		monthByvalue.put("6", "5");
		monthByvalue.put("7", "6");
		monthByvalue.put("8", "7");
		monthByvalue.put("9", "8");
		monthByvalue.put("10", "9");
		monthByvalue.put("11", "10");
		monthByvalue.put("12", "11");
	}

	public static final HashMap<String, String> OWNER;
	static {
		OWNER = new HashMap<String, String>();

		OWNER.put("Adobe Creative Cloud", "Internal Support Category");
		// OWNER.put("BlackTab","CAS New Hire Queue");
		OWNER.put("Business Objects", "Data Warehouse Support");
		OWNER.put("Camtasia", "Techforce-NH Software Queue");
		OWNER.put("Centro Database", "NTechforce - East"); // NHW External Provisioning in QA so failing .
		OWNER.put("Coupa", "Procurement");

		OWNER.put("Demo Account", "Marketing Cloud Solutions Engineering");
		//OWNER.put("Demo Account", "Marketing Cloud Solutions Engineering");
	//  OWNER.put("ET App", "Techforce - Indianapolis (ET)");
		OWNER.put("EventForce", "Marketing Operations");
		OWNER.put("GoToMeeting", "Techforce-NH Software Queue");
		OWNER.put("GUS access", "CAS New Hire Queue");
		OWNER.put("HFM / Essbase", "Controller - IT Approval");

     // OWNER.put("Hoovers", "#Techforce");

	//	OWNER.put("Hyperion Essbase", "Techforce");
		OWNER.put("Impersonation Accounts", "Techforce - East"); // NHW External Provisioning in QA so failing .
																	
		OWNER.put("KeyNote (iWork)", "Techforce-NH Software Queue");
		OWNER.put("LiveOps Account", "Techforce-NH Software Queue");

	//	OWNER.put("Marketing cloud Apps (Buddy Media)", "BM Tech App");
	//	OWNER.put("Marketing cloud Apps (Radian6)", "R6 Admin Portal App");
	//	OWNER.put("Marketing cloud Apps (Social.com)", "BB Tech App");

		OWNER.put("Microsoft Access", "Techforce-NH Software Queue");
		OWNER.put("Microsoft Project", "Techforce-NH Software Queue");
		OWNER.put("Microsoft Visio", "Techforce-NH Software Queue");

		OWNER.put("MindManager", "Techforce-NH Software Queue");
		OWNER.put("OmniGraffle", "Techforce-NH Software Queue");

		OWNER.put("Oracle", "IT - Finance Systems");
		OWNER.put("Oracle - ET", "Techforce - East");
		OWNER.put("Org62", "CAS New Hire Queue");
		OWNER.put("Oxygen XML Editor", "Techforce-NH Software Queue");
	//	OWNER.put("P4 / Perforce", "GUS Integration API");
		OWNER.put("Perforce, Code Collab", "GUS Integration API");
	//	OWNER.put("Phone and Voicemail - Cisco", "#Techforce");
	//	OWNER.put("Code Collab", "GUS Integration API");
	//	OWNER.put("Phone and Voicemail - i3", "#Techforce");
		OWNER.put("Planning / Essbase", "F&S - Corporate");
		OWNER.put("PSE", "Services Ops");
	//	OWNER.put("PurchasingForce", "Marketing Operations");
	//	OWNER.put("Salesforce.com (ET) NA7", "Techforce - App Support");
	//	OWNER.put("Sandbox Blacktab", "CAS New Hire Queue");
	//OWNER.put("Serraview Apps", "Serraview Apps Queue");
		OWNER.put("SFM/CRD Open Access & git.soma.salesforce.com", "Techforce-NH Software Queue");
		OWNER.put("Supportforce", "CAS New Hire Queue");
		OWNER.put("UltraEdit", "Techforce - East");
		OWNER.put("Virtual Machine", "Techforce - East");
		//Newly Added software
		OWNER.put("Lucidchart", "Techforce - End User Software");
		OWNER.put("SmartSheet", "Techforce - End User Software");
		OWNER.put("Intellij IDEA Ultimate", "Techforce - End User Software");
		OWNER.put("SoapUI NG Pro", "Techforce - End User Software");
		OWNER.put("Docusign", "Techforce - End User Software");
		OWNER.put("Grammarly", "Techforce - End User Software");
		OWNER.put("Dragon Naturally Speaking - Mac - For Accessibility use only", "Techforce - End User Software");
		OWNER.put("Dragon Naturally Speaking - Windows - For Accessibility use only", "Techforce - End User Software");

		//OWNER.put("AGIS", "#Techforce");
	//	OWNER.put("Hardware Request", "New Hire Queue");// Hyperion

	}

	public static final HashMap<String, String> Iscs;
	static {
		Iscs = new HashMap<String, String>();

		Iscs.put("Adobe Creative Cloud", "IT Helpdesk: Software Request: ExactTarget");

		Iscs.put("BlackTab", "Internal Salesforce.com App New Hire Access Request");
		Iscs.put("Business Objects", "Data Warehouse: Data Warehouse Support: Data Warehouse Access Request");
		Iscs.put("Camtasia", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Centro Database", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");
		Iscs.put("Coupa", "Coupa: New User Access");
		Iscs.put("Demo Account", "Marketing Cloud Demo Accounts - User Access");
		Iscs.put("Demo Account", "Marketing Cloud Demo Accounts - User Access");
		Iscs.put("ET App", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");

		Iscs.put("EventForce", "Marketing Operations: Access to EventForce custom app in 62 Org");
		Iscs.put("GoToMeeting", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("GUS access", "Internal Salesforce.com App New Hire Access Request");
		Iscs.put("HFM / Essbase", "IT - Finance Systems: Hyperion: HFM - New User Access/Security");

		Iscs.put("Hoovers", "Internal Salesforce.com App: Hoovers Account/Question");

		Iscs.put("Hyperion Essbase", "IT - Finance Systems: Hyperion: Planning/Essbase - New User Access/Security");
		Iscs.put("Impersonation Accounts", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");
		Iscs.put("KeyNote (iWork)", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("LiveOps Account", "IT Helpdesk - Software Request - New Hire Software Request");

		Iscs.put("Marketing cloud Apps (Buddy Media)",
				"Marketing Cloud: New / Change Access: Buddy Media Environment Access");
		Iscs.put("Marketing cloud Apps (Radian6)", "Marketing Cloud: New / Change Access: Radian6 Admin Portal");
		Iscs.put("Marketing cloud Apps (Social.com)",
				"Marketing Cloud: New / Change Access: Social.com Environment Access");

		Iscs.put("Microsoft Access", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Microsoft Project", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Microsoft Visio", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("MindManager", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("OmniGraffle", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Oracle", "IT - Finance Systems: Oracle Apps: Access/changes/Issues");
		Iscs.put("Oracle - ET", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");

		Iscs.put("Org62", "Internal Salesforce.com App New Hire Access Request");
		Iscs.put("Oxygen XML Editor", "IT Helpdesk - Software Request - New Hire Software Request");

		Iscs.put("P4 / Perforce", "Internal GUS.com App: User Access/Profile/Perm Sets/BlackTab");
		Iscs.put("Perforce, Code Collab", "Internal GUS.com App: User Access/Profile/Perm Sets/BlackTab");

		Iscs.put("Phone and Voicemail - Cisco", "IT Helpdesk: Phone: Extension Mobility");
		Iscs.put("Code Collab", "Internal GUS.com App: User Access/Profile/Perm Sets/BlackTab");
		Iscs.put("Phone and Voicemail - i3", "IT Helpdesk: Phone: Extension Mobility");
		Iscs.put("Planning / Essbase", "IT - Finance Systems: Hyperion: HFM - New User Access/Security");
		Iscs.put("PSE", "MC Services Operations: OpenAir Other / General Application Support");
		Iscs.put("PurchasingForce", "Marketing Operations: Access to PRForce, PurchasingForce, Dreamforce Org");
		Iscs.put("Salesforce.com (ET) NA7", "Internal ET App New Hire Access Request");
		Iscs.put("Sandbox Blacktab", "Internal Salesforce.com App New Hire Access Request");
		Iscs.put("Serraview Apps", "Facilities: Serraview Apps User Setup/Configuration");
		Iscs.put("SFM/CRD Open Access & git.soma.salesforce.com",
				"IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Supportforce", "Internal Salesforce.com App New Hire Access Request");
		Iscs.put("UltraEdit", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");
		Iscs.put("Virtual Machine", "IT Helpdesk - ExactTarget - New Hire Provisioning Request");

		Iscs.put("AGIS", "Internal Salesforce.com App: New User/User Maintenance");
		Iscs.put("Hardware Request", "IT Helpdesk: Hardware: New Hire Equipment Request");
		
		Iscs.put("Lucidchart", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("SmartSheet", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Intellij IDEA Ultimate", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("SoapUI NG Pro", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Docusign", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Grammarly", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Dragon Naturally Speaking - Mac - For Accessibility use only", "IT Helpdesk - Software Request - New Hire Software Request");
		Iscs.put("Dragon Naturally Speaking - Windows - For Accessibility use only", "IT Helpdesk - Software Request - New Hire Software Request");
		
	}

	/** Options and Descriptions of New hire page saved in Hashmap */
	public static final HashMap<String, String> actualDesc;
	static {
		actualDesc = new HashMap<String, String>();
		actualDesc.put(UIConstants.hireNewEmployee, UIConstants.hireNewEmployeeDesc);
		actualDesc.put(UIConstants.hireNewContractor, UIConstants.hireNewContractorDesc);
		actualDesc.put(UIConstants.relocation, UIConstants.relocationDesc);
		actualDesc.put(UIConstants.returntoExistingProcess, UIConstants.returntoExistingProcessDesc);
	}

	/** New hire dropdown options and descriptions */
	// public static final String hireNewEmployee = "Hire New Employee";
	public static final String hireNewEmployee = "Start The Process";
	public static final String hireNewEmployeeDesc = "1. Hiring or Re-hiring an Employee (FTE, Intern, Foundation, Fixed Term)\n"
			+ "2. Converting a Contractor to an Employee";

	// public static final String hireNewContractor = "Hire New Contractor";
	public static final String hireNewContractor = "Add a New Contractor";
	public static final String hireNewContractorDesc = "1. Hiring or Re-hiring a Contractor (Agency Temp, Consulting Firm Employee, Independent Contractor)\n"
			+ "2. Converting an Employee to a Contractor";

	// public static final String relocation = "International Relocation";
	public static final String relocation = "Add a New Int Relocation";

	public static final String relocationDesc = "Relocating an Employee from one region to another";

	public static final String returntoExistingProcess = "Return to Exisiting Process";
	public static final String returntoExistingProcessDesc = "To resume an on-boarding request you have saved for later (Employee or Contractor).";

	public static final String questionsText = "Questions? See the New Hire Wizard Reference Guide for more details on how to complete the New Hire Wizard";

	public static final String[] hiringAction = { "Hire New Employee", "Add a New Contractor",
			"International Relocation", "Return to Existing Process" };

	/** Contractor FLow Constants */
	public static final String contractorAction = "contractor";

	public static final String phoneYesVal = "By choosing \"Yes\", you validate that there is a business need for the phone, and you are confirming that you understand your cost center may be charged at a future date for equipment and services. As a result of selecting yes, your new hire will receive an email notification providing instructions on how to complete their Mobile Phone Request. Once your employee makes a device selection, agrees to the terms of use and your Approval is captured, device delivery will take 7-14 days depending on the device selections and options your employee selects.";

	public static final String brazilBusinessSite = "Brazil - Sao Paulo";

	public static final String BUSINESS_UNIT = "1605-MC Messaging";
	public static final String ROLE_FINANCE = "Finance/Accounting";
	public static final String ORG_MARKETING_CLOUD = "Marketing Cloud";

	public static final String phoneYesoption = "Yes";

	public static final String Non16BU[] = { "1605-Email", "1606-Mobile", "1607-Web", "1608-Other", "1609-General",
			"1613-Social", "1614-Marketing Automation", "1615-M&A Transfers", "1616-Data & Integration" };

	public static final String[] BusinessObjectValues = { "Account Analytics or Sales Strategy (Mini-Smart)",
			"Coveo Deflection", "Coveo Searches Clicks", "Customer Usage", "EWS", "Marketing Analytics", "Orders",
			"PJV/Expense", "Product Metrics", "Renewals", "Revenue", "Sales Analytics (SMART)", "Sales Compensation",
			"SMART-Finance", "SMART-Sales Development", "Subscriber Analytics (ASAP - FLASH REPORT)",
			"Support Analytics", "WorkForce Analytics" };

	public static final String[] roleValuesForSalesSupport = { "--None--", "Alliances & Channels", "Market Readiness",
			"Sales Strategy", "Other" };

	public static final List<String> ROLE_VALUE_FOR_OTHERS_EMPLOYEE = new ArrayList<String>(Arrays.asList("Employee"));

	public static final String[] resourceTypesForRelocation = { "SFDC Employee" };

	public static final String[] hirereasonForRelocation = { "Is Relocation" };

	public static final String[] defaultOrganizationValues = { "--None--", "CSG", "Sales", "Sales Support", "T&P",
			"Other" };

	public static final List<String> DESKTOP_VALUES = new ArrayList<String>(
			Arrays.asList("Not Required", "Linux Desktop", "Windows Desktop", "Mac Desktop"));

	public static final List<String> TEAM_VALUES = new ArrayList<String>(
			Arrays.asList("", "Advanced", "Partner", "Platinum", "Premium", "Standard"));

	public static final List<String> CONTRACTOR_HIRE_REASON_VALUES = new ArrayList<String>(
			Arrays.asList("", "Badge-Only", "Standard"));

	public static final List<String> RESOURCE_TYPES = new ArrayList<String>(Arrays.asList("", "Agency Temp",
			"Consulting Firm Employee", "Independent Contractor", "Intern", "Secondment (Japan only)"));

	public static final List<String> PCC_VALUES = new ArrayList<String>(Arrays.asList("100-United States of America",
			"110-Canada", "120-Mexico", "128-Brazil", "130-West", "131-Northern CA", "132-Southwest", "133-Central",
			"134-TOLA", "135-Oil & Gas", "150-East", "151-New York-1", "152-New York-2", "153-New England", "154-NY 3",
			"155-Atlanta", "156-Mid-Atlantic", "157-HLS", "192-Caribbean", "193-RO - LACA", "198 - All LACA",
			"199-ALL - Americas", "300-Japan", "310-Tokyo", "311-Osaka", "312-Nagoya", "390-RO - Japan",
			"400-Switzerland", "401-Ireland_OLD", "403-Italy", "404-Belgium", "405-Luxembourg", "411-Netherlands",
			"412-Finland", "414-France", "415-Spain", "416-Germany", "417-Norway", "418-Hungary", "420-Greece",
			"421-Portugal", "422-Austria", "424-Czech Republic", "425-Poland", "426-Denmark, 427-Sweden",
			"428-United Kingdom", "429-Russia", "430-Turkey", "441-Ireland", "450-United Arab Emirates",
			"452-South Africa", "454-Israel", "462-Morocco", "490-RO - Middle East", "491-RO - Africa", "498-RO - EMEA",
			"499-ALL - EMEA", "600-Singapore", "602-Thailand", "604-Hong Kong", "605-Korea", "606-China", "609-Taiwan",
			"611-India", "612-Australia", "613-New Zealand", "690-RO - APAC", "699-ALL - APAC",
			"997-All - Global (INACTIVE)", "998-All Salesforce", "999-Unspecified Region", "None"));

	public static final List<String> SUB_REGION_VALUES = new ArrayList<String>(
			Arrays.asList("", "Australia", "Brazil", "California", "Canada", "Centers of Excellence", "Central",
					"France", "GAP", "Germany", "Global Services Operations", "GTM", "Japan", "Northeast", "Northwest",
					"Platinum Support", "Platinum Support AUS", "Platinum Support UK", "Predictive Intelligence",
					"Singapore", "Social Marketing Cloud", "Southeast", "Southwest", "Strategic Services - East",
					"Strategic Services - West", "UK Office"));

	public static final List<String> PSE_ROLE_VALUES = new ArrayList<String>(
			Arrays.asList("", "Account Director", "Analytics Consultant", "Campaign Manager", "Data Architect",
					"Data Specialist", "Deliverability Consultant", "Deployment Specialist", "Design Consultant",
					"Senior Design Consultant", "GSO Business Analyst", "GSO Operations Specialist",
					"GSO Partner Specialist", "GSO Practice Lead", "GSO Practice Manager", "Manager",
					"Marketing Analyst", "Marketing Consultant", "Senior Marketing Consultant",
					"Platinum Support Analyst", "Platinum Support Engineer", "Production Specialist", "Program Manager",
					"Project Manager", "Quality Assurance Specialist", "GTM Services Consultant", "Solution Architect",
					"Technical Producer", "Technical QA Specialist", "Technology Architect", "Technology Specialist"));

	public static final List<String> JOB_STATUS_VALUES = new ArrayList<String>(
			Arrays.asList("", "Full-Time", "Part-Time"));

	public static final List<String> DIVISION_VALUES = new ArrayList<String>(Arrays.asList("", "Americas - Canada",
			"Americas - Latin America", "Americas - USA", "APAC - All Countries", "EMEA - All Countries", "Japan"));

	public static final List<String> ORG_NON_MC_16_VALUES = new ArrayList<String>(
			Arrays.asList("", "CSG", "Sales", "Sales Support", "T&P", "Other"));

	public static final List<String> ORG_MC_16_VALUES = new ArrayList<String>(Arrays.asList("", "Marketing Cloud"));

	public static final List<String> SALES_SUPPORT_ROLE_VALUES = new ArrayList<String>(
			Arrays.asList("", "Alliances & Channels", "Market Readiness", "Sales Strategy", "Other"));

	public static final List<String> CSG_ROLE_VALUES = new ArrayList<String>(
			Arrays.asList("", "CSG - Account Partner", "CSG - CFL", "CSG - Services", "Marketing Cloud", "Other"));

	public static final List<String> OTHERS_ROLE_VALUES = new ArrayList<String>(Arrays.asList("Contractor"));
	public static final List<String> OTHERS_ROLE_VALUES_relocation = new ArrayList<String>(Arrays.asList("Employee"));

	public static final List<String> TP_ROLE_VALUES = new ArrayList<String>(Arrays.asList("", "Products - Other",
			"Products - Product Manager", "Products - Program Manager", "Products - UX", "T&P - Hyderabad",
			"Technology - Developer Core", "Technology - Developer Non-Core", "Technology - Other"));

	public static final List<String> SALES_ROLE_VALUES = new ArrayList<String>(Arrays.asList("", "AE - EBU",
			"AE - EBU - Co-Prime", "AE - ESMB", "AE - ESMB - Co-Prime", "AE - MM/GB", "AE - MM/GB - Co-Prime",
			"Sales Dev - BDR", "Sales Dev - BDR Mgmt", "Sales Dev - CIT", "Sales Dev - SDR", "Sales Dev - SDR Mgmt",
			"Sales Leader", "Solution Engineer - B2C", "Solution Engineer - CBU", "Solution Engineer - EBU", "Solution Engineer - Other"));

	public static final List<String> MC_ROLE_VALUES = new ArrayList<String>(
			Arrays.asList("", "Finance/Accounting", "Sales", "Services", "Support", "T&P", "Other"));

	public static final List<String> ET_DEPARTMENT_VALUES = new ArrayList<String>(Arrays.asList("",
			"1531 - SFDC - Strategic Projects Delivery", "1550 - SFDC-ENTR-Named Acct Sales Engineer",
			"1551 - SFDC-ENTR Account Executive Management-2nd Line & Above",
			"1552 - SFDC-ENTR Account Executive Management-1st Line", "1554 - SFDC-ENTR Named Account Executive",
			"1555 - SFDC-Sales Dev-SR", "1556 - SFDC-Sales Dev Management-1st Line",
			"1557 - SFDC -Alliances Go-to-Market", "1558 - SFDC-Enterprise SEM",
			"1559 - SFDC-Customer Engagement Specialist Commercial/SMB", "1560 - SFDC-Corporate Marketing",
			"1565 - SFDC-CSM", "1566 - SFDC-CMRL - Mid-Market AE", "1567 - SFDC-CMRL-Named/GEO AE",
			"1568 - SFDC-SMB-Small and Medium Size Business AE", "1569 - SFDC-SMB-Emerging and Small Business AE",
			"1571 - SFDC-ENTR-SE MGMT-1st Line", "1572 - SFDC CMRL SE", "1573 - SFDC - Exec Admins - ENTR",
			"1574 - SFDC - Sales Dev - MM-BDR", "1575 - SFDC - CMRL AE Mgmt 2nd Line & Above",
			"3100 - Services Operations", "3400 - Client Success Center", "4400 - Site Monitoring",
			"5100 - Sales Admin", "6400 - Branding", "8100 - G&A Admin", "8200 - Legal - Other G&A",
			"8400 - Accounting", "8500 - Finance", "8600 - Office/HR"));

	public static final List<String> PRACTICE_COMMUNITY_VALUES = new ArrayList<String>(
			Arrays.asList("", "Centers of Excellence (COEs)", "Delivery Management Practice (DMP)",
					"Global Services Operations (GSO)", "Implementation Partner", "Mobile", "Platinum Support",
					"Predictive Intelligence (PI)", "Services Consulting (GTM)", "Social Marketing Cloud (SMC)",
					"Strategic Solutions", "Technology and Production Solutions"));

	public static final String[] EmployeeNeedsPhone = { "--None--", "No", "Yes"

	};

	public static final String employeeNeedsPhoneText = "By choosing " + "\"Yes\""
			+ ", you validate that there is a business need for the phone, and you are confirming that you understand your cost center may be charged at a future date for equipment and services. As a result of selecting yes, your new hire will receive an email notification providing instructions on how to complete their Mobile Phone Request. Once your employee makes a device selection, agrees to the terms of use and your Approval is captured, device delivery will take 7-14 days depending on the device selections and options your employee selects.";

	public static final String[] costCenterValuesForMC = { "1002", "2030", "3000", "4000", "4002", "4004", "4005",
			"4006", "4007", "4010", "4012", "4013", "4015", "4016", "4018", "4019", "4021", "4023", "4024", "4025",
			"4026", "4027", "4028", "4029", "4040", "5000", "5208", "5224", "5450", "5500", "5555", "6005", "6312",
			"6409"

	};

	public static final String[] costCenterValuesForSalesforce = { "FOUN - Foundation", "1002-Tech Ops",
			"1006-Tech Ops", "3090-Program Architects", "3020-Strategic Customers Delivery *", "3021-", "3050-",
			"3111-Strategic Projects Delivery *", "3113-", "4000-Developers", "4001-Development - Budget",
			"4002-Products & Technology Executive", "4003-Customer Centric Engineering", "4004-Technology Executive",
			"4005-Core Infrastructure Developers", "4006-Applications Developers", "4007-Development Executive",
			"4008-Core Infrastructure Management", "4009-Mobile Developers", "4009-R&D Management",
			"4010-Applications Management", "4011-QPA Executiv", "4011-Technology COO Management", "4012-QA",
			"4013-QA Management", "4013-Technology Communications", "4014-Planning & Ops",
			"4015-Performance Engineering", "4016-Engineering Services", "4017-QA Applications",
			"4018-Technical Documentation", "4019-User Experience", "4020-TPM Technology", "4021-Release Management",
			"4021-TPM Customer", "4022-Central People", "4022-TPM Products", "4023-Test Lab", "4024-R&D",
			"4025-Applications Developers", "4026-Development Labs", "4027-Acquisition User Experience",
			"4028-Acquisition TPM Customer", "4029-Acquisition App Management", "4030-Chatter Developers",
			"4031-QA Big Data", "4040-Automated Customer Engagement", "5119-", "5534-PubSec SE Mgmt", "5507-PubSec SE",
			"6005 - Product Management", "6401-Corporate Messaging", "7405 - IT Security Team", "7410-Trust Technology",
			"7411-Product Security", "7417 - IT - Finance", "7420-IT-Enterprise Apps & Integration",
			"7440-Detection & Response", "7441-Enterprise Security" };

	public static final String[] BuValues = { "1601", "1602", "1603", "1604", "1605", "1606", "1607", "1608", "1609",
			"1614", "1613", "1615", "1616" };

	// (MC 1 is when combination of given CC ,BU match , MC2 is when combination
	// of cc bu doesn't match)
	public static final String[] ContractorLaptopValuesForMC1 = { "None", "15\" Dell Developer Laptop",
			"Dell PC Laptop", "Mac Pro 15\" (Retina)", "Macbook Air", "Not Required" };

	public static final String[] ContractorLaptopValuesForMC2 = { "--None--", "Dell PC Laptop", "Macbook Air",
			"Not Required" };

	public static final String[] ContractorLaptopValuesForSalesforce1 = { "--None--", "15\" Dell Developer Laptop",
			"Dell PC Laptop", "Mac Pro 15\" (Retina)", "Macbook Air" };

	public static final String[] ContractorLaptopValuesForSalesforce2 = { "--None--", "Dell PC Laptop", "Macbook Air" };

	public static final String[] ContractorLaptopValuesForBrazilAndMC = { "--None--", "Macbook Pro 13\"",
			"Dell PC Laptop", "Not Required" };

	public static final String[] ContractorLaptopValuesForBrazilAndSalesforce = { "--None--", "Dell PC Laptop",
			"Macbook Pro 13\"" };

	// MC1 is when CC and BU combination matches with sheet (Dev options)
	// MC2 is when BU /CC combo doesn't match (non dev options )
	public static final String[] EmployeeLaptopValuesForMC1 = { "None", "15\" Dell Developer Laptop", "Dell PC Laptop",
			"Mac Pro 15\" (Retina)", "Macbook Air" };// removed "15\" Dell
														// Developer Laptop",

	public static final List<String> EMPLOYEE_LAPTOP_VALUES_MC2 = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "Macbook Air"));// test done
	// public static final String[] EmployeeLaptopValuesForMC2={"--None--","Dell
	// PC Laptop","Macbook Air"};
	public static final List<String> LAPTOP_VALUES_MC2_CHROME = new ArrayList<String>(
			Arrays.asList("None", "Chromebook", "Dell PC Laptop", "Macbook Air"));
	public static final List<String> FTE_LAPTOP_VALUES_1001_1003 = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "Macbook Air"));
	public static final List<String> FTE_LAPTOP_VALUES_1001_1003_CHROME = new ArrayList<String>(
			Arrays.asList("None", "Chromebook", "Dell PC Laptop", "Macbook Air"));

	public static final String[] EmployeeLaptopValuesForSalesforce1 = { "--None--", "15\" Dell Developer Laptop",
			"Dell PC Laptop", "Mac Pro 15\" (Retina)", "Macbook Air" };

	public static final String[] EmployeeLaptopValuesForSalesforce2 = { "--None--", "Dell PC Laptop", "Macbook Air" }; // when
																														// CC/BU
																														// not
																														// matched
																														// .

	// public static final String[]
	// EmployeeLaptopValuesForBrazil={"--None--","Dell PC Laptop","Macbook Pro
	// 13\""};
	public static final List<String> EmployeeLaptopValuesForBrazil = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "HP Zbook (Linux)"));

	// public static final List<String> LAPTOP_VALUES_CC7150_BU2301 = new ArrayList<String>(
	// Arrays.asList("None", "Dell PC Laptop", "Macbook Air"));
	public static final List<String> LAPTOP_VALUES_CC7150_BU2301 = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop"));
	public static final List<String> LAPTOP_VALUES_CC7150_BU2301_RELOCATION = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop"));
	public static final List<String> FTE_LAPTOP_VALUES_BRAZIL = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "HP Zbook (Linux)"));

	// public static final String[] cLaptopValues={"None","Dell PC Laptop","15\"
	// Dell Developer Laptop","Macbook Air","Macbook Pro 13\"","Mac Pro 15\"
	// (Retina)"};
	public static final List<String> cLaptopValues = new ArrayList<String>(Arrays.asList("None", "Dell PC Laptop",
			"HP Zbook (Linux)", "HP Zbook (Windows)", "Mac Pro 15\" (Retina)", "Macbook Air", "Macbook Pro 13\""));
	public static final List<String> cLaptopValuesRelocation = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "HP Zbook (Linux)", "HP Zbook (Windows)", "Mac Pro 15\" (Retina)",
					"Macbook Air", "Macbook Pro 13\""));
	// Laptop values for bussiness site not with in US, Canada and UK
	public static final List<String> LAPTOP_Values_CHROMEBOOK = new ArrayList<String>(
			Arrays.asList("None", "Chromebook", "Dell PC Laptop", "HP Zbook (Linux)", "HP Zbook (Windows)",
					"Mac Pro 15\" (Retina)", "Macbook Air", "Macbook Pro 13\""));

	public static final List<String> FTE_LAPTOP_VALUES_CC4000_BU_NOTBRAZIL = new ArrayList<String>(
			Arrays.asList("None", "Dell PC Laptop", "HP Zbook (Linux)", "HP Zbook (Windows)", "Mac Pro 15\" (Retina)",
					"Macbook Air", "Macbook Pro 13\""));
	public static final List<String> FTE_LAPTOP_VALUES_CC4000_BU_NOTBRAZIL_CHROME = new ArrayList<String>(
			Arrays.asList("None", "Chromebook", "Dell PC Laptop", "HP Zbook (Linux)", "HP Zbook (Windows)",
					"Mac Pro 15\" (Retina)", "Macbook Air", "Macbook Pro 13\""));

	public static final String[] DesktopValues = { "--None--", "Windows Desktop", "Mac Desktop", "Linux Desktop" };
	// when MC employee chooses Mac as laptop software values are different
	// MC and laptop dell pc

	public static final String[] SoftwareValuesForMacMC = { "Camtasia", "GoToMeeting", "KeyNote (iWork)",
			"Microsoft Access", "Microsoft Project", "Microsoft Visio",
			// "Mind Map",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", "UltraEdit", // failing
																			// ultra
																			// edit
																			// is
																			// not
																			// present
																			// in
																			// qa
																			// 4
																			// for
																			// MacMC
			"Virtual Machine" }; // only one value is different when MAc is
									// selected as laptop .

	public static final String[] accessValuesForMacMarketingCloud = { "Camtasia", "EventForce", "GUS access",
			"GoToMeeting", "KeyNote (iWork)", "LiveOps Account", "Microsoft Access", "Microsoft Project",
			"Microsoft Visio", "MindManager", "OmniGraffle", "Oxygen XML Editor", "LiveOps Account",
			"SFM/CRD Open Access & git.soma.salesforce.com", "Salesforce.com (ET) NA7", "Supportforce",
			"Virtual Machine" };

	// Org MC laptop dell pc
	public static final String[] SoftwareValuesForNonMacMC = { "Camtasia", "GoToMeeting", "KeyNote (iWork)",
			"Microsoft Access", "Microsoft Project", "Microsoft Visio",
			// "Mind Map",
			"MindManager", "OmniGraffle", "Oxygen XML Editor" };
	// Salesforce Dell PC
	public static final String[] SoftwareValuesForSalesforce = { "Camtasia", "GoToMeeting", "KeyNote (iWork)",
			"Microsoft Access", "Microsoft Project", "Microsoft Visio",
			// "Mind Map",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", };

	public static final String[] SoftwareValuesForBrazilMacMC = { "Camtasia", "GoToMeeting", "KeyNote (iWork)",
			"Microsoft Access", "Microsoft Project", "Microsoft Visio",
			// "Mindmap",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", "UltraEdit",
			// "Virtual Machine" // verify with kevin it is present in QA
	};
	public static final String[] SoftwareValuesForBrazilNonMacMC = {
			// "Mindmap",
			"Camtasia", "GoToMeeting", "KeyNote (iWork)", "Microsoft Access", "Microsoft Project", "Microsoft Visio",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", "UltraEdit" };
	public static final String[] SoftwareValuesForBrazilMacSalesforce = {
			// "Mindmap",
			"Camtasia", "GoToMeeting", "KeyNote (iWork)", "Microsoft Access", "Microsoft Project", "Microsoft Visio",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", "UltraEdit", "Virtual Machine" };
	public static final String[] SoftwareValuesForBrazilNonMacSalesforce = {
			// "Mindmap",
			"Camtasia", "GoToMeeting", "KeyNote (iWork)", "Microsoft Access", "Microsoft Project", "Microsoft Visio",
			"MindManager", "OmniGraffle", "Oxygen XML Editor", "UltraEdit" };

	public static final String[] ForceComValuesForMC = { "EventForce", "GUS access", "LiveOps Account",
			"Salesforce.com (ET) NA7", "Supportforce" };
	// BlackTab",Sandbox Blacktab"

	public static final String[] ForceComValuesForSalesforce = { "EventForce", "GUS access", "LiveOps Account",
			"Supportforce" };
	// "BlackTab",,"Sandbox Blacktab

}
