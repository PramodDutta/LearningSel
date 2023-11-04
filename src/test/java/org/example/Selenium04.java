package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium04 {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //driver.get("www.sdet.live");
        //driver.get("https://sdet.live");

        driver.navigate().to("https://sdet.live");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
