
package mysqlvsmongo;

/**
 *
 * @author murito
 */
public class MysqlVsMongo {

    /**
     * Progtrama para la comparación de tiempos de inserción en base de datos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generador gen = new Generador();
        gen.generadorMysql()
           .generadorMongo();
    }
    
}
