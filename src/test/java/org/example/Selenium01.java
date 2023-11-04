package org.example;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium01 {
    public static void main(String[] args) {

//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://sdet.live");

        //  SearchContext - Interface - findElement, and findElement
        // WebDriver
        // RemoteWebDriver
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver

        // Selenium - Arch - API
        // Create Session
        // Pass the commands as API



        //SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver = new ChromeDriver();


        // ChromeDriver driver = new ChromeDriver();

        // RemoteWebDriver remoteWebDriver = new RemoteWebDriver() - Multiple Run of different browser
        // Selenium Gird


        WebDriver driver = new ChromeDriver();
        // It will allow you to choose driver at Runtime by Grid
        // Hardcoding the ChromeDriver
        driver.get("https://sdet.live");
        driver.quit();

        // Quit and Close - Interview 










    }
}
