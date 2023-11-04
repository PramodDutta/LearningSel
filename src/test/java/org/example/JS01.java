package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS01 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/add_remove_elements/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.cssSelector("[onclick=\"addElement()\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",button);


        driver.get("https://thetestingacademy.com");
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


        WebElement ele = driver.findElement(By.xpath("//body/section[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
        js.executeScript("arguments[0].scrollIntoView(true)",ele);






    }
}
