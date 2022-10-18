package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casigo extends BaseClass {

    public String casigoURL = "https://cptspins:frtg45@casigo.whgstage.com";

    public static By account = By.xpath("//*[@class='navigation-link casigo-icon-account']");

    public static By depositAmount = By.xpath("//*[@class='btn btn-outline-secondary btn-block amount-btn']");

    public static By deposit = By.xpath("//*[@class='btn btn-primary']");

    public static By bank = By.xpath("//*[@data-testid='image-with-fallback-image'][1]");

    public static By accept = By.xpath("//*[data-testid='primary-button-body']");

    public static By continu = By.xpath("//*[data-testid='primary-button-body']");

    public static By username = By.xpath("//*[@data-testid='Input-text-loginid']");

    public static By cont = By.xpath("//*[@data-testid='continue-button']");

    public static By otp = By.xpath("//*[@class='sc-dlnjwi dRMjYq']");

    public static By otpfield = By.xpath("//*[@data-testid='Input-password-challenge_response']");

    public static By checkAccount = By.xpath("//*[@data-testid='393900/63625123']");

    public static By authcontinue = By.xpath("//*[@data-testid='393900/63625123']");

    public static By nobonus = By.xpath("//*[@class='no-bonus-call-to-action-container']");

    public static By email = By.id("email");

    public static By phone = By.id("phone");

    public static By term = By.id("terms");

    public static By startplay = By.xpath("//*[@class='btn btn-primary']");


    public static void iframe() {driver.switchTo().frame(0);}

    public static void account() {driver.findElement(account);}

    public static void clickStartPlay() {driver.findElement(startplay).click();}

    public static void clickTerm() {driver.findElement(term).click();}

    public static void typePhone(String tphone) {driver.findElement(phone).sendKeys(tphone);}

    public static void typeEmail(String temail) {driver.findElement(email).sendKeys(temail);}

    public static void withoutBonus() {driver.findElement(nobonus).click();}

    public static void continuea() {driver.findElement(authcontinue).click();}

    public static void typeOTP(String password) {driver.findElement(otpfield).sendKeys(password);}

    public static void getOTP() {
        String number = driver.findElement(otp).getText();
        driver.findElement(otpfield).sendKeys(number);
    }

    public static void cont() {driver.findElement(cont).click();}

    public static void typeUsername(String uname) {driver.findElement(username).sendKeys(uname);}

    public static void selectBank() {driver.findElement(bank).click();}

    public static void clickOndeposit() {driver.findElement(deposit);}

    public static void selectDeposit() {driver.findElement(depositAmount).click();}

    public static void clickAccept() {driver.findElement(accept).click();}


    public void casigoURL() throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Cookie name1 = new Cookie("test_country", "fi");
        Cookie name2 = new Cookie("test_ip_address", "146.70.96.67");


        driver.get(casigoURL);
        driver.manage().addCookie(name1);
        driver.manage().addCookie(name2);
        driver.manage().window().maximize();

        String URL = driver.getCurrentUrl();

        Thread.sleep(2000);




    }


    public static void login() throws InterruptedException {

        Thread.sleep(2000);
      //  WebDriver driver = new ChromeDriver();
        driver.findElement(account).click();
      //  driver.findElement(account).click();




    }

}


