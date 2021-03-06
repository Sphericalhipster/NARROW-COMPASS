/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Interfaces.IBD_CRUD;
import java.sql.*;
/**
 *
 * @author dinan
 */
public class ConsultasRegistroUsuarios extends Conexion implements IBD_CRUD{
    
    @Override
    public boolean Registrar(RegistroUsuarios RUNC){
        
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "insert into REGUSER (documento, nombre, usuario, contrasenia, TipoUsuario) values (?,?,?,?,?)";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, RUNC.getDocumento());
            ps.setString(2, RUNC.getNombre());
            ps.setString(3, RUNC.getUsuario());
            ps.setString(4, RUNC.getContrasenia());            
            ps.setString(5, RUNC.getTipoUsuario());            
            ps.execute();
            return true;
        }
        catch(SQLException e){
            //System.err.println("e");
            //para ver si hay error en caso de que no imprime e
            System.out.println("Error al conectar: "+ e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
               // System.err.println("e");
                System.out.println("Error al conectar: "+ e);
            }
            
        }
    }
    @Override
    public boolean Modificar(RegistroUsuarios RUNC){
        
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "update REGUSER set documento=?, nombre=?, usuario=?, contrasenia=?, TipoUsuario=? where id=?";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, RUNC.getDocumento());
            ps.setString(2, RUNC.getNombre());
            ps.setString(3, RUNC.getUsuario());
            ps.setString(4, RUNC.getContrasenia());
            ps.setString(5, RUNC.getTipoUsuario());            
            ps.setInt(6, RUNC.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            //System.err.println("e");
            //para ver si hay error en caso de que no imprime e
            System.out.println("Error al conectar: "+ e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
               // System.err.println("e");
                System.out.println("Error al conectar: "+ e);
            }
            
        }
    }
    @Override
    public boolean Eliminar(RegistroUsuarios RUNC){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "delete from  REGUSER where id=? ";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);                       
            ps.setInt(1, RUNC.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            //System.err.println("e");
            //para ver si hay error en caso de que no imprime e
            System.out.println("Error al conectar: "+ e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
               // System.err.println("e");
                System.out.println("Error al conectar: "+ e);
            }
            
        }
    
    }
    @Override
    public boolean Buscar(RegistroUsuarios RUNC){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
                                
        String consultaSQL = "select * from  REGUSER where documento=? ";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);                       
            ps.setString(1, RUNC.getDocumento());
            rs = ps.executeQuery();
            
            if(rs.next()){
                RUNC.setId(Integer.parseInt(rs.getString("id")));
                RUNC.setDocumento(rs.getString("documento"));
                RUNC.setNombre(rs.getString("nombre"));
                RUNC.setUsuario(rs.getString("usuario"));
                RUNC.setContrasenia(rs.getString("contrasenia"));
                RUNC.setTipoUsuario(rs.getString("TipoUsuario"));
                return true;
            }
            return false;
                        
        }
        catch(SQLException e){
            //System.err.println("e");
            //para ver si hay error en caso de que no imprime e
            System.out.println("Error al conectar: "+ e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
               // System.err.println("e");
                System.out.println("Error al conectar: "+ e);
            }
            
        }
    }
    
    @Override
    //prototipo, en caso e fallo quitar
    public boolean Loguin(RegistroUsuarios RUNC){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
                                
        String consultaSQL = "select id, documento, nombre, usuario, contrasenia, TipoUsuario from  REGUSER where usuario=? ";
        
        try{
            //establece la consulta usuario 
            ps = con.prepareStatement(consultaSQL);                       
            ps.setString(1, RUNC.getUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                //valida si lacontraseña del usuario es correcto 
                //siempre retornará falso a menos que las contraseñas coinciadan y los usuarios
                if(RUNC.getContrasenia().equals(rs.getString(5)) && RUNC.getTipoUsuario().equals(rs.getString(6))){
                    
                    RUNC.setId(rs.getInt(1));
                    RUNC.setNombre(rs.getString(3));
                    RUNC.setTipoUsuario(rs.getString(6));
                    
                    return true;
                    
                }
                else{
                    return false;
                }              
                
            }
            return false;
                        
        }
        catch(SQLException e){
            //System.err.println("e");
            //para ver si hay error en caso de que no imprime e
            System.out.println("Error al conectar: "+ e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
               // System.err.println("e");
                System.out.println("Error al conectar: "+ e);
            }
            
        }
    }
    
}
