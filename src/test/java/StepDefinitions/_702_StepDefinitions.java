package StepDefinitions;

import Pages._702_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _702_StepDefinitions {
    _702_DialogContent dc = new _702_DialogContent();

    @Given("User wants to access the Magento website")
    public void userWantsToAccessTheMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com");
        dc.myClick(dc.einwilligen);
        dc.myClick(dc.signIn);
    }


    @And("user wants to login with correct username as {string}and password as {string}")
    public void userWantsToLoginWithCorrectUsernameAsAndPasswordAs(String userName, String password) {
        dc.mySendKeys(dc.mailInput,userName);
        dc.mySendKeys(dc.passwordInput,password);
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        dc.myClick(dc.signInButton);
    }

    @Then("User is successfully redirected to the account dashboard")
    public void userIsSuccessfullyRedirectedToTheAccountDashboard() {
        dc.verifyContainsText(dc.welcome,"serkan");
    }


    @And("user wants to login with an invalid username as {string} and correct password as {string}")
    public void userWantsToLoginWithAnInvalidUsernameAsAndCorrectPasswordAs(String invalidUserName, String validPassword) {
        dc.mySendKeys(dc.mailInput,invalidUserName);
        dc.mySendKeys(dc.passwordInput,validPassword );

    }

    @Then("User receives an error message and stays on the login page")
    public void userReceivesAnErrorMessageAndStaysOnTheLoginPage() {
        dc.verifyContainsText(dc.errorMessage,"incorrect");
    }


    @And("user wants to login with correct username as {string} and an invalid password as {string}")
    public void userWantsToLoginWithCorrectUsernameAsAndAnInvalidPasswordAs(String validUserName, String invalidPassword) {
        dc.mySendKeys(dc.mailInput,validUserName);
        dc.mySendKeys(dc.passwordInput,invalidPassword);
    }

    @And("user wants to login with empty username and password fields")
    public void userWantsToLoginWithEmptyUsernameAndPasswordFields() {

    }

    @Then("User receives an error message" )
    public void userReceivesAnErrorMessage() {
        dc.verifyContainsText(dc.requiredField,"required field");
    }

    @When("User clicks on the Forget Your Password button")
    public void userClicksOnTheForgetYourPasswordButton() {
        dc.myClick(dc.forgetButton);
    }

    @And("User enters username as {string}")
    public void userEntersUsernameAs(String userName) {
        dc.mySendKeys(dc.eMailInput, userName);
    }

    @And("User clicks on the ResetMyPassword button")
    public void userClicksOnTheResetMyPasswordButton() {
        dc.myClick(dc.resetButton);
        dc.verifyContainsText(dc.resetSuccess, "you will receive an email");


    }
}
