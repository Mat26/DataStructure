
package comparator;

import java.util.Comparator;
import entity.Carro;


public class CarroComparatorByPlaca implements Comparator<Carro> {

    @Override
    public int compare(Carro car1, Carro car2) {       
       return car1.getPlaca().compareTo(car2.getPlaca());
    } 
    
}
