/**
 * Description : add Test to login sucessfully
 * Author      : Mayur Mansukh
 * Date        : 17/6/21
 */

package test;

import bridgelabz.base.Base;

import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void LoginTest()  {
        driver.get("https://www.bookswagon.com/");
    }
}
