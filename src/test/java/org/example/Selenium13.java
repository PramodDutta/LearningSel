package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class Selenium13 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement checkBoxes1 = checkBoxes.get(0);
        checkBoxes1.click();

    }
}
