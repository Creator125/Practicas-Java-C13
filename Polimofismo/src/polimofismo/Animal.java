package polimofismo;

public class Animal {
    String raza;
    String color;
    int edad;
    String nombre;

    public Animal() {
    }

    public Animal(String raza, String color, int edad, String nombre) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
