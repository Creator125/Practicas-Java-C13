package calculararea;

public class Circulo extends Figura {

    public Circulo() {
    }
    
    public Circulo(double radio) {
        super(radio, 0);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(longitud, 2);
    }
}
