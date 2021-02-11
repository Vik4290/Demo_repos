package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import demo.project.practice.Utilities;

public class TestListeners implements ITestListener   {

	@Override  
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.setProperty("org.uncommons.reportng.escape-output", "false");
		
	Reporter.log("Success of test cases and its details are : "+result.getName());	
		
		
	
		 
		String localpath;
		try {
			localpath = Utilities.captureScreenshot();
			

			Reporter.log("<br/>");
			
				Reporter.log("<a href="+localpath+ " target=\"_blank\"><b>Screenshot link</b></a>");
				Reporter.log("<br>");
				Reporter.log("<a href="+localpath+ " target=\"_blank\"><img height=400 width=400 src=" +localpath+"></a>");
		 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Reporter.log("<br/>");
		 Reporter.log("<br/>");
	
		 //Reporter.log("<br><img src='"+Utilities.captureScreenshot();+'" height='300' width='300'/><br>"); 
		
	

	 /* catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName()); 
	
	}
	
}
