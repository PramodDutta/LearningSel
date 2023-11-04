package com.tta.EXCEPTION;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exception01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Open a webpage
        driver.get("http://app.vwo.com");

        try {
            WebElement element = driver.findElement(By.id("nonexistent-element"));
            element.click();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }

        System.out.println("My other code");


        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement checkBoxes1 = checkBoxes.get(0);
        checkBoxes1.click();



        // Switch to a frame that does not exist on the page
        try {
            driver.switchTo().frame(1);
        }catch (Exception e){
            System.out.println("No idea about the Exception so parent Exception");
        }

        // Attempt to accept an alert that is not present on the page
//            driver.switchTo().alert().accept();
        //element = driver.findElement(By.id("invisible-element"));
        // display:none
//



    }
}
