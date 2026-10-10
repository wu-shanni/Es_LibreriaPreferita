package org.example;

public class Investigatore {
    private String cognome_nome;
    private String verbale;

    public Investigatore(String cognome_nome){
        this.cognome_nome = cognome_nome;
    }

    public String getCognome_nome() {
        return cognome_nome;
    }


    public void analizza (Sospettato s, Vittima v){
        System.out.println("* Investigatore: ");
        System.out.println("\tNome vittima: " + v.getCognome_nome());
        System.out.println("\tDescrizione: " + v.getDescrizione());
        System.out.println("\tSospettato: " + s.getCognome_nome());
        System.out.println("\tVerbale: \"" + s.getVerbale() + "\"");
    }
}
