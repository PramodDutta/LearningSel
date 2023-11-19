package atb5x.c4;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


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


public class SeleniumC401 {

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
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();


        // Assert the Error
        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println("1 -> " + error_msg.getText());

        // text to be present on the js notification
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(error_msg, "Your email, password, IP address or location did not match"));

        // contains -> partial text -> textToBePresentInElement
        // equals -> same message match. -> textToBe

        System.out.println("2 -> " + error_msg.getText());


    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
