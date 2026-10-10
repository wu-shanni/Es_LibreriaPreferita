package org.example;

public class Vittima {
    private String cognome_nome;
    private String descrizione;

    public Vittima(String cognome_nome, String descrizione){
        this.cognome_nome = cognome_nome;
        this.descrizione = descrizione;
    }

    public String getCognome_nome() {
        return cognome_nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
