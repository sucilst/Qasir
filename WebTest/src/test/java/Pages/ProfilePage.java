package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProfilePage extends PageObject {
    @FindBy(xpath = "/html/body/div[4]/div[1]/div/div/ul[1]/li/a/div/img")
    WebElement ICON_ACCOUNT;

    @FindBy(linkText = "Profil Pengguna")
    WebElement MENU_PROFIL_PENGGUNA;

    @FindBy(name = "first_name")
    WebElement FIRST_NAME;

    @FindBy(name = "last_name")
    WebElement LAST_NAME;

    @FindBy(name = "mobile")
    WebElement MOBILE;

    @FindBy(name = "email")
    WebElement EMAIL;

    @FindBy(id = "old-pin")
    WebElement OLD_PIN;

    @FindBy(xpath = "/html/body/main/div/div[3]/form/div[2]/div[2]/div[4]/div/div/button")
    WebElement BUTTON_SIMPAN;

    @FindBy(className = "alert-success")
    WebElement SUCCESS_MESSAGE;

    public void pageProfil(){
        ICON_ACCOUNT.click();
        MENU_PROFIL_PENGGUNA.click();
    }

    public void editProfil(){
        FIRST_NAME.sendKeys(" Edited");
        LAST_NAME.sendKeys(" Edited");
        MOBILE.sendKeys("123");
        EMAIL.clear();
        EMAIL.sendKeys("sucipdsedited22@gmail.com");
        OLD_PIN.clear();
    }

    public void saveProfilChange(){
        BUTTON_SIMPAN.click();
    }

    public void editSuccess(){
        Assert.assertEquals("Data berhasil disimpan. Silahkan lakukan re-login pada Aplikasi Qasir kamu untuk mengupdate data",SUCCESS_MESSAGE.getText());
    }
}
