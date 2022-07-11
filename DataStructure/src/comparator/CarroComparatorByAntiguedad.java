package comparator;

import java.util.Comparator;
import entity.Carro;

public class CarroComparatorByAntiguedad implements Comparator<Carro> {

    @Override
    public int compare(Carro car1, Carro car2) {
        int rpta;
        if (car1.getAntiguedad() > car2.getAntiguedad()) {
            rpta = 1;
        } else if (car1.getAntiguedad() < car2.getAntiguedad()) {
            rpta = -1;
        } else {
            rpta = 0;
        }
        return rpta;
    }

}
