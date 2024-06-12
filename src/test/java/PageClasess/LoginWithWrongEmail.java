package PageClasess;

import io.github.bonigarcia.wdm.WebDriverManager;
import listofElement.Login;
import listofElement.LoginwithWrongEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithWrongEmail {
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
        public void loginWithWrongEmail(){
            LoginwithWrongEmail signin = new LoginwithWrongEmail(driver);
            signin.EnterEmail();
            signin.verifywrongEmail();

        }

}
