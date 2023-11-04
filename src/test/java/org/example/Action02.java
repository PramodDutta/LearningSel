package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Action02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        Thread.sleep(5000);


        WebElement fromCity = driver.findElement(By.id("fromCity"));

        Actions actions = new Actions(driver);
        // build().perform();
        // Click -> Sendkeys - Web Page - Inputbox Inputs Finish
        // build.perform()
        actions.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for(WebElement e: list_auto_complete){
            if(e.getText().contains("New Delhi")){
                e.click();
                break;
            }

        }









    }
}
