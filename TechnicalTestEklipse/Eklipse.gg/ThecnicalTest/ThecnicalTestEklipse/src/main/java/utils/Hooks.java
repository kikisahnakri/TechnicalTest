package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://Dev/Selenium Java/eklipse/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

     /*   ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // Maximize window on start
        options.addArguments("disable-infobars"); // Disable info bars
        options.addArguments("disable-extensions"); // Disable extensions*/
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshotBytes, "image/png", "Screenshot on failure: " + scenario.getName());
            } catch (WebDriverException e) {
                System.err.println("WebDriverException while capturing screenshot: " + e.getMessage());
            }
        }
        if (driver != null) {
            driver.quit();
        }
    }


}

