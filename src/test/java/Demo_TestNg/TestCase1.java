package Demo_TestNg;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.testng.ITestResult;

public class TestCase1 

{
	@BeforeSuite
	public void beforSuite() 
	{
		System.out.println("Before Suite Method");
	}
	@AfterSuite
    public void afterSuite()
    {
		System.out.println("After Suite Method");
	}
	
	
	
	
	@BeforeTest
	public void beforeTest() 
	{
		//beforeTest Annotation
	  System.out.println(" Before Test Method");	
	}
	
	@AfterTest
	public void afterTest() 
	{
		//afterTest Annotation
	  System.out.println(" After Test Method");	
	}
	
	
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Method...\n");
		System.out.println("Hello...\n");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Method...\n");
		System.out.println("Bie...\n");
	}
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		System.out.println("Before Method...\n");
		System.out.println("StartTest...\n"+method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		System.out.println("After Method...\n"  );
		System.out.println("EndTest...\n"+result.getMethod().getMethodName());
	} 
	
	
	
	
	
	@Test
   public void test1()
   {
	   System.out.println("this is test1");
   }
	@Test
	public void test2()
	{
		System.out.println("This is test2");
	}

}
