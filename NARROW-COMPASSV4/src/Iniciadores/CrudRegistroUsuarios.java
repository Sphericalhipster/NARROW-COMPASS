/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciadores;

import Controlador.CtrlControlador;
import Modelo.ConsultasRegistroUsuarios;
import Modelo.RegistroUsuarios;
import Vista.frmRegistroUsuarios;
/**
 *
 * @author dinan
 */
public class CrudRegistroUsuarios {
    
    public static void main(String[] args){
        
        //si lo queremos llamar en el loguin ingresamos estos parámetros en el swich case
        //creamos los objetos
        RegistroUsuarios mod = new RegistroUsuarios();
        ConsultasRegistroUsuarios modC = new ConsultasRegistroUsuarios();
        frmRegistroUsuarios frm = new frmRegistroUsuarios();
        
        // llamamos el constructor que me va a recibir el modelo mod, las consultas modC y la vista frm
        CtrlControlador ctrl = new CtrlControlador(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }

    /*public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
