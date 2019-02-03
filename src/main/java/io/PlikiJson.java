package io;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;

public class PlikiJson implements OperacjePlikowe{
    private ObjectMapper mapper=new ObjectMapper();
    Sklep sklep;
    public void zapis(Sklep sklep) {
           try {
               mapper
                        .writerWithDefaultPrettyPrinter()
                        .writeValue(new File("sklep.json"), sklep);
           }
           catch (Exception e){
               e.printStackTrace();
           }

    }
    public Sklep odczyt() throws Exception{
        sklep=mapper.readValue(new File("sklep.json"),Sklep.class);
        return sklep;
    }
}
