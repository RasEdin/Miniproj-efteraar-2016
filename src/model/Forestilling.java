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
        try {

            String tidspunkt = "insert into film(dato) values(?)";
            pst = con.prepareStatement(tidspunkt);

            pst.setString(1, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
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
         try {

            String sal = "insert into film(sal) values(?)";
            pst = con.prepareStatement(sal);            
            pst.setInt(1, Integer.parseInt(jComboBox1.getSelectedItem().toString()));
           pst.executeUpdate();           
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
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
