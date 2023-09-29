package archivos;

import java.io.Serializable;

public class Perro implements Serializable{
    private String color, raza, nombre;

    public Perro() {
    }

    public Perro(String color, String raza, String nombre) {
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
