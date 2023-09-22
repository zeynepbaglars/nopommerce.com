package MUSTAFA;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BilgisayarSiparisi extends BaseDriver {
    @Test
    public void BilgisayarSiparisTesti() {

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(3);

        WebElements elements=new WebElements();

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

        Actions aksiyonlar = new Actions(driver);
        aksiyonlar.moveToElement(elements.tabs.get(0)).build().perform();

        elements.desktops.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"), "Desktops sayfasi acik degil");

        elements.ownComputer.click();
        elements.selectRAM.click();

        int borderRAM = elements.optionsRAM.size();
        int indexRAM = randomNumberGeneration(borderRAM);

        Select menuRAM = new Select(elements.selectRAM);
        menuRAM.selectByIndex(indexRAM);

        int borderHDD = elements.optionsHDD.size();
        int indexHDD = randomNumberGeneration(borderHDD);

        elements.optionsHDD.get(indexHDD).click();
        elements.addToCart.click();

        Assert.assertTrue(elements.IsSuccessful.getText().contains("has been added"), "Urun sepete eklenmedi");

    }




    public static int randomNumberGeneration(int border) {
        int randomNumber = (int) (Math.random() * border);
        return randomNumber;
    }
}
