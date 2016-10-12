
package mysqlvsmongo;

import java.util.Random;

/**
 *
 * @author murito
 */
public class Utilerias {
    /**
     * Genera un numero entero aleatorio en el rango especificado comenzando por el inicio epsecificado
     * @param rango El rango de datos para la secuencia aleatoria ejem. Desde 0 hasta 20
     * @param inicio El punto de inicio de los valores aleatorios, ejem. inicia en 5 y hasta 20
     * @return El numero aleatorio
     */
    public int rand(int rango, int inicio){
        Random rnd = new Random();
        return rnd.nextInt(rango)+inicio;
    }
    
    /**
     * Genera un numero flotante aleatorio en el rango especificado comenzando por el inicio epsecificado
     * @param rango El rango de datos para la secuencia aleatoria ejem. Desde 0 hasta 20
     * @param inicio El punto de inicio de los valores aleatorios, ejem. inicia en 5 y hasta 20
     * @return El numero aleatorio
     */
    public float randf(int rango, int inicio){
        Random rnd = new Random();
        return (rnd.nextInt(rango)+inicio)+rnd.nextFloat();
    }
    
    /**
     * Imprime el tiempo transcurrido entre operaciones de forma entendible por humanos
     * @param driver El nombre del driver a base de datos probado, ejem. Mysql o Mongo Solo es informativo
     * @param before El tiempo antes de comenzar
     * @param after  El tiempo al finalizar
     */
    public void printTime(String driver, long before, long after){
        long time = after-before;
        long seconds_time = time/1000;
        long seconds = seconds_time%60;
        long minuts = seconds_time/60;
        long hours = minuts/60;
        
        
        String time_  = driver+":  \n";
               time_ += "Horas: "+hours+"\n";
               time_ += "Minutos: "+minuts+"\n";
               time_ += "Segundos: "+seconds+"\n";
        
        System.out.println(time_);
    }
}
