package StepDefinitions;

import Pages._708_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _708_StepDefinitions {

    _708_DialogContent dc = new _708_DialogContent();

    @When("Kullanici magento sitesine giris yapar")
    public void kullaniciMagentoSitesineGirisYapar() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        System.out.println("Siteye Gidildi...! ");
        // GWD.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dc.singIn.click();
        dc.email.sendKeys("ozgurkarakus@gmail.com");
        dc.password.sendKeys("ozgur.123");
        dc.loginButton.click();
        dc.verifyContainsText(dc.loginAssert, "Welcome");
    }

    @Then("Begendigi bir urunun sayfasına gider")
    public void begendigiBirUrununSayfasınaGider() {
        dc.saleButton.click();
        dc.jackets.click();
        dc.fav1.click();
        //dc.saleButton.click();
        //dc.jackets.click();
        //dc.fav2.click();

    }

    @And("Kullanici Favorilere Ekle butonuna tiklar")
    public void kullaniciFavorilereEkleButonunaTiklar() {
        dc.wish1.click();
        //dc.wish2.click();

    }

    @And("Urunun favorilere eklendigine dair mesaj gosterilir")
    public void urununFavorilereEklendigineDairMesajGosterilir() {
dc.verifyContainsText(dc.wishAssert,"\n" +
        "Proteus Fitness Jackshirt has been added to your Wish List. Click here to continue shopping. ");

    }

    @And("Kullanıcı Hesabım sayfasına gider")
    public void kullanıcıHesabımSayfasınaGider() {
        Select drop = new Select(dc.dropdown);
        drop.deselectByValue("My Account");
        //dc.dropdown.click();
        dc.myAccount.click();
    }

    @And("Favorilerim linkine tıklar")
    public void favorilerimLinkineTıklar() {
        dc.myWishlist.click();
    }

    @Then("Favoriler listesinde eklediği ürünü görür")
    public void favorilerListesindeEklediğiÜrünüGörür() {
        dc.verifyContainsText(dc.myWishlistAssert,"Item");
        //dc.myWishlistAssert.isDisplayed();
    }

    @And("Kullanici urunun uzerine gittiginde delete butonunu gorur")
    public void kullaniciUrununUzerineGittigindeDeleteButonunuGorur() {
        Assert.assertTrue(dc.delete.isDisplayed(), "not isDisplayed");

        //dc.scrollToElement(dc.delete.isDisplayed());
    }

    @When("Kullanici delete butonuna tıklar")
    public void kullaniciButonunaTıklar() throws InterruptedException {
        dc.delete.click();
        GWD.getDriver().manage().wait(5);
    }

    @Then("Kullaniciya urunun favoriler listesinden cikarildigina dair bir mesaj goruntulenir")
    public void kullaniciyaUrununFavorilerListesindenCikarildiginaDairBirMesajGoruntulenir() {
        dc.verifyContainsText(dc.removeMessage, "removed");


    }


}
