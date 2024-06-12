package listofElement;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private final WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private final By EmailField = By.xpath("//input[@name='loginfmt']");
    private final By Button = By.xpath("//input[@id='idSIButton9']");
    private final By PasswordField = By.xpath("(//input[@id='i0118'])[1]");
    private final By passwordButton = By.xpath("//input[@id='idSIButton9']");
    private final By VerifyCode = By.xpath("//*[@id='idSubmit_SAOTCC_Continue']");
    public void EnterEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        emailElement.sendKeys("isabella.wong@amalitech.com");
        WebElement button = driver.findElement(Button);
        button.click();

    }

    public void EnterPassWord() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        Password.sendKeys("@RMS@003");
        WebElement button = driver.findElement(passwordButton);
        button.click();

    }

    public int EnterTwoTabCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement codeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("otc")));
        int totpCode = TOTPExample();
        codeInput.sendKeys(String.valueOf(totpCode));
        return totpCode;
    }


        public static int TOTPExample() {
            GoogleAuthenticator gAuth = new GoogleAuthenticator();
            return gAuth.getTotpPassword("rsg22dffmfhh6kbt");
        }
        public void ClickOnVerifyButton(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement verify = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyCode));
         verify.click();
        }
        public boolean verifyUrl(String expectedUrl){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl);
        }
    }


