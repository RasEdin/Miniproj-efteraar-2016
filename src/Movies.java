
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slmns
 */
public class Movies {

    // the url
    String url = "jdbc:postgresql://localhost:5432/Film";
    // the username
    String user = "postgres";
    // the password
    String password = "batman1993";
    //  The Statement
    Statement stat = null;
    // Declare The ResultSet
    ResultSet rs = null;

    public void connect() {
        System.out.println("--postgreSql JDBC connection test---");

        try {
            //      Locate my postgres JDBCdriver
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException ex) {
            // Catch exception
            System.out.println("JDBC is missing");
            ex.printStackTrace();
            return;
        }
        System.out.println("postgreSQL JDBC driver is registered");

    }
    

    
       // declare a connection.
    private Connection con = null;
    
    {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Movies.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (con != null); {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Movies.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
       
    }
    
    
    
   
}
