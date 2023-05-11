package UtilsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LoginPage {
	
	public static WebDriver driver;

	public void test (String username, String password, String exp) {
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement txtEmail=driver.findElement(By.id("user-name"));
		txtEmail.clear();
		txtEmail.sendKeys(username);
		
		WebElement txtpassword=driver.findElement(By.id("password"));
		txtpassword.clear();
		txtpassword.sendKeys(password);
		
		WebElement button= driver.findElement(By.id("login-button"));
		button.click();
		
		String exp_title="Swag Labs";
		String act_title=driver.getTitle();
		
		if(exp.equals("Valid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.id("logout_sidebar_link"));
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
			else if(exp.equals("Invalid"))
			{
				if(exp_title.equals(act_title))
				{
					driver.findElement(By.id("logout_sidebar_link"));
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
	}
