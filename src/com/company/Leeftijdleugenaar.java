package com.company;

import java.time.LocalDate;

public class Leeftijdleugenaar extends Persoon {

    public Leeftijdleugenaar(String naam, LocalDate geboortedatum) {
        super(naam, geboortedatum);
    }


    @Override
    public int getLeeftijd() {


        LocalDate vandaag = LocalDate.now();

        int leeftijd = vandaag.getYear() - geboortedatum.getYear();

        if (geboortedatum.getDayOfYear() > vandaag.getDayOfYear()){
            leeftijd --;
        }

        return leeftijd + 10;
    }
}
