package matricula;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int Edad;

    public Estudiante(String nombre, String apellido, int Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
    
    
}
