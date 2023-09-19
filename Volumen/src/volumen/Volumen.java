package volumen;

public class Volumen {

    public static void main(String[] args) {
        Caja caja1 = new Caja();
        double volumenCaja1;
        caja1.alto = 10;
        caja1.ancho = 30;
        caja1.largo = 22;
        volumenCaja1 = caja1.calcular();
        
        System.out.println("Volumen de la caja 1: "+volumenCaja1);
        
        Caja caja2 = new Caja();
        double volumenCaja2;
        caja1.alto = 1;
        caja1.ancho = 1;
        caja1.largo = 1;
        volumenCaja2 = caja1.calcular();
        
        System.out.println("Volumen de la caja 2: "+volumenCaja2);
        
        if(volumenCaja1 > volumenCaja2){
            System.out.println("La caja 1 es mayor");
        }else{
            System.out.println("La caja 2 es mayor");
        }
    }
    
}
