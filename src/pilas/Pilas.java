package pilas;

import javax.swing.JOptionPane;

public class Pilas {

    public static void main(String[] args) {
        int op, el, tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el tamaño de la pila"));
        pilaClass pil = new pilaClass(tam);
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un valor\n"
                    + "2. Eliminar un valor\n"
                    + "3. Mostrar elemento en la cima\n"
                    + "4. Mostrar todos los elementos de la pila\n"
                    + "5. Mostrar tamaño de la pila\n"
                    + "6. Salir\n\n"
                    + "Elija una opción:"));

            switch (op) {
                case 1:
                    el = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el valor"));
                    if (!pil.pilaLlena()) {
                        pil.empujar(el);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Llena");
                    }
                    break;
                case 2:
                    if (!pil.pilaVacia()) {
                        el = pil.eliminar();
                        JOptionPane.showMessageDialog(null, "Elemento eliminado: " + el);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacía");
                    }
                    break;
                case 3:
                    if (!pil.pilaVacia()) {
                        el = pil.cimaPila();
                        JOptionPane.showMessageDialog(null, "Elemento en la cima: " + el);
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacía");
                    }
                    break;
                case 4:
                    if (!pil.pilaVacia()) {
                        pil.imprimirPila();
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila Vacía");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + pil.tamanioPila());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (op != 6);
    }
}
