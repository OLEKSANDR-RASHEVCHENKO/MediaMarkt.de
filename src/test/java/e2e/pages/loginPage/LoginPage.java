package e2e.pages.loginPage;

import e2e.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='sc-c5b05e03-0 ihtuiJ']")
    WebElement headerOnLoginPage;
    @FindBy(xpath = "//*[@id='myaccount-login-form']")
    WebElement loginForm;
    @FindBy(xpath = "//*[@id='email']")
    WebElement emailInputField;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordInputField;
    @FindBy(xpath = "//*[text()='Passwort vergessen?']")
    WebElement passwordVergessenLink;
    @FindBy(xpath = "//*[@id='mms-login-form__login-button']")
    WebElement einloggenButton;
    public void waitForLoadingLoginPage(){
        getWait().forVisibility(headerOnLoginPage);
        getWait().forVisibility(loginForm);
        getWait().forClickable(emailInputField);
        getWait().forClickable(passwordInputField);
        getWait().forClickable(passwordVergessenLink);
        getWait().forClickable(einloggenButton);
        Assert.assertTrue(headerOnLoginPage.isDisplayed());
    }
    public void emailAndPasswordFill(String email,String password){
        emailInputField.sendKeys(email);
        passwordInputField.sendKeys(password);
        einloggenButton.click();
    }




}
