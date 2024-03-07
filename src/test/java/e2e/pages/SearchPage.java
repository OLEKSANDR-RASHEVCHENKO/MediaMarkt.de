package e2e.pages;

import e2e.Enums.EnumsSort;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-test='mms-search-srp-headlayout']")
    WebElement suchErgebnisseHeader;
    @FindBy(xpath = "//*[@id='acc-content-id-facet-Preis']//*[@class='sc-8519892c-0 lkbPyD']//*[@id='min']")
    WebElement minPrice;
    @FindBy(xpath = "//*[@data-test='sort-testId']")
    WebElement sotrDropDown;


    public void waitForLoading(){
        getWait().forVisibility(suchErgebnisseHeader);
    }
    public void clickOnSortMenü(){
        sotrDropDown.click();
    }
    public void chooseAnSortFromDropDown(EnumsSort enumsSort){
        WebElement chooseSort = driver.findElement(By.xpath(enumsSort.getListOfPrivateMenü()));
        chooseSort.click();
    }

}
