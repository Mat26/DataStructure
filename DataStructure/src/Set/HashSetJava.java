
package Set;
import java.util.*;
import java.util.Arrays;

public class HashSetJava {
    public static void main(String[] args) {
        //DEFINICIÓN
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> hashSet1 = new HashSet<>(3);
        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        
        System.out.println("**********ADD ELEMENTOS*************");
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(9);
        
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println(hashSet);
        hashSet.addAll(hashSet2);
        System.out.println(hashSet);//Borra los duplicados
        
        System.out.println("**********SIZE*************");
        System.out.println("El número de elementos es: " + hashSet.size());
        
        System.out.println("**********REMOVE*************");
        hashSet.remove(1);
        System.out.println("Se remueve el elemento de valor 1: " + hashSet);
        
        hashSet.removeAll(Arrays.asList(2,3,4));
        System.out.println("Se remueve el elemento de valor 2,3,4: " + hashSet);
        
        System.out.println("**********CONTAINS*************");
        System.out.println("¿El valor 5 esta en el set? " + hashSet.contains(5));
        System.out.println("¿El valor 5 y 7 esta en el set? " + hashSet.containsAll(Arrays.asList(5,7)));
        
        System.out.println("**********CLEAR*************");
        hashSet.clear();
        System.out.println("El set quedo vacio: " + hashSet);
        
        System.out.println("**********ISEMPTY*************");
        System.out.println("¿El set es vacio? " + hashSet.isEmpty());
        
        System.out.println("**********TOARRAY*************");
        Integer[] enteros = new Integer[hashSet2.size()];
        hashSet2.toArray(enteros);
        for(int entero: enteros){
            System.out.println("Array: " + entero);
        }
        
        System.out.println("**********RETAINALL*************");
        hashSet2.retainAll(hashSet1);
        System.out.println(hashSet2);
        
    }
    
    public static void recorrerHashSetForEach(Set<Integer> conjunto){
        for(int entero: conjunto) {
            System.out.println("Valor: " + entero);
        }
    }
}
