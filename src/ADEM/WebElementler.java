package ADEM;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementler {

    public WebElementler() {
        PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='Adobe Photoshop CS4']")
    public WebElement urun;
}