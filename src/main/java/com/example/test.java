package com.example;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.example.BaseClass.driver;

public class test {

    public static void main(String[] args){


     //   WebDriver driver = new ChromeDriver();

      //  webdriver.Chrome(ChromeDriverManager().install()
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\A\\chromedriver.exe");
        driver = new ChromeDriver();

        Cookie name1 = new Cookie("test_country", "fi");
        Cookie name2 = new Cookie("test_ip_address", "146.70.96.67");


        driver.get("https://whg:jackpotK1ng@hellocasino.whgstage.com");
        driver.manage().addCookie(name1);
        driver.manage().addCookie(name2);
        driver.manage().window().maximize();

        String URL = driver.getCurrentUrl();


    }


}
