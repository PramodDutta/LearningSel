package atb5x.c4;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.qameta.allure.Owner;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.List;

public class SeleniumC405 {


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();

    }

    @Owner("Promode")
    @Test
    public void testBrowser() throws InterruptedException {
        // Who is in Google
        driver.get("https://awesomeqa.com/webtable.html");

        // How to Fetch To Table?
        // Xpath -> //table[@id="customers"], CSS Selector, ID
        // If something is Dynamic In nature - //table[contains@id,"cust"]
        // ByTageName - table - 1 table only

        // Row , Col
        // Number of Rows and Column in table
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println(row);
        System.out.println(col);

        // //table[@id='customers']/tbody/tr[i]/td[j]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.print(data +" ");
                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is In - " + country_text);
                }

            }

        }








        // Google In Which Country
        // Find Helen Bennett In Which Country

    }


    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }


}





