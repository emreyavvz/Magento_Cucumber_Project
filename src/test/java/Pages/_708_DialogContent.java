package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _708_DialogContent extends ParentPage {

    public _708_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Sign') and contains(text(), 'In')]")
    public WebElement singIn;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password;
    @FindBy(xpath = "//button[@id='send2']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[@class='logged-in' and contains(text(), 'Welcome')]")
    public WebElement loginAssert;
    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement saleButton;
    @FindBy(xpath = "(//a[text()='Jackets'])[2]")
    public WebElement jackets;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/a/span/span/img")
    public WebElement fav1;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[2]/div/a/span/span/img")
    public WebElement fav2;
    @FindBy(xpath = "(//a[@class='action towishlist'])[1]")
    public WebElement wish1;
    @FindBy(xpath = "//div[contains(text(), 'has been added to your Wish List')]")
    public WebElement wishAssert;

    //(//span[@class='counter qty'])[1]
    @FindBy(xpath = "//button[@class='action switch' and @type='button']\n")
    public WebElement dropdown;
    @FindBy(xpath = "(//span[@class='counter qty'])[1]")
    public WebElement dropwish;
    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount;
    @FindBy(xpath = "//a[text()='My Wish List']")
    public WebElement myWishlist;
    @FindBy(xpath = "//span[@class='toolbar-number']")
    public WebElement myWishlistAssert;
    @FindBy(xpath = "//a[@title='Remove Item']")
    public WebElement delete;
    @FindBy(xpath = "(//div[contains(text(), 'Proteus Fitness Jackshirt has been removed from your Wish List.')]")
    public WebElement removeMessage;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "singIn": return this.singIn;
            case "email": return this.email;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "saleButton": return this.saleButton;
            case "jackets": return this.jackets;
            case "fav1": return this.fav1;
            case "fav2": return this.fav2;
            case "dropdown": return this.dropdown;
            case "loginAssert": return this.loginAssert;
            case "wishAssert": return this.wishAssert;
            case "wish1": return this.wish1;
            case "myAccount": return this.myAccount;
            case "delete": return this.delete;
            case "removeItem": return this.removeMessage;
            case "myWishlist": return this.myWishlist;
            case "myWishlistAssert": return this.myWishlistAssert;
            case "dropwish": return this.dropwish;
//span[text()='My Wish List']


        }

        return null;
    }


}
