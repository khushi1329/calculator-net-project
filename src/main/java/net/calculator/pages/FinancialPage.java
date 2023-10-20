package net.calculator.pages;

import net.calculator.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialPage extends Utility {

    private static final Logger log = LogManager.getLogger(FinancialPage.class.getName());

    public FinancialPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Financial Calculators']")
    WebElement financialCalculatorText;

    public String verifyFinancialCalculator(){
        log.info("clicking on Financial Calculator text" + this.financialCalculatorText.toString());
        return  getTextFromElement(financialCalculatorText);
    }


}
