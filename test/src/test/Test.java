/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con=null;
        try
        {
        // TODO code application logic here
            con=DriverManager.getConnection
       ("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp9","fdp9");  
            
      if(con !=null)
      {
     // con=DriverManager.getConnection
     //   ("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp9","fdp9");   
   //  System.out.println("Connection Established");
     Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from addressbook");
while(rs.next())
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      
con.close();

      }
  
}catch(Exception e){ System.out.println("Connection Failed");}

}
}
