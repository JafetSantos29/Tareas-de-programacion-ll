package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



/**
 *
 * @author jafet
 */
public class conexionMysql {
  Connection cn;
    
   public Connection conectar(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_java_mysql","root","");
            System.out.print("CONECTADO");
            
       } 
       catch(ClassNotFoundException | SQLException e){
           System.out.print("ERROR DE CONEXION BD"+e);
       }
       return cn;
   }

}
