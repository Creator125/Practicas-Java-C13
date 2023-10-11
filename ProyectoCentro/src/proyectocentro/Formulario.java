package proyectocentro;

import javax.swing.JOptionPane;

public class Formulario {
    ManejoArchivo mFile;
    int opcion;

    public void menuPrincipal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**Centro de adopcion*  \n \n"
                + "\n1. Modulo Animales \n2. Modulo Solcitantes \n3. Adoptar \n4. Salir \n\n\n\n",
                "Menu Principal", JOptionPane.PLAIN_MESSAGE));

        switch (opcion) {
            case 1:
                moduloAnaimales();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no Valida!");

        }
        menuPrincipal();
    }

    public void moduloAnaimales() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("**Modulo Animales**  \n \n\n1. Ingresar Animales \n2. Listar Animales"));

        opcion = escogerAnimal();
        switch (opcion) {
            case 0:
                Gato animal = new Gato();
                mFile = new ManejoArchivo();
                try {
                    mFile.createRegistro("Gato.txt", animal);

                } catch (Exception e) {
                }
                
            case 1:
                Perro dog = new Perro();

                try {
                    mFile = new ManejoArchivo();
                    mFile.createRegistro("Perro.txt", dog);

                } catch (Exception e) {
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    public int escogerAnimal() {
        String[] opciones = {"Gato", "Perro", "Volver"};
        int seleccion = JOptionPane.showOptionDialog(
                null, // Componente padre (null para centro de la pantalla)
                "Selecciona una opción:", // Mensaje
                "Cuadro de Diálogo con 3 Opciones", // Título del cuadro de diálogo
                JOptionPane.DEFAULT_OPTION, // Tipo de opción (por defecto)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                null, // Icono personalizado (null para icono predeterminado)
                opciones, // Arreglo de opciones
                opciones[0] // Opción predeterminada
        );
        return seleccion;
    }
}
