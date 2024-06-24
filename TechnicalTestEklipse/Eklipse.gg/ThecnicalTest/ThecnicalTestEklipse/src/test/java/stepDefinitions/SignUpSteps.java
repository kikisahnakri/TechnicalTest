package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.signInUpPage.SignUpsPage;
import utils.Hooks;


public class SignUpSteps {

    final WebDriver driver;
    final SignUpsPage signUpPage;

    public SignUpSteps() {
        this.driver = Hooks.driver;
        this.signUpPage = new SignUpsPage();
    }

    @Given("I am on the Sign Up page")
    public void iAmOnTheRegistrationPage() {
        signUpPage.OpenUrlsignUpPage("https://app.eklipse.gg/register");
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        signUpPage.enterUsername(username);
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        signUpPage.enterEmail(email);
    }

    @When("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        signUpPage.enterPassword(password);
    }

    @When("^I confirm password \"([^\"]*)\"$")
    public void iConfirmPassword(String confirmPassword) {
        signUpPage.confirmPassword(confirmPassword);
    }

    @When("I click the register button")
    public void iClickTheRegisterButton() {
        signUpPage.clickSignUpButton();
    }

    @Then("^I should see a message saying \"([^\"]*)\"$")
    public void iShouldSeeAMessageSaying(String message) {
        String actualMessage = signUpPage.getMessage();
        Assert.assertEquals(message, actualMessage);
    }
}
