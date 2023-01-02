package com.dotdash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text()=' Login']")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void login(String userName, String password){
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
