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
public interface IBD_CRUD extends Conexion_BD{
    void Escribir();
    void LEER();
    void Consultar();
    void Borrar();
}
