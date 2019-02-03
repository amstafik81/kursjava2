package io;

import model.Sklep;

public interface OperacjePlikowe {
    public Sklep odczyt() throws Exception;
    void zapis(Sklep sklep);

}
