package net.calculator.pages;

import net.calculator.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherPage extends Utility {

    private static final Logger log = LogManager.getLogger(OtherPage.class.getName());

    public OtherPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Conversion Calculator']")
    WebElement conversionCalculator;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Length']")
    WebElement length;


    public void clickOnConversionCalculatorTab(){
        log.info("clicking on Conversion Calculator Button" + this.conversionCalculator.toString());
        clickOnElement(this.conversionCalculator);
    }

    public void clickOnLengthTab(){
        log.info("clicking on Length Button" + this.length.toString());
        clickOnElement(this.length);
    }
}
