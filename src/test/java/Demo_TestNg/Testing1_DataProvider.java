package Demo_TestNg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DemoSdetAlertsEventHandling.DataReader1;
import DemoSdetAlertsEventHandling.HomePage1;
import DemoSdetAlertsEventHandling.LoginPage1;

public class Testing1_DataProvider
{
	
	//DataReader1 rd=new DataReader1();
	DataReader1 rd=new DataReader1();

	@Test (dataProvider="container")
	public void test(String username , String password) throws InterruptedException
	{
		LoginPage1 lp= new LoginPage1();
		HomePage1 hp=new HomePage1();

	
	lp.openURL("https://online.btes.co.in/login/index.php");
	
	Thread.sleep(5000);
	lp.Enterusername(username);
	lp.Enterpassword(password);
	hp=lp.Clicklogin();
	Thread.sleep(1000);
	
	System.out.println("Finish");
	
	}
	@DataProvider(name="container")
	public Object[] [] gettest() throws IOException
	{
		return rd.getdetails();
		
	}
}
