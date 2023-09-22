package BURCU;

import _Utility.BaseDriver;
import _Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ extends BaseDriver {


    @Test
    @Parameters
    public void US2() {

        driver.manage().window().maximize();


        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(5);

        WebElement login = driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();
        MyFunc.bekle(2);

        WebElement loginEmail = driver.findElement(By.name("Email"));
        loginEmail.sendKeys("team-7@gmail.com");
        MyFunc.bekle(2);

        WebElement loginPassword = driver.findElement(By.name("Password"));
        loginPassword.sendKeys("Teknostudy7");
        MyFunc.bekle(2);

        WebElement loginButton = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginButton.click();
        MyFunc.bekle(2);

        WebElement myAcount = driver.findElement(By.cssSelector("[class='ico-account']"));
        myAcount.getText();
        Assert.assertTrue(myAcount.getText().contains("My"));

        driver.quit();


    }
}
