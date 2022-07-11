package Map;

import entity.Carro;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {
        //DEFINICION
        HashMap<String,String> diccionario = new HashMap<>();
        HashMap<String,String> diccionario1 = new HashMap<>(5);
        
        System.out.println("**************PUT***************");
        diccionario.put("user", "Diana");
        diccionario.put("instagram", "DianaConde");
        diccionario.put("facebook", "DianCode");
        
        diccionario1.put("user2", "Diana");
        diccionario1.put("instagram2", "DianaConde");
        diccionario1.put("facebook2", "DianCode");

        System.out.println(diccionario);
        System.out.println(diccionario1);
        
        System.out.println("**************SIZE***************");
        System.out.println("El número de registros en el mapa es: " + diccionario.size());
        
        System.out.println("**************GET***************");
        String obtenido = diccionario.get("user");
        System.out.println("El valor de user es: " + obtenido);
        
        
        System.out.println("************CONTAINSKEY*************");
        boolean respuestaKey = diccionario.containsKey("user");
        System.out.println("Existe la llave user: " + respuestaKey);
        
        
        System.out.println("************CONTAINSVALUE*************");
        boolean respuestaValor = diccionario.containsValue("DianaConde");
        System.out.println("Existe la llave user: " + respuestaValor);
        
        
        System.out.println("************PUT*************");
        //(Este método, actualiza o crea un nuevo elemento en el diccionario)
        diccionario.put("user", "catalina");
        System.out.println(diccionario);
        
        System.out.println("************REPLACE*************");
        //Replace - Si el elemento no existo no hace nada, pero si existo lo actualizar
        diccionario.replace("instagram", "catalinaCode");
        diccionario.replace("noExiste", "noExiste");
        System.out.println(diccionario);
        
        
        System.out.println("************REMOVE*************");
        diccionario.remove("user");
        System.out.println(diccionario);
        diccionario.remove("facebook", "DianCode");
        System.out.println(diccionario);
        
        
        System.out.println("************CLONE*************");
        HashMap diccionarioClone = (HashMap) diccionario.clone();
        System.out.println(diccionarioClone);

        HashMap<String, Carro> dicCarros = new HashMap<>();
        dicCarros.put("1", new Carro("123", "Azul",1));
        dicCarros.put("2", new Carro("321", "Verde",2));
        recorrerMapForEach(dicCarros);
        recorrerMapForEach2(dicCarros);
        recorrerMapForEachValues(dicCarros);

    }
    
    private static void recorrerMapForEach(Map<String,Carro> mapa){
        for(String clave : mapa.keySet()){
            System.out.println("Clave: " + clave + " , valor: " + mapa.get(clave));
        }
    }
    
    private static void recorrerMapForEach2(Map<String,Carro> mapa) {
        for(Map.Entry entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " , valor: " + entry.getValue());
        }
    }
    
    private static void recorrerMapForEachValues(Map<String,Carro> mapa){
        for(Carro valor : mapa.values()){
            System.out.println("Valor: " + valor);
        }
    }

}
