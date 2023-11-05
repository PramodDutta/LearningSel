package atb5x.c2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SeleniumC2004 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver(); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.get("https://sdet.live");

        driver.quit(); // 90%



        //driver.close(); // Close the Current Browser Window - not the full browser
        // driver.close(); // Closed the window, Session id != null, Error - Invalid session Id


//        driver.quit(); // Close all the /sessions/windows and stop the browser
//        driver.quit(); // Closed All the window and Session = null, Error - Session ID is null



    }
}
