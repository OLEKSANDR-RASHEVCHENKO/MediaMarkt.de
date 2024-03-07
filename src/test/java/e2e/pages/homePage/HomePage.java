package e2e.pages.homePage;

import e2e.Enums.EnumPrivateMenü;
import e2e.Enums.EnumsKategorien;
import e2e.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-test='styled-logo']")
    WebElement logo;
    @FindBy(xpath = "//*[@class='sc-c5b05e03-0 jchEGK sc-500fea2d-0 bHRFdb']")
    WebElement headerOnStartPage;
    @FindBy(xpath = "//*[text()='OR']")
    WebElement myAccountDropDownButton;
    @FindBy(xpath = "//*[@id='mms-app-header-category-button']")
    WebElement alleKategorienButton;
    @FindBy(xpath = "//*[@id='search-form']")
    WebElement wasSuchstDuField;
    @FindBy(xpath = "//*[@data-test='mms-marketselector-container']")
    WebElement meinMarktButton;
    @FindBy(xpath = "//*[@class='sc-e37a60c3-0 eeuJKc']")
    WebElement markAuswählenDisplay;
    @FindBy(xpath = "//*[@id=':ra4:']")
    WebElement plzFieldMarkAuswählen;
    @FindBy(xpath = "//*[@class='sc-5a371591-1 dhQslF']")
    WebElement suchenButtonOnMarkAuswählen;


    public void waitForLoadingHomePage(){
        getWait().forVisibility(headerOnStartPage);
        getWait().forVisibility(myAccountDropDownButton);
        Assert.assertTrue(headerOnStartPage.isDisplayed());
        Assert.assertTrue(myAccountDropDownButton.isDisplayed());
    }
    public void clickOnLogo(){
        logo.click();
    }
    public void clickOnAllKategorienButton(){
        alleKategorienButton.click();
    }
    public void clickOnMyAccountDropDownButton(){
        myAccountDropDownButton.click();
    }
    public void chooseAnCategoryFromPrivateMenü(EnumPrivateMenü enumPrivateMenü){
        WebElement chooseAnCategoryFromPrivateMenü = driver.findElement(By.xpath(enumPrivateMenü.getListOfPrivateMenü()));
        chooseAnCategoryFromPrivateMenü.click();
    }
    public void chooseAnCategories(EnumsKategorien enumsKategorien){
        WebElement chooseAnCategoryType = driver.findElement(By.xpath(enumsKategorien.getListOfAllKategorien()));
        chooseAnCategoryType.click();
    }
    public void setIntoWasSuchstDuField(String product){
        wasSuchstDuField.sendKeys(product+ Keys.ENTER);
    }
}
