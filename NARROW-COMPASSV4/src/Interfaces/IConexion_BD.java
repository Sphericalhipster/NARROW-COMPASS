/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.*;

/**
 *
 * @author dinan
 */
public interface IConexion_BD {
    static String base = "RegistroUsuarios";
    static String user = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" + base;
    Connection con = null;
    
    Connection getConexion();
}
