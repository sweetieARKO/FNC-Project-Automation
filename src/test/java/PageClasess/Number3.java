package PageClasess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Number3 {
    private WebDriver driver;

    // This method initializes the WebDriver, maximizes the browser window, and navigates to the URL
    public void work() {
        WebDriverManager.edgedriver().setup();  // Setup Edge WebDriver
        driver = new EdgeDriver();  // Create a new EdgeDriver instance
        driver.manage().window().maximize();  // Maximize the browser window
        driver.get("https://the-internet.herokuapp.com/dropdown");  // Navigate to the specified URL
    }

    // Main method to execute the work method
    public static void main(String[] args) {
        Number3 setting = new Number3();  // Create an instance of Number3
        setting.work();  // Call the work method to perform the tasks
    }
}
