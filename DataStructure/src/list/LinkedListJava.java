package list;

import datastructure.Carro;
import static datastructure.DataStructure.buscarCarroPorColor;
import static datastructure.DataStructure.buscarCarroPorPlaca;
import java.util.LinkedList;

/**
 *
 * @author mtrujillo
 */
public class LinkedListJava {

    public static void main(String[] args) {

        /* LINKEDLIST:(Lista enlazada)
    - Mantiene los elementos en una serie de nodos enlazados entre sí.
    Cada uno de estos apunta tanto a su antecesor y al elemento que le sigue.(Doblemente enlazada)
    -Permite duplicados.
    - Mantiene el orden de inserción
    - Se puede tratar, no solo como una lista, tambien como una pila o como una cola.
    - Permite hacer inserciones o eliminaciones al principio o al final de la colección.
    - Manipulación mas rápida.
    
    https://www.youtube.com/watch?v=FIm34V6A4C4
    
    
         */
        System.out.println("***********************************");
        LinkedList<Carro> carroLinked = new LinkedList<>();

        //Agregar
        carroLinked.add(new Carro("placa1", "Verde"));
        carroLinked.add(new Carro("placa2", "Azul"));
        carroLinked.add(new Carro("placa3", "Cafe"));
        //Agregar al inicio
        carroLinked.addFirst(new Carro("placa4", "Rojo"));
        System.out.println(carroLinked);
        //Agregar al final
        carroLinked.addLast(new Carro("placa5", "Purpura"));
        //Obtener el primer elemento
        System.out.println("Este elemento es el primero: " + carroLinked.getFirst());
        //Obtener el último elemento de la lista
        System.out.println("Este es el último elemento: " + carroLinked.getLast());
        //Contiene un elemento en la lista
        carroLinked.contains(new Carro("placa6", "Azul"));
        //Obtener el elemento por nodo..
        System.out.println("Obtener pos 0" + carroLinked.get(2));
        //Remueve elementos en un LinkedList, el primer nodo
        carroLinked.removeFirst();
        System.out.println("Muestra la lista sin el primero: " + carroLinked.toString());
        //Remueve el último
        carroLinked.removeLast();
        System.out.println("Muestra la lista sin el último: " + carroLinked.toString());
        //Remueve todos los elementos
        //carroLinked.clear();
        System.out.println("Termina la lista vacia: " + carroLinked.toString());

        //Funciones con For para un ArrayList
        Carro carroFiltradoColor2 = buscarCarroPorColor("Azul", carroLinked);
        System.out.println(carroFiltradoColor2.toString());
        Carro carroFiltradoPlaca2 = buscarCarroPorPlaca("placa2", carroLinked);
        System.out.println(carroFiltradoPlaca2.toString());
    }
}
