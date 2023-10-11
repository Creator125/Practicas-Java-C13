package proyectocentro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ManejoArchivo {
    public ManejoArchivo() {
    }
    
    public  void createRegistro(String nombreArchivo, Animal cat ) throws IOException {
        try {
            
            cat.setNombre(JOptionPane.showInputDialog("Nombre: "));
            cat.setRaza(JOptionPane.showInputDialog("Raza: "));
                
            File texto = new File(nombreArchivo);
          
            if (texto.exists()) {
                FileOutputStream archivo2 = new FileOutputStream(nombreArchivo, true);
                MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
              
                miojectOutputStream.writeObject(cat);
                
                archivo2.close();
                miojectOutputStream.close();
                JOptionPane.showMessageDialog(null, "Agregado!");
                readArchivo("Perro.txt");

            } else {
                FileOutputStream  archivo = new FileOutputStream(nombreArchivo, true);
                ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
                
                archivo.close();
                ojectOutputStream.close();
                JOptionPane.showMessageDialog(null, "Creado Agregado!");
                readArchivo("Perro.txt");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public  void readArchivo(String nombreArchivo) throws IOException {
        List<Perro> listaObjetos = new ArrayList<>();
        Perro myCat1 =new Perro();
        
        try {
            FileInputStream fileIn = new FileInputStream(nombreArchivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
               
                 while (true) {
                try {
                   
                     myCat1 = (Perro) in.readObject();
                   
                     
                    listaObjetos.add(myCat1);
                    
                } catch (EOFException e) {
                   // EOFException indica que se llegó al final del archivo
                    
                    break;
                }
            }
          
            in.close();
            fileIn.close();
           
            for (Perro gato : listaObjetos) {
                System.out.println("Nombre: " + gato.getNombre());
            }
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
