package Ejercicio_tema_4;

public class SmartWatch extends SmartDevice{

    String bateria;
    String color;
    String peso;
    String procesador;
    String pantalla;
    String modelo;
    String marca;
    String ram;
    String profundimetro;

    public SmartWatch(){}

    public SmartWatch(String bateria,String color,String peso, String modelo, String pantalla, String procesador, String marca, String ram, String profundimetro){
        this.bateria = bateria;
        this.color = color;
        this.peso = peso;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.marca = marca;
        this.ram = ram;
        this.profundimetro = profundimetro;

    }
}
