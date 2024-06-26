package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _707_DialogContent extends ParentPage {

    public _707_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "username":
                return this.username;

        }

        return null;
    }


}
