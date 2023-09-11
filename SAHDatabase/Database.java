/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SAHDatabase;

//import java.sql libraries
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Imeah
 */
public class Database {
   private static Connection conn;
   
   public static Connection getConnection()
   {
      
      try
      {
         //Class.forName("org.apache.derby.jdbc.ClientDriver");
         conn = DriverManager.getConnection( "jdbc:mysql://localhost:3308/sahcol_maintenance?zeroDateTimeBehavior=convertToNull", "root",""); //Get database url, user and password
      }
      catch(SQLException sqle)
      {
         System.out.println(sqle.getMessage());
      }
//      catch(ClassNotFoundException cnfe)
//      {
//         cnfe.getMessage();
//      }
      return conn;
   }
}
 