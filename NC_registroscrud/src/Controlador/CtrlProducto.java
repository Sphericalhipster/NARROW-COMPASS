/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */
public class CtrlProducto implements ActionListener{
    
    private Producto mod;
    private ConsultasProducto modC;
    private frmProducto frm;
    
    //constructor
    public CtrlProducto (Producto mod, ConsultasProducto modC, frmProducto frm){
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
            frm.setTitle("productos");
            frm.setLocationRelativeTo(null);
            frm.txtId.setVisible(false);
    }
        
    
    //metodo abstracto con el que llamaremos los eventos de lso botones reemplazando de esta manera evt por e
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //toma los valores de las cajas de texto e ingresarlos al modelo mod
        //boton guardar
        if(e.getSource() == frm.btnGuardar){
            mod.setCodigo(frm.txtCodigo.getText());  
            mod.setNombre(frm.txtNombre.getText());  
            mod.setPrecio(frm.txtPrecio.getText());  
            mod.setCantidad(frm.txtCantidad.getText());  
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
            mod.setCodigo(frm.txtCodigo.getText());  
            mod.setNombre(frm.txtNombre.getText());  
            mod.setPrecio(frm.txtPrecio.getText());  
            mod.setCantidad(frm.txtCantidad.getText());  
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
            
            mod.setCodigo(frm.txtCodigo.getText());  
              
            if(modC.Buscar(mod)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frm.txtId.setText(String.valueOf(mod.getId()));
                frm.txtCodigo.setText(mod.getCodigo());
                frm.txtNombre.setText(mod.getNombre());
                frm.txtPrecio.setText(mod.getPrecio());
                frm.txtCantidad.setText(mod.getCantidad());
                
                
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
        frm.txtCodigo.setText(null);
        frm.txtNombre.setText(null);
        frm.txtPrecio.setText(null);
        frm.txtCantidad.setText(null);
    }
    
}
