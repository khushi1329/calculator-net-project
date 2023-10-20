package net.calculator.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.calculator.pages.FinancialPage;
import net.calculator.pages.HomePage;
import net.calculator.pages.OtherPage;
import org.junit.Assert;

public class TopMenuSteps {

    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I click on financial link$")
    public void iClickOnFinancialLink() {
        new HomePage().clickOnFinancialTab();

    }

    @Then("^I should navigate to financial calculators Page successfully$")
    public void iShouldNavigateToFinancialCalculatorsPageSuccessfully() {
        String expectedText= "Financial Calculators";
        String actualText= new FinancialPage().verifyFinancialCalculator();
        Assert.assertEquals(expectedText,actualText);
    }

    @When("^I click on fitness and health link$")
    public void iClickOnFitnessAndHealthLink() {
        new  HomePage().clickOnFitnessAndHealthTab();
    }

    @Then("^I should navigate to fitness and health calculators Page successfully$")
    public void iShouldNavigateToFitnessAndHealthCalculatorsPageSuccessfully() {
    }

    @When("^I click on other link$")
    public void iClickOnOtherLink() {
        new HomePage().clickOnOtherTab();
    }

    @Then("^I should navigate to other calculators Page successfully$")
    public void iShouldNavigateToOtherCalculatorsPageSuccessfully() {
    }

    @And("^I click on  conversion calculator slot$")
    public void iClickOnConversionCalculatorSlot() {
        new OtherPage().clickOnConversionCalculatorTab();
    }

    @Then("^i should click to length slot$")
    public void iShouldClickToLengthSlot() {
        new OtherPage().clickOnLengthTab();
    }
}
