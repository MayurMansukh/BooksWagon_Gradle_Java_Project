/**
 * Description : add Test to login sucessfully
 * Author      : Mayur Mansukh
 * Date        : 17/6/21
 */

package test;

import bridgelabz.base.Base;
import bridgelabz.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void LoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bookswagon.com/");
        loginPage.clickLogin();
        Thread.sleep(1000);
        loginPage.enterUserName("mansukhmayur99@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("Password1@2");
        Thread.sleep(1000);
        loginPage.clickSubmitBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bookswagon.com/myaccount.aspx");
        Thread.sleep(1000);
        loginPage.clickLogoutopt();
        loginPage.clickLogoutBtn();
    }
}
