package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        Operacion calculo = new Operacion();
        int suma, resta, mult, div;
        calculo.num1 = 3;
        calculo.num2 = 2;
        suma = calculo.sumar();
        resta = calculo.restar();
        mult = calculo.multiplicar();
        div = calculo.dividir();
        
        System.out.println("Valores: "+calculo.num1+" y "+calculo.num2);
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+ mult);
        System.out.println("Divicion: "+ div);
    }
    
}
