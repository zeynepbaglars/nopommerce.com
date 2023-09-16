package ZEYNEP;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US4_CHALLENGE_POMElements {
    public US4_CHALLENGE_POMElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }



    @FindBy(linkText = "Log in")
    public WebElement login;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;
    @FindBy(linkText = "Computers")
    public WebElement computers;
    @FindBy(linkText = "Notebooks")
    public WebElement notebooks;
    @FindBy(css = "[class='product-title'] a")
    public List<WebElement> tabProducts;
    @FindBy(id = "small-searchterms")
    public WebElement search;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement searchButton;
    @FindBy(css = "[class='product-title'] a")
    public List<WebElement> searchProducts;////random al
    @FindBy(css = "[class='product-name'] h1")
    public WebElement productName;

























}
