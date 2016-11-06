
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

    private Connection con;
    private Statement stat = null;
     ResultSet rs = null;

    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pro", "postgres", "batman1993");
            System.out.println("Connection succesful");
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void Insertdata() {
        try {
            stat = con.createStatement();
            stat.executeUpdate("insert into film(movie) values()");
            System.out.println("add done");
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void Readdata() {
        try {
            String query = "select * from film";
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            System.out.println("Movie names:");
            while(rs.next()){
                String movie = rs.getString("movie");
                System.out.println(movie);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Movies.class.getName()).log(Level.SEVERE, null, ex);
         
        }
    }

}
    
    

 
    
    

