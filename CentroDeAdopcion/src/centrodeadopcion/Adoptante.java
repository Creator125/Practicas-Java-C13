package centrodeadopcion;

import java.io.Serializable;

public class Adoptante implements Serializable{
    String nombre, apellido;
    int id;
    //Se declara version para serializar
    private static final long serialVersionUid=1L;

    public Adoptante() {
    }

    public Adoptante(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
