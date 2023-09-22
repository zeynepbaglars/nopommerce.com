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
}
