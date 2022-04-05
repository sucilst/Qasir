package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    @FindBy(id = "trigger-tab-email")
    WebElement TAB_EMAIL;

    @FindBy(id = "sign-in-email")
    WebElement EMAIL_TEXT;

    @FindBy(id = "password")
    WebElement PASSWORDL_TEXT;

    @FindBy(id = "submit-btn-signin")
    WebElement BUTTON_MASUK;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div/div/ul[1]/li/a/div/img")
    WebElement DASHBOARD;

    public void clickTabEmail(){
        TAB_EMAIL.click();
    }

    public void signIn(){
        EMAIL_TEXT.sendKeys("sucipds22@gmail.com");
        PASSWORDL_TEXT.sendKeys("230997");
        BUTTON_MASUK.click();
    }

    public void validasiSignIn(){
        DASHBOARD.isDisplayed();
    }
}
