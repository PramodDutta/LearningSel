package com.tta.vwo.pages.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    // Set up your Drivers
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }


    // Page Locators - Object Repo
    By username = By.id("login-username");
    By password = By.id("login-password" );
    By signButton = By.id("js-login-btn" );
    By sign_uplink= By.partialLinkText("Start a free trial");



    // Error Page Locator - here
    By error_message = By.id("js-notification-box-msg" );

    // Image, other link locator -> Not interested!!

    // Page Actions
    // Navigate to URL
    // Write some Text to email and password
    // Click on the Button
    // New Page -> Dashboard


    public void navigateToURL(String url){
        driver.get(url);
    }

    public void writeToElement(By element,String text){
        driver.findElement(element).sendKeys(text);
    }

    public void clickToElement(By element){
        driver.findElement(element).click();
    }

    public void loginToVWO(String email, String password_sent){
        writeToElement(username,email);
        writeToElement(password,password_sent);
        clickToElement(signButton);
    }

    public DashboardPage afterLogin(){
        return new DashboardPage(driver);
    }

    // Negative
    public String error_message_text() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(error_message).getText();
    }



}
