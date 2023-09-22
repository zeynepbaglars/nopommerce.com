package ADEM;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ extends BaseDriver {
    @Test
    @Parameters("mesaj")
    public void test1(String urunAdi) {

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(3);

        WebElementler webEl=new WebElementler();

        webEl.searchBox.sendKeys(urunAdi + Keys.ENTER);

        Assert.assertEquals(webEl.urun.getText(),urunAdi, "Aynı isimde ürün bulunamadı.");

    }
}