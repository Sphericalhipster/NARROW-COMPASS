/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.RegistroUsuarios;

/**
 *
 * @author dinan
 */
public interface IBD_CRUD {
    boolean Registrar(RegistroUsuarios RUNC);
    boolean Modificar(RegistroUsuarios RUNC);
    boolean Eliminar(RegistroUsuarios RUNC);
    boolean Buscar(RegistroUsuarios RUNC);
    boolean Loguin(RegistroUsuarios RUNC);
}
