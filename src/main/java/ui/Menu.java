package ui;

import io.PlikiJson;
import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
   public  void wyswietl(){
       Scanner wejscie=new Scanner(System.in);
      // Sklep sklep=new Sklep("Tesco");
       Sklep sklep=null;
       //PlikiBinarne plikiBinarne=new PlikiBinarne();
       PlikiJson mainJson=new PlikiJson();
//       try {
//           sklep = plikiBinarne.odczyt();
//       }
//       catch (Exception e){
//           e.printStackTrace();
//           System.out.println("Nie udało sie wczytac sklepu");
//           sklep=new Sklep("Tesco");
//       }
       try {
          sklep = mainJson.odczyt();
      }
      catch (Exception e){
           e.printStackTrace();
          System.out.println("Nie udało sie wczytac sklepu");
           sklep=new Sklep("Tesco");
     }


       //sklep=new Sklep("Tesco");
       System.out.println("1-dodaj alkohol");
       System.out.println("2-dodaj papierosy");
       System.out.println("3-usuń ");
       System.out.println("4-wyświetl ");

       System.out.println("q-wyjscie");
       boolean spr=true;
       // sklep.dodaj(new Alkohol("Alko1",BigDecimal.TEN,"20","20"));
        //sklep.dodaj(new Papierosy("d",2,"papa",BigDecimal.TEN));
       String wybor;
       do {
           System.out.println("Podaj wybór");
            wybor = wejscie.nextLine();
              switch (wybor) {
                  case "1": {
                      System.out.println("Dodawanie produktu");
                      System.out.println("Podaj nazwe:");
                      String nazwa = wejscie.nextLine();
                      System.out.println("Podaj cenę:");
                      BigDecimal cena = wejscie.nextBigDecimal();
                      wejscie.nextLine();
                      System.out.println("Podaj litraz:");
                      String litraz = wejscie.nextLine();
                      System.out.println("Podaj procent:");
                      String procent = wejscie.nextLine();
                      Alkohol alko = new Alkohol(nazwa, cena, litraz, procent);
                      sklep.dodaj(alko);
                      break;
                  }
                  case "2":{
                      System.out.println("Dodawanie produktu");
                      System.out.println("Podaj nazwe:");
                      String nazwa = wejscie.nextLine();
                      System.out.println("Podaj rodzaj:");
                      String rodzaj = wejscie.nextLine();
                      System.out.println("Podaj ilosc:");
                      int ilosc = wejscie.nextInt();
                      System.out.println("Podaj cenę:");
                      BigDecimal cena = wejscie.nextBigDecimal();
                      wejscie.nextLine();

                      Papierosy papie = new Papierosy(rodzaj,ilosc,nazwa,cena);
                      sklep.dodaj(papie);
                      break;
                  }

                  case "3": {
                          System.out.println("Odejmowanie produktu");
                          System.out.println("Podaj id usuwanego produktu:");
                          int id = wejscie.nextInt();
                          sklep.usun(id);
                          break;
                      }
                  case "4": {
                      System.out.println("Wyswietlenie produktów");
                      System.out.println(sklep);


                      break;
                  }
                  case "q": {
                      System.out.println("Bye Bye");
                        mainJson.zapis(sklep);
                      //plikiBinarne.zapis(sklep);

                      break;
                  }
                  default: {
                      System.out.println("Błędna opcja, spróbuj jeszcze raz");
                  }
              }
       } while (!wybor.equals("q"));

    }
}
