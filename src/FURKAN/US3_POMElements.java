package FURKAN;

import _Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


import java.util.List;

    public class US3_POMElements {

        public US3_POMElements() {
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
        @FindBy(css = "[class*='error']")
        public List<WebElement> errorMessage;
        @FindBy(linkText = "My account")
        public WebElement myAaccount;

}
