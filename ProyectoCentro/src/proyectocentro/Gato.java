package proyectocentro;

import java.io.Serializable;

public class Gato extends Animal implements Serializable{
    private static final long serialVesionUID = 1L;
  
       public Gato() {
    }

    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }
}
