package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.casigo;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;

import static com.example.casigo.*;


public class casigosteps extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

//    @After
//    public void teardown(){
//        closeDriver();
//    }


    @Given("^open the browser and launch casigo application$")
    public void open_the_browser_and_launch_casigo_application() throws InterruptedException {

        String casigoURL = "https://cptspins:frtg45@casigo.whgstage.com";
        navigateToHome(casigoURL);
        Thread.sleep(2000);
        casigo.account();
        casigo.selectDeposit();
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

    @Given("^logon to the application as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void logon_to_the_application_as_and(String arg1, String arg2) throws InterruptedException {

        Thread.sleep(2000);
        casigo.login();
        Thread.sleep(2000);

    }

    @Given("^click on deposit button after user logs on$")
    public void click_on_deposit_button_after_user_logs_on()  {

        casigo.clickOndeposit();

    }

    @And("click on account for deposit pnp")
    public void click_on_account_for_deposit_pnp() throws InterruptedException {
        Thread.sleep(2000);
        casigo.account();
    }


    @Given("select deposit amount from menu and click deposit")
    public void select_deposit_amount_from_menu_and_click_deposit() {
        casigo.selectDeposit();
        casigo.clickOndeposit();
    }

    @Given("complete the deposit flow")
    public void complete_the_deposit_flow() throws InterruptedException {

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

    @When("user click on submit button")
    public void user_click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Deposit is successful")
    public void deposit_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
