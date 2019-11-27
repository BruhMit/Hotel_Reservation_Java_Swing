/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tadesse
 */
public class Dbcon {
  private Connection conn;
   private Statement st;
   private ResultSet rs;
   private PreparedStatement pstmt;
   public Connection getConnection() throws ClassNotFoundException{
       try{
           String url="jdbc:mysql://localhost:3306/record";
           String user="root";
           String pass="";
          // Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection(url,user,pass);
           
       }catch(SQLException e){
           System.out.println("error with the connection" +e.getMessage());
           
       }catch(Exception ex){
          System.out.println("error with the connection" +ex.getMessage()); 
       }finally{
           return conn;
       }
   }
    public ResultSet searchQuery( String sql) throws ClassNotFoundException{
    try{
        getConnection();
        st=conn.createStatement();
        rs=st.executeQuery(sql);
        
        
    }catch(SQLException ex)
    
    {
      System.out.println("error with the connection" +ex.getMessage());   
    }
    return rs;
} 
    public    PreparedStatement preparedstatement(String sql)throws ClassNotFoundException{
       try { 
           PreparedStatement pstmt = conn.prepareStatement(sql);
       } catch (SQLException ex) {
           Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
       }
       return pstmt;
    }   
}
