package Test;

import Steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login {
    @Steps
    LoginStep loginStep;

    @Given("User open the Qasir page")
    public void userOpenTheGithubPage() {
        loginStep.UserOpenPage();
    }

    @When("Do Login")
    public void doLogin() {
        loginStep.clickTabEmail();
        loginStep.signIn();
    }

    @Then("Login Successfully")
    public void loginSuccess() {
        loginStep.validasiSignIn();
    }
}
