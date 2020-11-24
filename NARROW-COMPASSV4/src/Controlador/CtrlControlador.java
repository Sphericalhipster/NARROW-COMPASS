/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasRegistroUsuarios;
import Modelo.RegistroUsuarios;
import Vista.frmRegistroUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author dinan
 */
public class CtrlControlador implements ActionListener{
    private RegistroUsuarios mod;
    private ConsultasRegistroUsuarios modC;
    private frmRegistroUsuarios frm;
    
    //constructor
    public CtrlControlador (RegistroUsuarios mod, ConsultasRegistroUsuarios modC, frmRegistroUsuarios frm){
        this.mod = mod; 
        this.modC = modC;
        this.frm = frm;
        
        //llamo los botónes
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
                
    } 
   
    //inicair vista
    public void iniciar(){
            frm.setTitle("RegistroUsuarios");
            frm.setLocationRelativeTo(null);
            frm.txtId.setVisible(false);
    }
        
    
    //metodo abstracto con el que llamaremos los eventos de lso botones reemplazando de esta manera evt por e
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //toma los valores de las cajas de texto e ingresarlos al modelo mod
        //boton guardar
        if(e.getSource() == frm.btnGuardar){
            mod.setDocumento(frm.txtDocumento.getText());  
            mod.setNombre(frm.txtNombre.getText());  
            mod.setUsuario(frm.txtUsuario.getText());  
            mod.setContrasenia(frm.txtContrasenia.getText());  
            mod.setTipoUsuario(frm.txtTipoUsuario.getText());  
            if(modC.Registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            
        }
        // boton modificar
        if(e.getSource() == frm.btnModificar){
            
            mod.setId(Integer.parseInt(frm.txtId.getText()));  
            mod.setDocumento(frm.txtDocumento.getText());  
            mod.setNombre(frm.txtNombre.getText());  
            mod.setUsuario(frm.txtUsuario.getText());  
            mod.setContrasenia(frm.txtContrasenia.getText());  
            mod.setTipoUsuario(frm.txtTipoUsuario.getText());  
            if(modC.Modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
            }
            
        }
        // boton eliminar 
        if(e.getSource() == frm.btnEliminar){
            
            mod.setId(Integer.parseInt(frm.txtId.getText()));  
              
            if(modC.Eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
            }
            
        }
        
        // boton buscar
        if(e.getSource() == frm.btnBuscar){
            
            mod.setDocumento(frm.txtDocumento.getText());  
              
            if(modC.Buscar(mod)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frm.txtId.setText(String.valueOf(mod.getId()));
                frm.txtDocumento.setText(mod.getDocumento());
                frm.txtNombre.setText(mod.getNombre());
                frm.txtUsuario.setText(mod.getUsuario());
                frm.txtContrasenia.setText(mod.getContrasenia());
                frm.txtTipoUsuario.setText(mod.getTipoUsuario());
                
                
                //JOptionPane.showMessageDialog(null, "Registro Encontrado");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros ");
            }
            
        }
        
        //boton limpiar
        if(e.getSource() == frm.btnLimpiar){
            // llama al metodo limpiar
            limpiar();
        }
        
    }
    //establecer las cajas de texto como nulas se limpiara de la caja de texto 
    public void limpiar(){
        frm.txtId.setText(null);
        frm.txtDocumento.setText(null);
        frm.txtNombre.setText(null);
        frm.txtUsuario.setText(null);
        frm.txtContrasenia.setText(null);
        frm.txtTipoUsuario.setText(null);
        
    }
}
