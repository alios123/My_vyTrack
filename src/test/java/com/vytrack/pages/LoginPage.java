package com.vytrack.pages;

import com.vytrack.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputUsername;
    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;
    @FindBy(name ="_submit")
    public WebElement signInBtn;
    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidMessage;
    @FindBy(xpath = "\"//ul[@class='nav pull-right user-menu']/li\"")
    public WebElement fourModuleList;
}
