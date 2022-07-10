
package datastructure;


public class Carro {
    private String placa;
    private String color;
    
    public Carro(String placa, String color) {
        this.placa = placa;
        this.color = color;
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

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", color=" + color + '}';
    }
    
    
}
