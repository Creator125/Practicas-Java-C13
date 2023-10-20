package addlistdelete;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

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
    
    public void listar(String nombreArchivo){
        archivo = new File(nombreArchivo);
        Perro perro = new Perro();
        ArrayList<Perro> listaPerro = new ArrayList<>();
        
        try{
            if(archivo.exists()){
                FileInputStream archivoIn = new FileInputStream(nombreArchivo);
                ObjectInputStream entrada = new ObjectInputStream(archivoIn);
                while (true){
                    try{
                        perro = (Perro) entrada.readObject();
                        listaPerro.add(perro);
                    }catch (Exception e){
                        break;
                    }
                }
                
                for(Perro perrox: listaPerro){
                    archivoIn.close();
                    entrada.close();
                    System.out.println("Nombre del perro: "+perrox.getNombre()+
                            " Raza: "+perrox.getRaza());
                }
            }
        }catch (Exception e){
            
        }
    }
    
    public void deleteDog(int id, String nombreArchivo){
        archivo = new File(nombreArchivo);
        HashMap<Integer,Perro> hashPerros = new HashMap<>();
        Perro perro = new Perro();
        try{
            if (archivo.exists()) {
                FileInputStream archivoIn = new FileInputStream(nombreArchivo);
                ObjectInputStream entrada = new ObjectInputStream(archivoIn);
                
                while(true){
                    try{
                        perro = (Perro) entrada.readObject();
                        hashPerros.put(perro.getId(), perro);
                    }catch (Exception e){
                        break;
                    }
                }
                archivoIn.close();
                entrada.close();
            }
                
            if(hashPerros.containsKey(id)){
                hashPerros.remove(id);
                actualizarArchivo(hashPerros, nombreArchivo);
            }
        }catch (Exception e){
            
        }
    }

    public void actualizarArchivo(HashMap<Integer, Perro> hashSelecionado, String nombreArchivo){
        archivo = new File(nombreArchivo);
            
         try{
            if(archivo.exists()){
                FileOutputStream archivoOut = new FileOutputStream(nombreArchivo, true);
                ObjectOutputStream salida = new ObjectOutputStream(archivoOut);

                for(Perro perro: hashSelecionado.values()){
                    salida.writeObject(perro);
                }
                    
                archivoOut.close();
                salida.close();
                }
        }catch (Exception e){
            
        }
    }
}
