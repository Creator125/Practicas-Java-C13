package calculararea;

abstract class Figura {
    protected double longitud; // Puede representar el lado, base, radio, etc. según la figura
    protected double ancho;    // Puede representar la altura, el segundo lado, etc. según la figura

    // Constructor

    public Figura() {
    }
    
    public Figura(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}
