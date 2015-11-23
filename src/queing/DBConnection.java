/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

import java.sql.*;

/**
 * @author Henrik
 */
public class DBConnection 
{
    
        private Connection DBConnection;
        public Connection connect(String url) 
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Conncetion success");      

            }
                
                catch (ClassNotFoundException cnfe )
                {
                   System.out.println("Connection failed." + cnfe );
                }
            
            try
            {
                DBConnection = (Connection) DriverManager.getConnection(url,"admin","142536");
                        System.out.println("Database connected");
            }
            catch(SQLException se)
            {
                System.out.println("No database" + se);
            }
            return DBConnection;
            
        }
    
}
