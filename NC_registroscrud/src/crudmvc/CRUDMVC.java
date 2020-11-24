/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

/**
 *
 * @author dinan
 */
public class CRUDMVC {
    
    public static void main(String[] args){
        //si lo queremos llamar en el loguin ingresamos estos parámetros en el swich case
        //creamos los objetos
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();
        
        // llamamos el constructor que me va a recibir el modelo mod, las consultas modC y la vista frm
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    
    }
    
}
