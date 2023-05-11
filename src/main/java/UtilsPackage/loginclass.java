package UtilsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginclass {
	
	By user=By.cssSelector("div input[name=username]");
	By pass=By.cssSelector("div input[name=password]");
	By loginbtn=By.cssSelector("div button[class*='oxd-button']");
	
	WebDriver driver=DriverManager.getDriver();

	public loginclass openURL(String url) {
		driver.get(url);
		return this;}
		
	public loginclass Enterusername (String username) {
		driver.findElement(user).sendKeys(username);
		return this;
	}	
	public loginclass Enterpassword (String password) {
		driver.findElement(pass).sendKeys(password);
		return this;
	}
	public HomePage Clicklogin() {
		driver.findElement(loginbtn).click();;
		return new HomePage();
	}
	
	}