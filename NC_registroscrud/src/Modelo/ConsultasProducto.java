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
public class ConsultasProducto extends Conexion {
    public boolean Registrar(Producto pro){
        
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "insert into producto (codigo, nombre, precio, cantidad) values (?,?,?,?)";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getPrecio());
            ps.setString(4, pro.getCantidad());            
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
    
    public boolean Modificar(Producto pro){
        
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "update producto set codigo=?, nombre=?, precio=?, cantidad=? where id=?";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);
            ps./*setInt*/setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getPrecio());
            ps.setString(4, pro.getCantidad());            
            ps.setInt(5, pro.getId());
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
    
    public boolean Eliminar(Producto pro){
        
        
        PreparedStatement ps = null;
        Connection con = getConexion();
                                
        String consultaSQL = "delete from  producto where id=? ";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);                       
            ps.setInt(1, pro.getId());
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
    
    public boolean Buscar(Producto pro){
        
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
                                
        String consultaSQL = "select * from  producto where codigo=? ";
        
        try{
            ps = /*(PreparedStatement)*/ con.prepareStatement(consultaSQL);                       
            ps.setString(1, pro.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getString("precio"));
                pro.setCantidad(rs.getString("cantidad"));
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