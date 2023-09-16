package Utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {

    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browserTipi")
    public void baslangicIslemleri(String browserTipi){
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (browserTipi.toLowerCase())
        {
            case "firefox" :
                driver = new FirefoxDriver();
                break;

            case "safari" :
                driver = new SafariDriver();
                break;

            case "edge" :
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver();
        }


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }



    @AfterClass
    public void bitisIslemleri(){
        MyFunc.bekle(5);
        driver.quit();
    }

}