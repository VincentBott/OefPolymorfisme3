package com.company;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Persoon> personen = new HashSet<>();

        personen.add(new Persoon("Karen", LocalDate.of(1974, 10, 28)));
        personen.add(new Persoon("Kristel", LocalDate.of(1975,12,10)));
        personen.add(new Persoon("Kathleen", LocalDate.of(1978, 6, 18)));
        personen.add(new Leeftijdleugenaar("Josje", LocalDate.of(1986, 2, 16)));

        for (Persoon p: personen){

            System.out.printf("%s is %d jaar oud.%n", p.getNaam(), p.getLeeftijd());
        }
    }
}
