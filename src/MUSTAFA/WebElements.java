package MUSTAFA;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebElements {

    public WebElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='top-menu notmobile'] > li")
    public List<WebElement> tabs;

    @FindBy(xpath = "(//a[text()='Desktops '])[1]")
    public WebElement desktops;

    @FindBy(xpath = "//a[text()='Build your own computer']")
    public WebElement ownComputer;

    @FindBy(id = "product_attribute_2")
    public WebElement selectRAM;

    @FindBy(css = "[id='product_attribute_2'] > option")
    public List<WebElement> optionsRAM;

    @FindBy(name = "product_attribute_3")
    public List<WebElement> optionsHDD;

    @FindBy(id = "add-to-cart-button-1")
    public WebElement addToCart;

    @FindBy(className = "bar-notification success")
    public WebElement IsSuccessful;

}
