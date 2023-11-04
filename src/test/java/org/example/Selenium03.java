package org.example;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium03 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());

        driver.close();
        // Close the Current Window
        // Session Id - != null;
        // Error - Invalid session Id
        driver.quit();
        // Closed All the window and
        // Session = null,
        // Error - Session ID is null


        System.out.println(driver.getTitle());




    }
}
