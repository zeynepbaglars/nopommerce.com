package ALPER;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_ extends BaseDriver {
    @Test
    public void US1(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.bekle(5);

        WebElement register = driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();
        MyFunc.bekle(2);

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();
        MyFunc.bekle(2);

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("TEAM7");
        MyFunc.bekle(2);

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Team7");
        MyFunc.bekle(2);



        WebElement webDay = driver.findElement(By.name("DateOfBirthDay"));
        WebElement webMonth = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement webYear = driver.findElement(By.name("DateOfBirthYear"));

        Select day=new Select(webDay);
        Select month=new Select(webMonth);
        Select year=new Select(webYear);

        day.selectByVisibleText("1");
        month.selectByValue("1");
        year.selectByVisibleText("2023");
        MyFunc.bekle(2);



        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys("team-7@gmail.com");
        MyFunc.bekle(2);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Teknostudy7");
        MyFunc.bekle(2);

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Teknostudy7");
        MyFunc.bekle(2);

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        MyFunc.bekle(2);

        WebElement result = driver.findElement(By.cssSelector("[class='result']"));
        result.getText();
        Assert.assertTrue(result.getText().contains("Your"));

        WebElement continueSignout= driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        continueSignout.click();
        MyFunc.bekle(2);


        


        //team-7@gmail.com"









    }



}
