package Steps;

import Managers.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;


import java.io.FileNotFoundException;

public class Hooks extends WebDriverManager implements En {

    public final WebDriverManager manager;

    public Hooks(WebDriverManager manager) throws FileNotFoundException {
        this.manager = manager;
        Before((Scenario scenario) -> {
            System.out.println("This is before");
             driverInit();
            driver.switchTo().alert().accept();

        });
        After((Scenario scenario) -> {
            System.out.println("This is after");
              driver.quit();
        });

    }
}

//@Before
//    public void initBrowser()
//    {
//        manager.driverInit();
//        System.out.println("this is browser opening");
//
//    }
//    @After
//    public void closeBrowser(){

//        driver.quit();

//    }
//}
