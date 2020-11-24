/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author dinan
 */
public class Conexion {
    private final String base = "RegistroUsuarios";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/" + base;
    private Connection con = null;
    
    public Connection getConexion(){
        
        try{
            //ruta del controlador mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtiene la conexion y la guarda, rremplaza null 
            //en casoi de falla hacer un casteo (Connection)
            con = DriverManager.getConnection(this.url, this.user, this.password);
            
            //si no sirve el comando anterior provar con este 
            /*con = DriverManager.getConnection("jdbc:mysql://localhost/RegistroUsuarios", "root", "");*/
        }
        catch(ClassNotFoundException | SQLException e){
             System.out.println("Error al conectar: "+ e.getMessage());
        }
        return con;
    }
}
