package demo_Selenium;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.FluentWait;

//import java.time.Duration;


public class ImplicitExplicit {
    public static void main(String[]args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
       /* driver.get("https://mycbseguide.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000L);  */
        
      //  driver.quit();

      // Implicit Waits
       /*    driver.get("https://ui.cogmento.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement email= driver.findElement(By.name("email"));
        email.click();
        email.sendKeys("devhellboy.619@gmail.com");
        Thread.sleep(5000);  */

      // Explicit Waits
     /*   driver.get("https://ui.cogmento.com/");
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15L));
        WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        email.click();
        email.sendKeys("devhellboy.619@gmail.com");
        Thread.sleep(5000);
        */
        
        // Fluent Waits
      /*  driver.get("https://ui.cogmento.com/");
        FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));
        WebElement email=fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        email.click();
        email.sendKeys("devhellboy.619@gmail.com");

        Thread.sleep(5000L);
                               */
        
        driver.quit();
    }


}
