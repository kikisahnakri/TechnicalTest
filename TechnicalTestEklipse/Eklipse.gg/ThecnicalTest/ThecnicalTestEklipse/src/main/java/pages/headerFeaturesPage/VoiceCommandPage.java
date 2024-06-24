package pages.headerFeaturesPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;

public class VoiceCommandPage {
    private final WebDriver driver;


    public VoiceCommandPage(){
        this.driver = Hooks.driver;
    }

    private By image = By.xpath("//div[@class='elementor-element elementor-element-ff27ca2 elementor-widget elementor-widget-image']//img[1]");

    public Boolean getLandingPage () {
        return driver.findElement(image).isDisplayed();
    }

    public void verifyLandingPageOfVoiceCommand() {
        boolean isElementDisplayed = driver.findElement(image).isDisplayed();
        Assert.assertTrue("Element is not displayed", isElementDisplayed);
    }
}
