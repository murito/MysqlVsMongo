
package mysqlvsmongo;


/**
 *
 * @author murito
 */
public class Generador {
    /**
     * Objeto de tipo Heore
     * Almacena las propiedades del heore
     */
    private Heroe heroe;
    
    /**
     * Objeto de tipo Nombre
     * Almacena los nombres y apellidos para aleatorizar un nombre
     */
    private Nombres nombres;
    
    /**
     * Objeto de tipo Utilerias
     * Contiene los métodos para aleatorizar datos e impresión de tiempos
     */
    private Utilerias utils;
    
    /**
     * Variables para el conteo de tiempo
     */
    private long before,after;
    
    /**
     * Constructor de clase
     * Inicializa el objeto con nombres y las utilerias 
     */
    public Generador(){
        this.nombres = new Nombres();
        this.utils = new Utilerias();
    }
    
    /**
     * Genera e inserta en la base de datos 500, 000 registros del objeto Heroe de forma aleatoria
     * @return Una instancia de sí mismo
     */
    public Generador generadorMysql(){
        // Isntanciamos el objeto de conexion y conectamos
        Mysql mysql = new Mysql();
        mysql.connect();
        
        //Establecemos el tiempo antes de iniciar
        this.before = System.currentTimeMillis();
        
        // Recorremos el ciclo para generar objetos de Heroe aleatorios y los insertamos en la base de datos
        for (int i = 0; i < 500000; i++) {
            this.heroe = new Heroe(this.nombres.randNombre(), this.utils.randf(3,1), this.utils.randf(100,20), this.utils.rand(300,0), this.utils.randf(40000000,0));
            mysql.insertaHeroe(this.heroe);
        }
        
        // Tomamos el tiempo al final de la ejecución 
        this.after = System.currentTimeMillis();
        
        // Imprimimos la secuencia de tiempos transcurridos
        this.utils.printTime("MySQL", this.before, this.after);
        
        // Cerramos la conexion con mysql
        mysql.close();
        
        return this;
    }
    
    /**
     * Genera e inserta en la base de datos 500, 000 registros del objeto Heroe de forma aleatoria
     * @return Una instancia de sí mismo
     */
    public Generador generadorMongo(){
        // Isntanciamos el objeto de conexion y conectamos
        Mongo mongo = new Mongo();
        mongo.connect();
        
        //Establecemos el tiempo antes de iniciar
        this.before = System.currentTimeMillis();
        
        // Recorremos el ciclo para generar objetos de Heroe aleatorios y los insertamos en la base de datos
        for (int i = 0; i < 500000; i++) {
            this.heroe = new Heroe(this.nombres.randNombre(), this.utils.randf(3,1), this.utils.randf(100,20), this.utils.rand(300,0), this.utils.randf(40000000,0));
            mongo.insertaHeroe(this.heroe);
        }
        
        // Tomamos el tiempo al final de la ejecución 
        this.after = System.currentTimeMillis();
        
        // Imprimimos la secuencia de tiempos transcurridos
        this.utils.printTime("Mongo", this.before, this.after);
        
        return this;
    }
}