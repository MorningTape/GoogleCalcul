package Pages.GoogleCalculator;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch extends BasePage {
    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    private final By Search = By.xpath("//input[@name='q']");

    public GoogleSearch enterCountRooms(){
        driver.findElement(Search).sendKeys("Калькулятор", Keys.ENTER);
        return this;
    }

}
