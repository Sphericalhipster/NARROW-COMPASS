/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasRegistroFacultad;
import Modelo.RegistroFacultad;
import Vista.frmRegistroFacultad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */
public class CtrlControladorRF implements ActionListener{
    
    private RegistroFacultad modRF;
    private ConsultasRegistroFacultad modCRF;
    private frmRegistroFacultad frmRF;
    
    //constructor
    public CtrlControladorRF (RegistroFacultad modRF, ConsultasRegistroFacultad modCRF, frmRegistroFacultad frmRF){
        this.modRF = modRF; 
        this.modCRF = modCRF;
        this.frmRF = frmRF;
        
        //llamo los botónes
        this.frmRF.btnGuardarRF.addActionListener(this);
        this.frmRF.btnModificarRF.addActionListener(this);
        this.frmRF.btnEliminarRF.addActionListener(this);
        this.frmRF.BtnLimpiarRF.addActionListener(this);
        this.frmRF.btnBuscarRF.addActionListener(this);
                
    } 
   
    //iniciar vista
    public void iniciar(){
            frmRF.setTitle("Registro Facultad");
            frmRF.setLocationRelativeTo(null);
            frmRF.txtIdRF.setVisible(false);
    }
        
    
    //metodo abstracto con el que llamaremos los eventos de lso botones reemplazando de esta manera evt por e
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //toma los valores de las cajas de texto e ingresarlos al modelo mod
        //boton guardar
        if(e.getSource() == frmRF.btnGuardarRF){
            modRF.setNombre(frmRF.txtNombreRF.getText());  
            modRF.setZona(frmRF.txtZonaRF.getText());  
            
            if(modCRF.Registrar(modRF)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            
        }
        // boton modificar
        if(e.getSource() == frmRF.btnModificarRF){
            
            modRF.setId(Integer.parseInt(frmRF.txtIdRF.getText()));  
            modRF.setNombre(frmRF.txtNombreRF.getText());  
            modRF.setZona(frmRF.txtZonaRF.getText());  
              
            if(modCRF.Modificar(modRF)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
            }
            
        }
        // boton eliminar 
        if(e.getSource() == frmRF.btnEliminarRF){
            
            modRF.setId(Integer.parseInt(frmRF.txtIdRF.getText()));  
              
            if(modCRF.Eliminar(modRF)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
            }
            
        }
        
        // boton buscar
        if(e.getSource() == frmRF.btnBuscarRF){
            
            modRF.setNombre(frmRF.txtNombreRF.getText());  
              
            if(modCRF.Buscar(modRF)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frmRF.txtIdRF.setText(String.valueOf(modRF.getId()));
                frmRF.txtNombreRF.setText(modRF.getNombre());
                frmRF.txtZonaRF.setText(modRF.getZona());
                
                
                
                //JOptionPane.showMessageDialog(null, "Registro Encontrado");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros ");
            }
            
        }
        
        //boton limpiar
        if(e.getSource() == frmRF.BtnLimpiarRF){
            // llama al metodo limpiar
            limpiar();
        }
        
    }
    //establecer las cajas de texto como nulas se limpiara de la caja de texto 
    public void limpiar(){
        frmRF.txtIdRF.setText(null);
        frmRF.txtNombreRF.setText(null);
        frmRF.txtZonaRF.setText(null);       
        
    }
    
}
