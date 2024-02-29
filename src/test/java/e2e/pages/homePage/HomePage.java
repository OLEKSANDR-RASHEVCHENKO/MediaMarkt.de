package e2e.pages.homePage;

import e2e.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='sc-c5b05e03-0 jchEGK sc-500fea2d-0 bHRFdb']")
    WebElement headerOnStartPage;
    @FindBy(xpath = "//*[text()='OR']")
    WebElement myAccountDropDownButton;
    public void waitForLoadingHomePage(){
        getWait().forVisibility(headerOnStartPage);
        getWait().forVisibility(myAccountDropDownButton);
        Assert.assertTrue(headerOnStartPage.isDisplayed());
        Assert.assertTrue(myAccountDropDownButton.isDisplayed());
    }
}
