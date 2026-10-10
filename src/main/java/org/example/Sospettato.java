package org.example;

public class Sospettato {
    private String cognome_nome;
    private String verbale;

    public Sospettato(String cognome_nome, String verbale){
        this.cognome_nome = cognome_nome;
        this.verbale = verbale;
    }

    public String getCognome_nome() {
        return cognome_nome;
    }

    public String getVerbale() {
        return verbale;
    }
}


