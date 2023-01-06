package Exercise_theme_4;

public class SmartPhone extends SmartDevice{

    String sistema;
    int ram;

    public SmartPhone() {
        super();
    }
    public SmartPhone( String color, String modelo, String marca, int ram, String sistema){


        super(color, modelo, marca);
        this.ram = ram;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "marca: " + marca +
                ", modelo: " + modelo +
                ", color: " + color +
                ", ram: " + ram +
                ", sistema: " + sistema;
    }
}
