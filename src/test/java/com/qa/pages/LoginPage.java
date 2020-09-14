package com.qa.pages;

import Managers.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginPage extends WebDriverManager {

    public LoginPage() throws FileNotFoundException {
        PageFactory.initElements(driver, this);
//        driverInit();
    }

    @FindBy(id = "UserName")
    WebElement username;
    @FindBy(id = "txtPassword")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement loginBtn;
    @FindBy(xpath = "//img[contains(@class,'IndiciLogo')]")
    WebElement imageLogo;

    //Actions
    public String validateTitle() {
        System.out.println("This is git title" + driver.getTitle().toString());
        return driver.getTitle();


    }
    public Boolean validateLogo()
    {
        return imageLogo.isDisplayed();
    }
    public void closeAlert(){
        driver.switchTo().alert().dismiss();

    }
}
