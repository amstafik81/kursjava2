package model;

import java.math.BigDecimal;

public class Alkohol {
    private String nazwa;
    private BigDecimal cena;
    private String litraz;
    private String procent;
    private int id;
    private static int generator=1;
    //konstruktor
   public Alkohol(String nazwa,BigDecimal cena,String litraz,String procent){
        this.nazwa=nazwa;
        this.cena=cena;
        this.litraz=litraz;
        this.procent=procent;
        this.id=generator++;
    }
    public int getId(){
       return id;
    }
    @Override
    public String toString(){
       return this.id+"\t"+this.nazwa+"\t"+this.cena+"\t"+this.litraz;
    }
}
