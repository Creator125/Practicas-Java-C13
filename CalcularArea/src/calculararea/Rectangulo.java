package calculararea;

public class Rectangulo extends Figura {
    public Rectangulo(double longitud, double ancho) {
        super(longitud, ancho);
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }
}
