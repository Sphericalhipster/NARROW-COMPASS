/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thenarrowcompasscompany.narrow.compassv2;

/**
 *
 * @author dinan
 */
public interface Conexion_BD {
    static String USUARIOBD = "root";
    
    void conectar();
    void desconectar();
}
