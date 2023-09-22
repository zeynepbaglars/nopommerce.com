package ZEYNEP;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class US4_POMElements {
    public US4_POMElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "[class='top-menu notmobile']>li>a")//7
    public List<WebElement> tabMenu;
    @FindBy(css = "[class='top-menu notmobile']>li>ul>li")//9
    public List<WebElement> tabChildMenu;
    @FindBy(css = "[class='header-logo'] a")
    public WebElement anasayfa;

}

