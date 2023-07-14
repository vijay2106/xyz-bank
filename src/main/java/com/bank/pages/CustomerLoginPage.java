package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By selectYourname = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    By yourNametext =By.xpath("//label[contains(text(),'Your Name :')]");


    public void selectYourname(String text){
        selectByVisibleTextFromDropDown(selectYourname,text);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void verifyYourNameText(){
        assertVerifyText(yourNametext,"Your Name :");
    }

}