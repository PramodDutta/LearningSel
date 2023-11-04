package misc.svg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVG01 {
    public static void main(String[] args) {

        // //*[local-name()='svg']/*[local-name()='g' and @fill-rule="evenodd"]

        WebDriver driver = new ChromeDriver();
        // Open a webpage
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("AC");
        WebElement searchElement = driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='g' and @fill-rule=\"evenodd\"]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(searchElement).click().perform();
        searchElement.click();




    }
}
