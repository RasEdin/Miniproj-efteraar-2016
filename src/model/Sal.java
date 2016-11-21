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
public class Sal {
    private int kolonner;
    private int rækker;
    private int id;
    private String navn;


    public Sal(int kolonner, int rækker, int id, String navn) {
        this.kolonner = kolonner;
        this.rækker = rækker;
        this.id = id;
        this.navn = navn;
    }
    
    public Sal(int kolonner, int rækker, String navn) {
        this.kolonner = kolonner;
        this.rækker = rækker;
        this.navn = navn;
    }
    
    public int getKolonner() {
        return kolonner;
    }

    public void setKolonner(int kolonner) {
        this.kolonner = kolonner;
    }

    public int getRækker() {
        return rækker;
    }

    public void setRækker(int rækker) {
        this.rækker = rækker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Sal{" + "kolonner=" + kolonner + ", r\u00e6kker=" + rækker + ", id=" + id + ", navn=" + navn + '}';
    }
    
    
    
}
