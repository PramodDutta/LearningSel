package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium12 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebElement element = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
//        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        elementPrompt.click();


        // AWS Machine , Docker - Alert loads very slow - Limited RAM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //String text = alert.getText();
        alert.sendKeys("PRAMOD");
        alert.accept();
        //alert.dismiss();
//        System.out.println(text);


        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: PRAMOD");
//        Assert.assertEquals(result,"You successfully clicked an alert");






    }
}
