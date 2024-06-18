package org.epam.bdd.stepdefinitions;

import org.epam.bdd.pages.DriverInstance;
import org.epam.bdd.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    public LoginSteps(){
        driver=DriverInstance.getDriver();
        loginPage=new LoginPage(driver);
    }


    @Given("I am on login page")
    public void I_am_on_login_page(){
        driver.get("https://www.saucedemo.com/");
    }

    @When("I provide valid valid credentials")
    public void I_provide_valid_valid_credentials(Map<String,String> credential){
        System.out.println(credential);
        loginPage.setUsername(credential.get("username"));
        loginPage.setPassword(credential.get("password"));
    }

    @And("I click on login button")
    public void I_click_on_login_button(){
        loginPage.clickLoginBtn();
    }

    @Then("I should be logged in successfully")
    public void I_shoul_be_logged_in_successfully(){
        loginPage.verifyLoggedIn();
    }

    @Given("I have logged into application")
    public void I_have_logged_into_application(){

    }
    @When("I click on logout button")
    public void I_click_on_logout_button() throws InterruptedException {
        loginPage.clickLogoutBtn();
    }
    @Then("I should be logged out successfully")
    public void I_should_be_logged_out_successfully(){
        loginPage.verifyLoggedOut();
    }

    @When("^I provide invalid valid credentials (.*) and (.*)$")
    public void I_provide_invalid_valid_credentials(String username,String password){
        loginPage.setUsername(username);
        loginPage.setPassword(password);
    }
    @Then("^I should get error message (.*)$")
    public void I_should_get_error_message(String errorMsg){
        loginPage.verifyErrorMsg(errorMsg);
    }
}
