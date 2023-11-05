package atb5x.c1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium03 {
    public static void main(String[] args) {

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S


        // Selenium - Arch - API
        // Create Session, Commands or Functions -> API Request to Browser Driver (
        // Pass the commands as API


        // SearchContext driver = new ChromeDriver(); - GGF - this is useless - 2 functions
        // WebDriver driver = new ChromeDriver(); - this contains all the functions
        // RemoteWebDriver driver = new ChromeDriver(); - Fix to Remote

        // ChromeDriver driver = new ChromeDriver(); - We have all Chrome func but no the other functions
        //EdgeDriver driver = new EdgeDriver();


        // Scenarios
        // 1. Do want to run on  Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver();


        // 3. do you want to run on multiple browsers?
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)









    }
}
