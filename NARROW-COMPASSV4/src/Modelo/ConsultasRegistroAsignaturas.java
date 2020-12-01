/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Interfaces.IBD_CRUDRA;
import java.sql.*;
/**
 *
 * @author dinan
 */
public class ConsultasRegistroAsignaturas extends Conexion implements IBD_CRUDRA{

    @Override
    public boolean Registrar(RegistroAsignaturas RANC) {
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "insert into REGASIGNATURA(acronimo, nombre, grupo, horario, Comentario) values (?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(consultaSQL);
            ps.setString(1, RANC.getAcronimo());
            ps.setString(2, RANC.getNombre());                       
            ps.setString(3, RANC.getGrupo());                       
            ps.setString(4, RANC.getHorario());                       
            ps.setString(5, RANC.getComentario());                       
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
    public boolean Modificar(RegistroAsignaturas RANC) {
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "update REGASIGNATURA set acronimo=?, nombre=?, grupo=?, horario=?, Comentario=? where id_a=?";
        
        try{
            ps = con.prepareStatement(consultaSQL);            
            ps.setString(1, RANC.getAcronimo());
            ps.setString(2, RANC.getNombre());                
            ps.setString(2, RANC.getGrupo());                
            ps.setString(2, RANC.getHorario());                
            ps.setString(2, RANC.getComentario());                
            ps.setInt(3, RANC.getId());
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
    public boolean Eliminar(RegistroAsignaturas RANC) {
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "delete from  REGASIGNATURA where id_a=? ";
        
        try{
            ps = con.prepareStatement(consultaSQL);                       
            ps.setInt(1, RANC.getId());
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
    public boolean Buscar(RegistroAsignaturas RANC) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //reparacion consulta por acrónimo                        
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
    
}
