package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class CheckAnswersPage {

    private WebDriver driver;
            public CheckAnswersPage(WebDriver driver) {this.driver = driver;}

            private static final By GETRESULTS_BTN = By.id("button-get-results");
            private static final By CHANGEPAY = By.cssSelector("[href='/estimate-paye-take-home-pay/your-pay']");
            private static final By YEARLYPAY = By.cssSelector(".govuk-summary-list__value");
            private static final By SUMBITCHANGESBTN = By.id("button-continue");

            public void getResults(){ driver.findElement(GETRESULTS_BTN).click();
            }
            public void changePay() {
                driver.findElement(CHANGEPAY).click();
            }

            public void submitChanges(){
                driver.findElement(SUMBITCHANGESBTN).click();
            }

            public void PayAmended(String salary){
                String newSalary = driver.findElement(YEARLYPAY).getText();
                Assert.assertTrue(newSalary.contains(salary));
            }


}
