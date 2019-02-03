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

    @Override
    public String getTyp(){
       return "alko";
    }
    @Override
    public String toString(){
       return super.toString()+"\t"+
               this.litraz+"\t"+
               this.procent;
    }

    public String getLitraz() {
        return litraz;
    }

    public String getProcent() {
        return procent;
    }

    public void setLitraz(String litraz) {
        this.litraz = litraz;
    }

    public void setProcent(String procent) {
        this.procent = procent;
    }

    public Alkohol() {
    }
}
