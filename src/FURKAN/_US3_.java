package FURKAN;

import FURKAN.US3_POMElements;
import _Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static _Utility.BaseDriver.driver;

public class _US3_ extends BaseDriver {


    @Test(dataProvider = "datalarim")
    public void test(String mail, String sifre) {
        driver.get("https://demo.nopcommerce.com/");

        US3_POMElements elements = new US3_POMElements();

        elements.login.click();

        elements.email.sendKeys(mail);
        elements.password.sendKeys(sifre);
        elements.loginButton.click();
        String dogruMail = "team-789@gmail.com";
        String dogruSifre = "Teknostudy7";

        if (mail.equals(dogruMail) && sifre.equals(dogruSifre)) {
            Assert.assertTrue(elements.myAaccount.isDisplayed(), "Doğru mailde hata aldık");
            System.out.println(elements.myAaccount.isDisplayed() + "çalıştı dogru");
        } else {
            System.out.println(elements.errorMessage.size() + "çalıştı yanlış");
            Assert.assertTrue(elements.errorMessage.size() > 0, "yannlış mailde uyarı vermedi ");
        }


    }

    @DataProvider
    public Object[][] datalarim() {

        Object[][] data = {
                {"team-kmc@gmail.com", "Teknostudy7"},
                {"team-78@gmail.com", ""},
                {"team@gmail.com", "Teknostudy7"},
                {"team@gmail.com", ""},
                {"", ""},
                {"team@gmail.com", "Teknostudy"},
                {"team-789@gmail.com", "Teknostudy7"}
        };
        return data;
    }
}