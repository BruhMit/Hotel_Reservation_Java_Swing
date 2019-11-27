package csv;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public interface CSV {
     public void uploadCsv();
     }
class Hanta implements CSV{
public  String path;
 
    
    
    public Connection getCon() throws SQLException{
// creates a statement object in order to send it to daabase
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
// managing specifed driver and consructing connection to the given url
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1","root",""); 
// returning the connection
            return con;
        } catch (ClassNotFoundException ex) {
           
        }
        return null;
    }

    @Override
    public void uploadCsv() {
       // promote the user to choose a file or a directory 
      
        JFileChooser filechooser =new  JFileChooser();
// geting home directory of curren user
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
// file filters class
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text files","txt","csv");
// adding file filter option
        filechooser.addChoosableFileFilter(filter);
// this method reurns an integer status code specifies how the user dissmissed the dialog.
        int result = filechooser.showSaveDialog(null);
        String zna;
        if(result==JFileChooser.APPROVE_OPTION){
// accessing the file
           File selectedFile = filechooser.getSelectedFile();
// retrieving the path of the file
            zna = selectedFile.getAbsolutePath();
        this.path=zna;
        }                  //read file
         try{
// calling the connection interface in order to be connected with the database  
             Connection con=getCon();
// preparing sql statement in the database
             PreparedStatement ps;
// read data from the file
            FileReader fr = new FileReader(this.path);
// used to read data line by line using readLine() method
            BufferedReader buff = new BufferedReader(fr);
            String go;
            while((go = buff.readLine())!=null){
            String[] str = go.split(",");              // upload to DB
            String sql = "insert into bruh values(?,?,?,?,?,?,?)";
           ps = con.prepareStatement(sql);
           ps.setInt(1, Integer.parseInt(str[0]));
            ps.setString(2,str[1]);
            ps.setString(3,str[2]);
            ps.setString(4,str[3]);
            ps.setString(5,str[4]);
            ps.setString(6,str[5]);
            ps.setString(7,str[6]);
// executing the query
           ps.executeUpdate();
// closing the execution 
            ps.close();
              
             }
            JOptionPane.showMessageDialog(null,"Successfully Uploaded");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }
    

     public static void main(String[] args) {
// creating class object
         Hanta m= new Hanta();
// calling upload Csv() method
         m.uploadCsv();
     }
 }