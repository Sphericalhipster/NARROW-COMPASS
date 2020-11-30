/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.RegistroFacultad;

/**
 *
 * @author dinan
 */
public interface IBD_CRUDRF {
    boolean Registrar(RegistroFacultad RFNC);
    boolean Modificar(RegistroFacultad RFNC);
    boolean Eliminar(RegistroFacultad RFNC);
    boolean Buscar(RegistroFacultad RFNC);
    
}
