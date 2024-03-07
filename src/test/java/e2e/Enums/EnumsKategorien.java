package e2e.Enums;

import lombok.Getter;

@Getter
public enum EnumsKategorien {
    ANGEBOTEUNDAKTIONEN("Angebote & Aktionen"),
    OUTLET("OUTLET%"),
    LAST_MINUTE("Last Minute"),
    COMPUTER_BÜRO("Computer & Büro"),
    TV_AUDIO("TV & Audio"),
    SMARTPHONE("Smartphone & Tarife"),
    HAUSHALTGROSSGERÄTE("Haushaltsgroßgeräte"),
    HAUSHALT_WOHNEN("Haushalt & Wohnen"),
    GAMING_VR("Gaming & VR"),
    FOTO_DROHNEN("Foto & Drohnen"),
    GESUNDHEIT("Gesundheit & Körperpflege"),
    FILM_MUSIK("Film & Musik"),
    SPORT("Sport & Freizeit"),
    SMART_HOME("Smart Home"),
    HEIMWERKEN_GARTEN("Heimwerken & Garten"),
    SPILZEUG_BABY("Spielzeug & Baby"),
    REFURBISHED("Refurbished"),
    TARIFWELT("Tarifwelt"),

    TURN_ON_MAGAZIN("Turn On Magazin");

    private final String listOfAllKategorien;

    EnumsKategorien(String listOfKategoty) {
        this.listOfAllKategorien = "//*[text()='" + listOfKategoty + "']";
    }
    public String getListOfAllKategorien(){
        return listOfAllKategorien;
    }
}
