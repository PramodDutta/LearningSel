package com.tta.vwo.pages.pageObjectFactory;

import com.tta.vwo.pages.pageObjectModel.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPagePF {

    WebDriver driver;

    // Page Locators - Object Repo
    @FindBy(id = "login-username")
    WebElement username;
    @FindBy(id = "login-password")
    WebElement password;

    @FindBy(id = "js-login-btn")
    WebElement signButton;


    @FindAll({
            @FindBy(tagName = "a"),
            @FindBy(tagName = "img")
    }
    )
    List<WebElement> list_of_anchor_images;

    @FindBy(partialLinkText = "Start a free trial")
    WebElement sign_uplink;


    // Error Page Locator - here
    @FindBy(id = "js-notification-box-msg")
    WebElement error_message;

    // We all it is fast, It is also problems
    // If element - stalelement -> cache
    // Nagivaate Login - Found - username
    // Dashboard -> LoginPage -> username, Stalement


    // Set up your Drivers
    public LoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    // Image, other link locator -> Not interested!!

    // Page Actions
    // Navigate to URL
    // Write some Text to email and password
    // Click on the Button
    // New Page -> Dashboard


    public void navigateToURL(String url) {
        driver.get(url);
    }

    public void writeToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void clickToElement(WebElement element) {
        element.click();
    }

    public void loginToVWO(String email, String password_sent) {
        writeToElement(username, email);
        writeToElement(password, password_sent);
        clickToElement(signButton);
    }

    public DashboardPage afterLogin() {
        return new DashboardPage(driver);
    }

    // Negative
    public String error_message_text() throws InterruptedException {
        Thread.sleep(5000);
        return error_message.getText();
    }

    public void test_find_all_elements() {
        // Loop through the elements and perform actions
        for (WebElement element : list_of_anchor_images) {
            System.out.println(element.getText());
        }
    }


}
