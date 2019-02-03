package model;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class  Produkt implements Serializable {


    protected String nazwa;
    protected BigDecimal cena;
    protected int id;
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
