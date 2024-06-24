package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.signInUpPage.SignInsPage;
import utils.Hooks;

public class SignInSteps {


    final WebDriver driver;
    final SignInsPage signInPage;

    public SignInSteps() {
        this.driver = Hooks.driver;
        this.signInPage = new SignInsPage();
    }
    @Given("I am on the Sign In page")
    public void iAmOnTheSignInPage() {
        signInPage.OpenUrlsignInPage("https://app.eklipse.gg/login");
    }

    @When("I enter email {string} and password {string}")
    public void iEnterEmailAndPassword(String email, String password) {
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
    }

    @And("I click the sign in button")
    public void iClickTheSignInButton() {
        signInPage.clickSignInBtn();
    }

    @Then("I should see message {string}")
    public void iShouldSeeMessage(String popUpmessage) {
        String actualMessage = signInPage.getMessage();
        Assert.assertEquals(popUpmessage, actualMessage);
    }

    @And("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        String actualMessage = signInPage.getElementHome();
        Assert.assertEquals("Let’s Explore the Tools You’ll Love!",actualMessage);
    }

    //
    @When("I click sign up on logo Twitch")
    public void iClickSignUpOnLogoTwitch() {
    }

    @Then("I should see the application redirect to the Twitch sign up form")
    public void iShouldSeeTheApplicationRedirectToTheTwitchSignUpForm() {
    }

    @And("I enter email account twitch {string}")
    public void iEnterEmailAccountTwitch(String arg0) {
    }

    @And("I enter password account twitch {string}")
    public void iEnterPasswordAccountTwitch(String arg0) {
    }

    @Then("I should see the application redirect to the dashboard")
    public void iShouldSeeTheApplicationRedirectToTheDashboard() {
    }

    @When("I click sign up on logo Google")
    public void iClickSignUpOnLogoGoogle() {
    }

    @Then("I should see the application redirect to the Google sign up form")
    public void iShouldSeeTheApplicationRedirectToTheGoogleSignUpForm() {
    }

    @And("I enter email account google {string}")
    public void iEnterEmailAccountGoogle(String arg0) {
    }

    @And("I enter password account google {string}")
    public void iEnterPasswordAccountGoogle(String arg0) {
    }

    @When("I click sign up on logo Apple")
    public void iClickSignUpOnLogoApple() {
    }

    @Then("I should see the application redirect to the Apple sign up form")
    public void iShouldSeeTheApplicationRedirectToTheAppleSignUpForm() {
    }

    @And("I enter gmail account {string}")
    public void iEnterGmailAccount(String arg0) {
    }

    @And("I enter password gmail {string}")
    public void iEnterPasswordGmail(String arg0) {
    }

    @When("I click sign up on logo Facebook")
    public void iClickSignUpOnLogoFacebook() {
    }

    @Then("I should see the application redirect to the Facebook sign up form")
    public void iShouldSeeTheApplicationRedirectToTheFacebookSignUpForm() {
    }
}
