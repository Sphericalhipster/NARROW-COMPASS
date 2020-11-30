/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.ConsultasRegistroAsignaturas;
import Modelo.RegistroAsignaturas;
import Vista.frmRegistroAsignaturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */
public class CtrlControladorRA implements ActionListener{
    private RegistroAsignaturas modRA;
    private ConsultasRegistroAsignaturas modCRA;
    private frmRegistroAsignaturas frmRA;
    
    //constructor
    public CtrlControladorRA (RegistroAsignaturas modRA, ConsultasRegistroAsignaturas modCRA, frmRegistroAsignaturas frmRA){
        this.modRA = modRA; 
        this.modCRA = modCRA;
        this.frmRA = frmRA;
        
        //llamo los botónes
        this.frmRA.btnGuardarRA.addActionListener(this);
        this.frmRA.btnModificarRA.addActionListener(this);
        this.frmRA.btnEliminarRA.addActionListener(this);
        this.frmRA.btnLimpiarRA.addActionListener(this);
        this.frmRA.btnBuscarRA.addActionListener(this);
                
    } 
   
    //iniciar vista
    public void iniciar(){
            frmRA.setTitle("RegistroFacultad");
            frmRA.setLocationRelativeTo(null);
            frmRA.txtIdRA.setVisible(false);
    }
        
    
    //metodo abstracto con el que llamaremos los eventos de lso botones reemplazando de esta manera evt por e
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //toma los valores de las cajas de texto e ingresarlos al modelo mod
        //boton guardar
        if(e.getSource() == frmRA.btnGuardarRA){
            modRA.setAcronimo(frmRA.txtAcronimoRA.getText());  
            modRA.setNombre(frmRA.txtNombreRA.getText());  
            modRA.setGrupo(frmRA.txtGrupoRA.getText());  
            modRA.setHorario(frmRA.txtHorarioRA.getText());  
            modRA.setComentario(frmRA.txtComentariosRA.getText());  
            
            
            if(modCRA.Registrar(modRA)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            
        }
        // boton modificar
        if(e.getSource() == frmRA.btnModificarRA){
            
            modRA.setId(Integer.parseInt(frmRA.txtIdRA.getText()));  
            modRA.setAcronimo(frmRA.txtAcronimoRA.getText());  
            modRA.setNombre(frmRA.txtNombreRA.getText());  
            modRA.setGrupo(frmRA.txtGrupoRA.getText());  
            modRA.setHorario(frmRA.txtHorarioRA.getText());  
            modRA.setComentario(frmRA.txtComentariosRA.getText());  
            
              
            if(modCRA.Modificar(modRA)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
            }
            
        }
        // boton eliminar 
        if(e.getSource() == frmRA.btnEliminarRA){
            
            modRA.setId(Integer.parseInt(frmRA.txtIdRA.getText()));  
              
            if(modCRA.Eliminar(modRA)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                //invocar el método limpiar 
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
            }
            
        }
        
        // boton buscar
        if(e.getSource() == frmRA.btnBuscarRA){
            
            modRA.setNombre(frmRA.txtNombreRA.getText());  
              
            if(modCRA.Buscar(modRA)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frmRA.txtIdRA.setText(String.valueOf(modRA.getId()));
                frmRA.txtAcronimoRA.setText(modRA.getAcronimo());
                frmRA.txtNombreRA.setText(modRA.getNombre());
                frmRA.txtGrupoRA.setText(modRA.getGrupo());
                frmRA.txtHorarioRA.setText(modRA.getHorario());
                frmRA.txtComentariosRA.setText(modRA.getComentario());
                
                
                
                
                //JOptionPane.showMessageDialog(null, "Registro Encontrado");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros ");
            }
            
        }
        
        //boton limpiar
        if(e.getSource() == frmRA.btnLimpiarRA){
            // llama al metodo limpiar
            limpiar();
        }
        
    }
    //establecer las cajas de texto como nulas se limpiara de la caja de texto 
    public void limpiar(){
        frmRA.txtIdRA.setText(null);
        frmRA.txtAcronimoRA.setText(null);
        frmRA.txtNombreRA.setText(null);
        frmRA.txtGrupoRA.setText(null);
        frmRA.txtHorarioRA.setText(null);
        frmRA.txtComentariosRA.setText(null);
              
        
    }
}
