package com.tta.vwo.tests;

import com.tta.vwo.pages.pageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest2 {
    @Test
    public void test_vwo(){
        WebDriver driver = new ChromeDriver();
        new LoginPage(driver).loginToVWO("93npu2yyb0@esiix.com","Wingify@123");
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("Dashboard"));

    }
}
