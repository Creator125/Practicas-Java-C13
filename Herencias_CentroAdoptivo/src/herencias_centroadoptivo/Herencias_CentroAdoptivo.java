
package herencias_centroadoptivo;

public class Herencias_CentroAdoptivo {

    public static void main(String[] args) {
       //Creando el perro
       Perro miperrote = new Perro("Lucas","Pylbug","Cafe",15, 40, 01);
       miperrote.mostrarInfo();
       
       //Creando el gato
       Gato migaturrio = new Gato("Manqui","comun","naranja",9, 10, 02);
       migaturrio.mostrarInfo();
        
       //Creando el loro
       Loro loro1 = new Loro(true,true,"Milkin","cotorra","verde",5, 5, 03);
       loro1.mostrarInfo();
        
       //Creando el raton
       Raton mirata = new Raton("Sarilla","Rata calva","piel/rosado",7, 3, 04);
       mirata.mostrarInfo();
        
       //Creando el conejo
       Conejo conejo1 = new Conejo(true,"Pelusa","Enano hotot","blanco",5, 5, 05);
       conejo1.mostrarInfo();
    }
    
}
