/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Rasmus laptop
 */
public class Biotrio {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Film> films = new ArrayList<>();
    private ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private ArrayList<Sal> sale = new ArrayList<>();

    public Biotrio() {
    }

    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public ArrayList<Forestilling> getForestillinger() {
        return forestillinger;
    }

    public void setForestillinger(ArrayList<Forestilling> forestillinger) {
        this.forestillinger = forestillinger;
    }

    public ArrayList<Sal> getSale() {
        return sale;
    }

    public void setSale(ArrayList<Sal> sale) {
        this.sale = sale;
    }
    
    
    
}
