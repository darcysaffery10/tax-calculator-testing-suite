package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By ANNUAL_PAY = By.id("period-5");
    private static final By HOURLY_PAY = By.id("period");
    private static final By CONTINUE_BTN = By.id("button-continue");
    private static final By SALARY_ERROR = By.id("error-summary-title");

    public void goTo() {
        driver.get("https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay");
    }

    public void enterAmountPaid(String salary) {
        driver.findElement(By.id("amount")).sendKeys(salary);

    }

    public void selectAnnualPay() {
        driver.findElement(ANNUAL_PAY).click();
    }

    public void selectContinue() {
        driver.findElement(CONTINUE_BTN).click();
    }

    public void selectHourlyPay() {
        driver.findElement(HOURLY_PAY).click();
    }

    public void clearExistingSalary() {
        driver.findElement(By.id("amount")).clear();
    }

    public void salaryErrorPresent() {
        Assert.assertTrue(driver.findElement(SALARY_ERROR).isDisplayed());
    }


}

n
