package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _703_DialogContent extends ParentPage {

    public _703_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //https://magento.softwaretestingboard.com/customer/account/login/
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement Email;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement Password;

    @FindBy(xpath = "//*[@id=\"send2\"]")
    public WebElement SignIn;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    public WebElement ClickActionSwitch;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
    public WebElement MyAccount;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[1]/a")
    public WebElement ClickManageAddress;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[6]/div[1]/button")
    public WebElement AddNewAddress;

    @FindBy(xpath = "//*[@id=\"street_1\"]")
    public WebElement StreetAddress;

    @FindBy(xpath = "//*[@id=\"telephone\"]")
    public WebElement PhoneNumber;
    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement City;


    @FindBy(xpath = "//*[@id=\"zip\"]")
    public WebElement PostalCode;

    @FindBy(xpath = "//*[@id=\"country\"]")
    public WebElement Country;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    public WebElement SaveAddress;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement AddressAddedSuccessMessage;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "Email":
                return this.Email;
            case "Password":
                return this.Password;
            case "SignIn":
                return this.SignIn;
            case "ClickManageAddress":
                return this.ClickManageAddress;
            case "AddNewAddress":
                return this.AddNewAddress;
            case "StreetAddress":
                return this.StreetAddress;
            case "PhoneNumber":
                return this.PhoneNumber;
            case "City":
                return this.City;
            case "PostalCode":
                return this.PostalCode;
            case "Country":
                return this.Country;
            case "SaveAddress":
                return this.SaveAddress;
            case "AddressAddedSuccessMessage":
                return this.AddressAddedSuccessMessage;
            case "MyAccount":
                return this.MyAccount;
            case "ClickActionSwitch":
                return this.ClickActionSwitch;


        }
        return null;
    }
}
