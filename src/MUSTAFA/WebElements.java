package MUSTAFA;

import _Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WebElements {

    public WebElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='top-menu notmobile'] >li > a")
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

    @FindBy(className = "content")
    public WebElement IsSuccessful;




    Actions aksiyonlar = new Actions(BaseDriver.driver);




    public static int randomNumberGeneration(int border) {
        int randomNumber = (int) (Math.random() * border);
        return randomNumber;
    }

}
