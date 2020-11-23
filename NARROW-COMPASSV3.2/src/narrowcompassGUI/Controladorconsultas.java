/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrowcompassGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */
public class Controladorconsultas implements ActionListener{

    private REGUSER modificar;
    private ConsultasUsuarioBD modificarC;
    private RegistroUsuariosDB visual;
    
    //constructor
    public Controladorconsultas(REGUSER modificar, ConsultasUsuarioBD modificarC, RegistroUsuariosDB visual){
        
        this.modificar = modificar;
        this.modificarC = modificarC;
        this.visual = visual;
        
        this.visual.botong.addActionListener(this);
        this.visual.botonm.addActionListener(this);
        this.visual.botonb.addActionListener(this);
        this.visual.botone.addActionListener(this);
        this.visual.botonl.addActionListener(this);
        
        
    }
    public void iniciarvista(){
        visual.setTitle("REGUSER");
        visual.setLocationRelativeTo(null);
        visual.intid.setVisible(false);
    }
    //acciones de lso botones
    @Override
    public void actionPerformed(/*java.awt.event.ActionEvent evt-*/ActionEvent evt){
        
        
        //if botón guardar botong
        if(evt.getSource() == visual.botong){
            modificar.setDocumentoR(/*Integer.parseInt*/(visual.intdocumento.getText()));
            modificar.setNombreR(visual.varcharnombre.getText());
            modificar.setContraseniaR(visual.varcharcontrasenia.getText());
            modificar.setUsuarioR(visual.varcharusuario.getText());
            modificar.setTupoUsuarioR(visual.varchartipouser.getText());
            
            //if que envía el modificador REGUSER al modificador ConsultasUsuarioBD para validad si se cumplió el Query
            if(modificarC.Registrar(modificar)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                Limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
                Limpiar();
            }
        }
        
        //if boton modificar botonm
        
        if(evt.getSource() == visual.botonm){
            
            modificar.setId(/*Integer.parseInt*/(visual.intid.getText()));
            modificar.setDocumentoR(/*Integer.parseInt*/(visual.intdocumento.getText()));
            modificar.setNombreR(visual.varcharnombre.getText());
            modificar.setContraseniaR(visual.varcharcontrasenia.getText());
            modificar.setUsuarioR(visual.varcharusuario.getText());
            modificar.setTupoUsuarioR(visual.varchartipouser.getText());
            
            //if que envía el modificador REGUSER al modificador ConsultasUsuarioBD para validad si se cumplió el Query
            if(modificarC.Modificar(modificar)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                Limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                Limpiar();
            }
        }
        
        //if boton eliminat botone
        
        if(evt.getSource() == visual.botone){
            
            modificar.setId(/*Integer.parseInt*/(visual.intid.getText()));
            
            
            //if que envía el modificador REGUSER al modificador ConsultasUsuarioBD para validad si se cumplió el Query
            if(modificarC.Eliminar(modificar)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                Limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Eliminado");
                Limpiar();
            }
        }
        
        //if botonbuscar botonb
        
        if(evt.getSource() == visual.botonb){
            
            modificar.setDocumentoR(/*Integer.parseInt*/(visual.intdocumento.getText()));
            
            
            //if que envía el modificador REGUSER al modificador ConsultasUsuarioBD para validad si se cumplió el Query
            if(modificarC.Buscar(modificar)){
                //establece en la caja de texto los valores establecidos los valores tipo int se convierten con String.valueof
                
                visual.intid.setText(String.valueOf(modificar.getId()));
                visual.intdocumento.setText(String.valueOf(modificar.getDocumentoR()));
                visual.varcharnombre.setText(modificar.getNombreR());
                visual.varcharusuario.setText(modificar.getUsuarioR());
                visual.varcharcontrasenia.setText(modificar.getContraseniaR());
                visual.varchartipouser.setText(modificar.getTupoUsuarioR());
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró el resultado");
                Limpiar();
            }
        }
        
        if(evt.getSource() == visual.botonl){
            Limpiar();
        }
        
        
    }
    //establecer cajas de texto como nulas o vacías
    public void Limpiar(){
        visual.intid.setText(null);
        visual.intdocumento.setText(null);
        visual.varcharnombre.setText(null);
        visual.varcharusuario.setText(null);
        visual.varchartipouser.setText(null);
        visual.varcharcontrasenia.setText(null);
    }
    
    
    /*@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}
