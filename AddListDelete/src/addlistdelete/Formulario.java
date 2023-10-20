package addlistdelete;

import javax.swing.JOptionPane;

public class Formulario {
    int opcion;

    public Formulario() {
    }
    
    public void menuPrincipal(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**Centro de adopcion*  \n \n"
                + "\n1. Agregar \n2. Listar \n3. Elimnar \n4. Salir \n\n\n\n",
                "Menu Principal", JOptionPane.PLAIN_MESSAGE));
        
        switch (opcion) {
            case 1:
                asignarValor();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
        menuPrincipal();
    }
    
    public void asignarValor(){
        Perro perro = new Perro();
        try{
            perro.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"Indentificacion del perro")));
            perro.setNombre(JOptionPane.showInputDialog(null,"Nombre del perro"));
            perro.setRaza(JOptionPane.showInputDialog(null,"Raza del perro"));
            Crud agregarPerro = new Crud();
            agregarPerro.crearAchivo(perro, "Perros.txt");
        }catch (Exception e){
            asignarValor();
        }
        
    }
}
