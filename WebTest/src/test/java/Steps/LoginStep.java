package Steps;

import Pages.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginStep extends ScenarioSteps {
    LoginPage loginPage;

    public void UserOpenPage(){
        loginPage.open();
    }

    public void clickTabEmail(){
        loginPage.clickTabEmail();
    }

    public void signIn(){
        loginPage.signIn();
    }

    public void validasiSignIn(){
        loginPage.validasiSignIn();
    }
}
