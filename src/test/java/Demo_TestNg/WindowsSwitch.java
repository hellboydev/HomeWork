package Demo_TestNg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsSwitch
{
	public static void main(String[]args) throws InterruptedException
	{

	
	ChromeOptions options=new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("disable-infobars");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--disable-notifications");
    options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
    

    WebDriver driver=new ChromeDriver(options);
    driver.manage().window().maximize();
  //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
    String parentHandle=driver.getWindowHandle();
    System.out.println("parent window:"+parentHandle);
    
    
//    driver.findElement(By.cssSelector("button[id='newWindowBtn']")).click();
    driver.findElement(By.id("newWindowBtn")).click();
    Set<String>windowhandles=driver.getWindowHandles();//it will give parent value as well as other value in it.
    for (String windowhandle : windowhandles)
    {
		System.out.println(windowhandle);
		
		if(!windowhandle.equals(parentHandle))
		{
			driver.switchTo().window(windowhandle);
			driver.findElement(By.id("firstName")).sendKeys("Dev");
		//	driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Dev");
			Thread.sleep(5000);
			driver.close();
		}
		
	}
    driver.switchTo().window(parentHandle);
    driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Mhadev");
    Thread.sleep(2000);
}
}
