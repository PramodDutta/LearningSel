package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        //  //div[@data-testid=\"to-testID-origin\"]/div/div/input
        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().perform();
        actions.moveToElement(source).click().sendKeys(source,"DEL");

    }
}
