package pages.signInUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;

public class SignInsPage {

    private final WebDriver driver;

    public SignInsPage() {
        this.driver = Hooks.driver;
    }

    public By emailField = By.xpath("//input[@id='username']");
    public By passwordField = By.xpath("//input[@id='password']");
    public By signInButton = By.xpath("//button[@class='btn btn-primary special w-100']");
    public By popUpMessage = By.xpath("//div[@class='swal2-html-container m-0']/font[1]/font[.='Your account or password is incorrect. Reset or change your password.']");
    public By getElementHome = By.xpath("//div[@class='let-title']/font[1]/font[.='Let’s Explore the Tools You’ll Love!']");

    public void OpenUrlsignInPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInBtn() {
        driver.findElement(signInButton).click();
    }

    public String getMessage() {
        return driver.findElement(popUpMessage).getText();
    }

    public String getElementHome() {
        return driver.findElement(getElementHome).getText();
    }
}
