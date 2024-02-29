package e2e.tests.loginTests;

import e2e.pages.homePage.HomePage;
import e2e.pages.loginPage.LoginPage;
import e2e.pages.startPage.StartPage;
import e2e.tests.BaseTest;
import org.testng.annotations.Test;

public class UserCanLogginInSystemTest extends BaseTest {
    StartPage startPage;
    LoginPage loginPage;
    HomePage homePage;
    @Test
    public void userCanLoginInSystemTest(){
        String email = "rashevchenkoo@gmail.com";
        String password = "Gazmanov1234";
        startPage = new StartPage(app.driver);
        startPage.cookiesAgree();
        startPage.waitForLoadingStartPage();
        startPage.clickOnMyAccountDropDownButton();
        startPage.waitForLoadingDropDown();
        startPage.clickOnEinloggenButton();
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoadingLoginPage();
        loginPage.emailAndPasswordFill(email,password);
        homePage = new HomePage(app.driver);
        homePage.waitForLoadingHomePage();
    }
}
