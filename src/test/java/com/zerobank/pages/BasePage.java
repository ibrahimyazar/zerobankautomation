package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {  // first create this method
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }





}
