package PageClasess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class number2 {
    WebDriver driver;

    public void setDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login"); // Corrected URL
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='Secure Area']")).isDisplayed();


    }

    public static void main(String[] args) {
        number2 instance = new number2();
        instance.setDriver();

        // Add more actions here if needed, for example, login actions
    }
}
