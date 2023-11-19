package atb5x.c4;

import io.qameta.allure.Owner;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumC404 {


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() throws InterruptedException {

//        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.manage().window().maximize();
//
//        WebElement element = driver.findElement(By.id("dropdown"));
//        Select select = new Select(element);
//        select.selectByVisibleText("Option 2");
//
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
////        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
//
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("Pramod");
//        alert.accept();
//
//        String result = driver.findElement(By.id("result")).getText();
//        System.out.println(result);

//        // Model ( It should be in the iframe)
//        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
//
//        // Iframe

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> allCheck = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkbox : allCheck) {
            // Check the checkbox if it is not already checked
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }










    }


    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }


}

