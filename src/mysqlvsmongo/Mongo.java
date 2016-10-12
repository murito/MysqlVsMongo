
package mysqlvsmongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author murito
 */
public class Mongo {
    MongoClient mongoClient;
    MongoDatabase db;
    MongoCollection collection;
    
    /**
     * Establece la conexion con la instancia de mongo 
     */
    public void connect(){
        this.mongoClient = new MongoClient("127.0.0.1", 27017);
        this.db = this.mongoClient.getDatabase("mysql_vs_mongo");
        this.collection = db.getCollection("heroe");
    }
    
    /**
     * Inserta un objeto de heroe en la coleccion heroe
     * @param heroe El objeto de heroe
     */
    public void insertaHeroe(Heroe heroe){
        Document documento = new Document();
        documento.put("nombre", heroe.getNombre());
        documento.put("estatura", heroe.getEstatura());
        documento.put("peso", heroe.getPeso());
        documento.put("nivel_poder", heroe.getNivel_poder());
        documento.put("energia", heroe.getEnergia());
                
        this.collection.insertOne(documento);
    }
}
