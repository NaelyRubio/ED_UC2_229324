/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_lineales;

import nodos.Nodo;

/**
 * Implementacion de una lista enlazada simple.
 *
 * TDA: ListaEnlazadaSimple Elementos -NodoIncial: primer elemento de la lista
 * -TamanioLista: contador del numero total de elementos en la lista.
 *
 * @author naely
 */
public class ListaEnlazadaSimple {

    private Nodo inicial; // Primer nodo de la lista
    private int tam;  // numero total de elementos

    /**
     * Constructor de la lista enlazada simple Inicializa la lista vacia
     */
    public ListaEnlazadaSimple() {
        this.inicial = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista esta vacia
     *
     * @return true si la lista esta vacia, false en caso de lo contrario
     * @precondicion ninfuna
     * @poscindicion Regresa un mensaje si la lista esta vacia
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Regresa la cantidad de elementos que conforman la lista.
     *
     * @return El número de elementos en la lista (>= 0).
     * @precondicion Ninguna.
     * @postcondicion Ninguna.
     */
    public int size() {
        return tam;
    }

    /**
     * Añade un elemento al principio de la lista.
     *
     * @param e El elemento que se desea añadir a la lista.
     * @return Confirmación de si el elemento e pudo ser añadido.
     * @precondicion Verificar que el elemento e sea de un tipo de dato válido
     * para la lista.
     * @postcondicion La lista L con el nuevo elemento e, si era un elemento
     * válido.
     */
    public boolean addFirst(int e) {
        Nodo nuevoNodo = new Nodo(e);
        nuevoNodo.setSiguiente(inicial);
        inicial = nuevoNodo;
        tam++;
        return true; //se confirma que se agrego el elemento
    }

    /**
     * Añade un elemento al final de la lista.
     *
     * @param e El elemento que se desea añadir a la lista.
     * @return Confirmación de si el elemento e pudo ser añadido.
     * @precondicion Verificar que el elemento e sea de un tipo de dato válido
     * para la lista.
     * @postcondicion La lista L con el nuevo elemento e añadido al final, si
     * era un elemento válido.
     */
    public boolean addLast(int e) {
        Nodo nuevoNodo = new Nodo(e);

        if (inicial == null) { // Si la lista está vacía, el nuevo nodo será el primero
            inicial = nuevoNodo;
        } else {
            Nodo temp = inicial;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
        tam++;
        return true; // Confirmación de que se añadió el elemento
    }

    /**
     * Elimina el primer elemento de la lista.
     *
     * @return El valor del nodo eliminado, o -1 si la lista está vacía.
     * @precondicion La lista no debe estar vacía para eliminar un elemento.
     * @postcondicion La lista L sin el primer elemento.
     */
    public int removeFirst() {
        if (inicial == null) { // Verifica si la lista está vacía
            System.out.println("La lista está vacía, no se puede eliminar.");
            return -1; // se indica que no se eliminó nada
        }
        int datoEliminado = inicial.getDato();
        inicial = inicial.getSiguiente(); // Se mueve la referencia al siguiente nodo
        tam--;
        return datoEliminado; // se retorna el valor eliminado
    }

    /**
     * Elimina el último elemento de la lista.
     *
     * @return El valor del nodo eliminado, o menos1 si la lista está vacía.
     * @precondicion La lista no debe estar vacía para eliminar un elemento.
     * @postcondicion La lista L sin el último elemento.
     */
    public int removeLast() {
        if (inicial == null) { // Verifica si la lista está vacía
            System.out.println("La lista está vacía, no se puede eliminar.");
            return -1; // Indica que no se eliminó nada
        }
        if (inicial.getSiguiente() == null) { // Si solo hay un nodo en la lista
            int datoEliminado = inicial.getDato();
            inicial = null;
            tam--;
            return datoEliminado;
        }
        Nodo actual = inicial;
        while (actual.getSiguiente().getSiguiente() != null) { // Avanza hasta el penúltimo nodo
            actual = actual.getSiguiente();
        }
        int datoEliminado = actual.getSiguiente().getDato();
        actual.setSiguiente(null); // Se elimina el último nodo
        tam--;
        return datoEliminado; // se retorna el valor eliminado
    }

    /**
     * Busca si un elemento está dentro de la lista.
     *
     * @param e El elemento que se desea buscar en la lista.
     * @return true si el elemento está en la lista, false en caso contrario.
     * @precondicion Ninguna.
     * @postcondicion No modifica la lista, solo verifica la existencia del
     * elemento.
     */
    public boolean contains(int e) {
        Nodo actual = inicial;

        while (actual != null) {
            if (actual.getDato() == e) { // Si el nodo actual contiene el valor buscado
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false; // Si termina el recorrido sin encontrar el elemento, retorna false
    }

    /**
     * Elimina todos los elementos de la lista, dejándola vacía.
     *
     * @precondicion Ninguna.
     * @postcondicion La lista queda vacía.
     */
    public void clear() {
        inicial = null; // Se pierde la referencia a todos los nodos
        tam = 0; // Se reinicia el tamaño de la lista
    }

    /**
     * Muestra en consola cada uno de los elementos de la lista.
     *
     * @precondicion Ninguna.
     * @postcondicion Se imprimen los valores de la lista en consola.
     */
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        Nodo actual = inicial; // Comenzamos desde el primer nodo

        while (actual != null) {
            resultado.append(actual.getDato()); // Agregamos el dato del nodo
            if (actual.getSiguiente() != null) {
                resultado.append(" -> "); // Formato visual para la lista
            }
            actual = actual.getSiguiente(); // Avanzamos al siguiente nodo
        }

        resultado.append("]");
        return resultado.toString();
    }

}
