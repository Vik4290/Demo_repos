package testcases;

import com.aventstack.extentreports.Status;

import core.Test_core;
import demo.project.practice.Utilities;
import extentListeners.ExtentListeners;

public class Class_Tc01 extends Test_core {

	

	public static void class_Tc01()
	{

		
		System.out.println("*****ELEMENT PRESENT******" +Utilities.IsElementPresent());
		
		Utilities.click("//input[@value='radio2']");
		System.out.println("Radio button checked");
		ExtentListeners.testReport.get().generateLog(Status.INFO, "Radio button checked");
		
	}

	
	
}
