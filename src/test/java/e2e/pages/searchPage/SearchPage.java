package e2e.pages.searchPage;

import e2e.Enums.EnumsItemsNumberToDislikeOnSearchPage;
import e2e.Enums.EnumsItemsNumberToLikeOnSearchPage;
import e2e.Enums.EnumsItemsTitlesOnSearchPage;
import e2e.Enums.EnumsSort;
import e2e.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-test='mms-search-srp-headlayout']")
    WebElement suchErgebnisseHeader;
    @FindBy(xpath = "//*[@data-test='mms-facet-slider-currentprice']//*[@id='min']")
    WebElement minPrice;
    @FindBy(xpath = "//*[@data-test='sort-testId']")
    WebElement sotrDropDown;
    @FindBy(xpath = "//*[@data-test='mms-search-srp-productlist']//*[@class='sc-78ebdf9c-0 duPMTS'][1]//*[@data-test='mms-product-list-item-link']")
    WebElement firstItemHeaderOnSearchPage;
    @FindBy(xpath = "//*[@data-test='mms-search-srp-productlist']//*[@class='sc-78ebdf9c-0 duPMTS'][1]//*[@spacing='base']")
    WebElement firstItemPriceOnSearchPage;
    @FindBy(xpath = "//*[@data-test='mms-clear-filter']//*[@role='presentation']")
    WebElement cleanPreisParameters;
    @FindBy(xpath = "//*[@aria-label='Zur Wunschliste hinzufügen']")
    WebElement likeButton;
    @FindBy(xpath = "//*[@aria-label='Von der Wunschliste entfernen']")
    WebElement dislikeButton;
    @FindBy(xpath = "//*[@data-test='styled-logo']")
    WebElement homeButton;
    public void chooseItemsToLikeOnSearchPage(EnumsItemsNumberToLikeOnSearchPage enumsItemsNumberOfSearchPage){
        WebElement chooseItemsToLike = driver.findElement(By.xpath(enumsItemsNumberOfSearchPage.getListOfItemsNumber()));
        chooseItemsToLike.click();
    }
    public void chooseItemsToDislikeOnSearchPage(EnumsItemsNumberToDislikeOnSearchPage enumsItemsNumberToDislikeOnSearchPage){
        WebElement chooseItemsToDislike = driver.findElement(By.xpath(enumsItemsNumberToDislikeOnSearchPage.getListOfItemsNumber()));
        chooseItemsToDislike.click();
    }
    public String getItemName(EnumsItemsTitlesOnSearchPage enumsItemsTitlesOnSearchPage){
        WebElement getItem = driver.findElement(By.xpath(enumsItemsTitlesOnSearchPage.getItemTitleXPath()));
        return  getItem.getText();
    }
    public void clickOnHomeButton(){
        homeButton.click();
    }

    public void waitForLoading(){
        getWait().forVisibility(suchErgebnisseHeader);
        Assert.assertTrue(suchErgebnisseHeader.isDisplayed());
    }
    public void clickOnSortMenü(){
        sotrDropDown.click();
    }
    public void chooseAnSortFromDropDown(EnumsSort enumsSort){
        WebElement chooseSort = driver.findElement(By.xpath(enumsSort.getListOfPrivateMenü()));
        chooseSort.click();
    }
    public String firstItemGetPrice(){
        String priceString = firstItemPriceOnSearchPage.getText();
        String cleanedPriceString = priceString.replaceAll("[^\\d,]", "");
        String[] parts = cleanedPriceString.split(",");
        String price = "";
        if (priceString.startsWith("0,")) {
            price = "0," + parts[1];
        } else {
            price = parts[0];
        }
        return price;
    }
    public String firstItemGetHeader(){
        String getHeader = firstItemHeaderOnSearchPage.getText();
        return getHeader;
    }
    public void minPriceInput(String price){
        minPrice.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        minPrice.sendKeys(Keys.BACK_SPACE);
        minPrice.sendKeys(price);
        minPrice.sendKeys(Keys.ENTER);
    }
    public void cleanPriceParameters(){
        cleanPreisParameters.click();
    }
    public void likeItem(){
        likeButton.click();
    }
    public void disLikeItem(){
        dislikeButton.click();
    }

}
