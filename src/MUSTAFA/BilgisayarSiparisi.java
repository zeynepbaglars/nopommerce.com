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

        //List<WebElement> tabs = driver.findElements(By.cssSelector("[class='top-menu notmobile'] > li"));

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

        WebElement desktops = driver.findElement(By.xpath("(//a[text()='Desktops '])[1]"));
        desktops.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"), "Desktops sayfasi acik degil");

        WebElement ownComputer = driver.findElement(By.xpath("//a[text()='Build your own computer']"));
        ownComputer.click();

        WebElement selectRAM = driver.findElement(By.id("product_attribute_2"));
        selectRAM.click();

        List<WebElement> optionsRAM = driver.findElements(By.cssSelector("[id='product_attribute_2'] > option"));
        int borderRAM = optionsRAM.size();
        int indexRAM = randomNumberGeneration(borderRAM);

        Select menuRAM = new Select(selectRAM);
        menuRAM.selectByIndex(indexRAM);


        List<WebElement> optionsHDD = driver.findElements(By.name("product_attribute_3"));
        int borderHDD = optionsHDD.size();
        int indexHDD = randomNumberGeneration(borderHDD);
        optionsHDD.get(indexHDD).click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button-1"));
        addToCart.click();

        WebElement IsSuccessful = driver.findElement(By.className("bar-notification success"));

        Assert.assertTrue(IsSuccessful.getText().contains("has been added"), "Urun sepete eklenmedi");

    }




    public static int randomNumberGeneration(int border) {
        int randomNumber = (int) (Math.random() * border);
        return randomNumber;
    }
}
