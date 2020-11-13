package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



abstract class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;

    public void waitAndClick(By selector){
        wait.until(ExpectedConditions.elementToBeClickable(selector)).click();
    }
}