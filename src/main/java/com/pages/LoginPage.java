package com.pages;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    //By Locators
    private By userName = By.id("user-name");
    private By passWord = By.id("password");
    private By loginButton = By.id("login-button");

    //constructor of the page Class
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // page actions: features(behavior) of the page in the form of methods
    public String getLoginPageTittle(){
        return driver.getTitle();
    }

    public void enterUsername(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }

    public CartPage doLogin(String uName, String pass){
        DriverFactory.getDriver().get("https://www.saucedemo.com");
        driver.findElement(userName).sendKeys(uName);
        driver.findElement(passWord).sendKeys(pass);
        driver.findElement(loginButton).click();
        return new CartPage(driver);
    }


}
