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
import static narrowcompassGUI.Conexion_BD.PASSWORDBD;
import static narrowcompassGUI.Conexion_BD.URL;
import static narrowcompassGUI.Conexion_BD.USUARIOBD;

/**
 *
 * @author dinan
 */

public class ConexionBD implements Conexion_BD{
    
    private Connection conexion = null;
    
    
    @Override
    public Connection getConnection_BD(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIOBD, PASSWORDBD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroUsuariosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
    }

    @Override
    public void conectar_BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar_BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    

}
