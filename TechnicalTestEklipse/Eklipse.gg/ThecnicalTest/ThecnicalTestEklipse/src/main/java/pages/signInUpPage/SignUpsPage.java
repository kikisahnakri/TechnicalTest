package pages.signInUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;

public class SignUpsPage {

    private final WebDriver driver;

    public SignUpsPage() {
        this.driver = Hooks.driver;
    }


    public By usernameField = By.xpath("//input[@id='name']");
    public By emailField = By.xpath("//input[@id='email']");
    public By passwordField = By.xpath("//input[@id='password']");
    public By confirmPasswordField = By.xpath("//input[@id='password_confirmation']");
    public By signUpButton = By.xpath("//button[@class='btn btn-primary special w-100']");
    public By messageText = By.xpath("//div[@class='alert alert-danger text-center'] | //h1[@class='text-center']");


    public void OpenUrlsignUpPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public String getMessage() {
        return driver.findElement(messageText).getText();
    }
}
