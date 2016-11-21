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
public class Booking {
    private User user;
    private Forestilling forestilling;
    private int rækker;
    private int kolonner;
    private int id;

    public Booking(User user, Forestilling forestilling, int rækker, int kolonner, int id) {
        this.user = user;
        this.forestilling = forestilling;
        this.rækker = rækker;
        this.kolonner = kolonner;
        this.id = id;
    }

    public Booking(User user, Forestilling forestilling, int rækker, int kolonner) {
        this.user = user;
        this.forestilling = forestilling;
        this.rækker = rækker;
        this.kolonner = kolonner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public void setForestilling(Forestilling forestilling) {
        this.forestilling = forestilling;
    }

    public int getRækker() {
        return rækker;
    }

    public void setRækker(int rækker) {
        this.rækker = rækker;
    }

    public int getKolonner() {
        return kolonner;
    }

    public void setKolonner(int kolonner) {
        this.kolonner = kolonner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
