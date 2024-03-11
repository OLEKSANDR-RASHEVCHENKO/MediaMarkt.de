package e2e.Enums;

import lombok.Getter;

@Getter
public enum EnumsItemsNumberToDislikeOnSearchPage {
    One("1"),
    Two("2"),
    Three("3"),
    Fohr("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Ache("8"),
    Nine("9"),
    Ten("10"),
    Eleven("11"),
    Twelve("12"),
    Thirteen("13");

    private final String listOfItemsNumber;

    EnumsItemsNumberToDislikeOnSearchPage(String listOfNumbersItem) {
        this.listOfItemsNumber = "//*[@class='sc-78ebdf9c-0 duPMTS'][" + listOfNumbersItem + "]//*[@aria-label='Von der Wunschliste entfernen']";
    }

    public String getListOfNumberOfItem() {
        return listOfItemsNumber;
    }
}
