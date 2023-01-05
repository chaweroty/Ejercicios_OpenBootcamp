package Ejercicio_tema_4;

public class SmartWatch extends SmartDevice{

    double pulgadas;
    String conectividad;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad) {
        super(marca, modelo, color);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "marca: " + marca +
                ", modelo: " + modelo +
                ", color: " + color +
                ", pulgadas: " + pulgadas +
                ", conectividad: " + conectividad;
    }
}
