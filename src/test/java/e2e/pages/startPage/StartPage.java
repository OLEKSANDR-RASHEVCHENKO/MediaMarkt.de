package e2e.pages.startPage;

import e2e.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id='pwa-consent-layer-accept-all-button']")
    WebElement cookiesAgree;
    @FindBy(xpath = "//*[@class='sc-c5b05e03-0 jchEGK sc-500fea2d-0 bHRFdb']")
    WebElement headerOnStartPage;
    @FindBy(xpath = "//*[@data-test='myaccount-dropdown-button']")
    WebElement myAccountDropDownButton;
    @FindBy(xpath = "//*[@data-test='myaccount-dropdown-desktop-list']")
    WebElement dropDown;
    @FindBy(xpath = "//*[@id='myaccount-dropdown-login-button']")
    WebElement einloggenButton;
    @FindBy(xpath = "//*[@id='myaccount-dropdown-register-button']")
    WebElement neuRegistrierenButton;

    public void waitForLoadingStartPage(){
        getWait().forVisibility(headerOnStartPage);
        getWait().forVisibility(myAccountDropDownButton);
        getWait().forClickable(myAccountDropDownButton);
    }
    public void waitForLoadingDropDown(){
        getWait().forVisibility(dropDown);
    }
    public void cookiesAgree(){
        cookiesAgree.click();
    }
    public void clickOnMyAccountDropDownButton(){
        myAccountDropDownButton.click();
    }
    public void clickOnEinloggenButton(){
        getWait().forVisibility(einloggenButton);
        getWait().forClickable(einloggenButton);
        einloggenButton.click();
    }


}
