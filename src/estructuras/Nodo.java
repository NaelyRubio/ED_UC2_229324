/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

/**
 *
 * @author naely
 */
public class Nodo {
    
    private int dato;
    private Nodo siguiente;

    /**
     * Constructor de Nodo
     * @param dato Valor a almacenar en el nodo.
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     * @return Valor del nodo.
     */
    public int getDato() {
        return dato;
    }

    /**
     * Modifica el valor almacenado en el nodo.
     * @param dato Nuevo valor para el nodo.
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * Obtiene la referencia al siguiente nodo.
     * @return Nodo siguiente en la lista.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Modifica la referencia al siguiente nodo.
     * @param siguiente Nuevo nodo que será el siguiente.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
