package pilas;

import javax.swing.JOptionPane;

/**
 * Clase que representa una pila de enteros.
 */
public class pilaClass {
    int vectorPila[];
    int cima;
    
    /**
     * Constructor de la clase PilaClass.
     * @param tamanio Tamaño máximo de la pila.
     */
    public pilaClass(int tamanio){
        vectorPila = new int [tamanio];
        cima=-1;
    }
    
    /**
     * Método para agregar un elemento a la pila.
     * @param dato Elemento a agregar.
     */
    public void empujar(int dato){
        cima++;
        vectorPila[cima] = dato;
    }
    
    /**
     * Método para eliminar y obtener el elemento en la cima de la pila.
     * @return Elemento eliminado de la pila.
     */
    public int eliminar(){
        int elem = vectorPila[cima];
        cima--;
        return elem;
    }
    
    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    /**
     * Verifica si la pila está llena.
     * @return true si la pila está llena, false en caso contrario.
     */
    public boolean pilaLlena(){
        return vectorPila.length-1 == cima;
    }
    
    /**
     * Obtiene el elemento en la cima de la pila sin eliminarlo.
     * @return Elemento en la cima de la pila.
     */
    public int cimaPila(){
        return vectorPila[cima];
    }
    
    /**
     * Obtiene el tamaño máximo de la pila.
     * @return Tamaño máximo de la pila.
     */
    public int tamanioPila(){
        return vectorPila.length;
    }
    
    /**
 * Imprime los elementos de la pila.
 */
public void imprimirPila() {
    if (pilaVacia()) {
        JOptionPane.showMessageDialog(null, "La pila está vacía.");
        return;
    }

    StringBuilder message = new StringBuilder("Elementos de la pila:\n");
    for (int i = cima; i >= 0; i--) {
        message.append(i).append(" ").append(vectorPila[i]).append("\n");
    }
    JOptionPane.showMessageDialog(null, message.toString());
}
}
