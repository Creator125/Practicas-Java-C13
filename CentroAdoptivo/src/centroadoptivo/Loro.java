package centroadoptivo;

public class Loro {
    String nombre;
    int edad, peso, id;

    public Loro() {
    }

    public Loro(String nombre, int edad, int peso, int id) {
        this.nombre = nombre;
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
        System.out.println("Informacion del loro "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("peso: "+peso);
    }
}
