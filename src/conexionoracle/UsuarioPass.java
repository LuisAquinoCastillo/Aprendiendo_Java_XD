/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionoracle;

public class UsuarioPass {
    private String usuario;
    private String password;
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
