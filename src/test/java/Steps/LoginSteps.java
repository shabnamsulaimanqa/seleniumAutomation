package Steps;

import Managers.WebDriverManager;
import com.qa.pages.LoginPage;
import com.qa.util.Base;
import cucumber.api.java.Before;
import cucumber.api.java8.En;

import java.io.FileNotFoundException;

public class LoginSteps extends LoginPage implements En {
    public LoginSteps()  throws FileNotFoundException {
        WebDriverManager manager = new WebDriverManager();


        Given("^I am on home page$", () -> {
            System.out.println("This is home page");
//            driverInit();
//            manager.driverInit();
//            validateLogo();
            validateTitle();
        });
        When("^I enter ([^\"]*) and ([^\"]*)$", (String username , String password) -> {System.out.println("This is password test");
        });
        Then("^I successfully login to application$", () -> {System.out.println("This is last test");
        });

    }

}
