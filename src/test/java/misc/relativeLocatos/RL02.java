package misc.relativeLocatos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RL02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Open a webpage
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.switchTo().frame("result");

        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));

        submit.click();

        WebElement parent_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error = driver.findElement(with(By.tagName("small")).near(parent_element));
        System.out.println(error.getText());



    }
}
