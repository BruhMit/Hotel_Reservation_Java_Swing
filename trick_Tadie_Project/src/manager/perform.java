package manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class perform<T> implements Javainterface<T> {
           T value1;
           T value2;
           T value3;
           T value4;
           T value5;
           int b;
           ArrayList c;
    public perform(ArrayList<T> c){
         b=0;
        upload(c,b);
}
       
    public void upload(ArrayList<T> c,int b){
        for(T k:c){
           if(b==0){
               this.value1=k;
           } 
            if(b==1){
               this.value2=k;
           } 
             if(b==2){
               this.value3=k;
           } 
              if(b==3){
               this.value4=k;
           } 
               if(b==4){
               this.value5=k;
           } 
               ////
               b++; 
        }
        try {
                String url = "jdbc:mysql://localhost/upload";
                Connection conn = DriverManager.getConnection(url,"root","");
                String sql= "INSERT INTO  newupload VALUES (?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, (String) value1);
                pstmt.setString(2, (String) value2);
                pstmt.setString(3, (String) value3);
                pstmt.setString(4, (String) value4);
                pstmt.setString(5, (String) value5);
                pstmt.executeUpdate();
                conn.close();
       }catch(Exception e){    
           JOptionPane.showMessageDialog(null,e);
     }
        //Access ac=new  Access();//creating of an objectof the access class.
        //ac.fetch();
    }   
   
}
