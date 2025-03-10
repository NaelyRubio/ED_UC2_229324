/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_lineales;

import nodos.Nodo;



/**
 * Implementacion de una lista enlazada simple.
 * 
 * TDA: ListaEnlazadaSimple
 * Elementos
 * -NodoIncial: primer elemento de la lista
 * -TamanioLista: contador del numero total de elementos en la lista.
 * @author naely
 */
public class ListaEnlazadaSimple {
    
   private Nodo NodoInicial; 
   private int TamañoLista; 
    
    /**
     * Constructor de la lista enlazada simple
     * Inicializa la lista vacia
     */
    public ListaEnlazadaSimple(){
        this.NodoInicial = null;
        this.TamañoLista = 0;      
    }
    
    public void addFirst(int nuevo){
    Nodo nuevoNodo = new Nodo (nuevo);
    nuevoNodo.setSiguiente(N);
    }
}
