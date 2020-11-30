/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciadores;

import Controlador.CtrlControladorRF;
import Modelo.ConsultasRegistroFacultad;
import Modelo.RegistroFacultad;
import Vista.frmRegistroFacultad;
/**
 *
 * @author dinan
 */
public class CrudRegistroFacultad {
    public static void main(String[] args){
        
        //si lo queremos llamar en el loguin ingresamos estos parámetros en el swich case
        //creamos los objetos
        RegistroFacultad modRF = new RegistroFacultad();
        ConsultasRegistroFacultad modCRF = new ConsultasRegistroFacultad();
        frmRegistroFacultad frmRF = new frmRegistroFacultad();
        
        // llamamos el constructor que me va a recibir el modelo mod, las consultas modC y la vista frm
        CtrlControladorRF ctrl = new CtrlControladorRF(modRF, modCRF, frmRF);
        ctrl.iniciar();
        frmRF.setVisible(true);
        
    }
}
