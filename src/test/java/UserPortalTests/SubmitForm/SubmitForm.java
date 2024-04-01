package UserPortalTests.SubmitForm;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.*;
import UserPortalTests.LoginTest.LoginTests;
import org.testng.annotations.Test;

public class SubmitForm extends GlobalSetup {

    LoginTests loginTests=new LoginTests();
    HomePage homePage=new HomePage(driver.getWebDriver());
    CheckList checkList=new CheckList(driver.getWebDriver());
    public int mainFactorIndex=3;
    @Test
    public void submitChecklist() throws InterruptedException {
        loginTests.testInspectorValidLogin();
        homePage.openForm();
        checkList.fillForm(mainFactorIndex);


    }
}
