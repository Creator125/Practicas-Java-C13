/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centrodeadopcion;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jornada Tarde
 */
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
        
        try{
            archivo = new File("ListaAdoptantes.txt");
            
            if(archivo.exists()){
                //Abriendo el archivo
                FileOutputStream arpetura = new FileOutputStream("ListaAdoptantes.txt");
                //Mandar el objeto sin cabecrea
                MyObjectOutputStream salida = new ObjectOutputStream(arpetura);
                salida.writeObject(adoptante1);
                salida.close();
                apertura.close;
            }else{
                FileOutputStream arpetura = new FileOutputStream("ListaAdoptantes.txt");
                
                MyObjectOutputStream salida1 = new ObjectOutputStream(arpetura);
                salida1.writeObject(adoptante1);
                
            }
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }
}
