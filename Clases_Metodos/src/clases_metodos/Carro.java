
package clases_metodos;

public class Carro {
    // Atributos
    boolean encendido = false;
    String marca, modelo, color;
    double velocidad = 0;
    
    // Métodos
    public void acelerar(double incremento) {
        velocidad += incremento;
        System.out.println("El carro esta acelerando a "+velocidad+" km");
    }
    
    public void desacelerar(double descremento){
        velocidad -= descremento;
        System.out.println("El carro ahora esta a "+velocidad+" km");
    }

    public void frenar() {
        System.out.println("El carro se detuvo");
    }

    public void imprimirInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}
