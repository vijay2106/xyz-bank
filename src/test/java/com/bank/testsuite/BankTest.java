package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        //  click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        //	enter FirstName
        addCustomerPage.EnterFirstname("Diuesh");
        //	enter LastName
        addCustomerPage.EnterLastname("Roman");
        //	enter PostCode
        addCustomerPage.EnterPostcode("HA8 7HG");
        //	click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
        //	popup display

        //	verify message "Customer added successfully"
        addCustomerPage.verifyCustomeraddedsuccessfully();
        //	click on "ok" button on popup.
        addCustomerPage.accpetPopUp();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        //  click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //	click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
        //	Search customer that created in first test
        openAccountPage.selectCustomer("Vijay london");
        //	Select currency "Pound"
        openAccountPage.selectCurrency("Pound");
        //	click on "process" button
        openAccountPage.clickOnProcessButton();
        //	popup displayed

        //	verify message "Account created successfully"
        openAccountPage.verifyAccountCreatedSuccessfully();
        //	click on "ok" button on popup.
        openAccountPage.accpetPopUp();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        //  click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.selectYourname("Diuesh Roman");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	verify "Logout" Tab displayed.
        customersPage.verifyLogouttab();
        //	click on "Logout"
        customersPage.clickOnLogoutTab();
        //	verify "Your Name" text displayed.
        customerLoginPage.verifyYourNameText();
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        //  click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.selectYourname("Diuesh Roman");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	click on "Deposit" Tab
        customersPage.clickOnDepositeTab();
        //	Enter amount 100
        customersPage.enterDepositAmount("100");
        //	click on "Deposit" Button
        customersPage.clickOnDepositButton();
        //	verify message "Deposit Successful"
        customersPage.verifyDepositSuccessfulText();

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        //  click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //	search customer that you created.
        customerLoginPage.selectYourname("Diuesh");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        //	click on "Withdrawal" Tab
        customersPage.clickOnWithdrawalTab();
        //	Enter amount 50
        customersPage.enterWithdrawalAmount("50");
        //	click on "Withdraw" Button
        customersPage.clickOnWithdrawButton();
        //	verify message "Transaction Successful"
        customersPage.verifyTransactionSuccessfulText();
    }
}