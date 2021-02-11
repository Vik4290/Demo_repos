package demo.project.practice;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Test_core;
import testcases.Class_Tc01;
import testcases.Class_Tc02;

public class TC_02 {


	
	@BeforeTest
	public void setup()
	{
		Test_core.launch();
		
	}
	
	
	@Test
	public void launch() 
	{
       Class_Tc02.class_Tc02();		
		
	}
	
	@AfterTest
	public void teardown()
	{
		Utilities.quit();
		
	}
	
	
}
