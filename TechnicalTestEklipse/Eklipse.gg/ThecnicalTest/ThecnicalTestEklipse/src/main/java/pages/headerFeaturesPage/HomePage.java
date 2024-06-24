// src/main/java/pages/HomePage.java

package pages.headerFeaturesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import utils.Hooks;

public class HomePage{
    private final WebDriver driver;


    public HomePage() {
        this.driver = Hooks.driver;
    }

    private By dropdownFeature = By.xpath("//a[.='Features']");
    private By actualElementGaming = By.xpath("//a[.='Gaming Stream Highlights']");
    private By actualElementContentPublisher = By.xpath("//a[.='Content Publisher']");
    private By actualElementAiBeta = By.xpath("//a[.='AI-Edit (Beta)']");
    private By actualElementEklipseStudio = By.xpath("//a[.='Eklipse Studio']");
    private By actualElementVoiceCommend = By.xpath("//a[.='Voice Command']");
    private By actualElementMobileApp = By.xpath("//a[.='Mobile App']");
    private By actualElementPremiumEditPage = By.xpath("//a[.='Pro Edits']");
    private By actualElementPremiumSupport = By.xpath("//a[.='Kick Support']");

    //use case expath
    private By dropdownUseCase = By.xpath("//a[.='Use Case']");
    private By actualElementCOD = By.xpath("//p[.='COD Streamers']");
    private By actualElementFortnite = By.xpath("//p[.='Fortnite Streamers']");
    private By actualElementApex = By.xpath("//p[.='Apex Streamers']");
    private By actualElementConsoleStreamer= By.xpath("//p[.='Console Streamers']");
    private By actualElementCheckoutMoreGames = By.xpath("//h3[@class='title']");
    public By actualElementSupport = By.xpath("//p[.='Connect Kick streams for the optimal experience']");
    public By actualElementProEdit= By.xpath("//p[.='Professional editing just for you']");

    //
    private By signUpBtn = By.xpath("//div[@class='header-main__col header-main__col--right']/a[contains(.,'Sign Up For Free')]");



    public void openHomePage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void moveToFeatures() {
        WebElement ElementFeatures = driver.findElement(dropdownFeature);
        Actions actions = new Actions(driver);
        actions.moveToElement(ElementFeatures).build().perform();
    }

    public String getElementLandingGaming() {
        return driver.findElement(actualElementGaming).getText();
    }

    public String getLandingPublisher() {
        return driver.findElement(actualElementContentPublisher).getText();
    }

    public String getLandingAiBeta () {
        return driver.findElement(actualElementAiBeta).getText();
    }
    public String getLandingEklipseStudio() {
        return driver.findElement(actualElementEklipseStudio).getText();
    }
    public String getLandingVoiceCommend () {
        return driver.findElement(actualElementVoiceCommend).getText();
    }
    public String getLandingMobileApp () {
        return driver.findElement(actualElementMobileApp).getText();
    }

    public String getLandingPremiumSupport () {
        return driver.findElement(actualElementPremiumSupport).getText();
    }
    public String getLandingPremiumProEdit () {
        return driver.findElement(actualElementProEdit).getText();
    }


    /*public void verifyElementMenuFeatures() {
        String expectedLandingGaming = "Gaming Stream Highlights";
        String actualLandingGaming = driver.findElement(actualElementGaming).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingGaming,actualLandingGaming);

        String expectedLandingPublisher = "Content Publisher";
        String actualLandingPublisher = driver.findElement(actualElementContentPublisher).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingPublisher,actualLandingPublisher);

        String expectedLandingAiBeta = "AI-Edit (Beta)";
        String actualLandingAiBeta = driver.findElement(actualElementAiBeta).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingAiBeta,actualLandingAiBeta);


        String expectedLandingEklipseStudio = "Eklipse Studio";
        String actualLandingEklipseStudio= driver.findElement(actualElementEklipseStudio).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingEklipseStudio,actualLandingEklipseStudio);

        String expectedLandingVoiceCommand = "Voice Command";
        String actualLandingVoiceCommand= driver.findElement(actualElementVoiceCommend).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingVoiceCommand,actualLandingVoiceCommand);

        String expectedLandingMobileApp = "Mobile App";
        String actualLandingMobileApp= driver.findElement(actualElementMobileApp).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingMobileApp,actualLandingMobileApp);

    }*/


