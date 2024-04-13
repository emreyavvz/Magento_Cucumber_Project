package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _701_DialogContent extends ParentPage{

    public _701_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    public WebElement CreateAccount;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement registerSuccesMessage;
    //Thank you for registering with Main Website Store.


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "firstName":
                return this.firstName;

            case "lastName":
                return this.lastName;

            case "emailAddress":
                return this.emailAddress;

            case "password":
                return this.password;

            case "confirmPassword":
                return this.confirmPassword;
                case "CreateAccount":
                    return this.CreateAccount;

            case "registerSuccesMessage":
                return this.registerSuccesMessage;
        }
        return null;
    }
}
