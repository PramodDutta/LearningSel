package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;


public class Selenium06 {

    // 2 Test cases

    // One Negative - Invalid Username, password -> Error
    // One Positive - Valid Username, password -> Dashboard Page

    ChromeOptions options;
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }


    @Test(priority = 1, groups = {"negative", "sanity", "reg"})
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC#1 - Verify that with Invalid username and Valid password, Login is not successfull !!")
    public void testInvalidLogin() throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.co");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();

        //contact+atb5x@thetestingacademy.com: ATBx@1234

//        Thread.sleep(2000);
//
//        WebElement errorMessgae = driver.findElement(By.className("notification-box-description"));
//        // 3 seconds
//        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(errorMessgae));


        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement errorMessgae2 = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });


            // (1-5) - Fine  , 6 -> Exp


            // Another - F  - 10, 2, -> 5
            //  areYouavaibale after 2 - > visible ?


            // Assertion
            // Expected Result == Actual Result

            String errorString = driver.findElement(By.className("notification-box-description")).getText();
            Assert.assertEquals(errorMessgae2.getText(), "Your email, password, IP address or location did not match");


        }

        @Test(enabled = false, priority = 2, groups = {"positive", "sanity", "smoke"})
        @Description("Verify that with Valid username and Valid password, Login is successfull !!")
        public void testValidLogin () throws InterruptedException {

            // ID, Name, ClassName -> CssSelector, Xppath - Firefox or Chrome
            // xpath. CSS Selector -> Chrome, will not work Firefox.


            driver.get("https://app.vwo.com/#/login");
            driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
            driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
            driver.findElement(By.id("js-login-btn")).click();


            // Wait
            Thread.sleep(2000);


            // Assertion
            // Expected Result == Actual Result

            Assert.assertEquals(driver.getTitle(), "Dashboard");
            Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/dashboard");

            driver.get("https://app.vwo.com/logout");


        }

        @AfterSuite
        public void tearDown () {
            driver.quit();
        }


    }
