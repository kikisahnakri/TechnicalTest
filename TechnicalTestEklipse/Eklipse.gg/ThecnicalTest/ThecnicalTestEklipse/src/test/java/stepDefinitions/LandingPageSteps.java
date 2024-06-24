package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.headerFeaturesPage.*;
import pages.headerUseCasePage.CodStreamsPage;
import utils.Hooks;

public class LandingPageSteps {

    final WebDriver driver;
    final HomePage homePage;
    final GamingStreamPage gamingPage;
    final ContentPublisherPage publisherPage;
    final AiBetaPage aiEditPage;
    final EklipseStudioPage eklipsePage;
    final VoiceCommandPage voicePage;
    final MobileAppPage mobilePage;
    final Premium_ProEditPage premEditPage;
    final Premium_KickSupportPage premSupportPage;
    final CodStreamsPage codPage;

    public LandingPageSteps() {
        this.driver = Hooks.driver;
        this.homePage = new HomePage();
        this.gamingPage = new GamingStreamPage();
        this.publisherPage = new ContentPublisherPage();
        this.aiEditPage = new AiBetaPage();
        this.eklipsePage = new EklipseStudioPage();
        this.voicePage = new VoiceCommandPage();
        this.mobilePage = new MobileAppPage();
        this.premEditPage = new Premium_ProEditPage();
        this.premSupportPage = new Premium_KickSupportPage();
        this.codPage = new CodStreamsPage();
    }


    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        homePage.openHomePage("https://eklipse.gg/");
    }

    @When("I hover over the dropdown features")
    public void i_drag_mouse_to_dropdown_feature() {
        homePage.moveToFeatures();
    }

    @Then("I should see the list of free features in the menu")
    public void i_should_see_list_the_menu_of_the_free_feature() {
        String expectedLandingGaming = "Gaming Stream Highlights";
        String actualLandingGaming = homePage.getElementLandingGaming();
        Assert.assertEquals(expectedLandingGaming,actualLandingGaming);

        String expectedLandingPublisher = "Content Publisher";
        String actualLandingPublisher = homePage.getLandingPublisher();
        Assert.assertEquals(expectedLandingPublisher,actualLandingPublisher);

        String expectedLandingAiBeta = "AI-Edit (Beta)";
        String actualLandingAiBeta = homePage.getLandingAiBeta();
        Assert.assertEquals(expectedLandingAiBeta,actualLandingAiBeta);

        String expectedLandingEklipseStudio = "Eklipse Studio";
        String actualLandingEklipseStudio= homePage.getLandingEklipseStudio();
        Assert.assertEquals(expectedLandingEklipseStudio,actualLandingEklipseStudio);

        String expectedLandingVoiceCommand = "Voice Command";
        String actualLandingVoiceCommand= homePage.getLandingVoiceCommend();
        Assert.assertEquals(expectedLandingVoiceCommand,actualLandingVoiceCommand);

        String expectedLandingMobileApp = "Mobile App";
        String actualLandingMobileApp= homePage.getLandingMobileApp();
        Assert.assertEquals(expectedLandingMobileApp,actualLandingMobileApp);

    }

    @And("I click on Gaming Stream Highlight")
    public void i_click() {
        homePage.clickFeatureLandingGaming();
    }

    @Then("I should see the application redirect to the Gaming Stream Highlight page")
    public void iShouldSeeApplicationRedirectToPageOfGamingStreamHightlight() {
        String expectedHeading = "Turn Gaming Streams into TikToks with AI";
        String actualHeading = gamingPage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }


    @And("I click on Content Publisher")
    public void iClickContentPublisher() {
        homePage.clickFeatureLandingContentPublisher();
    }

    @Then("I should see the application redirect to the Content Publisher page")
    public void iShouldSeeApplicationRedirectToPageOfContentPublisher() {
        //publisherPage.verifyLandingPageOfContentPublisher();
        String expectedHeading = "Content Publisher";
        String actualHeading = publisherPage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @And("I click on Ai-Edit")
    public void iClickOnAiEdit() {
        homePage.clickFeatureLandingAiEditBeta();
    }

    @Then("I should see the application redirect to the Ai-Edit \\(Beta) page")
    public void iShouldSeeTheApplicationRedirectToTheAiEditBetaPage() {
        //aiEditPage.verifyLandingPageOfAiBeta();
        String expectedHeading = "Automate Your Editing Process\n" +
                "With AI Video Edit:";
        String actualHeading = aiEditPage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @And("I click on Eklipse Studio")
    public void iClickOnEklipseStudio() {
        homePage.clickFeatureLandingEklispe();
    }

    @Then("I should see the application redirect to the Eklipse Studio page")
    public void iShouldSeeTheApplicationRedirectToTheEklipseStudioPage() {
        //eklipsePage.verifyLandingPageOfEklispe();
        String expectedHeading = "Repurpose Video Content, Instantly with Eklipse Studio!";
        String actualHeading = eklipsePage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @And("I click on Voice Command")
    public void iClickOnVoiceCommand() {
        homePage.clickFeatureLandingVoiceCommand();
    }

    @Then("I should see the application redirect to the Voice Command page")
    public void iShouldSeeTheApplicationRedirectToTheVoiceCommandPage() {
        //voicePage.verifyLandingPageOfVoiceCommand();
        boolean isElementDisplayed = voicePage.getLandingPage();
        Assert.assertTrue("Element is not displayed", isElementDisplayed);

    }

    @And("I click on Mobile App")
    public void iClickOnMobileApp() {
        homePage.clickFeatureLandingMobileApp();
    }

    @Then("I should see the application redirect to the Mobile App page")
    public void iShouldSeeTheApplicationRedirectToTheMobileAppPage() {
       // mobilePage.verifyLandingPageOfMobileApp();
        String expectedHeading = "Eklipse Mobile app is Here";
        String actualHeading = mobilePage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @Then("I should see the list of premium features in the menu")
    public void iShouldSeeTheListOfPremiumFeaturesInTheMenu() {
       // homePage.verifyElementMenuFeatures();
        String expectedLandingSup = "Connect Kick streams for the optimal experience";
        String actualPreSup = homePage.getLandingPremiumSupport();
        Assert.assertEquals(expectedLandingSup,actualPreSup);

        String expectedPro = "Professional editing just for you";
        String actualPro = homePage.getLandingPremiumProEdit();
        Assert.assertEquals(expectedPro,actualPro);
    }

    @And("I click on Pro Edits")
    public void iClickOnProEdits() {
        homePage.clickFeatureLandingPremiumProEdit();

    }

    @Then("I should see the application redirect to the premium feature of Pro Edit page")
    public void iShouldSeeTheApplicationRedirectToThePremiumFeatureProEditPage() {
      //  premEditPage.verifyLandingPageOnPremiumPageProEdith();
        String expectedHeading = "Supercharge your Highlights\n" +
                "with Pro Edits!";
        String actualHeading = premEditPage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }


    @And("I click on Kick Support")
    public void iClickOnKickSupport() {
        homePage.clickFeatureLandingPremiumSupport();
    }


    @Then("I should see the application redirect to the premium feature of Kick Support page")
    public void iShouldSeeTheApplicationRedirectToThePremiumFeatureKickSupportPage() {
       // premSupportPage.verifyLandingPageOnKickSupport();
        String expectedHeading = "Eklipse Now Supports";
        String actualHeading = premSupportPage.getLandingPage();
        Assert.assertEquals(expectedHeading,actualHeading);
    }


    //use case feature
    @When("I drag the mouse to the dropdown Use Case")
    public void iDragTheMouseToTheDropdownUseCase() {
        homePage.moveToUseCase();
    }

    @Then("I should see the list of use case features in the menu")
    public void iShouldSeeTheListOfUseCaseFeaturesInTheMenu() {
       // homePage.verifyElementMenuUseCase();

        String expectedLandingCod = "COD Streamers";
        String actualLandingCod = homePage.getLandingPageCod();
        Assert.assertEquals("Menu item does not match",expectedLandingCod,actualLandingCod);

        String expectedLandingApex = "Apex Streamers";
        String actualLandingApex = homePage.getLandingPageApex();
        Assert.assertEquals("Menu item does not match",expectedLandingApex,actualLandingApex);

        String expectedLandingFortnite = "Fortnite Streamers";
        String actualLandingFortnite = homePage.getLandingPageFortnite();
        Assert.assertEquals("Menu item does not match",expectedLandingFortnite,actualLandingFortnite);


        String expectedLandingConsole = "Console Streamers";
        String actualLandingConsole= homePage.getLandingPageStreamer();
        Assert.assertEquals("Menu item does not match",expectedLandingConsole,actualLandingConsole);

        String expectedLandingMoreGames = "Check out 200+ more games supported by Eklipse";
        String actualLandingMoreGames= homePage.getLandingPageMoreGames();
        Assert.assertEquals("Menu item does not match",expectedLandingMoreGames,actualLandingMoreGames);

    }

    @And("I click on COD Streamers")
    public void iClickOnCODStreamers() {
        homePage.clickCOD();
    }

    @Then("I should see the application redirect to the premium feature of COD Streamers page")
    public void iShouldSeeTheApplicationRedirectToThePremiumFeatureOfCODStreamersPage() {
        //codPage.verifyPageCod();
        String expectedTitle = "Convert your Call of Duty Gameplay Clip - Eklipse";
        String actualTitle = codPage.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
