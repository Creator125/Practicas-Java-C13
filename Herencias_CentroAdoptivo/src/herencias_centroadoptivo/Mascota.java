package herencias_centroadoptivo;

public class Mascota {
    String nombre, raza, color;
    int edad, peso, id;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, String color, int edad, int peso, int id) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.id = id;
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
    
    public void mostrarInfo(){
        System.out.println("Informacion del la mascota "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Color: "+color);
        System.out.println("Edad: "+edad);
        System.out.println("peso: "+peso);
    }
    
    
}
