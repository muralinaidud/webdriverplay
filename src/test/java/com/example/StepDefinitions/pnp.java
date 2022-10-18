package com.example.StepDefinitions;

import com.example.casigo;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.example.BaseClass.navigateToHome;

public class pnp {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\A\\chromedriver.exe");
        driver = new ChromeDriver();
        String casigoURL = "https:";
        Cookie name1 = new Cookie("test_country", "FI");
        Cookie name2 = new Cookie("test_ip_address", "194.34.132.59");

        driver.get(casigoURL);
        driver.manage().deleteAllCookies();
        driver.manage().addCookie(name1);
        driver.manage().addCookie(name2);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='navigation-link casigo-icon-account']")).click();
        //casigo.account();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/main/lib-deposit-amount/form/div[1]/div/lib-dynamic-form-field/div/div/lib-input-amount/div/div[1]/div/div[5]/button")).click();
        casigo.clickOndeposit();
        casigo.iframe();
        casigo.selectBank();
        casigo.cont();
        casigo.cont();
        casigo.typeUsername("testuser");
        casigo.cont();
        Thread.sleep(1000);
        casigo.getOTP();
        casigo.cont();



    }

}
