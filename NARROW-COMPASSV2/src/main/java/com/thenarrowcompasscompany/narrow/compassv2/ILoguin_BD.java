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
public interface ILoguin_BD extends Conexion_BD{
    void Verificar_Usuario();
    void Modificar_Contraseña();
    void Registro_Usuario();
}
