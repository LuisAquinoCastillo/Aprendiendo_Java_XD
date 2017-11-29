/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionoracle;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luisaquino
 */
public class ConexionOracle {
    UsuarioPass up;
    String usu=up.getUsuario();
    String pas=up.getPassword();
    String respuesta;
    
    public String conectar(){
        Connection con=null;
        try{
            con=InclusionDriver.ConectarAOracle(usu, pas);
            respuesta="Succssefull connection";
        }catch(ClassNotFoundException e){
            respuesta="WARNING Driver is not included";
        }catch(SQLException e){
            respuesta="Connection failed";
        }finally{
           try{
               if (con!=null)con.close();
               respuesta="Service Terminated";
           } catch(SQLException e){
           }
        }
        return respuesta;
    }
    
}
