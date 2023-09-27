package calculararea;

public class CalcularArea {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Cuadrado cuadrado1 = new Cuadrado();
        Triangulo tiangulo = new Triangulo();
        
        circulo1.setLongitud(5);
        cuadrado1.setLongitud(3.5);
        
        System.out.println("Area del circulo: "+circulo1.calcularArea());
        System.out.println("Area del cuadrado: "+cuadrado1.calcularArea());
    }
    
}
