/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.GUI_projekt;
/**
 *
 * @author Rasmus laptop
 */
public class Forestilling {

    private String tidspunkt;
    private int id;
    private Film[] film;
    private Sal sal;
    private Connection con;
    private Statement stat = null;
    ResultSet rs = null;
    private PreparedStatement pst;

    public Forestilling(String tidspunkt, Film[] film, Sal sal) {
        this.tidspunkt = tidspunkt;
        this.film = film;
        this.sal = sal;
    }

    public Forestilling(String tidspunkt, int id, Film[] film, Sal sal) {
        this.tidspunkt = tidspunkt;
        this.id = id;
        this.film = film;
        this.sal = sal;
    }

    public String getTidspunkt() {
  
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sal getSal() {
        
        return sal;
    }

    public void setSal(Sal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Forestilling{" + "tidspunkt=" + tidspunkt + ", id=" + id + ", film=" + film + ", sal=" + sal + '}';
    }

}
