package net.calculator.pages;

import net.calculator.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Financial']")
    WebElement financial;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Other']")
    WebElement other;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Fitness & Health']")
    WebElement fitnessAndHealth;


    public void clickOnFinancialTab(){
        log.info("clicking on Financial Button" + this.financial.toString());
        clickOnElement(this.financial);
    }

    public void clickOnOtherTab(){
        log.info(" clicking on Other Button" + other.toString());
        clickOnElement(this.other);
    }

    public void clickOnFitnessAndHealthTab(){
        log.info(" clicking on FitnessAndHealth Button" + fitnessAndHealth.toString());
        clickOnElement(this.fitnessAndHealth);
    }
}
