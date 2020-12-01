/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasEstudiantes;
import Modelo.RegistroAsignaturas;
import Modelo.RegistroFacultad;
import Vista.inicio_estudianteNC;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */




public class CtrlControladorIE implements ActionListener{
    
    
    private RegistroAsignaturas modRA; 
    private RegistroFacultad modRF; 
    private ConsultasEstudiantes modCCE;
    private inicio_estudianteNC frmIE;
    
    
    //constructor
    public CtrlControladorIE (RegistroAsignaturas modRA, RegistroFacultad modRF, ConsultasEstudiantes modCCE, inicio_estudianteNC frmIE){
        
        
        this.modRA = modRA;         
        this.modRF = modRF; 
        this.modCCE = modCCE;
        this.frmIE = frmIE;
        
        //llamo los botónes
        this.frmIE.Buscar_imagen.addActionListener(this);
        
        //this.frmRA.btnLimpiarRA.addActionListener(this);
        
                
    } 

    //iniciar vista
    public void iniciar(){
            frmIE.setTitle("Inicio Estudiante");
            frmIE.setLocationRelativeTo(null);
            frmIE.txtIdRA.setVisible(false);
            frmIE.txtIdRF.setVisible(false);
            frmIE.txtGrupoRA.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String mensaje_imagen1 = null;
        String mensaje_asignatura = null;
        String numerozona = null; 
        // boton buscar
        if(e.getSource() == frmIE.Buscar_imagen){
            
            modRF.setNombre(frmIE.txtFacultadIE.getText());  
            modRA.setAcronimo(frmIE.txtAsignaturaIE.getText());  
            
            if(modCCE.Buscar(modRF)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frmIE.txtIdRF.setText(String.valueOf(modRF.getId()));
                frmIE.txtFacultadIE.setText(modRF.getNombre()+ modRF.getZona());
                //frmIE.txtZonaRF.setText(modRF.getZona());                
                                
                //JOptionPane.showMessageDialog(null, "Registro Encontrado");
                
            }            
            else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros ");
            }
            
            if(modCCE.Buscar(modRA)){
                
                //String value of hace referencia al ingreso del los valores int a txt como si fuera una conversion 
                frmIE.txtIdRA.setText(String.valueOf(modRA.getId()));
                frmIE.txtAsignaturaIE.setText(modRA.getAcronimo() + modRA.getNombre()/*+ modRA.getGrupo() + modRA.getHorario() + modRA.getComentario()*/);
                frmIE.Mostrar_asignatura.setText(modRA.getAcronimo() + modRA.getNombre() + modRA.getGrupo() + modRA.getHorario() + modRA.getComentario());
                
                //frmIE.txtZonaRF.setText(modRF.getZona());
                
                
                
                
                
                //JOptionPane.showMessageDialog(null, "Registro Encontrado");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encuentran registros ");
            }
            
            /*while(e.getSource() == frmIE.Buscar_imagen){*/
                //while (modCCE.Buscar(modRF)){
                    numerozona = modRF.getZona();
                //}
                System.out.println("La zona es " + numerozona);
                
                switch(numerozona){
                    case "1":

                        //mensaje imagen se refiere a una variable que definirá que se imprimirá en cada caso
                        mensaje_imagen1 = "Universidad Nacional Sede Bogotá";
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen = new ImageIcon ("src/imagenes/ZONA1.jpg");
                        Icon logo1 = new ImageIcon(imagen.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo1);
                        frmIE.Mostrar_imagen.setVisible(true);
                        frmIE.Mostrar_imagen.repaint();                
                        break;
                    case "2":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen2 = new ImageIcon ("src/imagenes/ZONA2.jpg");
                        Icon logo2 = new ImageIcon(imagen2.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo2);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    
                    case "3":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen3 = new ImageIcon ("src/imagenes/ZONA3.jpg");
                        Icon logo3 = new ImageIcon(imagen3.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo3);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                        
                    case "4":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen4 = new ImageIcon ("src/imagenes/ZONA4.jpg");
                        Icon logo4 = new ImageIcon(imagen4.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo4);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "5":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen5 = new ImageIcon ("src/imagenes/ZONA5.jpg");
                        Icon logo5 = new ImageIcon(imagen5.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo5);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "6":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen6 = new ImageIcon ("src/imagenes/ZONA6.jpg");
                        Icon logo6 = new ImageIcon(imagen6.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo6);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "7":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen7 = new ImageIcon ("src/imagenes/ZONA7.jpg");
                        Icon logo7 = new ImageIcon(imagen7.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo7);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "8":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen8 = new ImageIcon ("src/imagenes/ZONA8.jpg");
                        Icon logo8 = new ImageIcon(imagen8.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo8);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "9":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen9 = new ImageIcon ("src/imagenes/ZONA9.jpg");
                        Icon logo9 = new ImageIcon(imagen9.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo9);
                        frmIE.Mostrar_imagen.repaint();
                        break;
                    case "10":
                        mensaje_imagen1 = "Imagen zona 1 de la universidad";                
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagen10 = new ImageIcon ("src/imagenes/CiudadUniversitaria.jpg");
                        Icon logo10 = new ImageIcon(imagen10.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logo10);
                        frmIE.Mostrar_imagen.repaint();
                        break;

                    default:
                        //mensaje imagen se refiere a una variable que definirá que se imprimirá en cada caso
                        mensaje_imagen1 = "Universidad Nacional Sede Bogotá";
                        //crear objeto imagen que se establecerá en un label
                        ImageIcon imagendefault = new ImageIcon ("src/imagenes/zonas_universidad_nacional.png");
                        Icon logodefault = new ImageIcon(imagendefault.getImage().getScaledInstance(frmIE.Mostrar_imagen.getWidth(), frmIE.Mostrar_imagen.getHeight(), Image.SCALE_DEFAULT));
                        frmIE.Mostrar_imagen.setIcon(logodefault);
                        frmIE.Mostrar_imagen.setVisible(true);
                        frmIE.Mostrar_imagen.repaint();  
                        break;
                }
            //}
        }
    }
}


