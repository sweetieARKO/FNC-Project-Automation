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
        System.out.println(  driver.getCurrentUrl());
        System.out.println(     driver.getTitle());
         }
    @Test
    public void loginWithCorrectCredentials(){
        Login signin = new Login(driver);
        signin.EnterEmail();
        signin.EnterPassWord();
        signin.EnterTwoTabCode();
        signin.ClickOnVerifyButton();
        signin.verifyUrl("https://arms-fnc-frontend.amalitech-dev.net/dashboard");

    }
}