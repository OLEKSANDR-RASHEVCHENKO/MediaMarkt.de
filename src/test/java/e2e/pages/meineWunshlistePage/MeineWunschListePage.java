package e2e.pages.meineWunshlistePage;

import e2e.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MeineWunschListePage extends BasePage {
    public MeineWunschListePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-test='myaccount-page-headline']")
    WebElement headerOnWunschListePage;
    @FindBy(xpath = "//*[@class='sc-f1f881c4-0 evTnGL']")
    WebElement subHeader;
    @FindBy(xpath = "//*[@data-test='wishlist-wrapper']")
    WebElement wunshcListeWrapper;
    @FindBy(xpath = "//*[@data-test='wishlist-item'][1]//*[@data-test='wishlist-tile-product-link']")
    WebElement itemInWunschLieste;
    @FindBy(xpath = "//*[@data-test='wishlist-item'][1]//*[@data-test='wishlist-remove']")
    WebElement removeItemFromWunschListe;
    @FindBy(xpath = "//*[@class='sc-c9210e66-0 sc-57676b39-3 brTJqv eEybxp']")
    WebElement homeButton;


    public void waiteForLoading(){
        getWait().forVisibility(headerOnWunschListePage);
        getWait().forVisibility(subHeader);
        getWait().forVisibility(wunshcListeWrapper);
        getWait().forVisibility(itemInWunschLieste);
        getWait().forClickable(removeItemFromWunschListe);
        Assert.assertTrue(headerOnWunschListePage.isDisplayed());
        Assert.assertTrue(subHeader.isDisplayed());
        Assert.assertTrue(wunshcListeWrapper.isDisplayed());
        Assert.assertTrue(itemInWunschLieste.isDisplayed());
        Assert.assertTrue(removeItemFromWunschListe.isDisplayed());
    }
    public void itemIsInvisibility(){
        getWait().forInvisibility(itemInWunschLieste);
    }

    public String getItemTitle(){
        return itemInWunschLieste.getText();
    }
    public void clickOnRemoveButton(){
        removeItemFromWunschListe.click();
    }
    public void clickOnHomeButton(){
        homeButton.click();
    }
}
