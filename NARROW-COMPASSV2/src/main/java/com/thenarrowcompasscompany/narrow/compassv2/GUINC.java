/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thenarrowcompasscompany.narrow.compassv2;

//imprimir en otra pantalla
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author dinan
 */
public abstract class GUINC extends javax.swing.JFrame /*implements GUINC1*/ {
    
    public abstract void Salir(java.awt.event.ActionEvent evt);
    public String Mostrar_mensaje(){
        return "Hasta Luego...";
    }

}
