package atb5x.c2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariOptions;

public class SeleniumC2001 {
    public static void main(String[] args) {

//        // If you are using Selenium < 4.6 or selenium 3.14 ( 40%)
//        // Edge
//        System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
//        // Firefox
//        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//        // Chrome
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        // IE
//        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
//        // Safari
//        System.setProperty("webdriver.safari.driver", "path/to/safaridriver");
//




        // Selenium 4.10 - Selenium Manager - will automatically download the Drivers all
        // when needed when you start the Selenium server.




        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=800,600");
        //edgeOptions.setHeadless(true);
        EdgeDriver driver = new EdgeDriver(edgeOptions); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

//
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        SafariOptions safariOptions = new SafariOptions();
//        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
//

    }
}
