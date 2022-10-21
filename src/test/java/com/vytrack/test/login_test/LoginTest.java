package com.vytrack.test.login_test;

import com.vytrack.pages.LoginPage;
import com.vytrack.util.ConfigurationReader;
import com.vytrack.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class LoginTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Test
    public void verify_positive_login_test(){

        loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signInBtn.click();

    }

    @Test
    public void verify_view_4_module_test(){
        loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signInBtn.click();

}

    @Test
    public void verify_negative_login_test(){
        loginPage=new LoginPage();
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("invalid_username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("invalid_password"));
        loginPage.signInBtn.click();
        Assert.assertTrue(loginPage.invalidMessage.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
