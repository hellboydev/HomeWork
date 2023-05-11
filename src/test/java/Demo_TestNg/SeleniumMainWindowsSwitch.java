package Demo_TestNg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class SeleniumMainWindowsSwitch {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Windows.html");      
		
	    String mainWH=driver.getWindowHandle(); //yha par current window handle into a mainWH variable		
		//find button
		WebElement clickBtn=driver.findElement(By.xpath("//a/button[contains(text(),'click')]"));		
		clickBtn.click();	
		
		Set<String> windowHandles=driver.getWindowHandles();
		for (String windowH : windowHandles) {//iterate all window handles
			if(!windowH.matches(mainWH)) { //if not matches then set that window handle as current window handle
				driver.switchTo().window(windowH);//perform switch
			}
		}
		System.out.println("After Switch: "+driver.getTitle());
		driver.close();// close popup window
		driver.switchTo().window(mainWH);//change foucus to main window again and continue further.
		
		System.out.println("MAIN WINDOW Title After Switch To original: "+driver.getTitle());	
		//Close chrome browser window
		driver.quit();
	}
}
