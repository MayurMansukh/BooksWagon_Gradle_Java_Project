/**
 * Description : add BooksWagon web Login page locators and methods
 * Author      : Mayur Mansukh
 * Date        : 18/6/21
 */
package bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"ctl00_divLogin\"]/ul/li[1]/a")
    WebElement login;

    @FindBy(id = "ctl00_phBody_SignIn_txtEmail")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"ctl00_divLogged\"]/ul/li/a/span")
    WebElement logoutopt;

    @FindBy(xpath = "//*[@id=\"ctl00_lnkbtnLogout\"]")
    WebElement logoutBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {

        login.click();
    }

    public void enterUserName(String username) {

        userName.sendKeys(username);
    }

    public void enterPassword(String Password) {

        password.sendKeys(Password);
    }

    public boolean clickSubmitBtn() {

        submitBtn.click();
        return true;
    }

    public void clickLogoutopt() {

        logoutopt.click();
    }

    public void clickLogoutBtn() {

        logoutBtn.click();
    }




}
