package Ejercicio_tema_4;

public class SmartDevice {


    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();

        smartPhone.bateria = "4000 mhp";
        smartPhone.color =  "negro";
        smartPhone.marca = "Apple";
        smartPhone.modelo = "Iphone 12 pro";
        smartPhone.peso = "162 g";
        smartPhone.pantalla = "super retina XDR ";
        smartPhone.procesador = "A14";
        smartPhone.ram = "8 gb";

        System.out.println("El smartphone cuenta con una bateria de: " + smartPhone.bateria + "viene de color: " + smartPhone.color +
                            "es de la marca: " + smartPhone.marca + " es el: " + smartPhone.modelo + "tiene un peso de: " + smartPhone.peso +
                            "tiene una pantalla: " + smartPhone.pantalla + "cuenta con un procesador: " + smartPhone.procesador +
                            "y tiene una de ram: " + smartPhone.ram);

        System.out.println(" ");


        SmartWatch smartWatch = new SmartWatch();

        smartWatch.bateria = "2000 mhp";
        smartWatch.color =  "blanco";
        smartWatch.marca = "Apple";
        smartWatch.modelo = "Apple Watch Ultra";
        smartWatch.peso = "60g";
        smartWatch.pantalla = "Retina";
        smartWatch.procesador = "A10";
        smartWatch.ram = "3200 MB";
        smartWatch.profundimetro = "Cuenta con profundimetro";

        System.out.println("El smartWatch cuenta con una bateria de: " + smartWatch.bateria + "viene de color: " + smartWatch.color +
                "es de la marca: " + smartWatch.marca + " es el: " + smartWatch.modelo + "tiene un peso de: " + smartWatch.peso +
                "tiene una pantalla: " + smartWatch.pantalla + "cuenta con un procesador: " + smartWatch.procesador +
                " tiene una de ram: " + smartPhone.ram + " y " + smartWatch.profundimetro);


    }
}
