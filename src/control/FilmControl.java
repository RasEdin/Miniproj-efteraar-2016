/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import view.Admin;
import javax.swing.JTable;

import model.Db_Connection;

/**
 *
 * @author slmns
 */
public class FilmControl {

    public void readTable(JTable table) {
        try {
            Db_Connection.getInstance().connect();

            String sql = "select * from film";
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);
            Db_Connection.getInstance().rs = Db_Connection.getInstance().pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(Db_Connection.getInstance().rs));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void insert(String movie, int sal, String dato, String tid) {
        try {

            String sql = "insert into film(movie,sal,dato,tid) values(?,?,?,?)";
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);
            Db_Connection.getInstance().pst.setString(1, movie);

            Db_Connection.getInstance().pst.setString(3, dato);
            Db_Connection.getInstance().pst.setInt(2, sal);
            Db_Connection.getInstance().pst.setString(4, tid);
            Db_Connection.getInstance().pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add Done");
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void delete(String deletemovie) {
        try {

            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement("Delete from film where movie=?");
            Db_Connection.getInstance().pst.setString(1, deletemovie);
            Db_Connection.getInstance().pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Done");

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
    }

    public void searchmovie(String movie, JTable table) {

        try {
            String sql = "select * from film where movie = ?";
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);
            Db_Connection.getInstance().pst.setString(1, movie);
            Db_Connection.getInstance().rs = Db_Connection.getInstance().pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(Db_Connection.getInstance().rs));
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void searchdato(String dato, JTable table) {

        try {
            String sql2 = "select * from film where dato = ?";

            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql2);
            Db_Connection.getInstance().pst.setString(1, dato);
            Db_Connection.getInstance().rs = Db_Connection.getInstance().pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(Db_Connection.getInstance().rs));

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void customerstable(JTable table2){
        try {
            String sql = "select * from customers";
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);
            Db_Connection.getInstance().rs = Db_Connection.getInstance().pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(Db_Connection.getInstance().rs));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void searchnumber(String number, JTable table2){
       
        String sql = "select * from customers where number = ?";
        
        try {
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);
            Db_Connection.getInstance().pst.setInt(1, Integer.parseInt(number));            
            Db_Connection.getInstance().rs = Db_Connection.getInstance().pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(Db_Connection.getInstance().rs));
        } catch (SQLException ex) {            
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void ticket( int phone,int id){
        try {

            String sql = "insert into ticket(telefon,forestilling) values(?,?)";
            Db_Connection.getInstance().pst = Db_Connection.getInstance().con.prepareStatement(sql);                       
            Db_Connection.getInstance().pst.setInt(1, phone);
            Db_Connection.getInstance().pst.setInt(2, id);
            Db_Connection.getInstance().pst.executeUpdate();           
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
