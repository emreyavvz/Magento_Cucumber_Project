package StepDefinitions;

import Pages._701_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class _701_StepDefinitions {
    _701_DialogContent dialogContent = new _701_DialogContent();

    @Given("the user is on the Magento registration page")
    public void theUserIsOnTheMagentoRegistrationPage() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/create/");
        System.out.println("The user is on the Magento registration page");
    }

    @When("the user enters their personal information")
    public void theUserEntersTheirPersonalInformation(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        dialogContent.mySendKeys(dialogContent.firstName, list.get(0).get("firstName"));
        dialogContent.mySendKeys(dialogContent.lastName, list.get(0).get("lastName"));
        System.out.println("The user entered their personal information");
    }

    @And("the user enters their login credentials")
    public void theUserEntersTheirLoginCredentials(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        dialogContent.mySendKeys(dialogContent.emailAddress, list.get(0).get("email"));
        dialogContent.mySendKeys(dialogContent.password, list.get(0).get("password"));
        dialogContent.mySendKeys(dialogContent.confirmPassword, list.get(0).get("confirmPassword"));
        System.out.println("The user entered their login credentials");
    }

    @And("the user clicks on Create an Account button")
    public void theUserClicksOnCreateAnAccountButton() {
        dialogContent.myClick(dialogContent.CreateAccount);
        System.out.println("The user clicked on Create an Account button");
    }

    @And("the user should receive a confirmation message")
    public void theUserShouldReceiveAConfirmationMessage() {
        dialogContent.verifyContainsText(dialogContent.registerSuccesMessage, "Thank you for registering with Main Website Store.");
        System.out.println("The user should receive a confirmation message");
    }
}
