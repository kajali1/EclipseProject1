package namepackage1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestngAnnotations1 {

	
	@Test(groups= {"priority1"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"priority1"})
	public void test3()
	{
		
		System.out.println("test3");
	}
	
	@BeforeMethod
	public void beforeme()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterme()
	{
		System.out.println("Aftermethod");
	}
	@BeforeTest
	public void beforetes()
	{
		System.out.println("Beforetest");
	}
	@AfterTest
	public void aftertes()
	{
		System.out.println("AfterTest");
	}
	

}
