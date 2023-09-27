
package interfaces;

public class Loro extends Animal implements Adoptable{
    private boolean imita;
    private boolean vuela;

    public Loro(boolean imita, boolean vuela) {
        this.imita = imita;
        this.vuela = vuela;
    }

    public Loro(boolean imita, boolean vuela, int id, int edad, int peso, String nombre, String color) {
        super(id, edad, peso, nombre, color);
        this.imita = imita;
        this.vuela = vuela;
    }

    public boolean isImita() {
        return imita;
    }

    public void setImita(boolean imita) {
        this.imita = imita;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    
    
}
