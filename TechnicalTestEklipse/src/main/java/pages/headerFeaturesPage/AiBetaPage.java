package pages.headerFeaturesPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;

public class AiBetaPage {

    private final WebDriver driver;


    public AiBetaPage(){
        this.driver = Hooks.driver;
    }

    private By h1 = By.xpath("//h1[.='Automate Your Editing ProcessWith AI Video Edit:']");


    public String getLandingPage () {
        return driver.findElement(h1).getText();
    }

    public void verifyLandingPageOfAiBeta(){
        String expectedHeading = "Automate Your Editing Process\n" +
                "With AI Video Edit:";
        String actualHeading = driver.findElement(h1).getText();
        Assert.assertEquals("Heading does not match",expectedHeading,actualHeading);
    }
}
