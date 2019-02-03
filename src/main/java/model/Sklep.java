package model;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep implements Serializable {


    private String nazwa;
    private List<Produkt> produkty;

    public String getNazwa() {
        return nazwa;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.produkty=new ArrayList<>();

    }

   public void dodaj(Produkt produkt){
        produkty.add(produkt);

    }

    public void usun(int id){
        Iterator<Produkt> iterator=produkty.iterator();
        while (iterator.hasNext()){
            Produkt produkt=iterator.next();
            if(produkt.getId()==id){
                iterator.remove();
            }

        }
    }


    public String toString(){
        String rezultat="ID\tTyp\tNazwa\tCena\tinne\n";
        for(Produkt produkt:produkty){

            rezultat+=produkt+"\n";
        }

        return rezultat;
    }
    public Sklep(){

    }
}
