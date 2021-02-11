package testcases;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import demo.project.practice.Utilities;
import extentListeners.ExtentListeners;

public class Class_Tc02 {
	
	public static void class_Tc02() 
	{

		
		System.out.println("*****ELEMENT PRESENT******" +Utilities.IsElementPresent());
		
		Utilities.click("//button[@id='openwindow']");
		System.out.println("New window opened");
		ExtentListeners.testReport.get().generateLog(Status.INFO, "New window opened");
	
		
	}

}
