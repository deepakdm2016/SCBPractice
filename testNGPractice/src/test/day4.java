package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	
	@BeforeClass
	public void beforeClassExecution()
	{
		System.out.println("Hello, This is my test for before class execution in day4");
	}
	
	@AfterClass
	public void afterClassExecution()
	{
		System.out.println("Hello, This is my test for after class execution in day4");
	}
	
	@Test(groups="Smoke")
	public void webloginHomeLoan()
	{
		System.out.println("Hello, This is my webloginHomeLoan");
	}
	
	@Test(dependsOnMethods="loginAPIHomeLoan")
	public void MobileloginHomeLoan()
	{
		System.out.println("Hello, This is my MobileloginHomeLoan");
	}
	
	@Test
	public void loginAPIHomeLoan()
	{
		Assert.assertTrue(false);
		System.out.println("Hello, This is my loginAPIHomeLoan");
	}

	@Parameters({"empId","name"})
	@Test
	public void verifyParameterization(String empId, String name)
	{
		System.out.println("Parameterization value empId is "+empId+" and name is "+name);
		System.out.println("Hello, This is my second testNG program");
	}

}
