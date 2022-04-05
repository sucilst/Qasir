package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class OutletPage extends PageObject {
    @FindBy(linkText = "Outlet")
    WebElement MENU_OUTLET;

    @FindBy(className = "p-header-title")
    WebElement OUTLET_PAGE;

    public void clickMenuOutlet(){
        MENU_OUTLET.click();
    }

    public void validasiPageOutlet(){
        OUTLET_PAGE.isDisplayed();
    }
}
