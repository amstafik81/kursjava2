package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {

    private String litraz;
    private String procent;

    //konstruktor
   public Alkohol(String nazwa,BigDecimal cena,String litraz,String procent){
       //konstruktor lasy bazowej
        super(nazwa,cena);
        this.litraz=litraz;
        this.procent=procent;
    }

}