    public void clickFeatureLandingGaming() {
        WebElement elementGaming = driver.findElement(actualElementGaming);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementGaming).click().build().perform();

    }


    public void clickFeatureLandingContentPublisher(){
        WebElement elementPublisher = driver.findElement(actualElementContentPublisher);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementPublisher).click().build().perform();
    }

    public void clickFeatureLandingAiEditBeta(){
        WebElement elementAiEdit = driver.findElement(actualElementAiBeta);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementAiEdit).click().build().perform();
    }

    public void clickFeatureLandingEklispe(){
        WebElement elementEklipse = driver.findElement(actualElementEklipseStudio);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementEklipse).click().build().perform();
    }

    public void clickFeatureLandingVoiceCommand(){
        WebElement elementVoiceCommand = driver.findElement(actualElementVoiceCommend);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementVoiceCommand).click().build().perform();
    }

    public void clickFeatureLandingMobileApp(){
        WebElement elementMobileApp = driver.findElement(actualElementMobileApp);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementMobileApp).click().build().perform();
    }

    public void clickFeatureLandingPremiumProEdit(){
        WebElement elementProEdit = driver.findElement(actualElementPremiumEditPage);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementProEdit).click().build().perform();
    }

    public void clickFeatureLandingPremiumSupport(){
        WebElement elementProEdit = driver.findElement(actualElementPremiumSupport);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementProEdit).click().build().perform();
    }


    // use case features
    public void moveToUseCase() {
        WebElement ElementFeaturesUseCase = driver.findElement(dropdownUseCase);
        Actions actions = new Actions(driver);
        actions.moveToElement(ElementFeaturesUseCase).build().perform();
    }

    public String getLandingPageCod () {
        return driver.findElement(actualElementCOD).getText();
    }

    public String getLandingPageApex() {
        return driver.findElement(actualElementApex).getText();
    }
    public String getLandingPageFortnite () {
        return driver.findElement(actualElementFortnite).getText();
    }
    public String getLandingPageStreamer () {
        return driver.findElement(actualElementConsoleStreamer).getText();
    }
    public String getLandingPageMoreGames () {
        return driver.findElement(actualElementCheckoutMoreGames).getText();
    }


    /*public void verifyElementMenuUseCase() {
        String expectedLandingCod = "COD Streamers";
        String actualLandingCod = driver.findElement(actualElementCOD).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingCod,actualLandingCod);

        String expectedLandingApex = "Apex Streamers";
        String actualLandingApex = driver.findElement(actualElementApex).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingApex,actualLandingApex);

        String expectedLandingFortnite = "Fortnite Streamers";
        String actualLandingFortnite = driver.findElement(actualElementFortnite).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingFortnite,actualLandingFortnite);


        String expectedLandingConsole = "Console Streamers";
        String actualLandingConsole= driver.findElement(actualElementConsoleStreamer).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingConsole,actualLandingConsole);

        String expectedLandingMoreGames = "Check out 200+ more games supported by Eklipse";
        String actualLandingMoreGames= driver.findElement(actualElementCheckoutMoreGames).getText();
        Assert.assertEquals("Menu item does not match",expectedLandingMoreGames,actualLandingMoreGames);

    }*/
    public void clickCOD() {
        WebElement ElementUseCaseCod= driver.findElement(actualElementCOD);
        Actions actions = new Actions(driver);
        actions.moveToElement(ElementUseCaseCod).click().build().perform();
    }

    public void clickSignUp() {
        driver.findElement(signUpBtn).click();
    }
}
