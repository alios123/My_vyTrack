package com.vytrack.test.login_page;

import com.vytrack.util.ConfigurationReader;
import com.vytrack.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void verify_positive_login_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement username=Driver.getDriver().findElement(By.name("_username"));
        WebElement password=Driver.getDriver().findElement(By.name("_password"));
        WebElement loginBtn=Driver.getDriver().findElement(By.name("_submit"));
        username.sendKeys(ConfigurationReader.getProperty("Storeusername"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }
}
