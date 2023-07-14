package com.bank.testbase;

import com.bank.propertyreader.PropertyReader;
import com.bank.utilities.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public  void setUp(){
        selectBrowser(browser);

    }
    @AfterTest
    public void tearDown(){
        closeBrowser();
    }

}
