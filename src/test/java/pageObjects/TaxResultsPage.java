package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TaxResultsPage {

    private WebDriver driver;

    public TaxResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By TAXRESULTSPRESENT = By.cssSelector(".govuk-panel__body");

    public void resultsPageDisplayed() {
        Assert.assertTrue(driver.findElements(TAXRESULTSPRESENT).size() != 0);

    }

    }


n
