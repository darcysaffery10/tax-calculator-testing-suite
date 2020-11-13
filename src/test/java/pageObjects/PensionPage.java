package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.junit.Assert;



public class PensionPage {

    private WebDriver driver;

    public PensionPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final By NO_BTN = By.id("overStatePensionAge-2");
    public static final By YES_BTN = By.id("overStatePensionAge");
    public static final By CONTINUE_BTN = By.id("button-continue");

    public void underPensionAge(){ driver.findElement(NO_BTN).click();
    }

    public void overPensionAge(){ driver.findElement(YES_BTN).click();
    }
    public void selectContinue(){ driver.findElement(CONTINUE_BTN).click();
    }

}
