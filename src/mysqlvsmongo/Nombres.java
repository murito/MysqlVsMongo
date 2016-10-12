/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlvsmongo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author murito
 */
public class Nombres {
    /**
     * Los nombres y apellidos para aleatorizar
     */
    private List<String> nombres, apellido1, apellido2;
    
    /**
     * Objeto de Utilerias con los metodos de aleatorizacion utilizados
     */
    private Utilerias utils;
    
    /**
     * Constructor de clase Inicializa los nombres y apellidos
     */
    public Nombres(){
        this.utils = new Utilerias();
        this.nombres = new LinkedList<>();
        this.apellido1 = new LinkedList<>();
        this.apellido2 = new LinkedList<>();
        
        
        this.nombres.add("Juan");
        this.nombres.add("Luis");
        this.nombres.add("Pedro");
        this.nombres.add("Jorge");
        this.nombres.add("Lucia");
        this.nombres.add("Maria");
        this.nombres.add("Carla");
        this.nombres.add("Yoselin");
        
        this.apellido1.add("Perez");
        this.apellido1.add("Loza");
        this.apellido1.add("Cantera");
        this.apellido1.add("Rodriguez");
        this.apellido1.add("Menchaca");
        this.apellido1.add("Cardoso");
        this.apellido1.add("Orozco");
        this.apellido1.add("Vazquez");
        
        this.apellido2.add("Moreno");
        this.apellido2.add("Vaca");
        this.apellido2.add("Pulido");
        this.apellido2.add("Reyna");
        this.apellido2.add("Sanchez");
        this.apellido2.add("Lujan");
        this.apellido2.add("Uribe");
        this.apellido2.add("Alcazar");
    }
    
    /**
     * Regresa un nombre aleatorio a partir de la lista de nombres y apellidos
     * @return 
     */
    public String randNombre(){
        return this.nombres.get(this.utils.rand(7,0)) +" "+ this.apellido1.get(this.utils.rand(7,0)) +" "+ this.apellido2.get(this.utils.rand(7,0));
    }
}
