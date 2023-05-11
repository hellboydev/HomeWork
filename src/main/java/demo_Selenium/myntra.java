package demo_Selenium;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class myntra
{
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        By women= By.cssSelector("div.desktop-navLink.desktop-navLink a[href=\"/shop/women\"]");
        By Kurta_set= By.cssSelector("li a[href=\"/women-kurtas-kurtis-suits\"]");



        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        // Locating the Main Menu (Parent element)
        WebElement WOMEN= driver.findElement(women);
        //Instantiating Actions class
        Actions actions = new Actions(driver);
        //Hovering on women
        
        WebElement kurtaset= driver.findElement(Kurta_set);
      
        actions.moveToElement(WOMEN).moveToElement(kurtaset).click().build().perform();

        System.out.println(driver.getCurrentUrl());


        //driver.quit();

    }



    }

