package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

    public static void main(String[] args) {
            //

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload_file = driver.findElement(By.xpath("//input[@id='fileToUpload']"));
        upload_file.sendKeys("/Users/pramod/Downloads/MTC.jpg");

        driver.findElement(By.name("submit")).click();




    }
}
