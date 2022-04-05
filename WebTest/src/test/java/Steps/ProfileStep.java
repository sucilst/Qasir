package Steps;

import Pages.ProfilePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ProfileStep extends ScenarioSteps {
    ProfilePage profilePage;

    public void pageProfil(){
        profilePage.pageProfil();
    }

    public void editProfil(){
        profilePage.editProfil();
    }

    public void saveProfilChange(){
        profilePage.saveProfilChange();
    }

    public void editSuccess(){
        profilePage.editSuccess();
    }
}
