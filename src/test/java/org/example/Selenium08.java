package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Selenium08 {


    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");

        // Link Text and Partial Link Text

        // a - anchor
        // <a href="http://app.vwo.com >Login to VWO</a>
        WebElement startTrial = driver.findElement(By.linkText("Start a free trial"));
        //startTrial.click();

        WebElement readLink = driver.findElement(By.partialLinkText("Read about"));
        readLink.click();











    }
}
