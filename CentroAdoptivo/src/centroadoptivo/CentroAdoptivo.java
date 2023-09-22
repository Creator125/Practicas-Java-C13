package centroadoptivo;

public class CentroAdoptivo {

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro("Lucas",15, 40, 01);
        
        perro1.setNombre("Boster");
        
        System.out.println("Nombre del perro1: "+perro1.getNombre());
        System.out.println("Nombre del perro2: "+perro2.getNombre());
        perro2.mostrarInfo();
        
        //Creando el gato
        Gato gato1 = new Gato("Manqui",9, 10, 02);
        gato1.mostrarInfo();
        
        //Creando el loro
        Loro loro1 = new Loro("Milkin",5, 5, 03);
        loro1.mostrarInfo();
        
        //Creando el raton
        Raton mirata = new Raton("Sarilla",7, 3, 04);
        mirata.mostrarInfo();
        
        //Creando el conejo
        Conejo conejo1 = new Conejo("Pelusa",14, 10, 05);
        conejo1.mostrarInfo();
        
    }
    
}
