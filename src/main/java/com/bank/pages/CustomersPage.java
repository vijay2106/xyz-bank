package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By logoutText = By.xpath("//button[contains(text(),'Logout')]");
    By DepositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@type='submit']");
    By DepositSuccessfulText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By WithdrawalTab =By.xpath("//button[normalize-space()='Withdrawl']");
    By TransactionSuccessfulText = By.xpath("//span[contains(text(),'Transaction successful')]");

    public void verifyLogouttab(){
        assertVerifyText(logoutText,"Log out");
    }
    public void clickOnLogoutTab(){
        clickOnElement(logoutText);
    }
    public void clickOnDepositeTab(){
        clickOnElement(DepositTab);
    }
    public void enterDepositAmount(String text){
        sendTextToElement(amountField,text);
    }
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    public void verifyDepositSuccessfulText(){
        assertVerifyText(DepositSuccessfulText,"Deposit Successful");
    }
    public void clickOnWithdrawalTab(){
        clickOnElement(WithdrawalTab);
    }
    public void enterWithdrawalAmount(String text){
        sendTextToElement(amountField,text);
    }
    public void clickOnWithdrawButton(){
        clickOnElement(depositButton);
    }
    public void verifyTransactionSuccessfulText(){
        assertVerifyText(TransactionSuccessfulText,"Transaction successful");
    }
}