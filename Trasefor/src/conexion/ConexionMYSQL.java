
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMYSQL {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String database = "TraseforTamara";
    private static String hostname = " 192.168.56.1 ";
    private static String port = "3306";
    private static String username = "root";
    private static String password = "123456789";
    private static String connectionURL;
    private static Connection conn;
    
    public ConexionMYSQL(){
        this.connectionURL = "jdbc:mysql://";
        this.connectionURL = += hostname + ":" + port + "/" + database;
        this.connectionURL += " autoReconnect=tru&useSSL=false";
    }
    public static Connection getConnection(){
    try {
        Class.forName(driver);
        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
        } catch(SQLException e){
            System.out.print("no se puede conectar:"+e.getMessage());
        }
    } catch (ClassNotFoundException ex){
        System.out.print("la clase "+driver+" no existe en el sistema");
    }
    return conn;
    }
}
