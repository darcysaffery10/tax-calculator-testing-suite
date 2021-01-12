package Tests;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

public class Tests {

    private static WebDriver driver = new ChromeDriver();
    private HomePage homePage = new HomePage(driver);
    private PensionPage pensionPage = new PensionPage(driver);
    private WeeklyHoursPage hoursPage = new WeeklyHoursPage(driver);
    private TaxCodePage taxCodePage = new TaxCodePage(driver);
    private CheckAnswersPage confirmationPage = new CheckAnswersPage(driver);
    private TaxResultsPage taxResultsPage = new TaxResultsPage(driver);

    @AfterClass public static void quitDriver(){
        driver.quit();
    }

    /* Full Tax Journey using average pay
    - Enter an annual salary of "22000"
    - Under the state pension age
    - Use generic tax code of "1250L"
    - Get results
    - Verify results page is displayed
     */

    @Test public void completeJourney () {
        homePage.goTo();
        homePage.enterAmountPaid("22000");
        homePage.selectAnnualPay();
        homePage.selectContinue();
        pensionPage.underPensionAge();
        pensionPage.selectContinue();
        taxCodePage.enterTaxCode("1250L");
        taxCodePage.continueBtn();
        confirmationPage.getResults();
        taxResultsPage.resultsPageDisplayed();

    }
    /* Amend details
    - Input average annual salary
    - Under state pension age
    - Use generic tax code
    - Make changes on checkAnswersPage
    - Review changes
    - Verify results page present
     */

    @Test public void amendDetails(){
        driver.manage().deleteAllCookies();
        homePage.goTo();
        homePage.enterAmountPaid("22000");
        homePage.selectAnnualPay();
        homePage.selectContinue();
        pensionPage.underPensionAge();
        pensionPage.selectContinue();
        taxCodePage.enterTaxCode("1250L");
        taxCodePage.continueBtn();
        confirmationPage.changePay();
        homePage.clearExistingSalary();
        homePage.enterAmountPaid("21000");
//        confirmationPage.PayAmended("21000");
        confirmationPage.submitChanges();
        taxResultsPage.resultsPageDisplayed();

    }


       /* Invalid TaxCode
    - Input average annual salary
    - Under state pension age
    - Use invalid tax code
    - Verify invalid tax code alert present
     */
    @Test public void invalidTaxCode(){
        driver.manage().deleteAllCookies();
        homePage.goTo();
        homePage.enterAmountPaid("22000");
        homePage.selectAnnualPay();
        homePage.selectContinue();
        pensionPage.underPensionAge();
        pensionPage.selectContinue();
        taxCodePage.enterTaxCode("29087dsf");
        taxCodePage.continueBtn();
        taxCodePage.invalidTaxError();
        driver.quit();
    }
/* Invalid salary
- input invalid salary
- confirm error message
*/


    @Test public void invalidSalary(){
        homePage.goTo();
        homePage.enterAmountPaid("dshhjhs");
        homePage.selectAnnualPay();
        homePage.selectContinue();
        homePage.salaryErrorPresent();

    }

       /* Over state pension age
    - Input average annual salary
    - Hover and select over state pension age
    - Use generic tax code
    - Verify results page present
     */

    @Test public void overPensionAge(){
        driver.manage().deleteAllCookies();
        homePage.goTo();
        homePage.enterAmountPaid("22000");
        homePage.selectAnnualPay();
        homePage.selectContinue();
        pensionPage.overPensionAge();
        pensionPage.selectContinue();

    }

    /* Input hourly salary
    - input hourly salary
    -input number of hours a week
    -
     */

    @Test public void hourlySalary(){
        driver.manage().deleteAllCookies();
        homePage.goTo();
        homePage.enterAmountPaid("22000");
        homePage.selectHourlyPay();
        homePage.selectContinue();
        hoursPage.inputWeeklyHours("37");
        homePage.selectContinue();

    }
}
n
