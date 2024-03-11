package e2e.tests.userCanSearchProductsTest;

import e2e.Enums.EnumsItemsNumberToDislikeOnSearchPage;
import e2e.Enums.EnumsItemsNumberToLikeOnSearchPage;
import e2e.Enums.EnumsItemsTitlesOnSearchPage;
import e2e.Enums.EnumsSort;
import e2e.pages.SearchPage;
import e2e.pages.homePage.HomePage;
import e2e.pages.loginPage.LoginPage;
import e2e.pages.startPage.StartPage;
import e2e.tests.BaseTest;
import org.testng.annotations.Test;

public class UserCanSearchProductsTest extends BaseTest {
    StartPage startPage;
    LoginPage loginPage;
    HomePage homePage;
    SearchPage searchPage;
    @Test
    public void userCanSearchProductsTest(){
        String email = "rashevchenkoo@gmail.com";
        String password = "Gazmanov1234";
        String product = "macbook air m1";
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
        homePage.setIntoWasSuchstDuField(product);
        searchPage = new SearchPage(app.driver);
        searchPage.waitForLoading();
        searchPage.chooseItemsToLikeOnSearchPage(EnumsItemsNumberToLikeOnSearchPage.Three);
        searchPage.chooseAnSortFromDropDown(EnumsSort.PREISABSTEIG);
        String first = searchPage.firstItemGetPrice();
        searchPage.minPriceInput(first);
        searchPage.chooseItemsToLikeOnSearchPage(EnumsItemsNumberToLikeOnSearchPage.One);
        searchPage.chooseItemsToDislikeOnSearchPage(EnumsItemsNumberToDislikeOnSearchPage.One);
        String nameOfItem=searchPage.getItemName(EnumsItemsTitlesOnSearchPage.Two);
        System.out.println(nameOfItem);



    }
}
