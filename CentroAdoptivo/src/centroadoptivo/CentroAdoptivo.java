package centroadoptivo;

public class CentroAdoptivo {

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro("Lucas",15, 40, 01);
        
        perro1.setNombre("Boster");
        
        System.out.println("Nombre del perro1: "+perro1.getNombre());
        System.out.println("Nombre del perro2: "+perro2.getNombre());
    }
    
}
