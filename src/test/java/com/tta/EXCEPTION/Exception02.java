package com.tta.EXCEPTION;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Open a webpage
        driver.get("http://google.com");
        WebElement search = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        try {
            driver.navigate().refresh();
            // Webdeiver -> Search it may be disconnect from the DOM, since Refresh or Navigate to other page
            // forward back forward -> Element disconnect from the DOM (html page)


            search.sendKeys("The Testing Academy" + Keys.RETURN);

        } catch (StaleElementReferenceException e){
            System.out.println("Stale element found!!");
            WebElement search2 = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
            search2.sendKeys("The Testing Academy" + Keys.RETURN);
        }


    }
}
