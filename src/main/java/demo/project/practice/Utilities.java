package demo.project.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Test_core;

public class Utilities extends Test_core
{
	
	public static String screenshotName;
	public static String FilePath;
	
	public static String captureScreenshot() throws IOException
	{
		Date d = new Date();
		screenshotName = 	d.toString().replace(":","_").replace(" " ,"_");
		
		File srceenshot  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	 FilePath = "C:\\Users\\Vikram\\Vik_POM\\demo.project.practice\\test-output\\html\\Screenshots\\" +screenshotName+ ".jpg";
		
		//C:\Users\Vikram\Vik_POM\demo.project.practice\test-output\html
		
		System.out.println(FilePath);
		
		FileUtils.copyFile(srceenshot, new File(FilePath));
		return FilePath;
		
	}

	
	
	
	public static boolean IsElementPresent()
	{
		if(driver.findElement(By.xpath("//input[@value='radio2']")) != null)
		{
			System.out.println("Element is present");
			return true;
		}
		
		else
			{
			System.out.println("Element not present");
			return false;
			}
	}
	
	
	public static void click(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	    System.out.println("Item clicked");
		
	}
	
	
	
	public static void quit() 
	{
	driver.quit();
	}
}
