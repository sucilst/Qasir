package Test;

import Steps.ProfileStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Profile {
    @Steps
    ProfileStep profileStep;

    @Given("Already in Profile Page")
    public void profilePage() {
        profileStep.pageProfil();
    }

    @When("Edit Profile")
    public void editProfile() {
        profileStep.editProfil();
        profileStep.saveProfilChange();
    }

    @Then("The Profile Successfully Edited")
    public void editSuccess() {
        profileStep.editSuccess();
    }
}
