package stepsDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;
import scripts.Commons;
import scripts.Configuration;

import java.util.Properties;


public class SaucedemoSteps {

    private final static Properties keyProperties = Configuration.keyPropertyFile;

    @Given("the user visits SauceDemo page")
    public void navigateToLoginPage() {
        Commons.navigateTo("https://www.saucedemo.com/");
    }

    @When("I enter my valid email {string}")
    public void enterValidEmail(String email) {
        SaucedemoPage.enterEmail(email);
    }

    @And("I enter my password {string}")
    public void enterPassword(String password) {
        SaucedemoPage.enterPassword(password);
    }

    @When("I make a click on the login button")
    public void clickOnLoginButton() {
        SaucedemoPage.clickLoginButton();
    }

    @Then("I should be redirected to the home page")
    public void verifyRedirectedToHomePage() {
        //Assert.assertTrue(Commons.verifyElementPresent(homePageLocator));
    }

    @Then("^an error message is displayed with text: (.*)$")
    public void verifyErrorMessageIsDisplayed(String keyProperty) {

        String message = keyProperties.getProperty(keyProperty);
        Assert.assertTrue(
                Commons.verifyElementHasAttribute(
                        Commons.findElementByText("header3", message),
                        "textContent",
                        message
                )
        );
    }
}