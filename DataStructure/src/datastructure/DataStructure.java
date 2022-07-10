
package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mtrujillo
 */
public class DataStructure {

/*
COLECCIÓN: Estructura que permite mantener y manipular, de manera dinámica, elementos de un
mismo tipo.(Parametrizado)
 */


    public static void main(String[] args) {
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
        
        /*
    LINKEDLIST:(Lista enlazada)
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
    carroLinked.add(new Carro("placa1","Verde"));
    carroLinked.add(new Carro("placa2","Azul"));
    carroLinked.add(new Carro("placa3","Cafe"));
    //Agregar al inicio
    carroLinked.addFirst(new Carro("placa4","Rojo"));
    System.out.println(carroLinked);
    //Agregar al final
    carroLinked.addLast(new Carro("placa5","Purpura"));
    //Obtener el primer elemento
    System.out.println("Este elemento es el primero: " + carroLinked.getFirst());
    //Obtener el último elemento de la lista
    System.out.println("Este es el último elemento: " + carroLinked.getLast());
    //Contiene un elemento en la lista
    carroLinked.contains(new Carro("placa6","Azul"));
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
      /*
    Map:(Diccionario)
    - Mantiene los elementos en una serie de nodos enlazados entre sí.
    Cada uno de estos apunta tanto a su antecesor y al elemento que le sigue.(Doblemente enlazada)
    -Permite duplicados.
    - Mantiene el orden de inserción
    - Se puede tratar, no solo como una lista, tambien como una pila o como una cola.
    - Permite hacer inserciones o eliminaciones al principio o al final de la colección.
    - Manipulación mas rápida.
    
    https://www.youtube.com/watch?v=FIm34V6A4C4
     */
      
      /*
    HashMap:
      Maneja llave, valor para cada uno de sus elementos.
      Solo acepta Clases como parametro.
    
    https://www.youtube.com/watch?v=FIm34V6A4C4
     */
        System.out.println("***********************************************");
        HashMap diccionario = new HashMap();
        //Insertar datos al diccionario
        diccionario.put("user", "Diana");
        diccionario.put("instagram", "DianaConde");
        diccionario.put("facebook", "DianCode");
        
        System.out.println(diccionario);
        //CONOCER EL NÚMERO DE ELEMENTOS QUE TIENE EL HASHMAP
        System.out.println(diccionario.size());
        //OBTENER INFORMACIÓN DEL DICCIONARIO(Value)
        String contenidoUser = diccionario.get("user").toString();
        System.out.println("El valor de user es: " + contenidoUser);
        //SABER SI EXISTE LA LLAVE EN EL DICCIONARIO
        boolean respuestaKey = diccionario.containsKey("user");
        System.out.println("Existe la llave user: " + respuestaKey);
        //SABER SI EXISTE EL VALOR EN EL DICCIONARIO
        boolean respuestaValor = diccionario.containsValue("DianaConde");
        System.out.println("Existe la llave user: " + respuestaValor);
        //UPDATE VALUES EN EL DICCIONARIO (Este método, actualiza o crea un nuevo elemento en el diccionario)
        diccionario.put("user","catalina");
        System.out.println(diccionario);
        //Replace - Si el elemento no existo no hace nada, pero si existo lo actualizar
        diccionario.replace("instagram","catalinaCode");
        diccionario.replace("noExiste","noExiste");
        System.out.println(diccionario);
        //ELIMINAR ELEMENTOS DEL DICCIONARIO
        diccionario.remove("user");
        System.out.println(diccionario);
        diccionario.remove("facebook", "DianCode");
        System.out.println(diccionario);
        //CLONAR UN DICCIONARIO
        HashMap diccionarioClone = (HashMap)diccionario.clone();
        System.out.println(diccionarioClone);
        
        HashMap<String,Carro> dicCarros = new HashMap<>();
        dicCarros.put("1", new Carro("123","Azul"));
        dicCarros.put("2", new Carro("321","Verde"));
        System.out.println(dicCarros);
        
    }

    
    //FUNCIONES!!!
    public static Carro buscarCarroPorColor(String color, List<Carro> carros) {
        for (Carro carro : carros) {
            if (carro.getColor().equals(color)) {
                return carro;
            }
        }
        return null;
    }

    public static Carro buscarCarroPorPlaca(String placa, List<Carro> carros) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getPlaca().equals(placa)) {
                return carros.get(i);
            }
        }
        return null;
    }   
    
}


