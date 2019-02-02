package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt{
    private String rodzaj;
    private int ilosc;


    public Papierosy(String rodzaj, int ilosc, String nazwa, BigDecimal cena) {
        super(nazwa,cena);
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;

    }


}
