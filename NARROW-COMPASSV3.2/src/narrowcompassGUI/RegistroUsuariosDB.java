/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrowcompassGUI;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dinan
 */
public class RegistroUsuariosDB extends GUINC implements Conexion_BD{
    
    /**
     * Creates new form RegistroUsuariosDB
     */
    // botón salir método abstracto
    @Override
    public void Salir(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null,Mostrar_mensaje());         
        System.exit(WIDTH);  
    }
        
    public RegistroUsuariosDB() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        intdocumento = new javax.swing.JTextField();
        varcharnombre = new javax.swing.JTextField();
        varcharusuario = new javax.swing.JTextField();
        varchartipouser = new javax.swing.JTextField();
        botone = new javax.swing.JToggleButton();
        botonl = new javax.swing.JToggleButton();
        botong = new javax.swing.JToggleButton();
        botonm = new javax.swing.JToggleButton();
        botonb = new javax.swing.JToggleButton();
        varcharcontrasenia = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        intid = new javax.swing.JTextField();
        conectarBD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(249, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 65, -1));

        jLabel1.setText("Documento:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 110, -1, -1));

        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, -1, -1));

        jLabel4.setText("Contrasenia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 187, -1, -1));

        jLabel5.setText("TipoUsuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 220, -1, -1));
        jPanel1.add(intdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 67, 120, -1));
        jPanel1.add(varcharnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 107, 120, -1));

        varcharusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varcharusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(varcharusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 147, 120, -1));
        jPanel1.add(varchartipouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 217, 120, -1));

        botone.setText("Eliminar");
        jPanel1.add(botone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, -1));

        botonl.setText("Limpiar");
        jPanel1.add(botonl, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 280, 80, -1));

        botong.setText("Guardar");
        jPanel1.add(botong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, -1));

        botonm.setText("Modificar");
        jPanel1.add(botonm, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 250, 80, -1));

        botonb.setText("Buscar");
        jPanel1.add(botonb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));
        jPanel1.add(varcharcontrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 184, 120, -1));

        jLabel6.setText("CRUD USUARIOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 30, -1, -1));

        intid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intidActionPerformed(evt);
            }
        });
        jPanel1.add(intid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 20));

        conectarBD.setText("conectar");
        conectarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarBDActionPerformed(evt);
            }
        });
        jPanel1.add(conectarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.Salir(evt);
    }//GEN-LAST:event_SalirActionPerformed

    private void varcharusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varcharusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varcharusuarioActionPerformed

    private void intidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intidActionPerformed

    private void conectarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarBDActionPerformed
        // TODO add your handling code here:
        java.sql.Connection cn; 
        ConexionBD con = new ConexionBD(); 
        cn = con.getConnection_BD();
        
        if(cn!= null){
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al conectar");  
        }
    }//GEN-LAST:event_conectarBDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuariosDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuariosDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuariosDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuariosDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuariosDB().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Salir;
    public javax.swing.JToggleButton botonb;
    public javax.swing.JToggleButton botone;
    public javax.swing.JToggleButton botong;
    public javax.swing.JToggleButton botonl;
    public javax.swing.JToggleButton botonm;
    private javax.swing.JButton conectarBD;
    public javax.swing.JTextField intdocumento;
    public javax.swing.JTextField intid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField varcharcontrasenia;
    public javax.swing.JTextField varcharnombre;
    public javax.swing.JTextField varchartipouser;
    public javax.swing.JTextField varcharusuario;
    // End of variables declaration//GEN-END:variables
    
    //conexion me va a guardar la conexión de mysql
    /*private Connection conexion = null;
    public Connection getConnection_BD(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIOBD, PASSWORDBD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroUsuariosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
    }*/
    
    
    
    @Override
    public void conectar_BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desconectar_BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection conexion = null;
    @Override    
    public Connection getConnection_BD(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIOBD, PASSWORDBD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroUsuariosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
    }
    
}