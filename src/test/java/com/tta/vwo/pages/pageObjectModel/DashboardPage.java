package com.tta.vwo.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    // Set up your Drivers
    WebDriver driver;

    public DashboardPage(WebDriver driver){

        this.driver = driver;
    }


    // Page Locators
    By userNameOnDashboard = By.xpath("//span[@data-qa=\"lufexuloga\"]");




    // Page Actions
    public String loggedInUserName() throws InterruptedException {
        Thread.sleep(10000);
        return driver.findElement(userNameOnDashboard).getText();
  }


}
