package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.math.BigDecimal;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,property = "type")

@JsonSubTypes({
        @JsonSubTypes.Type(value = Alkohol.class,name = "alkohol"),
        @JsonSubTypes.Type(value = Papierosy.class,name = "papierosy")
})
public abstract class  Produkt implements Serializable {

    //private static final long serialVersionUID=3213123123123L;
    protected String nazwa;
    protected BigDecimal cena;
    protected int id;
    private static int generator=1;

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.id=generator++;
    }

    public int getId(){
        return id;
    }
    @JsonIgnore
    public abstract String getTyp();
    @Override
    public String toString(){
        return this.id+"\t"+getTyp()+"\t"+this.nazwa+"\t"+this.cena+"\t";
    }

    public Produkt() {
    }
}
