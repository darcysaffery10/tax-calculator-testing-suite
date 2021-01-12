package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TaxCodePage {

    private WebDriver driver;

    public TaxCodePage(WebDriver driver) { this.driver = driver; }

    public static final By TAXCODEINPUTBOX = By.id("taxCode");
    public static final By CONTINUEBTN = By.id("button-continue");
    public static final By TAXCODEERROR = By.id("error-summary-title");

    public void enterTaxCode(String taxCode){
        driver.findElement(TAXCODEINPUTBOX).sendKeys(taxCode);
    }

    public void continueBtn(){ driver.findElement(CONTINUEBTN).click();
    }

    public void invalidTaxError(){
        Assert.assertTrue(driver.findElement(TAXCODEERROR).isDisplayed());
    }
}
n
