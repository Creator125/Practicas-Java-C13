package calculararea;

public class Cuadrado extends Figura{

    public Cuadrado() {
    }

    public Cuadrado(double longitud, double ancho) {
        super(longitud, ancho);
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
    public double calcularArea(){
        return Math.pow(longitud, 2);
    }
}
