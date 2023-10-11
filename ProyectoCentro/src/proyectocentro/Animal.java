package proyectocentro;

import java.io.Serializable;

public class Animal implements Serializable{
   String nombre, raza;
   private static final long serialVesionUID = 1L;

    public Animal() {
    }

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
   
}
