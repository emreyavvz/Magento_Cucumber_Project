package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _705_DialogContent extends ParentPage {

    public _705_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement Email;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement Password;
    @FindBy(xpath = "//*[@id=\"send2\"]")
    public WebElement SignIn;

    @FindBy(xpath = "//a[@aria-label='store logo']")
    public WebElement StoreLogo;

    @FindBy(xpath = "//span[@class='action more button']")
    public WebElement ShopNewYoga;

    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]")
    public WebElement ShortItem;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement ItemAddedMessage;

    @FindBy(xpath = "//div[@class='swatch-opt-1997']//div[@id='option-label-size-143-item-171']")
    public WebElement ItemSize;

    @FindBy(xpath = "//div[@class='swatch-opt-1997']//div[@id='option-label-color-93-item-49']")
    public WebElement ItemColor;

    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]")
    public WebElement AddToCart;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "Email":
                return this.Email;
            case "Password":
                return this.Password;
            case "SignIn":
                return this.SignIn;
            case "StoreLogo":
                return this.StoreLogo;
            case "ShopNewYoga":
                return this.ShopNewYoga;
            case "ShortItem":
                return this.ShortItem;
            case "ItemAddedMessage":
                return this.ItemAddedMessage;
            case "ItemSize":
                return this.ItemSize;
            case "ItemColor":
                return this.ItemColor;
            case "AddToCart":
                return this.AddToCart;
        }

        return null;
    }
}
