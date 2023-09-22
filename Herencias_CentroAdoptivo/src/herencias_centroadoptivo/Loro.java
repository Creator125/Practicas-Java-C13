package herencias_centroadoptivo;

public class Loro extends Mascota{
    boolean vuela, imitaSonido;

    public Loro() {
    }

    public Loro(boolean vuela, boolean imitaSonido) {
        this.vuela = vuela;
        this.imitaSonido = imitaSonido;
    }

    public Loro(boolean vuela, boolean imitaSonido, String nombre, String raza, String color, int edad, int peso, int id) {
        super(nombre, raza, color, edad, peso, id);
        this.vuela = vuela;
        this.imitaSonido = imitaSonido;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isImitaSonido() {
        return imitaSonido;
    }

    public void setImitaSonido(boolean imitaSonido) {
        this.imitaSonido = imitaSonido;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    
    
    
}
