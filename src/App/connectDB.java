package App;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jerson
 */
public class connectDB {
    
    public static void main(String[] args) {
        try
        {
            String dbUser = "Napphy";
            String dbPassword = "Sep2021102596";
            String dbURL ="jdbc:mysql://cs155-project.c4znnhx9inbw.ap-southeast-2.rds.amazonaws.com:3306/cs155?zeroDateTimeBehavior=CONVERT_TO_NULL";
             
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            Connection connect = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            
            if(connect != null)
            {
                System.out.println("Success");
            }
            
            else 
            {
                System.out.println("Failed");
                
            }
            
        }
        
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) 
        {
            java.util.logging.Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
