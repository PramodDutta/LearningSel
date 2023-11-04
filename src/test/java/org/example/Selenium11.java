package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selenium11 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        // //div[@class='example']/select - XPATH
        Select select = new Select(element);

        //select.selectByIndex(1);
        select.selectByVisibleText("Option 2");



    }
}
