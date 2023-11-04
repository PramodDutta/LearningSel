package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Window01 {

    public static void main(String[] args) {



        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/windows");


        // Store the handle of the current window
        String mainWindowHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        // 2 Windows

        // Store the handles of all open windows in a list
        Set<String> windowHandles = driver.getWindowHandles();


        for(String handle : windowHandles){
            // Switch the focus to each window in turn
            driver.switchTo().window(handle);

        }

        // Switch the focus back to the main window
        driver.switchTo().window(mainWindowHandle);









    }
}
