package centromascotas;

import java.io.*;

public class GestionArchivos {
    public void registrar(Animal animalr){
        try{
            Menu menu = new Menu();
            FileWriter escritura = new FileWriter("Gato.txt", true);
            escritura.write(animalr.getNombre());
            escritura.write(",");
            escritura.write(animalr.getRaza());
            escritura.write(",");
            escritura.write(animalr.getColor());
            escritura.write(",");
            escritura.write(String.valueOf(animalr.getEdad()));
            escritura.write(",");
            escritura.write(String.valueOf(animalr.getId()));
            escritura.close();
        }catch (Exception e){
            
        }
        
        
    }
    
    
    public void leer(){
        File fichero = new File("Gatos.txt");
        
        try{
            BufferedReader lectura = new BufferedReader(new FileReader(fichero));
            String linea;
            
            while((linea = lectura.readLine().trim()) != null){
                String datos[] = linea.split(",");
                
                System.out.println("El nombre es "+datos[0]+" El color es"+datos[2]);
            }
            
            Menu menu = new Menu();
            menu.principal();
            lectura.close();
        }catch (Exception e){
            
        } 
    }
    
    public void eliminar(int id){
            
    }
}
