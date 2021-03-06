package io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import model.Sklep;

import java.io.*;

public class PlikiBinarne implements OperacjePlikowe{
    public void zapis(Sklep sklep){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sklep.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sklep);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            System.out.println("Nie udało sie zapisać do pliku");
            e.printStackTrace();
        }

    }
    public Sklep odczyt() throws Exception {
        Sklep sklep=null;

            FileInputStream fileInputStream=new FileInputStream("sklep.bin");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            sklep=(Sklep) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        return sklep;
    }
}
