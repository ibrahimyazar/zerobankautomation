package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

@FindBy(xpath = "//*[text() = 'Cash Accounts']")
public WebElement CashAccountsElement;

@FindBy(xpath = "//*[text() = 'Investment Accounts']")
public WebElement InvestmentAccountsElemenent;

@FindBy(xpath = "//*[text() = 'Credit Accounts']")
public WebElement CreditAccountsElement;

@FindBy(xpath = "//*[text() = 'Loan Accounts']")
public WebElement LoanAccountsElement;

@FindBy(css = "[class = 'board-header']")
public List<WebElement> accountTypes;

    public void pageTitle(){
     // WebElement title = Driver.get().getTitle();
    }

    public void accountTypes(){

        String CashAccountsText = CashAccountsElement.getText();
        String InvestmentAccountsText = InvestmentAccountsElemenent.getText();
        String CreditAccountsText = CreditAccountsElement.getText();
        String LoanAccountsText = LoanAccountsElement.getText();

    }
    // this methos if for get the names of string and we are call the browser utills class
    public List<String> getAccountTypesNames(){
        return BrowserUtils.getListOfString(accountTypes);

    }


}
