package repasojava;

import java.io.*;

public class Sucursal extends Banco implements Serializable{
    private String nombreGerente;

    public Sucursal(String nombreGenrate) {
        this.nombreGerente = nombreGenrate;
    }

    public Sucursal(String nombreGenrate, String nombre, String direccion, String pagina, int telefono) {
        super(nombre, direccion, pagina, telefono);
        this.nombreGerente = nombreGenrate;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }
    
}
