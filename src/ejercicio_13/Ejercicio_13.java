package ejercicio_13;

import javax.swing.JOptionPane;

/**
 * 13. Mostrar al usuario una serie de opciones y recoger por teclado su
 * eleccion mediante el uso de un JOptionPane. Mostrar un JOptionPane en cada
 * caso con su respectivo mensaje.
 *
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        System.out.print("Opción 1: Mensaje de pregunta.\n"
                + "Opción 2: Mensaje de advertencia.\n"
                + "Opción 3: Mensaje de error.\n"
                + "Opción 4: Mensaje de información.\n");
        //Orden de valores para JOptionPane: (Componente padre, mensaje, titulo, tipo de mensaje, icono). 
        String elegirPanel = JOptionPane.showInputDialog(null, "Elige el mensaje a visualizar: ");
        //Controlamos que opción elige el usuario.
        if ((elegirPanel != null)) {
            switch (elegirPanel) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Mensaje de pregunta", "Pregunta", JOptionPane.QUESTION_MESSAGE);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Mensaje de advertencia", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Mensaje de error", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Mensaje de información", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El numero introducido no corresponde a ninguna opcion.", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            //Si el usuario cancela la introduccion de texto, lo controlamos y mostramos un mensaje de advertencia.
            JOptionPane.showMessageDialog(null, "El usuario canceló la acción.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }

}
