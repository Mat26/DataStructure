package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArrayListJava {

   
    public static void main(String[] args) {
        //DECLARACIÓN DE UN ARRAYLIST (CONSTRUCTOR)
        ArrayList arraySinTipo = new ArrayList();
        ArrayList<String> newArrayList = new ArrayList<>();
        List<String> dadArrayList = new ArrayList<>();
        ArrayList<String> newArrayList2 = new ArrayList<>(4);
        ArrayList<String> newArrayList3 = new ArrayList<>(Arrays.asList("elemento6","elemento4","elemento8"));
        
        System.out.println("**********ADD ELEMENTOS*************");
        //ARRAYLIST SIN TIPO
        arraySinTipo.add("Cadena Caracteres");
        arraySinTipo.add(1);
        arraySinTipo.add(1.8);
        arraySinTipo.add(true);
        arraySinTipo.add('a');
        System.out.println("Lista sin tipo: " + arraySinTipo);
        String cadena = String.valueOf(arraySinTipo.get(0));
        System.out.println(cadena);
               
        
        //AGREGAR ELEMENTOS
        newArrayList.add("elemento1");
        newArrayList.add("elemento2");
        newArrayList.add("elemento3");
        newArrayList.add("elemento4");
        System.out.println("Lista con tipo: " +newArrayList);
        
        //DEFINICIÓN CON TAMAÑO DEFINIDO        
        newArrayList2.add("elemento1");
        newArrayList2.add("elemento2");
        newArrayList2.add("elemento3");
        newArrayList2.add("elemento4");
        System.out.println("Cadena con tamaño definido: " + newArrayList);
        
        
        //AGREGAR ELEMENTOS DEFINIENDO LA POSICIÓN
        newArrayList.add(1,"elemento5");
        System.out.println("Add elemento5 en posición 1: " + "\n" +  newArrayList);
        //AGREGAR UN CONJUNTO DE ELEMENTOS
        newArrayList.addAll(newArrayList3);
        System.out.println("Add mas de un elemento al final de la lista: " + "\n" + newArrayList);
        
        System.out.println("**********SIZE*************");
        //Tamaño de el ArrayList
        System.out.println("Número de elementos de la lista: " +newArrayList.size());
        
        System.out.println("**********GET ELEMENTOS*************");
        //Acceder a un elemento, se comienza contando desde la posición 0!
        System.out.println("Elemento en la posición 0: " + newArrayList.get(0));
        System.out.println("Elemento en la posición 3: " + newArrayList.get(3));
        
        System.out.println("**********SET ELEMENTOS*************");
        //Cambiar un elemento
        newArrayList.set(0, "elemento0");
        System.out.println("Actualiza elemento en la posición 0: " + newArrayList.get(0));
        
        System.out.println("**********REMOVE ELEMENTOS*************");
        //Quitar un elemento
        newArrayList.remove(2);
        System.out.println("Removio elemento en la posición 2: " + newArrayList);
        
        System.out.println("**********INDEXOF ELEMENTOS*************");
        //BUSCAR ELEMENTOS
        System.out.println("Buscar: " + newArrayList.indexOf("elemento0"));
        //ULTIMA VEZ EN QUE UN ELEMENTO SE ENCUENTRA EN LA LISTA, DEVUELVE -1 SI NO EXISTE
        System.out.println("Buscar2: " + newArrayList.lastIndexOf("elemento4"));
        
        System.out.println("**********SUBLIST ELEMENTOS*************");
        //SUBLISTA
        System.out.println("Sublista: " + newArrayList.subList(0, 3));
        
        System.out.println("**********CLONE ELEMENTOS*************");
        //CLONAR LA LISTA
        ArrayList<String> clonado = (ArrayList<String>) newArrayList.clone();
        System.out.println("Clono array en otro objeto: " + clonado);
        
        System.out.println("**********TOARRAY ELEMENTOS*************");
        //De Lista a Array
        String[] arr = new String[clonado.size()];
        clonado.toArray(arr);
        for(String a:arr){
            System.out.println("Array: " + a);
        }
        
        System.out.println("**********CLEAN ELEMENTOS*************");
        //Eliminar todos los elementos en el ArrayList
        newArrayList.clear();
        System.out.println("Lista luego de ser limpiada: " + newArrayList); 
        
        System.out.println("**********CONTAINS ELEMENTOS*************");
        //Contener
        System.out.println("¿La lista contiene el elemento4? " + newArrayList.contains("elemento4"));
        
        System.out.println("**********ISEMPTY ELEMENTOS*************");
        //Es vacio
        System.out.println("¿Esta lista esta vacia? " + newArrayList.isEmpty());
                
        

        System.out.println("*************COMO RECORRER UN ARRAY LIST******************");
        readWithFor(newArrayList3);
        readWithForEach(newArrayList3);
       
    }
    
    public static void readWithFor(ArrayList<String> arr){
        System.out.println("**Read with FOR**");
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Posición " + i + ": " + arr.get(i));
        }
    }
    
    public static void readWithForEach(ArrayList<String> arr){
        System.out.println("**Read with FOR EACH**");
        for(String a : arr){
            System.out.println("Elemento: " + a);
        }
    }
      
        
}
