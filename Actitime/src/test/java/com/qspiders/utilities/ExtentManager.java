package com.qspiders.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	public static ExtentReports report;
	
	public static ExtentReports getinstance()
	{
		if(report==null)
		{
			report = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\Result\\Extent_Report.html",true,DisplayOrder.OLDEST_FIRST);
			report.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Extentconfig\\ExtentConfig.xml"));
		}
		return report;
	}

}
