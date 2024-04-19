package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _704_DialogContent extends ParentPage {

    public _704_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
@FindBy(xpath = "//*[@id=\"store.menu\"]")
public WebElement tabMenu;
@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
public WebElement Women;
@FindBy(xpath = "//*[@id=\"ui-id-5\"]")
public WebElement Men;
@FindBy(xpath = "//*[@id=\"ui-id-6\"]")
public WebElement Gear;
@FindBy(xpath = "//*[@id=\"ui-id-7\"]")
public WebElement Training;
@FindBy(xpath = "//*[@id=\"ui-id-8\"]")
public WebElement Sale;

@FindBy(xpath = "//*[@id=\"ui-id-9\"]")
public WebElement womenTops;
@FindBy(xpath = "//*[@id=\"ui-id-10\"]")
public WebElement womenBottoms;

@FindBy(xpath = "//*[@id=\"ui-id-17\"]")
public WebElement menTops;
@FindBy(xpath = "//*[@id=\"ui-id-18\"]")
public WebElement menBottoms;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "Women":return this.Women;
            case "tabMenu":return this.tabMenu;
            case "Men":return this.Men;
            case "Gear":return this.Gear;
            case "Training":return this.Training;
            case "womenTops":return this.womenTops;
            case "womenBottoms":return this.womenBottoms;
            case "menTops":return this.menTops;
            case "menBottoms":return this.menBottoms;
            case "Sale":return this.Sale;


        }

        return null;
    }


}
