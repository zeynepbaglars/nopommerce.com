package ZEYNEP;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class US4_CHALLENGE extends BaseDriver {


    @Test(groups = {"UI Testing", "Search"," TAB Menu"," Regression"})
    public void test() {

        US4_CHALLENGE_POMElements elements = new US4_CHALLENGE_POMElements();

        driver.get("https://demo.nopcommerce.com/");

        new Actions(driver).
                moveToElement(elements.computers)
                .build().perform();
        elements.notebooks.click();

        List<String> tabProducts = new ArrayList<>();
        for (WebElement element : elements.tabProducts) {
            tabProducts.add(element.getText());
//            System.out.println(element.getText());
        }
        elements.search.click();
        elements.search.sendKeys("notebooks");
        elements.searchButton.click();

        String random=randomProduct();
        boolean control = false;
        for (String product : tabProducts) {
            if (product.equals(random)) {
//                System.out.println("****"+product);
                control = true;
            }
        }
        Assert.assertTrue(control, "hatalı ürün dizilimi");
    }

    public String randomProduct() {
        US4_CHALLENGE_POMElements elements = new US4_CHALLENGE_POMElements();

        int random = (int) (Math.random() * elements.searchProducts.size());
        elements.searchProducts.get(random).click();
        return elements.productName.getText();

    }


//      steps
//      1. computers kısmına hover yap
//      2. notebooka tıkla
//      3.tıklatmadan sonra gelen 6 elemanı liste al
//      4.search kısmına notebook yav ve entera bas// burdaki veriyi xml de elle yaz
//      5. arama sonrası çıkan elemanlarda rastgele birine tıklat
//      6.bu ürünün başta notebook altında aldığımız liste( 6elemanlı olan) olup olmadığını kontrol et.


}
