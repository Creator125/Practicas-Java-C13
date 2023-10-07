package repasojava;

public class Banco {
    private String nombre, direccion, pagina;
    private int telefono;

    public Banco() {
    }

    public Banco(String nombre, String direccion, String pagina, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pagina = pagina;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
