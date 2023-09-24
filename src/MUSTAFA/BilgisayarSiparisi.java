package MUSTAFA;

import _Utility.BaseDriver;
import _Utility.MyFunc;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BilgisayarSiparisi extends BaseDriver {
    @Test
    public void BilgisayarSiparisTesti() {

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(2);

        WebElements elements = new WebElements();

        List<String> list = new ArrayList<>();
        list.add("Computers");
        list.add("Electronics");
        list.add("Apparel");
        list.add("Digital downloads");
        list.add("Books");
        list.add("Jewelry");
        list.add("Gift Cards");

        for (int i = 0; i < elements.tabs.size(); i++) {
            Assert.assertEquals(elements.tabs.get(i).getText(), list.get(i), "Tab menu dogru sekilde gorunmuyor");
        }

        elements.aksiyonlar.moveToElement(elements.tabs.get(0)).build().perform();
        elements.desktops.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"), "Desktops sayfasi acik degil");

        elements.ownComputer.click();
        elements.selectRAM.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(elements.optionsRAM));
        int borderRAM = elements.optionsRAM.size();
        int indexRAM = WebElements.randomNumberGeneration(borderRAM);

        Select menuRAM = new Select(elements.selectRAM);
        menuRAM.selectByIndex(indexRAM);

        int borderHDD = elements.optionsHDD.size();
        int indexHDD = WebElements.randomNumberGeneration(borderHDD);

        elements.optionsHDD.get(indexHDD).click();
        elements.addToCart.click();

        Assert.assertTrue(elements.IsSuccessful.getText().contains("has been added"), "Urun sepete eklenmedi");

    }

}
