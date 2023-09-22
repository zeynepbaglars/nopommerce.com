package ZEYNEP;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US4 extends BaseDriver {
    @Test
    public void Test() {
        US4_POMElements elements = new US4_POMElements();
        driver.get("https://demo.nopcommerce.com/");

    List<String> tabMenu=new ArrayList<>(Arrays.asList("Computers","Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"));
    List<String> tabAltMenu=new ArrayList<>(Arrays.asList("Desktops","Notebooks", "Software"));
    tabMenu.addAll(tabAltMenu);

        for (int i = 0; i < tabMenu.size(); i++) {

       hoverOver(driver.findElement(By.linkText(tabMenu.get(i))));
       driver.findElement(By.linkText(tabMenu.get(8))).click();



        }

    }



    public void hoverOver(WebElement element) {
        new Actions(driver).moveToElement(element).build().perform();
        MyFunc.bekle(2);
    }
}
