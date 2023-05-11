import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginPage {
public static WebDriver driver;

	public void test (String username, String password) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		//driver.close();
	}

		
	}
