package matricula;

import java.io.Serializable;

public class Materia implements Serializable{
    
    private String nombre;
     private int id;
    
    public Materia(){
        
    }
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }
    public Materia(int id,String nombre) {
        this.nombre = nombre;
        this.id=id;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
