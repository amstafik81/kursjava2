package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt{
    private String rodzaj;
    private int ilosc;


    public String getRodzaj() {
        return rodzaj;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Papierosy(String rodzaj, int ilosc, String nazwa, BigDecimal cena) {
        super(nazwa,cena);
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;

    }
    @Override
    public String getTyp(){
        return "pap";
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+
                this.rodzaj+"\t"
                +this.ilosc;
    }

    public Papierosy() {
    }
}
