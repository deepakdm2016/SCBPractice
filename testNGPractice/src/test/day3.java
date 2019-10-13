package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	
	@Test(groups="Smoke")
	public void webloginCarLoan()
	{
		System.out.println("Hello, This is my webloginCarLoan");
	}
	
	
	@Test
	public void testBeforeMethod()
	{
		System.out.println("Hello, This is my Before method execution in day3");
	}
	
	@Test
	public void testAfterMethod()
	{
		System.out.println("Hello, This is my after method execution in day3");
	}
	
	@Test(enabled=true)
	public void MobileloginCarLoan()
	{
		System.out.println("Hello, This is my MobileloginCarLoan");
	}
	
	@Test(timeOut=5000)
	public void MobileloginCarLoan2()
	{
		System.out.println("Hello, This is my MobileloginCarLoan2");
	}
	
	
	@Test
	public void loginAPICarLoan()
	{
		System.out.println("Hello, This is my loginAPICarLoan");
	}

	
}
