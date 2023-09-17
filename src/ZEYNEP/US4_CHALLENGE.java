package ZEYNEP;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US4_CHALLENGE extends BaseDriver {
  US4_CHALLENGE_POMElements elements = new US4_CHALLENGE_POMElements();
  @Test
    public void test(){
    driver.get("https://openmrs.org");


    elements.login.click();
    elements.email.sendKeys("team7@gmail.com");
    elements.password.sendKeys("team7nop");
    elements.loginButton.click();
    new Actions(driver).
           moveToElement(elements.computers)
            .build().perform();
    elements.notebooks.click();
    List<String> tabProducts=new ArrayList<>();

    for (WebElement element:elements.tabProducts){
      tabProducts.add(element.getText());
    }
    elements.search.click();
    elements.search.sendKeys("notebooks");
    elements.searchButton.click();
  }
  public void RandomProduct(){
    US4_CHALLENGE_POMElements elements = new US4_CHALLENGE_POMElements();
    int random=(int)(Math.random()*elements.searchProducts.size());
    elements.searchProducts.get(random).click();
  }
}



//      1. computers kısmına hover yap
//      2. notebooka tıkla
//      3.tıklatmadan sonra gelen 6 elemanı liste al
//      4.search kısmına notebook yav ve entera bas// burdaki veriyi xml de elle yaz
//      5. arama sonrası çıkan elemanlarda rastgele birine tıklat
//      6.bu ürünün başta notebook altında aldığımız liste( 6elemanlı olan) olup olmadığını kontrol et.


