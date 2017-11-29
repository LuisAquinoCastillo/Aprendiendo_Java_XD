/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionoracle;
import java.sql.*;
/**
 *
 * @author luisaquino
 */
public class InclusionDriver {
    
    public static Connection ConectarAOracle(String usuario,String pass)throws SQLException, ClassNotFoundException{
        String url="jdbc:oracle:thin:@localhost:1521:prueba";
        //Carga del driver
        Class.forName("oracle.jdbc.driver");
        Connection con= DriverManager.getConnection(url, usuario, pass);
        return con;
    }
}
