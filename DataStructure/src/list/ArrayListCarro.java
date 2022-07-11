
package list;

import comparator.CarroComparatorByPlaca;
import comparator.CarroComparatorByAntiguedad;
import entity.Carro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListCarro {
    public static void main(String[] args) {
        
        List<Carro> misCarros = new ArrayList<>();
        misCarros.add(new Carro("ABD-678", "Verde",2));
        misCarros.add(new Carro("DDD-890", "Azul",1));
        misCarros.add(new Carro("ABC-001", "Cafe",8));
        System.out.println(misCarros.size());
        System.out.println(misCarros.get(misCarros.size() - 1));

        Carro carroFiltradoColor = buscarCarroPorColor("Azul", misCarros);
        System.out.println(carroFiltradoColor.toString());
        Carro carroFiltradoPlaca = buscarCarroPorPlaca("ABC-000", misCarros);
        System.out.println(carroFiltradoPlaca);
        
        System.out.println("**********SORT*************");
        Collections.sort(misCarros,new CarroComparatorByPlaca());
        System.out.println(misCarros);
        
        Collections.sort(misCarros,new CarroComparatorByAntiguedad());
        System.out.println(misCarros);
        
        
        Collections.sort(misCarros);
        System.out.println(misCarros);
        
        System.out.println("**********EQUALS*************");
        List<Carro> misCarros2 = new ArrayList<>();
        //misCarros2 = misCarros; Forzamos a que sea el mismo
        System.out.println(misCarros == misCarros2);//SON EL MISMO OBJETO? Ocupan el mismo espacio en memoria?
        System.out.println(misCarros.get(0).equals(new Carro("ABC-001", "Cafe",8)));//Contienen el mismo razgo diferenciador?
        
    }
    
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
