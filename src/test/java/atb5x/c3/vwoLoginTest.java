package atb5x.c3;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class vwoLoginTest {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

    @Owner("Promode")
    @Test
    public void testNegative() throws InterruptedException {
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        List<WebElement> button_submit = driver.findElements(By.xpath("//button[contains(@class,\"btn--positive\")]/span[text()=\"Sign in\"]"));
        button_submit.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());


        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

    }

    @Owner("Promode")
    @Test
    public void testPositive() throws InterruptedException {
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("contact+atb5x@thetestingacademy.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.clear();
        password.sendKeys("ATBx@1234");

        List<WebElement> button_submit = driver.findElements(By.xpath("//button[contains(@class,\"btn--positive\")]/span[text()=\"Sign in\"]"));
        button_submit.get(0).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement name_on_dashboard_page_ele = driver.findElement(By.xpath("//span[@data-qa=\"lufexuloga\"]"));
        System.out.println(name_on_dashboard_page_ele.getText());

        Assert.assertEquals(name_on_dashboard_page_ele.getText(), "Aman");

    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
