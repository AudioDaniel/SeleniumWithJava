package stepsDef;

import io.cucumber.datatable.DataTable;
import pages.Plexus.Newsletter;
import pages.Plexus.Contacto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Map;

public class PlexusSteps {

    @Given("that I am on the subscription page")
    public void goToSubscriptionPage() {
        Newsletter.navigateToSubsriptionPage();
    }
    @When("^I enter my work email '(.*)'$")
    public void enterEmail(String email) {
        Newsletter.setEmailPlexus(email);
    }
    @And("^I enter my name '(.*)'$")
    public void enterName(String name) {
        Newsletter.setName(name);
    }

    @And("I click on subscribirse")
    public void clickButton() {
        Newsletter.clickSubscribeButton();
    }
    @Then("I should get an error message")
    public void verifyErrorMessageDisplayed() {
        Newsletter.verifyErrorMessage();
    }


    @Given("that I am on the contact page")
    public void thatIAmOnTheContactPage() {
        Contacto.navigateToContactPage();
    }

    @When("I click on the send button")
    public void iClickOnTheSendButton() {
        Contacto.clickSendButton();
    }

    @Then("The following fields are highlighted in color.")
    public void theFollowingFieldsAreHighlightedInColor(DataTable dt) {
        Contacto.verifyFieldsColors(dt);
    }
}
