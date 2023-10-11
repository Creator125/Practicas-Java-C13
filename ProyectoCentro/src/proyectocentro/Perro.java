package proyectocentro;

import java.io.Serializable;

public class Perro extends Animal implements Serializable{
    private static final long serialVesionUID = 1L;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }
}
