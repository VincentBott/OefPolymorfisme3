package com.company;

import java.time.LocalDate;

public class Persoon {


    String naam;
    LocalDate geboortedatum;

    public Persoon(String naam, LocalDate geboortedatum) {

        this.naam = naam;
        this.geboortedatum = geboortedatum;

    }


    public String getNaam() {

        return this.naam;
    }

    public int getLeeftijd() {


        LocalDate vandaag = LocalDate.now();

        int leeftijd = vandaag.getYear() - geboortedatum.getYear();

        if (geboortedatum.getDayOfYear() > vandaag.getDayOfYear()){
            leeftijd --;
        }

        return leeftijd;
    }
}
