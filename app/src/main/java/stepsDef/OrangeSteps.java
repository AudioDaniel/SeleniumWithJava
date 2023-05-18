package stepsDef;
import elements.OrangeElements;
import org.junit.Assert;
import pages.orange.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pages.orange.Profile;
import pages.orange.Admin;
import pages.orange.PIM;
import pages.orange.Recruitment;
import scripts.Commons;
import scripts.Configuration;

import java.util.Properties;

public class OrangeSteps {
    private final static Properties keyProperties = Configuration.keyPropertyFile;
    @Given("that I am on the login page")
    public void navigateToLogin(){
        Login.navigateToLogin();
    }

    @When("I enter my credentials")
    public void iEnterMyCredentials() {
        Login.enterCredentials();
    }

    @And("I click login")
    public void iClickLogin() {
        Login.clickLoginButton();
    }

    @And("I click on profile button")
    public void iClickOnProfileButton() {
        Login.clickBurgerButton();
        Login.clickProfileButton();
    }

    @And("I change my nationality to Afghan")
    public void iChangeMyNationalityToAfghan() {
        Profile.changeNationalityProfilePage("Burkinabe");
    }

    @Then("I should see my name in a badge")
    public void iShouldSeeMyNameInABadge() {
        Login.verifyBadge();
    }

    @When("^I click on (.*) button$")
    public void iClickOnButton(String section) {
        Login.clickBurgerButton();
        Login.clickOnButton(section);
    }

    @Then("^I should be redirected to the (.*) page$")
    public void iShouldBeRedirectedToThePage(String section) {
        String regex = keyProperties.getProperty("@ORANGE_GENERIC_REGEX");
        Assert.assertTrue("The url doesn't follow the pattern",
                Login.verifyUrl(regex,section));
    }


    @And("I add a new employee")
    public void addNewEmployee(){
        Admin.addNewEmployee();
    }

    @And("I select the users role")
    public void iSelectTheUsersRole() {
        Admin.selectUserRole();
    }

    @And("^I write the employee's name (.*)$")
    public void iWriteTheEmployeeSNameName(String name) {
        Admin.writeEmployeeName(name);

    }

    @And("I select the status as enabled")
    public void iSelectTheStatusAsEnabled() {
        Admin.selectEnabled();
    }

    @And("^I enter the username (.*)$")
    public void iEnterTheUsernameUsername(String username) {
        Admin.writeUserName(username);
    }

    @And("^I enter the password (.*)$")
    public void iEnterThePassword(String password) {
        Admin.writePassword(password);
    }

    @And("I click the save button")
    public void iClickTheSaveButton() {
        Admin.clickSaveButton();
    }

    @And("^I input the new employee first name: (.*)$")
    public void iInputTheNewEmployeeFirstNameFirstname(String firstname) {
        Recruitment.writeFirstName(firstname);
    }

    @And("^I input the new employee middle name: (.*)$")
    public void iInputTheNewEmployeeMiddleNameMiddlename(String middlename) {
        Recruitment.writeMiddleName(middlename);
    }

    @And("^I input the new employee last name: (.*)$")
    public void iInputTheNewEmployeeLastNameLastname(String lastname) {
        Recruitment.writeLastName(lastname);
    }

    @And("^I input the new employee mail : (.*)$")
    public void iInputTheNewEmployeeMailMail(String mail) {
        Recruitment.writeMail(mail);
    }

    @Then("I save the employee's profile")
    public void iSaveTheEmployeeSProfile() {
        PIM.saveEmployee();
    }
}
