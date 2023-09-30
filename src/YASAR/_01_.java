package YASAR;

import _Utility.BaseDriver;
import _Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_ extends BaseDriver {
    @Test
    public void us4() {

        driver.navigate().to("https://demo.nopcommerce.com/");
        // List<WebElement> menü= driver.findElements(By.xpath("//ul[@class='top-menu mobile']/li"));
        //// for (WebElement e:menü) {
        ////     driver.findElement(By.linkText(e.getText()));
        ////     e.click();
        // }
        //Actions aksiyon=new Actions(driver);

        WebElement computers = driver.findElement(By.linkText("Computers"));
        //aksiyon.moveToElement(computers).build().perform();
        Assert.assertTrue(computers.isDisplayed(),"yanlış url");
        computers.click();
        

        WebElement desktops = driver.findElement(By.linkText("Desktops"));
        Assert.assertTrue(desktops.isDisplayed(),"yanlış url");
        desktops.click();

        //Assert.assertTrue(desktops,aranılan sayfada değilsiniz);

        //aksiyon.moveToElement(computers).build().perform();
       WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
       Assert.assertTrue(notebooks.isDisplayed(),"yanlış url");
       notebooks.click();

       WebElement software = driver.findElement(By.linkText("Software"));
       Assert.assertTrue(software.isDisplayed(),"yanlış url");
       software.click();

       WebElement elektronik = driver.findElement(By.linkText("Electronics"));
       Assert.assertTrue(elektronik.isDisplayed(),"yanlış url");
       elektronik.click();

       WebElement camfoto = driver.findElement(By.linkText("Camera & photo"));
       Assert.assertTrue(camfoto.isDisplayed(),"yanlış url");
       camfoto.click();

       WebElement cellphones = driver.findElement(By.linkText("Cell phones"));
       Assert.assertTrue(cellphones.isDisplayed(),"yanlış url");
       cellphones.click();

       WebElement others = driver.findElement(By.linkText("Others"));
       Assert.assertTrue(others.isDisplayed(),"yanlış url");
       others.click();

       WebElement apparel = driver.findElement(By.linkText("Apparel"));
       Assert.assertTrue(apparel.isDisplayed(),"yanlış url");
       apparel.click();

       WebElement shoes = driver.findElement(By.linkText("Shoes"));
       Assert.assertTrue(shoes.isDisplayed(),"yanlış url");
       shoes.click();

       WebElement cloth = driver.findElement(By.linkText("Clothing"));
       Assert.assertTrue(cloth.isDisplayed(),"yanlış url");
       cloth.click();

       WebElement accesss = driver.findElement(By.linkText("Accessories"));
       Assert.assertTrue(accesss.isDisplayed(),"yanlış url");
       accesss.click();

       WebElement ddown = driver.findElement(By.linkText("Digital downloads"));
       Assert.assertTrue(ddown.isDisplayed(),"yanlış url");
       ddown.click();

       WebElement books = driver.findElement(By.linkText("Books"));
       Assert.assertTrue(books.isDisplayed(),"yanlış url");
       books.click();

       WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
       Assert.assertTrue(jewelry.isDisplayed(),"yanlış url");
       jewelry.click();

       WebElement giftcards = driver.findElement(By.linkText("Gift Cards"));
       Assert.assertTrue(giftcards.isDisplayed(),"yanlış url");
       giftcards.click();                                                 







    }
}
