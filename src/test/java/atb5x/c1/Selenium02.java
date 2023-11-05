package atb5x.c1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium02 {
    public static void main(String[] args) {

        // Selenium
        // Pom.xml -> 4.12

        //<dependency>
        //      <groupId>org.seleniumhq.selenium</groupId>
        //      <artifactId>selenium-java</artifactId>
        //      <version>4.10.0</version>
        //      <scope>compile</scope>
        //    </dependency>

        EdgeDriver driver = new EdgeDriver(); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");
        driver.close();













    }
}
