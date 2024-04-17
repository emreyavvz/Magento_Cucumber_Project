package StepDefinitions;

import Pages._703_DialogContent;
import Pages._705_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _705_StepDefinitions {

    _705_DialogContent dc5 = new _705_DialogContent();

    @Given("The user is logged into their account")
    public void TheUserIsLoggedIntoTheirAccount() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/");
        dc5.mySendKeys(dc5.Email, "a2032@proton.me");
        dc5.mySendKeys(dc5.Password, "L8eAk57*v_KqsjZ");
        dc5.myClick(dc5.SignIn);
    }

    @When("The user browses the homepage")
    public void theUserBrowsesTheHomepage() {
        dc5.myClick(dc5.StoreLogo);
    }

    @And("The user adds a randomly selected product to the cart")
    public void theUserAddsARandomlySelectedProductToTheCart() {
        dc5.myClick(dc5.ItemSize);
        dc5.myClick(dc5.ItemColor);
        dc5.myClick(dc5.AddToCart);
    }

    @Then("The product should be added successfully")
    public void theProductShouldBeAddedSuccessfully() {
        dc5.verifyContainsText(dc5.ItemAddedMessage, "You added Echo Fit Compression Short to your");
    }

    @And("The user selects the quantity of the product")
    public void theUserSelectsTheQuantityOfTheProduct() {
    }

    @Then("The quantity of the product in the cart should be updated accordingly")
    public void theQuantityOfTheProductInTheCartShouldBeUpdatedAccordingly() {
    }

    @And("the user has products in their cart")
    public void theUserHasProductsInTheirCart() {
    }

    @When("the user removes a product from the cart")
    public void theUserRemovesAProductFromTheCart() {
    }

    @Then("the product should be successfully removed")
    public void theProductShouldBeSuccessfullyRemoved() {
    }

    @And("The user clicks on shop")
    public void theUserClicksOnShop() {
        dc5.myClick(dc5.ShopNewYoga);
    }
}
