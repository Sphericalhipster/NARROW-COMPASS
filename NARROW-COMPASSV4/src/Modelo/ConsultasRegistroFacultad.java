/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.IBD_CRUDRF;
import java.sql.*;

/**
 *
 * @author dinan
 */
public class ConsultasRegistroFacultad extends Conexion implements IBD_CRUDRF{

    @Override
    public boolean Registrar(RegistroFacultad RFNC) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "insert into REGFACULTAD (nombref, zona) values (?,?)";
        
        try{
            ps = con.prepareStatement(consultaSQL);
            ps.setString(1, RFNC.getNombre());
            ps.setString(2, RFNC.getZona());                       
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
    public boolean Modificar(RegistroFacultad RFNC) {
       
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "update REGFACULTAD set nombref=?, zona=? where id_f=?";
        
        try{
            ps = con.prepareStatement(consultaSQL);            
            ps.setString(1, RFNC.getNombre());
            ps.setString(2, RFNC.getZona());                
            ps.setInt(3, RFNC.getId());
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
    public boolean Eliminar(RegistroFacultad RFNC) {
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "delete from  REGFACULTAD where id_f=? ";
        
        try{
            ps = con.prepareStatement(consultaSQL);                       
            ps.setInt(1, RFNC.getId());
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
    public boolean Buscar(RegistroFacultad RFNC) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
                                
        String consultaSQL = "select * from  REGFACULTAD where nombref=? ";
        
        try{
            ps = con.prepareStatement(consultaSQL);                       
            ps.setString(1, RFNC.getNombre());
            rs = ps.executeQuery();
            
            if(rs.next()){
                RFNC.setId(Integer.parseInt(rs.getString("id_f")));                
                RFNC.setNombre(rs.getString("nombref"));
                RFNC.setZona(rs.getString("zona"));                
                
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
}

    
    

