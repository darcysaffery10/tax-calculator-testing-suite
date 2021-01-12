package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WeeklyHoursPage {

    private WebDriver driver;
    public WeeklyHoursPage(WebDriver driver) {this.driver = driver;}
    private static final By HOURS_INPUT = By.id("how-many-a-week");


    public void inputWeeklyHours(String hours) {
        driver.findElement(HOURS_INPUT).sendKeys(hours);
    }




}
n
