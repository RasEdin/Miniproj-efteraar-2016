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
public class User {
    private String navn;
    private String telefon;
    private int id;

    public User() {
    }

    public User(String navn, String telefon, int id) {
        this.navn = navn;
        this.telefon = telefon;
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "navn=" + navn + ", telefon=" + telefon + ", id=" + id + '}';
    }
    
    
    
}
