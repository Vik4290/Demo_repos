package demo.project.practice;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Test_core;
import testcases.Class_Tc01;


public class Demo1 {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		Test_core.launch();
		
	}
	
	
	@Test
	public void launch()
	{
       Class_Tc01.class_Tc01();
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		Utilities.quit();
		
	}
	
	
}
