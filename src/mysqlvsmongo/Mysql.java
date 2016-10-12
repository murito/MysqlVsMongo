
package mysqlvsmongo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author murito
 */
public class Mysql {
    protected Connection conn = null;
    protected String DBNAME = "mysql_vs_mongo";
    protected String HOST = "127.0.0.1";
    protected String DSN = "jdbc:mysql://"+this.HOST+"/"+this.DBNAME;//data source name
    protected String DBUSER = "root";
    protected String DBPASS = "";
    
    /**
     * Establece la conexion conla instancia de mysql
     * @return Un objeto de la conexion 
     */
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                this.conn = (Connection) DriverManager.getConnection(this.DSN,this.DBUSER,this.DBPASS);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con base de datos. (0)");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar conector de base de datos. (01)");
        }
        
        return conn;
    }
    
    /**
     * Inserta un objeto de heroe en la tabla heroe
     * @param heroe El objeto de heroe
     */
    public void insertaHeroe(Heroe heroe){
        try {
            String sql = "INSERT INTO heroe(nombre, estatura, peso, nivel_poder, energia) ";
            sql += "VALUES(?, ?, ?, ?, ?)";
            
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            ps.setString(1, heroe.getNombre());
            ps.setFloat(2, heroe.getEstatura());
            ps.setFloat(3, heroe.getPeso());
            ps.setInt(4, heroe.getNivel_poder());
            ps.setDouble(5, heroe.getEnergia());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Cierra la conexion con la instancia de MySQL
     */
    public void close(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
