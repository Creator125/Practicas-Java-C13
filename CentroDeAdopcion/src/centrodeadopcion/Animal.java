package centrodeadopcion;

public class Animal {
    private String nombre, raza, color, descripcion;
    private boolean adoptable;
    private int id;

    public Animal() {
    }

    public Animal(String nombre, String raza, String color, String descripcion, boolean adoptable, int id) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.descripcion = descripcion;
        this.adoptable = adoptable;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isAdoptable() {
        return adoptable;
    }

    public void setAdoptable(boolean adoptable) {
        this.adoptable = adoptable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   
}
