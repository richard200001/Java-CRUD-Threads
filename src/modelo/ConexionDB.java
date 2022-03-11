package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class ConexionDB {
    
    public static Connection obtenerConexion(){
        Connection conn=null;
        String URL="jdbc:mysql://localhost:3306/DataBase";
        String usuario="root";
        String password="password";
        try{
             conn=DriverManager.getConnection(URL,usuario,password);
             if(conn != null){
                 System.out.println("Se estableció la conexión");
                 return conn;
             }
        }catch(SQLException e){
            System.out.println("No se pudo establecer la conexión"+e.getMessage());
           
        }
         return conn;
    }
}
