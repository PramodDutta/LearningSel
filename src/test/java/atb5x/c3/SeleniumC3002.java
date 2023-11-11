//package atb5x.c3;
//
//import io.qameta.allure.Owner;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class SeleniumC3002 {
//
//    EdgeDriver driver;
//    @BeforeTest
//    public void openBrowser(){
//        // Create Session via the API and Session ID is generated
//        driver = new EdgeDriver();
//
//    }
//
//    // contact+atb5x@thetestingacademy.com: ATBx@1234
//
//
//    @Owner("Promode")
//    @Test
//    public void testBrowser() throws InterruptedException {
//        //Launch the Browser with the URL mentioned!
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//        // Xpath and Css Selector
//        // Start a Free Trail -> Start ? - Try out and let me know
//
//        // Locator Strategy ( Find a unique element by using below mechanism)
//        // ID -> NAME -> ClassName -> TagName -> Css Selector -> Xpath
//        // Css Selector vs Xpath -> ideal -> css Selector,
//        // But nowdays 4 GB> ram -> xpath / css same. performance almost same.
//
//
//
//        // Xpath
//        // XML based Language to find the elements in Tag Based Document
//        // HTML -> also Tag based Document - Yes/ no
//        // ##  //tagName[@attribute='value']
//        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi" data-gtm-form-interact-field-id="0">
//        // <input type="email" class="text-input W(100%)" name="username2" id="login-username2" data-qa="hocewoqisia" data-gtm-form-interact-field-id="0">
//        //
//        //  ##   //input[@id="login-username"]
//        // ##   //input[@name="username"]
//        //  ##   //input[@data-qa="hocewoqisi"]
//
//        // Performance  -
//        //*[@id="js-login-confirm-email"] -> *  find all the tags where id = js-login
//        //input[@id="login-username"] -> find all the inputs where id - login-username
//
//        // Xpath Functions and Xpath Axes - 95% time - you will be able to find the element
//
//        // https://katalon-demo-cura.herokuapp.com/
//
////        WebElement make_app_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
//
//        // Not recomm - Please don't use them
////        WebElement make_app_btn = driver.findElement(By.xpath("/html/body/header/div/a"));
//
//
//
//        WebElement verb = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/parent::div"));
//        WebElement verb = driver.findElement(By.cssSelector("#btn-make-appointment"));
//        System.out.println(verb.getText());
//        //list_make_app_btn.get(1).click();
//
//        Thread.sleep(3000);
//
//        // Mammal  - precending - Fish  - //div[@class="Mammal"]/preceding::div
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//    @AfterTest
//    public void closeBrowser(){
//        driver.quit();
//    }
//}
