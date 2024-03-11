package e2e.Enums;

import lombok.Getter;

@Getter
public enum EnumsSort {
    BESTEERGEBNISSE("Beste Ergebnisse"),
    PREISAUFSTEIG("Preis: aufsteigend"),
    PREISABSTEIG("Preis: absteigend"),
    BEWRTUNGEN("Bewertungen"),
    TOPSELLER("Topseller"),
    NEUHEITEN("Neuheiten"),
    VERFÜGBARKEIT("Verfügbarkeit"),
    VORBESTELLER("Vorbesteller");


    private final String listOfSortDropDown;

    EnumsSort(String listOfMenü) {
        this.listOfSortDropDown = "//*[@data-test='sort-testId']//*[text()='"+ listOfMenü +"']";
    }
    public String getListOfPrivateMenü(){
        return listOfSortDropDown;
    }
}

