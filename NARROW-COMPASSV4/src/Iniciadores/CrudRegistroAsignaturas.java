/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciadores;

import Controlador.CtrlControladorRA;
import Modelo.ConsultasRegistroAsignaturas;
import Modelo.RegistroAsignaturas;
import Vista.frmRegistroAsignaturas;

/**
 *
 * @author dinan
 */
public class CrudRegistroAsignaturas {
    public static void main(String[] args){
        
        //si lo queremos llamar en el loguin ingresamos estos parámetros en el swich case
        //creamos los objetos
        RegistroAsignaturas modRA = new RegistroAsignaturas();
        ConsultasRegistroAsignaturas modCRA = new ConsultasRegistroAsignaturas();
        frmRegistroAsignaturas frmRA = new frmRegistroAsignaturas();
        
        // llamamos el constructor que me va a recibir el modelo mod, las consultas modC y la vista frm
        CtrlControladorRA ctrl = new CtrlControladorRA(modRA, modCRA, frmRA);
        ctrl.iniciar();
        frmRA.setVisible(true);
        
    }
}
