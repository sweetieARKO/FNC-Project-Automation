package listofElement;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginwithWrongEmail {
    private final WebDriver driver;

    public LoginwithWrongEmail(WebDriver driver) {
        this.driver = driver;
    }

    private final By EmailField = By.xpath("//input[@name='loginfmt']");
    private final By Button = By.xpath("//input[@id='idSIButton9']");
    private final By PasswordField = By.xpath("(//input[@id='i0118'])[1]");
    private final By passwordButton = By.xpath("//input[@id='idSIButton9']");
    private final By VerifyCode = By.xpath("//*[@id='idSubmit_SAOTCC_Continue']");
    private final By UserNameError = By.xpath("//*[@id='usernameError']");
    public void EnterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        emailElement.sendKeys("isabella.wongamalitech.com");
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(Button));
        button.click();
    }

    public void verifywrongEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement wrongEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameError));
        String actualText = wrongEmail.getText();
        String expectedText = "We couldn't find an account with that username.";
        assertEquals(actualText, expectedText);
    }

    private void assertEquals(String actualText, String expectedText) {
        if(!actualText.equals(expectedText)){
            throw new AssertionError("Expected: '" + expectedText + "', but found: '" + actualText + "'");
        }
    else {
            System.out.println("Text is as expected");

        }
    }


}

