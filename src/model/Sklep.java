package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {


    private String nazwa;
    private List<Produkt> produkty;

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.alkohole=new ArrayList<>();
        this.papieros=new ArrayList<>();
    }

   public void dodajAlkohol(Alkohol alkohol){
        alkohole.add(alkohol);

    }
    public void dodajPapierosy(Papierosy papierosy){
        papieros.add(papierosy);

    }
    public void usunAlkohol(int id){
        Iterator<Alkohol> iterator=alkohole.iterator();
        while (iterator.hasNext()){
            Alkohol alkohol=iterator.next();
            if(alkohol.getId()==id){
                iterator.remove();
            }

        }
    }
    public void usunPapierosy(int id){
        Iterator<Papierosy> iterator=papieros.iterator();
        while (iterator.hasNext()){
            Papierosy papieros=iterator.next();
            if(papieros.getId()==id){
                iterator.remove();
            }

        }
    }
  //  public void wyswietlAlkohol(){
    //    for(Alkohol i:alkohole){
     //       System.out.println(i);
     //   }
   // }
    public String toString(){
        String rezultat="ID\tNazwa\tCena\n";
        for(Alkohol alkohol:alkohole){

            rezultat+=alkohol+"\n";
        }
        for(Papierosy papieros:papieros){

            rezultat+=papieros+"\n";
        }
        return rezultat;
    }
}
