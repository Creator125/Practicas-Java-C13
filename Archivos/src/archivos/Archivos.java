package archivos;

import java.io.*;

public class Archivos {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Perro miPerrote = new Perro("Blanco y negro", "comun","Mario");
        Perro miPerrillo = new Perro();
        miPerrillo.setNombre("Dogo");
        miPerrillo.setRaza("Salchicha");
        String nombreArchivo = "Perros.dat";
        try{
            OutputStream salida = new FileOutputStream(nombreArchivo);
            ObjectOutputStream obsalida = new ObjectOutputStream(salida);
            obsalida.writeObject(miPerrote);
            obsalida.writeObject(miPerrillo);
            obsalida.close();
        }catch (FileNotFoundException ex){
            
        }
        
        try{
            InputStream in = new FileInputStream(nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(in);
            Perro perro3 = (Perro)entrada.readObject();
            
            System.out.println("Nombre: "+perro3.getNombre());
            System.out.println("Raza: "+perro3.getRaza());
        }catch (FileNotFoundException ex){
            
        }
    }
    
}
