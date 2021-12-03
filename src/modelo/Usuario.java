/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Isadora
 */
public class Usuario {
    private String userr;
    private String pass;
    private String estado;

    public Usuario() {
    }

    public Usuario(String userr, String pass, String estado) {
        this.userr = userr;
        this.pass = pass;
        this.estado = estado;
    }

    public String getUserr() {
        return userr;
    }

    public void setUserr(String userr) {
        this.userr = userr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
