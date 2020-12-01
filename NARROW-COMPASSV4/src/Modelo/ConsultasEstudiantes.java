/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaces.IBD_CRUDRA;
import Interfaces.IBD_CRUDRF;
import java.sql.*;

/**
 *
 * @author dinan
 */
public class ConsultasEstudiantes extends Conexion implements IBD_CRUDRA, IBD_CRUDRF{

    
    @Override
    public boolean Buscar(RegistroAsignaturas RANC) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
                                
        String consultaSQL = "select * from  REGASIGNATURA where acronimo=? ";
        
        try{
            ps = con.prepareStatement(consultaSQL);                       
            ps.setString(1, RANC.getAcronimo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                RANC.setId(Integer.parseInt(rs.getString("id_a")));                
                RANC.setAcronimo(rs.getString("acronimo"));
                RANC.setNombre(rs.getString("nombre"));                
                RANC.setGrupo(rs.getString("grupo"));                
                RANC.setHorario(rs.getString("horario"));                
                RANC.setComentario(rs.getString("Comentario"));                
                
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
    
    
    
    
    
    @Override
    public boolean Registrar(RegistroAsignaturas RANC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modificar(RegistroAsignaturas RANC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(RegistroAsignaturas RANC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean Registrar(RegistroFacultad RFNC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modificar(RegistroFacultad RFNC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(RegistroFacultad RFNC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}
