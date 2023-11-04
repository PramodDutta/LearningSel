package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables01 {
    public static void main(String[] args) {

        // Chrome for Testing
        // 4.11 - Selenium managers
        WebDriver driver = new ChromeDriver();
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // Table - //table[@id="customers"]
        // Row - //table[@id="customers"]/tbody/tr - 7 Rows, 1 Headgin ( row -1 )
        // Col - //table[@id="customers"]/tbody/tr[2]/td


        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);


        // //tbody/tr[2]/td[1] //tbody/tr[2]/td[1] //tbody/tr[2]/td[1]
        // //tbody/tr[3]/td[1] //tbody/tr[3]/td[3] //tbody/tr[3]/td[3]
        // //tbody/tr[4]/td[1] //tbody/tr[4]/td[3] //tbody/tr[4]/td[3]


        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for (int i = 2; i < row ; i++) {
            for (int j = 1; j < col ; j++) {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_xpath+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is In - " + country_text);
                }
            }

        }


        // Find Helen Bennett In Which Country



    }


}
