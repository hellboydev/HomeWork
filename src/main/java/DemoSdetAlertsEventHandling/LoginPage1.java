package DemoSdetAlertsEventHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage1 
{

	By user=By.cssSelector("div.form-group input[id='username']");
	By pass=By.cssSelector("div.form-group input[id='password']");
	By loginbtn=By.cssSelector("button[id='loginbtn']");
	
	WebDriver driver=DriverManager1.getdriver();

	public LoginPage1 openURL(String url) {
		driver.get(url);
		return this;}
		
	public LoginPage1 Enterusername (String username) {
		driver.findElement(user).sendKeys(username);
		return this;
	}	
	public LoginPage1 Enterpassword (String password) {
		driver.findElement(pass).sendKeys(password);
		return this;
	}
	public HomePage1 Clicklogin() {
		driver.findElement(loginbtn).click();;
		return new HomePage1();
	}
	
	
}
