package StepDefinitions;

import Pages._703_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class _703_StepDefinitions {
    _703_DialogContent dialogContent = new _703_DialogContent();

    @Given("Kullanıcı, hesabına giriş yapar")
    public void kullanıcıHesabınaGirişYapar() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/");
        dialogContent.mySendKeys(dialogContent.Email, "a2032@proton.me");
        dialogContent.mySendKeys(dialogContent.Password, "L8eAk57*v_KqsjZ");
        dialogContent.myClick(dialogContent.SignIn);
    }

    @Then("Kullanıcı myaccount linkine tıklar")
    public void kullanıcıMyaccountLinkineTıklar() {
        dialogContent.myClick(dialogContent.ClickActionSwitch);
        dialogContent.myClick(dialogContent.MyAccount);
    }

    @And("Kullanıcı, Adress Book kısmındaki Manage Address linkine tıklar")
    public void kullanıcıAdressBookKısmındakiManageAddressLinkineTıklar() {
        dialogContent.myClick(dialogContent.ClickManageAddress);
    }

    @And("Kullanıcı, Add New Address linkine tıklar")
    public void kullanıcıAddNewAddressLinkineTıklar() {

        dialogContent.myClick(dialogContent.AddNewAddress);
    }

    @And("Gerekli alanları kullanarak doldurur")
    public void gerekliAlanlarıStreetAddressPhoneNumberStateCityPostalCodeCountryKullanarakDoldurur(DataTable dataTable) {
        List<Map<String, String>> addressList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> address : addressList) {
            Select ddMenu = new Select(dialogContent.Country);
            ddMenu.selectByValue(address.get("Country"));

            dialogContent.mySendKeys(dialogContent.StreetAddress, address.get("StreetAddress"));
            dialogContent.mySendKeys(dialogContent.PhoneNumber, address.get("PhoneNumber"));
            dialogContent.mySendKeys(dialogContent.PostalCode, address.get("PostalCode"));
            dialogContent.mySendKeys(dialogContent.City, address.get("City"));
        }
    }
    @Then("Değişiklikleri kaydeder ve adreslerim sayfasına geri döner")
    public void değişiklikleriKaydederVeAdreslerimSayfasınaGeriDöner() {
        dialogContent.myClick(dialogContent.SaveAddress);
        dialogContent.verifyContainsText(dialogContent.AddressAddedSuccessMessage, "You saved the address.");
    }

}
