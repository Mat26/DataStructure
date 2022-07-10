
package datastructure;

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


