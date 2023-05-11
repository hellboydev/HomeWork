package Demo_TestNg;
import org.testng.annotations.*;

public class TestCase3 
{
	
	@BeforeMethod
	public void methodtriologyBefore()
	{
		System.out.println("Print methodtriologyBefore");
	}
	@Test
	   public void test5()
	   {
		   System.out.println("this is test5");
	   }
		@Test
		public void test6()
		{
			System.out.println("This is test6");
		}
		@AfterMethod
		public void methodtriologyAfter()
		{
		   System.out.println("Print methodtriologyAfter");	
		}
}

