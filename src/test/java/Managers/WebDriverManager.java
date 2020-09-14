package Managers;

import com.qa.util.Base;
import com.qa.util.Constants;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class WebDriverManager extends Base {
    public static WebDriver driver;

    public WebDriverManager() throws FileNotFoundException {
    }

    public WebDriver driverInit(){
    String browsername = prop.getProperty("browser");
    if(browsername.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(Constants.Page_Load_Time, TimeUnit.SECONDS);
       driver.get(prop.getProperty("url"));
    }
        return driver;
}

}
