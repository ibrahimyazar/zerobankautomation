package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefinitions {

    // first we need to create AccountsummaryPage object in order to calll AccountsummaryPage class
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    @Then("Verifies that Account Summary page should have the title {string}")
    public void verifies_that_Account_Summary_page_should_have_the_title(String string) {
        System.out.println("I am in the Account Summary");
        //accountSummaryPage.pageTitle();
        String actualResult = Driver.get().getTitle();
        Assert.assertEquals(string, actualResult);

    }

    @Then("User Should see {string}, {string}, {string}, {string}")
    public void user_Should_see(String string, String string2, String string3, String string4) {

        String CashAccountsText = accountSummaryPage.CashAccountsElement.getText();
        String InvestmentAccountsText = accountSummaryPage.InvestmentAccountsElemenent.getText();
        String CreditAccountsText = accountSummaryPage.CreditAccountsElement.getText();
        String LoanAccountsText1 = accountSummaryPage.LoanAccountsElement.getText();
        Assert.assertEquals( string, CashAccountsText );
        Assert.assertEquals( string2, InvestmentAccountsText);
        Assert.assertEquals( string3, CreditAccountsText );
        Assert.assertEquals( string4, LoanAccountsText1);

       // Assert.assertEquals(string,)
    }

    @Then("User Should see that account types are displayed")
    public void user_Should_see_that_account_types_are_displayed(List<String> dataTable) {
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        System.out.println(dataTable);   // [Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts]
        accountSummaryPage.waitUntilLoaderMaskDisappear();
        accountSummaryPage.getAccountTypesNames();
        Assert.assertEquals(dataTable, accountSummaryPage.getAccountTypesNames());

        int text = accountSummaryPage.getAccountTypesNames().size();
        System.out.println(text);



    }


}
