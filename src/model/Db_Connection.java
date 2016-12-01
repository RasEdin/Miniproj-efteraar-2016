/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author slmns
 */
public class Db_Connection {

    public Connection con;

    private Statement stat = null;
    public ResultSet rs = null;
    public PreparedStatement pst;
    private static Db_Connection instance = null;

    private Db_Connection() {

    }

    public static Db_Connection getInstance() {
        if (instance == null) {
            instance = new Db_Connection();
        }
        return instance;
    }

    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pro", "postgres", "batman1993");

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }
}
