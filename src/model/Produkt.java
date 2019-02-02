package model;

import java.math.BigDecimal;

public abstract class  Produkt {


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
    public abstract String getTyp();
    @Override
    public String toString(){
        return this.id+"\t"+getTyp()+"\t"+this.nazwa+"\t"+this.cena+"\t";
    }
}
