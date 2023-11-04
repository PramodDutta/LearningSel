package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ComplexSceanrio {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);

        List<WebElement> webElementList = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));

        new Actions(driver).moveToElement(webElementList.get(1)).click().perform();

        // here you will add logic until loading bar  not visible


        // Switch the Child Window
        // Move to the Iframe of Child
        // CLick on the CLickmap

        Set<String> windowsHandles = driver.getWindowHandles();

        Iterator<String> iterable = windowsHandles.iterator();
        while (iterable.hasNext()) {
            String childWindow = iterable.next();
            if (!mainWindowHandle.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.switchTo().frame("heatmap-iframe");

                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();


            }


        }


    }
}
