package centrodeadopcion;

import javax.swing.JOptionPane;

public class Formulario {
    int opcion;
    Crud manipularArchivos;

    public Formulario() {
    }

    public Formulario(int opcion) {
        this.opcion = opcion;
    }
    
    public void menuPrincipal(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bievenidos \n \n \nModulo animales "
                                    + "\n1.Adopciones \n2.Registrar \n3.Salir \n\n"));
        
        switch (opcion) {
            case 1:
                manipularArchivos = new Crud();
                manipularArchivos.guardarAdoptante();
                break;
            case 2:
                manipularArchivos = new Crud();
                manipularArchivos.leerAnimal();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void formularioAdoptantes(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bievenidos \n \n \n1.Modulo adoptantes "
                                    + "\n1.Modulo Animal \n2.Adoptar \n3.Salir \n\n"));
        
        switch (opcion) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
