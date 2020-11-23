/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrowcompassGUI;

/**
 *
 * @author dinan
 */
public class ConsultarUsuariosMVC {
    //aplicando poliformismo
    
    public static void main(String[] args){
        
        REGUSER modificar = new REGUSER();
        ConsultasUsuarioBD modificarC = new ConsultasUsuarioBD(); 
        RegistroUsuariosDB visual = new RegistroUsuariosDB();
        
        Controladorconsultas ctrl = new Controladorconsultas(modificar, modificarC, visual);
        ctrl.iniciarvista();
        visual.setVisible(true);
        
        
        
    }
    
}
