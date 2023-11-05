package atb5x.c2;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumC2006 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();
        //Launch the Browser with the URL mentioned!
        driver.get("https://app.vwo.com");
    }


    @Owner("Promode")
    @Test
    public void negativeTC() {

        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi" data-gtm-form-interact-field-id="0">


        // <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe" data-gtm-form-interact-field-id="1">

        // <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //
        //								</button>


        //      <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>


        // Flow to Automation
        // Navigate to URL
        // Find the First Element username and enter the email Id
        // Find the Second Element username and enter the password
        // Find the Third Element username and click / submit
        // Verify that error should come



        // Print the URl
        System.out.println(driver.getCurrentUrl());

        // Print the Title
        System.out.println(driver.getTitle());

        // Page Load Strateryg - Normal it nature, which all resource will load, we will wait for all
        // resources to load.

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        // It is bad practice - right now it fine. ->
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
