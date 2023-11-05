package atb5x.c1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class Selenium04 {
    public static void main(String[] args) {

        // Selenium 4.6 ? Nothing is required

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("/Users/pramod/Documents/Code/TKRepo/LearningSel/src/test/java/atb5x/adblockeredge.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");



    }
}
