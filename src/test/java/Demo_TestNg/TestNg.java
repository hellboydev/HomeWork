package Demo_TestNg;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

public class TestNg {
	    
	
	     public static WebDriver driver;
	     @Test
	     public void hello() {

	         ChromeOptions options=new ChromeOptions();
	         options.addArguments("--remote-allow-origins=*");
	         options.addArguments("disable-infobars");
	         options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

	         WebDriver driver=new ChromeDriver(options);
	         driver.manage().window().maximize();


	         driver.get("https://ui.cogmento.com/");
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         WebElement email= driver.findElement(By.name("email"));
	         email.click();
	         email.sendKeys("devhellboy.619@gmail.com");
	        // Thread.sleep(5000);
	       /*  driver.manage().deleteAllCookies();
	         Cookie cookie=new Cookie("om","har har mahadev");

	         driver.manage().addCookie(cookie);

	         Cookie fetchedCookie = driver.manage().getCookieNamed("om");
	         System.out.println(fetchedCookie.getValue());
	         //  driver.manage().notify();
	 */
	         driver.quit();
	     }
	
	}

