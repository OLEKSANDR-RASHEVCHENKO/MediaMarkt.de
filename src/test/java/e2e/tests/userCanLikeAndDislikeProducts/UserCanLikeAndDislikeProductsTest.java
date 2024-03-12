package e2e.tests.userCanLikeAndDislikeProducts;

import e2e.Enums.*;
import e2e.pages.searchPage.SearchPage;
import e2e.pages.homePage.HomePage;
import e2e.pages.loginPage.LoginPage;
import e2e.pages.meineWunshlistePage.MeineWunschListePage;
import e2e.pages.startPage.StartPage;
import e2e.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCanLikeAndDislikeProductsTest extends BaseTest {
    StartPage startPage;
    LoginPage loginPage;
    HomePage homePage;
    SearchPage searchPage;
    MeineWunschListePage meineWunschListePage;
    @Test
    public void userCanLikeAndDislikeProductsTest() {

        String email = "rashevchenkoo@gmail.com";
        String password = "Gazmanov1234";
        String product = "starlink";
        startPage = new StartPage(app.driver);
        startPage.cookiesAgree();
        startPage.waitForLoadingStartPage();
        startPage.clickOnMyAccountDropDownButton();
        startPage.waitForLoadingDropDown();
        startPage.clickOnEinloggenButton();
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoadingLoginPage();
        loginPage.emailAndPasswordFill(email, password);
        homePage = new HomePage(app.driver);
        homePage.waitForLoadingHomePage();
        homePage.setIntoWasSuchstDuField(product);
        searchPage = new SearchPage(app.driver);
        searchPage.waitForLoading();
        searchPage.chooseAnSortFromDropDown(EnumsSort.PREISABSTEIG);
        String first = searchPage.firstItemGetPrice();
        searchPage.minPriceInput(first);
        searchPage.chooseItemsToLikeOnSearchPage(EnumsItemsNumberToLikeOnSearchPage.One);
        searchPage.chooseItemsToDislikeOnSearchPage(EnumsItemsNumberToDislikeOnSearchPage.One);
        searchPage.chooseItemsToLikeOnSearchPage(EnumsItemsNumberToLikeOnSearchPage.One);
        String nameOfItem = searchPage.getItemName(EnumsItemsTitlesOnSearchPage.One);
        System.out.println(nameOfItem);
        searchPage.clickOnHomeButton();
        homePage.waitForLoadingHomePage();
        homePage.clickOnMyAccountDropDownButton();
        homePage.chooseAnCategoryFromPrivateMenü(EnumPrivateMenü.MEINE_WUNSHLISTE);
        meineWunschListePage = new MeineWunschListePage(app.driver);
        meineWunschListePage.waiteForLoading();
        String itemNameOnWunschListPage=meineWunschListePage.getItemTitle();
        Assert.assertEquals(nameOfItem,itemNameOnWunschListPage);
        meineWunschListePage.clickOnRemoveButton();
        meineWunschListePage.itemIsInvisibility();
        meineWunschListePage.clickOnHomeButton();
        homePage.waitForLoadingHomePage();
    }
}
