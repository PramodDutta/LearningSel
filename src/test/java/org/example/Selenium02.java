package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Selenium02 {
    public static void main(String[] args) {

//        // Selenium Version < 4
//        // for Mac
//        System.setProperty("webdriver.chrome.driver", "/Users/pramod/Documents/driver/chromedriver");
//        // For Window
//        System.setProperty("webdriver.chrome.driver", "C://Users/pramod/Documents/driver/chromedriver.exe");
//        // Selenium Version > 4.x
//        // No need to Set-up the Driver

        ///Users/pramod/Downloads/adblocker.crx
        ChromeOptions options = new ChromeOptions();
        //options.setPageLoadStrategy() // 3 Load - Fast, Load, Medium Mode
        //options.setHeadless(true); // Headless - with No UI (while running the selenium Automation, You will not see UI)

        // Headless - Use it when you done with the Test case
        //options.addArguments("--headless=new");

        //options.addExtensions(new File("/Users/pramod/Downloads/adblocker.crx"));
        // to set the Window Size
        //options.addArguments("--window-size=1280,800");

        // Want to Maximum
        options.addArguments("--start-maximized");
//
//        // Disable extensions
//        options.addArguments("--disable-extensions");
//
//        // Disable browser notifications
//        options.addArguments("--disable-notifications");
//
//        // Disable JavaScript
//        options.addArguments("--disable-javascript");
//
//        // Set a specific language for the browser UI
//        options.addArguments("--lang=hi");


        // Disable infobars, such as "Chrome is being controlled by automated software"
        options.addArguments("--disable-infobars");


        // Set the download directory
        options.addArguments("--download.default_directory=/Users/pramod/Downloads/");

        // Disable Chrome's password manager
        options.addArguments("--disable-password-manager");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());

//
//
//        FirefoxOptions options2 = new FirefoxOptions()
//                .addPreference("browser.startup.page", 1)
//                .addPreference("browser.startup.homepage", "https://www.google.co.uk");
//
//        WebDriver driver2 = new FirefoxDriver(options2);


        //options.addArguments("--user-data-dir=/Users/pramod/Library/Application%20Support/Google/Chrome/Profile%205/");
        //driver.quit();





    }
}
