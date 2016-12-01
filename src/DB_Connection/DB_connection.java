/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.GUI_projekt;

/**
 *
 * @author MouNj
 */
public class DB_connection {

    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static String DATABASE = "test_database";
    private static final String USERNAME = "test_user";
    private static final String PASSWORD = "test_password";

    private static Connection createConnection() throws ClassNotFoundException, SQLException {
        // Driver is loaded - postgreSQL JDBC Driver needs to be
        // added under libraries for this to work
        Class.forName("org.postgresql.Driver");

        // A connection-object is created with host, port, databasename, username and password
        String url = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;

        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        return conn;
    }

//    public void closeConnection() {
//        if (con != null) {
//            try {
//                con.close();
//
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//            System.out.println("the connection now is closed ");
//        }
//    }
    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
