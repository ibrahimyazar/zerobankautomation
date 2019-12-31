package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPageStepDefinition {
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    LoginStepDefinitions loginStepDefinitions = new LoginStepDefinitions();
    @FindBy(id = "aa_accountId")
    public WebElement selectElement;

    @When("User click the Account activity submodule")
    public void user_click_the_Account_activity_submodule() {
    accountActivityPage.AccountActivityLinkClick();



    }

    @Then("Account activity page should be displayed")
    public void account_activity_page_should_be_displayed() {

    }

    @Then("Page title is {string}")
    public void page_title_is(String string) {

       // String title = Driver.get().getTitle();
       //accountActivityPage.AccountActivityTitle();
        Assert.assertEquals(string, Driver.get().getTitle());
        BrowserUtils.wait(5);

    }

    @When("Account drop down default option should be {string}")
    public void account_drop_down_default_option_should_be(String string) {

        Select select = new Select(selectElement);
        select.selectByValue("Savings");
        String text = "select: " + select.getFirstSelectedOption().getText();
        Assert.assertEquals(string, select.getFirstSelectedOption().getText());
    }


}
