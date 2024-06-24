package pages.headerUseCasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Hooks;
public class CodStreamsPage {

    private final WebDriver driver;


    public CodStreamsPage(){
        this.driver = Hooks.driver;
    }


    private By title = By.xpath("//title[.='Convert your Call of Duty Gameplay Clip - Eklipse']");


    public String getTitle() {
        return driver.getTitle();
    }

    public void verifyPageCod(){
        String expectedTitle = "Convert your Call of Duty Gameplay Clip - Eklipse";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match",expectedTitle,actualTitle);
    }
}
