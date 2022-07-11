
package list;

import entity.Carro;
import java.util.ArrayList;
import java.util.List;


public class ArrayListCarro {
    public static void main(String[] args) {
        
        List<Carro> misCarros = new ArrayList<>();
        misCarros.add(new Carro("ABD-678", "Verde"));
        misCarros.add(new Carro("DDD-890", "Azul"));
        misCarros.add(new Carro("ABC-001", "Cafe"));
        System.out.println(misCarros.size());
        System.out.println(misCarros.get(misCarros.size() - 1));

        Carro carroFiltradoColor = buscarCarroPorColor("Azul", misCarros);
        System.out.println(carroFiltradoColor.toString());
        Carro carroFiltradoPlaca = buscarCarroPorPlaca("ABC-000", misCarros);
        System.out.println(carroFiltradoPlaca);
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
