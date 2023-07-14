package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {

    By FirstnameField = By.xpath("//input[@placeholder='First Name']");
    By LastnameField = By.xpath("//input[@placeholder='Last Name']");

    By PostcodeField = By.xpath("//input[@placeholder='Post Code']");
    By AddCustomerButton = By.xpath("//button[@type='submit']");

    public void EnterFirstname(String text){
        sendTextToElement(FirstnameField,text);
    }
    public void EnterLastname(String text){
        sendTextToElement(LastnameField,text);
    }
    public void EnterPostcode(String text){
        sendTextToElement(PostcodeField,text);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(AddCustomerButton);
    }
    public void verifyCustomeraddedsuccessfully(){
        String expectedtext ="Customer added successfully";
        String actualtext = getTextFromAlert();
        Assert.assertEquals("not match text",actualtext,expectedtext);
    }
    public void accpetPopUp(){
        acceptAlert();
    }

}