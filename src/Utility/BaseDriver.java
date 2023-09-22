package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {


    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {
      Logger logger = Logger.getLogger("");
      logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

public void login(){



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




}

    @AfterClass
    public void bitisIslemleri() {
        MyFunc.bekle(5);
        driver.quit();
    }


}