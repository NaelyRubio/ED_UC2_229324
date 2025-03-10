/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_lineales;

/**
 *
 * @author naely
 */
public class PruebasListaEnlazadaSimple {

    public static void main(String[] args) {
        // Crear una nueva lista enlazada simple
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        // Probar si la lista está vacía
        System.out.println("¿Lista vacía?: " + lista.isEmpty());

        // Agregar elementos al principio y al final
        lista.addFirst(10);
        lista.addFirst(5);
        lista.addLast(15);
        lista.addLast(20);
        System.out.println("Lista después de agregar elementos: " + lista);

        // Verificar el tamaño
        System.out.println("Tamaño de la lista: " + lista.size());

        // Buscar un elemento en la lista
        System.out.println("¿La lista contiene 10? " + lista.contains(10));
        System.out.println("¿La lista contiene 50? " + lista.contains(50));

        // Obtener un elemento por índice (si fuera posible)
        // En tu código no hay un método `getElement(int index)`, así que comenté esta parte
        // System.out.println("Elemento en la posición 2: " + lista.getElement(2));
        // Eliminar elementos
        lista.removeFirst();
        System.out.println("Lista después de eliminar el primero: " + lista);

        lista.removeLast();
        System.out.println("Lista después de eliminar el último: " + lista);

        // Vaciar la lista
        lista.clear();
        System.out.println("Lista después de vaciarla: " + lista);

        // Verificar nuevamente si la lista está vacía
        System.out.println("¿Lista vacía después de limpiar?: " + lista.isEmpty());
    }
}
