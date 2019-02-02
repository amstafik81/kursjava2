package model;

import java.math.BigDecimal;

public class Produkt {


    private String nazwa;
    private BigDecimal cena;
    private int id;
    private static int generator=1;
    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.id=generator++;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return this.id+"\t"+this.nazwa+"\t"+this.cena+"\t";
    }
}
