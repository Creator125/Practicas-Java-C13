//Clase para manipular el archivo>consultar,manipular,guardar
package centrodeadopcion;

import java.io.*;
import javax.swing.JOptionPane;

public class Crud {
    File archivo;

    public Crud() {
    }
    
    public void guargarAnimal(Animal animal, String archivo){
        
    }
    
    public void leerAnimal(String archivo){
        
    }
    
    public void guardarAdoptante(){
        Adoptante adoptante1 = new Adoptante();
        adoptante1.setNombre(JOptionPane.showInputDialog("Ingrese tu nombre"));
        adoptante1.setApellido(JOptionPane.showInputDialog("Ingrese tu apellido"));
        adoptante1.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu nombre")));
        
        try {
            archivo = new File("listaAdoptantes.txt");
            
            if (archivo.exists()) {
                //Abriendo archivo----true es para que se guarden los datos sin perder info 
                FileOutputStream apertura = new FileOutputStream("listaAdoptantes.txt",true);
                //Mandar el objeto sin cabecera
                MyObjectOutStream salida = new MyObjectOutStream(apertura);
                salida.writeObject(adoptante1);
            }else{
                FileOutputStream apertura1 = new FileOutputStream("listaAdoptantes.txt",true);
                ObjectOutputStream salida1 = new ObjectOutputStream(apertura1);
                salida1.writeObject(adoptante1);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace(System.out);
         
     }
    }
}
