/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rasmus laptop
 */
public class Film {
    private String titel;
    private String varighed;
    private String beskrivelse;
    private int id;

    //constructors    

    public Film(String titel, String varighed, String beskrivelse) {
        this.titel = titel;
        this.varighed = varighed;
        this.beskrivelse = beskrivelse;
    }
    
    public Film(String titel, String varighed, String beskrivelse, int id) {
        this.titel = titel;
        this.varighed = varighed;
        this.beskrivelse = beskrivelse;
        this.id = id;
    }
    
    
    
    
    //getters and setters
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVarighed() {
        return varighed;
    }

    public void setVarighed(String varighed) {
        this.varighed = varighed;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Film{" + "titel=" + titel + ", varighed=" + varighed + ", beskrivelse=" + beskrivelse + '}';
    }
    
    
}