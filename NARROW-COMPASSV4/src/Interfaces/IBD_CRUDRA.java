/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.RegistroAsignaturas;

/**
 *
 * @author dinan
 */
public interface IBD_CRUDRA {
    boolean Registrar(RegistroAsignaturas RANC);
    boolean Modificar(RegistroAsignaturas RANC);
    boolean Eliminar(RegistroAsignaturas RANC);
    boolean Buscar(RegistroAsignaturas RANC);
}
