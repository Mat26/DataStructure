package Map;

import datastructure.Carro;
import java.util.HashMap;

/**
 *
 * @author mtrujillo
 */
public class HashMapClass {

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
    public static void main(String[] args) {

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
        diccionario.put("user", "catalina");
        System.out.println(diccionario);
        //Replace - Si el elemento no existo no hace nada, pero si existo lo actualizar
        diccionario.replace("instagram", "catalinaCode");
        diccionario.replace("noExiste", "noExiste");
        System.out.println(diccionario);
        //ELIMINAR ELEMENTOS DEL DICCIONARIO
        diccionario.remove("user");
        System.out.println(diccionario);
        diccionario.remove("facebook", "DianCode");
        System.out.println(diccionario);
        //CLONAR UN DICCIONARIO
        HashMap diccionarioClone = (HashMap) diccionario.clone();
        System.out.println(diccionarioClone);

        HashMap<String, Carro> dicCarros = new HashMap<>();
        dicCarros.put("1", new Carro("123", "Azul"));
        dicCarros.put("2", new Carro("321", "Verde"));
        System.out.println(dicCarros);

    }
}
