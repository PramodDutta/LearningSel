package atb5x.c4;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

class SeleniumC403 {

// Selenium Waits, Select, Alert, Checkbox, JavascriptExecutor
// WebTables,Window, Iframe, File Upload, SVG and Shadow DOM.


// Framework - Hybrid Framework - Allure - 80% Any, Ecom, Banking, Flow ( Mixture of Module, Data Driven)
// Cucumber BDD - Feature Files -> Code
// Run our code from Jenkins, Git -> Jenkins -> Selenium Grid( Local, AWS Cloud, BrowserStack/ LamdaTest)

// Ultimate Goal
// Pick Any application - Flow( +,- scenarios) -> Automation Scripts -> Git -> Jenkins Job -> Run your Test cases on Selenium Grid( Local, AWS Cloud, BrowserStack/ LamdaTest)
// VWO login
// Negative - Login -> Login error
// Positive  Login -> Dashboard Page
// 100 more also ( Dashboard Page, UI verification)


// Future
// Rest Assured into the Selenium Code.
// Mix your API + Web Automation Testcases
// Login VWO -> Dashboard Page -> Directly reach to Dashboard Page if you have access to Cookie
// Inject a Cookie into the Browser and Reach to the Dashboard page Directly.
// Login API, API Key -> Reach to other pages directly.


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() throws InterruptedException {

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Global wait to all the elements which we don't

        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("contact+atb5x@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("ATBx@1234");
        driver.findElement(By.id("js-login-btn")).click();



//        WebElement userName = driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));

        // text to be present on the js notification
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 95%
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-qa='lufexuloga']")));

        // contains -> partial text -> textToBePresentInElement
        // equals -> same message match. -> textToBe


        // Automation in the 32 GB, 16gb, 8gb -> polling -> resource allocation
        // 4 GB 2 GB -> Fluent Wait - Save
        // Ex w - IS EASY :), Jr also are able to understand

        // Fluent Wait
        // Condition but with the Polling period


        // 5 %
        FluentWait<EdgeDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        wait1.until(new Function<EdgeDriver, WebElement>() {
            @Override
            public WebElement apply(EdgeDriver edgeDriver) {
                return driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
            }
        });



        WebElement userName = driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        System.out.println("2 -> " + userName.getText());


    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
