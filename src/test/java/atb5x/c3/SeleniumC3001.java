package atb5x.c3;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumC3001 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();

    }

    // contact+atb5x@thetestingacademy.com: ATBx@1234


    @Owner("Promode")
    @Test
    public void testBrowser() {
        //Launch the Browser with the URL mentioned!
        driver.get("https://app.vwo.com");
        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        System.out.println(button_list);

        for(WebElement button : button_list){
            System.out.println(button.getText());
        }


//        WebElement link_text_start_tril = driver.findElement(By.linkText("Start a free trial"));
        WebElement link_text_start_tril = driver.findElement(By.partialLinkText("Start a free"));
        link_text_start_tril.click();
        // anchor - HTML Tage a -> click, submit, getText.

        // locator
        // ID, CLASS, CLASSnaE, taGnaME, lIKtEXT, partialText - 40%
        // Css Selectos , Xpath (xpath Axes)- 60%

        // Xpath and Css Selector - 80% Automation sCEIPTS easily











    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
