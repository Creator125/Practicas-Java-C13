package calculararea;

public class Triangulo extends Figura{

    public Triangulo() {
    }

    public Triangulo(double longitud, double ancho) {
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
        return (longitud * ancho) / 2;
    }
}
