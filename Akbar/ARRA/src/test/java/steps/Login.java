package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPages;

public class Login {
    WebDriver driver;
    LoginPages loginpages;

    @Given("User Access URL")
    public void user_access_url() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        System.setProperty("webdriver.chrome.driver", "C:\\File Kerja\\Aplikasi\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://192.168.1.42:8081/login");
        loginpages = new LoginPages(driver);
    }
    @When("User Input Username Valid")
    public void user_input_username_valid() {
        loginpages.setInputUsername("usermaker");
    }

    @And("User Input Password Valid")
    public void user_input_password_valid() {
        loginpages.setInputPassword("P@ssw0rd");
    }

    @Then("User Click Button Login")
    public void user_click_button_login() {
        loginpages.ClickButtonLogin();
    }

    @And("User Success To Login")
    public void user_success_to_login() {
        loginpages.SuccessDirectDashboard();
    }

}
