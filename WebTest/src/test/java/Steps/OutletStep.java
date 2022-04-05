package Steps;

import Pages.OutletPage;
import net.thucydides.core.steps.ScenarioSteps;

public class OutletStep extends ScenarioSteps {
    OutletPage outletPage;

    public void clickMenuOutlet(){
        outletPage.clickMenuOutlet();
    }

    public void validasiPageOutlet(){
        outletPage.validasiPageOutlet();
    }
}
