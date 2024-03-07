package e2e.Enums;

import lombok.Getter;

@Getter
public enum EnumPrivateMenü {
    KONTOÜBERSICHT("Kontoübersicht"),
    MEINE_KÄUFE("Meine Käufe"),
    MEINE_WUNSHLISTE("Meine Wunschliste"),
    MEINE_ABONEMENTS("Meine Abonnements"),
    MEINE_COUPONS("Meine Coupons"),
    MEINE_PUNKTE("Meine Punkte"),
    MEIN_PROFIL("Mein Profil"),
    ABMELDEN("Abmelden");


    private final String listOfPrivateMenüDropDown;

    EnumPrivateMenü(String listOfMenü) {
        this.listOfPrivateMenüDropDown = "//*[text()='" + listOfMenü + "']";
    }
    public String getListOfPrivateMenü(){
        return listOfPrivateMenüDropDown;
    }
}

