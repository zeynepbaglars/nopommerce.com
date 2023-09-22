package FEYZANUR;

import _Utility.BaseDriver;
import _Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class _01_ extends BaseDriver{
    @Test
    public void Test5US(){
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(1);

        WebElement giftCard = driver.findElement(By.xpath("//*[@href='/gift-cards']"));
        Assert.assertTrue(giftCard.isDisplayed());
        giftCard.click();
        MyFunc.bekle(1);

        WebElement add = driver.findElement(By.xpath("//*[@class='button-2 product-box-add-to-cart-button']"));
        add.click();
        MyFunc.bekle(1);

        WebElement add2 = driver.findElement(By.id("add-to-cart-button-43"));
        add2.click();
        MyFunc.bekle(1);

        WebElement hata = driver.findElement(By.xpath("//*[@class='content']"));
        Assert.assertTrue(hata.isDisplayed());
        MyFunc.bekle(1);

        WebElement recipientname = driver.findElement(By.id("giftcard_43_RecipientName"));
        recipientname.sendKeys("madam");
        MyFunc.bekle(1);

        WebElement recipientemail = driver.findElement(By.id("giftcard_43_RecipientEmail"));
        recipientemail.sendKeys("deryagizem@gmail.com");
        MyFunc.bekle(1);

        WebElement name = driver.findElement(By.id("giftcard_43_SenderName"));
        name.sendKeys("bir dost");
        MyFunc.bekle(1);

        WebElement mail = driver.findElement(By.id("giftcard_43_SenderEmail"));
        mail.sendKeys("deryagizem@gmail.com");
        MyFunc.bekle(1);

        WebElement message = driver.findElement(By.id("giftcard_43_Message"));
        message.sendKeys("ı hope you'll be happy");
        MyFunc.bekle(1);

        add2.click();
        MyFunc.bekle(1);

        WebElement sepet = driver.findElement(By.xpath("//*[@href='/cart']"));
        sepet.click();
        MyFunc.bekle(1);

        WebElement edit=driver.findElement(By.xpath("//*[text()='Edit']"));
        Assert.assertTrue(edit.isDisplayed());

        bitisIslemleri();}}
