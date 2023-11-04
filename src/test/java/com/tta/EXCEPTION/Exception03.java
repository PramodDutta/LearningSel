package com.tta.EXCEPTION;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exception03 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Open a webpage
        driver.get("http://app.vwo.com");

        WebElement element = driver.findElement(By.id("login-username"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].parentNode.removeChild(arguments[0]);", element);
        element.click();


    }
}
