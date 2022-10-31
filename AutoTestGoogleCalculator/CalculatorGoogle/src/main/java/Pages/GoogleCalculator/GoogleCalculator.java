package Pages.GoogleCalculator;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleCalculator extends BasePage {
    public GoogleCalculator(WebDriver driver) {
        super(driver);
    }

    private final By One = By.xpath("//div[.='1']");
    private final By Two = By.xpath("//div[.='2']");
    private final By Three = By.xpath("//div[.='3']");
    private final By Four = By.xpath("//div[.='4']");
    private final By Five = By.xpath("//div[.='5']");
    private final By Six = By.xpath("//div[.='6']");
    private final By Seven = By.xpath("//div[.='7']");
    private final By Eight = By.xpath("//div[.='8']");
    private final By Nine = By.xpath("//div[.='9']");
    private final By Zero = By.xpath("//div[.='0']");
    private final By Plus = By.xpath("//div[.='+']");
    private final By Minus = By.xpath("//div[.='−']");
    private final By LeftBracket = By.xpath("//div[.='(']");
    private final By RightBracket = By.xpath("//div[.=')']");
    private final By Multiplication = By.xpath("//div[.='×']");
    private final By Division = By.xpath("//div[.='÷']");
    private final By Equally = By.xpath("//div[.='=']");
    private final By Sin = By.xpath("//div[.='sin']");
    private final By Result = By.xpath("//div[@id='cwos']");

    public GoogleCalculator enterTestCase1(){
        driver.findElement(LeftBracket).click();
        driver.findElement(One).click();
        driver.findElement(Plus).click();
        driver.findElement(Two).click();
        driver.findElement(RightBracket).click();
        driver.findElement(Multiplication).click();
        driver.findElement(Three).click();
        driver.findElement(Minus).click();
        driver.findElement(Four).click();
        driver.findElement(Zero).click();
        driver.findElement(Division).click();
        driver.findElement(Five).click();
        driver.findElement(Equally).click();
        return this;
    }

    public GoogleCalculator enterTestCase2(){
        driver.findElement(Six).click();
        driver.findElement(Division).click();
        driver.findElement(Zero).click();
        driver.findElement(Equally).click();
        return this;
    }

    public GoogleCalculator enterTestCase3(){
        driver.findElement(Sin).click();
        driver.findElement(LeftBracket).click();
        driver.findElement(Equally).click();
        return this;
    }
}

