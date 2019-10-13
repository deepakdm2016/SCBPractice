package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test(groups="Smoke")
	public void firstTestMethodDay2()
	{
		System.out.println("Hello, This is my first testNG program from day2");
	}
	
	@Test
	public void secondTestMethodDay2()
	{
		System.out.println("Hello, This is my second testNG program from day 2");
	}

	@BeforeSuite
	@Test
	public void BeforeSuiteValidation()
	{
		System.out.println("Executing before suite of day2");
	}
	
	
	@AfterSuite
	@Test
	public void AfterSuiteValidation()
	{
		System.out.println("Executing after suite of day2");
	}
	

}
