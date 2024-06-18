package org.epam.bdd.stepdefinitions;

import org.epam.bdd.pages.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WithdrawCashStep {
    private Account account;
    private int actBalance;

    @Given("I have a balance of ${int} in my account")
    public void I_have_a_balance_of_$_in_my_account(int amount){
        account=new Account();
        account.setBalance(amount);
        actBalance=account.getBalance();
        Assert.assertEquals(actBalance,amount);
    }

    @When("I request ${int}")
    public void I_request_$(int amount){
        account.withdraw(amount);
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(int amount){
        Assert.assertEquals(actBalance-account.getBalance(),amount,"dispensed failed");
    }
}
