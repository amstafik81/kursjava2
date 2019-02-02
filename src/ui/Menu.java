package ui;

import java.util.Scanner;

public class Menu {
   public  void wyswietl(){
       Scanner wejscie=new Scanner(System.in);
       System.out.println("1-dodaj alkohol");
       System.out.println("2-usuń alkohol");
       System.out.println("3-wyświetl alko");
       System.out.println("q-wyjscie");
       boolean spr=true;
       String wybor;
       do {
           System.out.println("Podaj wybór");
            wybor = wejscie.nextLine();
              switch (wybor) {
                  case "1":
                      System.out.println("Dodawanie produktu");
                      break;
                  case "2":
                      System.out.println("Odejmowanie produktu");
                      break;
                  case "3":
                      System.out.println("Wyswietlenie produktów");
                      break;
                  case "q":
                      System.out.println("Bye Bye");
                      break;
                  default:
                      System.out.println("Błędna opcja, spróbuj jeszcze raz");
              }
       } while (!wybor.equals("q"));

    }
}
