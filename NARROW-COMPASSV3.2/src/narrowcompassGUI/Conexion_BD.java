/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrowcompassGUI;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dinan
 */
public interface Conexion_BD {
    
    //recuerda que está de más poner abstract en un método y final en una constante
    static  String USUARIOBD = "root";
    static  String CONNECTBD = "registrousuarios";    
    static  String PASSWORDBD = "";
    static  String URL = "jdbc:mysql://localhost/" + CONNECTBD;
    
    //void Connection();
    //conexion me va a guardar la conexión de mysql
    Connection conexion = null;

    /**
     *
     * @return
     */
    
    
    void conectar_BD();
    void desconectar_BD();
    //conectar bases de datos 
    Connection getConnection_BD();
}

