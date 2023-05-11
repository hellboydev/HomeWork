package demo_Selenium;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        options.addArguments("disable-infobars");
	        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

	        WebDriver driver=new ChromeDriver(options);
	        driver.manage().window().maximize();


	        driver.get("https://www.facebook.com");
	        driver.manage().deleteAllCookies();
	        Cookie cookie=new Cookie("om","har har mahadev");

	        driver.manage().addCookie(cookie);

	        Cookie fetchedCookie = driver.manage().getCookieNamed("om");
	        System.out.println(fetchedCookie.getValue());
	      //  driver.manage().notify();

	        driver.quit();
	}

}
