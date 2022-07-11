
package entity;

import java.util.Objects;


public class Carro implements Comparable<Carro>{
    private String placa;
    private String color;
    private int antiguedad;

    public Carro(String placa, String color, int antiguedad) {
        this.placa = placa;
        this.color = color;
        this.antiguedad = antiguedad;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", color=" + color + ", antiguedad=" + antiguedad + '}';
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.placa);
        hash = 53 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public int compareTo(Carro car) {
       //return this.antiguedad - car.getAntiguedad();
       return this.placa.compareTo(car.getPlaca());
    }
    
}
