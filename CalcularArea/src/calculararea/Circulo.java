package calculararea;

public class Circulo extends Figura {
    public Circulo(double radio) {
        super(radio, 0); // Ancho no se utiliza en el cálculo del área del círculo
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(longitud, 2);
    }
}
