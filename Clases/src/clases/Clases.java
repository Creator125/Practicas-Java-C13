package clases;

public class Clases {

    public static void main(String[] args) {
        double volumen, perimetro;
        Caja miCaja = new Caja();
        miCaja.alto = 20;
        miCaja.ancho = 15;
        miCaja.largo = 30;
        
        volumen = miCaja.alto * miCaja.ancho * miCaja.largo;
        perimetro = miCaja.alto + miCaja.ancho + miCaja.largo;
        
        System.out.println("Volumen de la caja: "+ volumen);
        System.out.println("Perimetro de la caja: "+ perimetro);
        
        //Definir objeto caja1
        double volumenCaja1;
        Caja caja1= new Caja();
        caja1.alto = 49;
        caja1.ancho = 55;
        caja1.largo = 90;
        
        volumenCaja1 = caja1.alto * caja1.ancho * caja1.largo;
        
         //Definir objeto caja2
        double volumenCaja2;
        Caja caja2= new Caja();
        caja2.alto = 24;
        caja2.ancho = 75;
        caja2.largo = 39;
        
        volumenCaja2 = caja2.alto * caja2.ancho * caja2.largo;
        
        if(volumenCaja1 > volumenCaja2){
            System.out.println("Caja 1 tiene mayor volumne");
        }else{
            System.out.println("Caja 2 tiene mayor volumne");
        }
        
        
    }
    
}
