package Tests.Base;

import Common.CommonActions;
import Pages.GoogleCalculator.GoogleCalculator;
import Pages.GoogleCalculator.GoogleSearch;
import Pages.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static Common.Config.CLEAR_COOKIES_AND_STORAGE;
import static Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected GoogleSearch Google_search = new GoogleSearch(driver);
    protected GoogleCalculator googleCalculator = new GoogleCalculator((driver));

    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor JavascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            JavascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
@AfterSuite (alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
