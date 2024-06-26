package PageClasess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class mine {
    WebDriver driver;

    public void setUpDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String Title = driver.getTitle();
        String Title2 = "Google";
        Assert.assertEquals(Title, Title2);
        driver.quit(); // Close the browser after the test
    }

    public static void main(String[] args) {
        mine test = new mine();
        test.setUpDriver();
    }
}
