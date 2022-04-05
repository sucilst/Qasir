package Test;

import Steps.OutletStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Outlet {
    @Steps
    OutletStep outletStep;

    @When("Click Menu Outlet")
    public void clickMenuOutlet() {
        outletStep.clickMenuOutlet();
    }

    @Then("Page Outlet successfully loaded")
    public void loginSuccess() {
        outletStep.validasiPageOutlet();
    }
}
