
package narrowcompassGUI;

import com.mysql.jdbc.Connection;
//error de import
//import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ConsultasUsuarioBD extends ConexionBD{
    
    public boolean Registrar(REGUSER registrousuarios){
        
        
        PreparedStatement ps = null;
        Connection conexion = getConnection_BD();
        
        String consultaSQL = "insert into reguser(documento, nombre, usuario, contrasenia, TipoUsuario) "
                             + "values (?, ?, ?, ?, ?);";
        
        try{
            ps = /*(PreparedStatement)*/ conexion.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, registrousuarios.getDocumentoR());
            ps.setString(2, registrousuarios.getNombreR());
            ps.setString(3, registrousuarios.getUsuarioR());
            ps.setString(4, registrousuarios.getContraseniaR());
            ps.setString(5, registrousuarios.getTupoUsuarioR());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println("e");
            return false;
        }
        finally{
            try{
                conexion.close();
            }
            catch(SQLException e){
                System.err.println("e");
            }
            
        }
        
        
    
    }
    
    
    public boolean Modificar(REGUSER registrousuarios){
        
        
        PreparedStatement ps = null;
        Connection conexion = getConnection_BD();
        
        String consultaSQL = "update reguser set documento = ?, nombre = ?, usuario = ?, contrasenia = ?, TipoUsuario = ? "
                             + "where id = ? ";
        
        try{
            ps = conexion.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, registrousuarios.getDocumentoR());
            ps.setString(2, registrousuarios.getNombreR());
            ps.setString(3, registrousuarios.getUsuarioR());
            ps.setString(4, registrousuarios.getContraseniaR());
            ps.setString(5, registrousuarios.getTupoUsuarioR());
            ps./*setInt*/setString(5, registrousuarios.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println("e");
            return false;
        }
        finally{
            try{
                conexion.close();
            }
            catch(SQLException e){
                System.err.println("e");
            }
            
        }
        
        
    
    }
    
    public boolean Eliminar(REGUSER registrousuarios){
        
        
        PreparedStatement ps = null;
        Connection conexion = getConnection_BD();
        
        String consultaSQL = "delete from reguser where id=? ";
        
        try{
            ps = (PreparedStatement) conexion.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, registrousuarios.getId());
            
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println("e");
            return false;
        }
        finally{
            try{
                conexion.close();
            }
            catch(SQLException e){
                System.err.println("e");
            }
            
        }
        
        
    
    }
    
    public boolean Buscar(REGUSER registrousuarios){
        
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConnection_BD();
        
        String consultaSQL = "select * from reguser where documento = ? ";
        
        try{
            ps = (PreparedStatement) conexion.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, registrousuarios.getDocumentoR());            
            ps.executeQuery();
            
            if(rs.next()){
                registrousuarios.setId(/*Integer.parseInt*/(rs.getString("id")));
                registrousuarios.setDocumentoR(/*Integer.parseInt*/(rs.getString("documento")));
                registrousuarios.setNombreR(rs.getString("nombre"));
                registrousuarios.setUsuarioR(rs.getString("usuario"));
                registrousuarios.setContraseniaR(rs.getString("contrasenia"));
                registrousuarios.setTupoUsuarioR(rs.getString("TipoUsuario"));
                
                return true;
            }
            
            return true;
            
        }
        catch(SQLException e){
            System.err.println("e");
            return false;
        }
        finally{
            try{
                conexion.close();
            }
            catch(SQLException e){
                System.err.println("e");
            }
            
        }
        
        
    
    }
}
 