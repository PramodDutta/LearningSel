package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;

public class Selenium05 {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://app.vwo.com");

        // Find the elements
        // do some actions

        // ID,name, className, tagName, Partial Text and lINK Text

//        <input
//                type="email"
//               class="text-input W(100%)"
//               name="username"
//               id="login-username"
//               data-qa="hocewoqisi"
//        >


        // Aim to put email id into the username input box
        // id > name > className > css Selector > xpath >  partial Text > link
        // Unique ID
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("93npu2yyb0@esiix.com");

        // <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Wingify@123");

        //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">

        WebElement submitButton = driver.findElement(By.xpath("//button[@data-qa=\"sibequkica\"]"));
        WebElement submitButton2 = driver.findElement(By.xpath("//*[@data-qa=\"sibequkica\"]"));



        submitButton.click();

        driver.quit();




    }
}
