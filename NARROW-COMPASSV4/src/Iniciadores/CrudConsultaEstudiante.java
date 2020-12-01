/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciadores;

import Controlador.CtrlControladorIE;
import Modelo.ConsultasEstudiantes;
import Modelo.RegistroAsignaturas;
import Modelo.RegistroFacultad;
import Vista.inicio_estudianteNC;

/**
 *
 * @author dinan
 */
public class CrudConsultaEstudiante {
    public static void main(String[] args){
        
        //si lo queremos llamar en el loguin ingresamos estos parámetros en el swich case
        //creamos los objetos
        RegistroAsignaturas modRA = new RegistroAsignaturas();
        RegistroFacultad modRF = new RegistroFacultad();
        ConsultasEstudiantes modCCE = new ConsultasEstudiantes();
        inicio_estudianteNC frmIE = new inicio_estudianteNC();
        
        // llamamos el constructor que me va a recibir el modelo mod, las consultas modC y la vista frm
        CtrlControladorIE ctrl = new CtrlControladorIE(modRA, modRF, modCCE, frmIE);
        ctrl.iniciar();
        frmIE.setVisible(true);
    }  
}
