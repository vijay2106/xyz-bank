package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By AddCustomerTab= By.xpath("//button[@class='btn btn-lg tab btn-primary']");

    By OpenAccountTab = By.xpath("//button[normalize-space()='Open Account']");

    public void clickOnAddCustomerTab(){
        clickOnElement(AddCustomerTab);
    }
    public void clickOnOpenAccountTab(){
        clickOnElement(OpenAccountTab);
    }

}