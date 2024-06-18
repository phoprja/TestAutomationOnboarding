package org.epam.bdd.stepdefinitions;

import org.epam.bdd.pages.DriverInstance;
import org.epam.bdd.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {
    private WebDriver driver;
    private RegistrationPage registrationPage;
    public RegistrationSteps(){
        this.driver= DriverInstance.getDriver();
        registrationPage=new RegistrationPage(driver);
    }

    @Given("I am on the registration page")
    public void I_am_on_the_registration_page(){
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @When("^I enter the firstname (.*)$")
    public void I_enter_the_firstname(String firstname){
        registrationPage.setFirstName(firstname);
    }

    @And("^I enter the lastname (.*)$")
    public void I_enter_the_lastname(String lastname){
        registrationPage.setLastName(lastname);
    }

    @And("^I enter the email (.*)$")
    public void I_enter_the_email(String email){
        registrationPage.setEmail(email);
    }

    @And("^I select gender as (.*)$")
    public void I_select_gender(String gender){
        registrationPage.selectGender(gender);
    }

    @And("^I enter the mobile number (.*)$")
    public void I_enter_the_mobile(String mobile){
        registrationPage.setMobile(mobile);
    }

    @And("^I select date of birth as (.*)$")
    public void I_select_date_of_birth(String dob){
        registrationPage.setDOB(dob);
    }
    @And("^I select hobby as (.*)$")
    public void I_select_hobby(String hobby){
        registrationPage.selectHobbies(hobby);
    }

    @And("^I upload picture with (.*)$")
    public void I_upload_picture(String picName){
        registrationPage.uploadPicture(picName);
    }

    @And("I click on register button")
    public void I_click_on_register_button(){
        registrationPage.clickSubmitBtn();
    }

    @Then("User should register successfully")
    public void User_should_register_successfully(){
        registrationPage.verifyUserRegister();
    }
}
