package com.example;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\A\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void navigateToHome(String URL) throws InterruptedException {
        Cookie name1 = new Cookie("test_country", "FI");
        Cookie name2 = new Cookie("test_ip_address", "194.34.132.59");

        driver.get(URL);
        driver.manage().deleteAllCookies();
        driver.manage().addCookie(name1);
        driver.manage().addCookie(name2);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }

//    public static void closeDriver(){
//        driver.quit();
//    }


}
