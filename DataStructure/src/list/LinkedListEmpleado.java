
package list;


import entity.Empleado;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class LinkedListEmpleado {
    public static void main(String[] args) {
        System.out.println("***********************************");
        LinkedList<Empleado> carroLinked = new LinkedList<>();

        //Agregar
        carroLinked.add(new Empleado("Diego", 12));
        carroLinked.add(new Empleado("Sandra", 32));
        carroLinked.add(new Empleado("Javier", 45));
        //Agregar al inicio tambien se puede utilizaar push
        carroLinked.addFirst(new Empleado("Diana", 26));
        System.out.println(carroLinked);
        //Agregar al final
        carroLinked.addLast(new Empleado("Pedro", 10));
        //Agregar donde sea
        carroLinked.add(2, new Empleado("Monica", 12));
        System.out.println(carroLinked);
        //Agragar mas de un elemento
        carroLinked.addAll(Arrays.asList(new Empleado("Miguel",30),new Empleado("Nicolas",60)));
        System.out.println(carroLinked);
        //Agregar a la cola HACE PARTE DE LA INTERFACE QUEUE PERO ES LO MISMO QUE ADD()
        carroLinked.offer(new Empleado("Santiago",32));
        System.out.println(carroLinked);
        //Obtener el primer elemento
        System.out.println("Este elemento es el primero: " + carroLinked.getFirst());
        //Obtener el último elemento de la lista
        System.out.println("Este es el último elemento: " + carroLinked.getLast());
        //Obtener cualquier elemento
        System.out.println("Este es el elemento en la posición 1: " + carroLinked.get(1));
        //Obtener elementos con la interfaz QUEUE
        System.out.println("Método de queue: " + carroLinked.peekFirst());
        //Contiene un elemento en la lista
        carroLinked.contains(new Empleado("Santiago", 32));
        //Obtener el elemento por nodo..
        System.out.println("Obtener pos 0" + carroLinked.get(2));
        //Remueve elementos en un LinkedList, el primer nodo POP METHOD
        carroLinked.removeFirst();
        System.out.println("Muestra la lista sin el primero: " + carroLinked.toString());
        //Remueve el último
        carroLinked.removeLast();
        System.out.println("Muestra la lista sin el último: " + carroLinked.toString());
        //Remueve a partir del número de nodo
        carroLinked.remove(2);
        System.out.println("Se ha eliminado la posición 2: " + carroLinked.toString());
        //Remueve todos los elementos
        //carroLinked.clear();
        System.out.println("Termina la lista vacia: " + carroLinked.toString());

        //Funciones con For para un ArrayList
        Empleado carroFiltradoNombre = buscarCarroPorNombre("Nicolas", carroLinked);
        System.out.println(carroFiltradoNombre);
        Empleado carroFiltradoEdad = buscarCarroPorEdad(26, carroLinked);
        System.out.println(carroFiltradoEdad);
    }
    
    public static Empleado buscarCarroPorNombre(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public static Empleado buscarCarroPorEdad(int edad, List<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEdad() == edad) {
                return empleados.get(i);
            }
        }
        return null;
    }
}
