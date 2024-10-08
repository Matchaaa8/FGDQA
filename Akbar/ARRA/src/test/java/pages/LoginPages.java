package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPages {
    WebDriver driver;

    @FindBy(name = "username")
    private WebElement InputUsername;

    @FindBy(name = "password")
    private WebElement InputPassword;

    @FindBy(id = "btnLogin")
    private WebElement ButtonLogin;

    @FindBy(className = "logo")
    private WebElement LogoDashboard;

    public LoginPages(WebDriver webDrivers){
        driver = webDrivers;
        PageFactory.initElements(driver,this);
    }

    public void setInputUsername(String Username){
        InputUsername.sendKeys(Username);
    }

    public void setInputPassword(String Password){
        InputPassword.sendKeys(Password);
    }

    public void ClickButtonLogin(){
        ButtonLogin.click();
    }

    public void SuccessDirectDashboard(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(LogoDashboard));
        driver.quit();
    }
}
