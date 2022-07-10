package list;

import datastructure.Carro;
import static datastructure.DataStructure.buscarCarroPorColor;
import static datastructure.DataStructure.buscarCarroPorPlaca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mtrujillo
 */
public class ArrayListJava {

    /*
    LIST:
    - Es una colección que mantiene los elementos en un orden líneal(Secuencial).
    - Permite acceder a cada uno de sus elementos para: Modificar, eliminar o adicionar)
      mediante un índice entero mayor o igual a 0.
        Existen 3 implementaciones: 
        ArrayList
        LinkedList
        Vector
     */

    public static void main(String[] args) {

        /*
    ARRAYLIST:
    - Es una clase contenedora genérica que implementa arrays dinámicos de objetos de cualquier tipo.
    - Dinamica quiere decir que su tamaño puede variar luego de ser creado.
    - El tiempo promedio que gasta en los procesos de almacenamiento y acceso
    de elementos es menor que el tiempo promedio de las otras dos clases.
    - No sucede lo mismo con el tiempo promedio usado en procesos de eliminación.
    - Sus posiciones inician en 0.
    - Realiza con bastante lentitud las operaciones de insertado y borrado de elementos en medio de la Lista.
    Para validar mas: https://www.youtube.com/watch?v=MT77xTj76xE
         */
        //CREACIÓN DE UN ARRAYLIST
        ArrayList<String> newArrayList = new ArrayList<>();
        //AGREGAR ELEMENTOS
        newArrayList.add("elemento1");
        newArrayList.add("elemento2");
        newArrayList.add("elemento3");
        newArrayList.add("elemento4");
        System.out.println(newArrayList);
        //Tamaño de el ArrayList
        System.out.println(newArrayList.size());
        //Acceder a un elemento, se comienza contando desde la posición 0!
        System.out.println(newArrayList.get(0));
        System.out.println(newArrayList.get(3));
        //Cambiar un elemento
        newArrayList.set(0, "elemento0");
        System.out.println(newArrayList.get(0));
        //Quitar un elemento
        newArrayList.remove(2);
        System.out.println(newArrayList);
        //Eliminar todos los elementos en el ArrayList
        newArrayList.clear();
        System.out.println(newArrayList);
        //Contener
        System.out.println(newArrayList.contains("elemento4"));
        //Es vacio
        System.out.println("Esta lista esta vacia: " + newArrayList.isEmpty());
        //Podemos hacerlo de igual forma con Objetos, en este caso Carro

        System.out.println("*****************************************");

        List<Carro> misCarros = new ArrayList<>();
        misCarros.add(new Carro("ABD-678", "Verde"));
        misCarros.add(new Carro("DDD-890", "Azul"));
        misCarros.add(new Carro("ABC-001", "Cafe"));
        System.out.println(misCarros.size());
        System.out.println(misCarros.get(misCarros.size() - 1));

        //Funciones con For para un ArrayList
        Carro carroFiltradoColor = buscarCarroPorColor("Azul", misCarros);
        System.out.println(carroFiltradoColor.toString());
        Carro carroFiltradoPlaca = buscarCarroPorPlaca("ABC-000", misCarros);
        //System.out.println(carroFiltradoPlaca.toString());
    }
}
