package demo_Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class question2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	      ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        options.addArguments("disable-infobars");
	        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

	        WebDriver driver= new ChromeDriver(options);

	        driver.get("https://www.facebook.com/");
	        if(driver.getPageSource().contains("hakunama-tata timon and puma ")){
	            System.out.println("Text present");
	        }else{
	            System.out.println("Text not present");
	        }
	}

}
