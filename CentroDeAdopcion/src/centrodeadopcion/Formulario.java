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
                formularioAdoptantes();
                break;
            case 2:
                //pendiente
                break; 
             case 3:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
            }
    }
    
    public void formularioAdoptantes(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Adoptantes \n \n  "
                + "\n1.Ingresar \n 2.Listar \n 3.Salir \n\n"));
        
        switch(opcion){
             case 1:
                manipularArchivos = new Crud();
                manipularArchivos.guardarAdoptante();
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
