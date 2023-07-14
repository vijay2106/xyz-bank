package com.bank.pages;


import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By BankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By CustomerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnBankManagerLoginTab(){
        mouseHoverToElementAndClick(BankManagerLoginTab);
    }
    public void clickOnCustomerLoginTab(){
        mouseHoverToElement(CustomerLoginTab);
    }

}