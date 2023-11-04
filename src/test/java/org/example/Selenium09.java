package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class Selenium09 {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");


        WebElement makeAppButton = driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]"));
        makeAppButton.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // ID, Name, ClasName, Xpath

        List<WebElement> userNamesInputBoxes = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        userNamesInputBoxes.get(1).sendKeys("John Doe");

        WebElement passwordInputBox = driver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();
        

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");




//        driver.quit();




    }
}
