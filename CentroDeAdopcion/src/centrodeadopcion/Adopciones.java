package centrodeadopcion;

import java.time.LocalDate;

public class Adopciones {
    Adoptante doctable1;
    Animal animal1;
    String estadoAdopcion;
    LocalDate fechaAdopcion, fechaSolicitud;
    int id;

    public Adopciones() {
    }

    public Adopciones(Adoptante doctable1, Animal animal1, String estadoAdopcion, LocalDate fechaAdopcion, LocalDate fechaSolicitud, int id) {
        this.doctable1 = doctable1;
        this.animal1 = animal1;
        this.estadoAdopcion = estadoAdopcion;
        this.fechaAdopcion = fechaAdopcion;
        this.fechaSolicitud = fechaSolicitud;
        this.id = id;
    }

    public Adoptante getDoctable1() {
        return doctable1;
    }

    public void setDoctable1(Adoptante doctable1) {
        this.doctable1 = doctable1;
    }

    public Animal getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }

    public String getEstadoAdopcion() {
        return estadoAdopcion;
    }

    public void setEstadoAdopcion(String estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;
    }

    public LocalDate getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(LocalDate fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
