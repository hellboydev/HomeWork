package Demo_FrameworkBtes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class HomePage
{
    WebDriver driver=DriverManager.getDriver();



    public CoursesPage clickOnCourse(String courseName){
        By coursesBy=By.cssSelector("label[name='"+courseName+"']");
        driver.findElement(coursesBy).click();
        return new CoursesPage();
    }


}
