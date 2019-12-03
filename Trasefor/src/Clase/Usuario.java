
package Clase;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    private int id_usuario;
    private String apodo;
    private String clave;
    
    public Usuario() {
        
    }
    public static boolean conectar (String usuario, String clave){
        boolean valido = false;
        ConexionMYSQL sql = new ConexionMYSQL();
        
        String query ="SELEC * FROM usuario" ;
        query += "WHERE apodo = '" + usuario + "' ";
        query += "AND clave = '" + clave + "'";
        
      try {  
        Statement s = sql.conn.createStatement();
        resulSet rs = s.executeQuery(query);
    } catch (SQLException ex){
        Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}