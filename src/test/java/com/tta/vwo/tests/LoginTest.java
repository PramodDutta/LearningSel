package com.tta.vwo.tests;

import com.tta.vwo.pages.pageObjectFactory.LoginPagePF;
import com.tta.vwo.pages.pageObjectModel.DashboardPage;
import com.tta.vwo.pages.pageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void test_vwo_negative() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        LoginPage loginPage= new LoginPage(driver);
        LoginPagePF loginPage= new LoginPagePF(driver);
        loginPage.navigateToURL("https://app.vwo.com");
        loginPage.loginToVWO("contact+augg@thetestingacademy","Wingify@123");
        String error_text = loginPage.error_message_text();
        Assert.assertEquals(error_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void test_vwo_positive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.navigateToURL("https://app.vwo.com");
        loginPage.loginToVWO("contact+augg@thetestingacademy.com","Wingify@123");
        DashboardPage dashboardPage = loginPage.afterLogin();
        String username_expected = dashboardPage.loggedInUserName();
        Assert.assertEquals(driver.getCurrentUrl(),"Dashboard");
        Assert.assertEquals(username_expected,"dasdad dasdad");
        driver.quit();

    }
}
