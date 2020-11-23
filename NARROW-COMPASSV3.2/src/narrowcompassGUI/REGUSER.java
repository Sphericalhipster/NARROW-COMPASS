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
//prueba de ehrencia métodos de consultausuario en caso de falla borrar
public class REGUSER /*extends ConsultasUsuarioBD*/{
    
    private String id;
    private String documentoR;
    private String nombreR;
    private String usuarioR;
    private String contraseniaR;
    private String TupoUsuarioR;
    
    //encapsulamiento
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*public int getDocumentoR() {
        return documentoR;
    }

    public void setDocumentoR(int documentoR) {
        this.documentoR = documentoR;
    }*/
    public String getDocumentoR() {
        return documentoR;
    }

    public void setDocumentoR(String documentoR) {
        this.documentoR = documentoR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getUsuarioR() {
        return usuarioR;
    }

    public void setUsuarioR(String usuarioR) {
        this.usuarioR = usuarioR;
    }

    public String getContraseniaR() {
        return contraseniaR;
    }

    public void setContraseniaR(String contraseniaR) {
        this.contraseniaR = contraseniaR;
    }

    public String getTupoUsuarioR() {
        return TupoUsuarioR;
    }

    public void setTupoUsuarioR(String TupoUsuarioR) {
        this.TupoUsuarioR = TupoUsuarioR;
    }
}
