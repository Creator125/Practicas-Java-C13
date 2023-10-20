package addlistdelete;

import java.io.*;

public class Crud {
    File archivo;
    
    public void crearAchivo(Perro perro, String nombreArchivo){
        try{
            archivo = new File(nombreArchivo);
            
            if(archivo.exists()){
                FileOutputStream archvoConCabecera = new FileOutputStream(nombreArchivo);
                MyObjectOutStream salidaSinCabecera = new MyObjectOutStream(archvoConCabecera);
                archvoConCabecera.close();
                salidaSinCabecera.close();
            }else{
                FileOutputStream archivoOut = new FileOutputStream(nombreArchivo, true);
                ObjectOutputStream salida = new ObjectOutputStream(archivoOut);
                salida.writeObject(perro);
                archivoOut.close();
                salida.close();
            }
        }catch(Exception e){
        
        }
    }
}
