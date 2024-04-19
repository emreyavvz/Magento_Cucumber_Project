package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _702_DialogContent extends ParentPage {

    public _702_DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@class='fc-button-label'])[1]")
    public WebElement einwilligen;
    @FindBy (linkText = "Sign In")
    public WebElement signIn;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement mailInput;
    @FindBy(xpath = "//*[@title='Password']")
    public WebElement passwordInput;
    @FindBy(xpath = "(//*[@name='send'])[1]")
    public WebElement signInButton;
    @FindBy(xpath = "(//*[@class='logged-in'])[1]" )
    public WebElement welcome;
    @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[2]/div/div/div")
    public WebElement errorMessage;
    @FindBy(xpath = "//*[@id='email-error']")
    public WebElement requiredField;
    @FindBy(xpath = "(//*[@class='secondary'])[1]")
    public WebElement forgetButton;
    @FindBy(xpath = "//*[@id='email_address']")
    public WebElement eMailInput;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement resetButton;
    @FindBy(xpath = "//*[@data-ui-id='message-success']")
    public WebElement resetSuccess;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "einwilligen" : return this.einwilligen;
            case "Sign In": return this.signIn;
            case "mailInput": return this.mailInput;
            case "passwordInput": return this.passwordInput;
            case "signInButton": return this.signInButton;
            case "welcome" : return this.welcome;
            case "errorMessage" : return this.errorMessage;
            case "requiredField" : return this.requiredField;
            case "forgetButton" : return this.forgetButton;
            case "eMailInput" : return this.eMailInput;
            case "resetButton" : return this.resetButton;
            case "resetSuccess" : return this.resetSuccess;

        }
        return null;

    }


}
