package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {

    By selectCustomer = By.xpath("//select[@id='userSelect']");
    By selectCurrency = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[@type='submit']");



    public void selectCustomer(String text){
        selectByVisibleTextFromDropDown(selectCustomer,text);
    }
    public void selectCurrency(String text){
        selectByVisibleTextFromDropDown(selectCurrency,text);
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }
    public void verifyAccountCreatedSuccessfully(){
        String expectedtext ="Account created successfully";
        String actualtext = getTextFromAlert();
        Assert.assertEquals("not match text",actualtext,expectedtext);
    }
    public void accpetPopUp(){
        acceptAlert();
    }
}