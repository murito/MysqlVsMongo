
package mysqlvsmongo;

/**
 *
 * @author murito
 */
public class Heroe {
    /**
     * El nombre del heore
     */
    private String nombre;
    
    /**
     * La estatura del heroe
     */
    private float estatura;
    
    /**
     * El peso del heroe
     */
    private float peso;
    
    /**
     * El nivel de poder del heroe
     */
    private int nivel_poder;
    
    /**
     * El nivel de nergía del hereo
     */
    private double energia;

    /**
     * Constructor de clase
     * @param nombre El nomnre del heroe
     * @param estatura La estatura del heroe
     * @param peso El peso del heroe
     * @param nivel_poder El nivel de poder del heroe
     * @param energia  El nivel de energia del heroe
     */
    public Heroe(String nombre, float estatura, float peso, int nivel_poder, double energia) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.nivel_poder = nivel_poder;
        this.energia = energia;
    }

    /**
     * Obtiene el nombre del heroe
     * @return String El nombre del heroe
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la estatura del heroe
     * @return la estatura del heroe
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * Obtiene el peso del heroe
     * @return el peso del heroe
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Obtiene el nivel de poder del heroe
     * @return el nivel de poder del heroe
     */
    public int getNivel_poder() {
        return nivel_poder;
    }

    /**
     * Obtiene el nivel de energia del heroe
     * @return el nivel de energia del heroe
     */
    public double getEnergia() {
        return energia;
    }

    /**
     * Establece el nombre del heroe
     * @param nombre el nombre del heroe
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la estatura del heroe
     * @param estatura la estatura del heroe
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * Establece el peso del heroe
     * @param peso el peso del heroe
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Establece el nivel de poder del heroe
     * @param nivel_poder nivel de poder del heroe
     */
    public void setNivel_poder(int nivel_poder) {
        this.nivel_poder = nivel_poder;
    }

    /**
     * Establece el nivel de energia del heroe
     * @param energia nivel de energia del heroe
     */
    public void setEnergia(double energia) {
        this.energia = energia;
    }
}