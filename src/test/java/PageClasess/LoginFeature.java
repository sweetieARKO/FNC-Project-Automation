package PageClasess;

import io.github.bonigarcia.wdm.WebDriverManager;
import listofElement.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFeature {
    WebDriver driver;

    @BeforeTest
    public void setUpDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://arms-fnc-frontend.amalitech-dev.net/login");
        // Initialize your WebDriver here, for example:
        // driver = new ChromeDriver();
        // Add necessary WebDriver setup code here
    }
    @Test
    public void login(){
        Login signin = new Login(driver);
        signin.EnterEmail();
        signin.EnterPassWord();
        signin.EnterTwoTabCode();
        signin.ClickOnVerifyButton();
        signin.verifyUrl("https://arms-fnc-frontend.amalitech-dev.net/dashboard");
    }
}
