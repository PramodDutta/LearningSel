package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;


public class Selenium10 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

//        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
//
//        WebElement headerText = driver.findElement(By.xpath("//h1"));
//        WebElement emailId_CSS = driver.findElement(By.cssSelector("#login-username"));
//        WebElement emailClassName_CSS = driver.findElement(By.cssSelector(".className"));

        driver.get("https://awesomeqa.com/css/");

        List<WebElement> list_of_spans = driver.findElements(By.cssSelector("div.first > span"));
        System.out.println(list_of_spans.get(2).getText());


//
//        List<WebElement> headerText2 = driver.findElements(By.xpath("//div[@class=\"Mammal\"]/child::div"));
//        System.out.println(headerText.getText());


    }
}
