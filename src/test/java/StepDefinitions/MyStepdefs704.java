package StepDefinitions;

import Pages._704_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepdefs704 {

    _704_DialogContent dc1=new _704_DialogContent();
    @Given("Navigate to Magneto")
    public void navigateToMagneto() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @And("Hover To Element")
    public void hoverToElement(DataTable butonlar) throws InterruptedException {
        List<String> strButtonList= butonlar.asList(String.class);

        for(int i=0;i< strButtonList.size();i++) {

            Object linkWebElemnt= dc1.getWebElement(strButtonList.get(i));
            Thread.sleep(1000);
            dc1.myHover((WebElement) linkWebElemnt);
    }




}



    @When("The user should be able to see Tab Menu")
    public void theUserShouldBeAbleToSeeTabMenu() {
        dc1.tabMenu.isDisplayed();
    }


    @Then("The user should be able to see the WOMEN Top and Bottom Categories")
    public void theUserShouldBeAbleToSeeTheWOMENTopAndBottomCategories() {
        dc1.womenTops.isDisplayed();
        dc1.womenBottoms.isDisplayed();

    }

    @Then("The user should be able to see the Men Top and Bottom Categories")
    public void theUserShouldBeAbleToSeeTheMenTopAndBottomCategories() {
        dc1.menTops.isDisplayed();
        dc1.menBottoms.isDisplayed();
    }
}
