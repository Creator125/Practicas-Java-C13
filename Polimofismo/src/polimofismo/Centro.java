package polimofismo;

import java.util.ArrayList;
import java.util.List;

public class Centro {
    private List<Animal> animalesDisponible;
    
    public Centro(){
        animalesDisponible = new ArrayList<>();
    }
    
    public void agregarAnimal(Animal animal){
        animalesDisponible.add(animal);
    }
    
    public void listarAnimal(){
        System.out.println("Animales disponibles");
        
        for(Animal animal: animalesDisponible){
            System.out.println("Nombre: "+ animal.getNombre() +"- Edad "+ animal.getEdad());
           
            if(animal instanceof Perro){
                System.out.println("La raza es: "+ ((Perro) animal).getRaza());
            }else if(animal instanceof Gato){
                System.out.println("El color es: "+ ((Gato) animal).getColor());
            }
            
        }
    }
}
