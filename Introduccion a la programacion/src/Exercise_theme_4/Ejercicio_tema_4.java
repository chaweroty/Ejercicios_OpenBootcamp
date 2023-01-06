package Exercise_theme_4;

public class Ejercicio_tema_4 {
    public static void main(String[] args) throws Exception
    {

        int numberolf = 1;

        if (numberolf > 0) {
            System.out.println( "La variable es positiva");
        }
        if(numberolf < 0){
            System.out.println( "La variable es negativa");
        }
        if(numberolf == 0){
            System.out.println("La variable es igual a 0");
        }

        //ciclo while
        System.out.println("Este es el ciclo While");
        int numerowhile  = 0;

        while (numerowhile < 3) {
            System.out.println(numerowhile);
            numerowhile++;
        }

        //Ciclo do while

        int numerodowhile = 3;
        do{
            System.out.println("Este es el ciclo do While");
            System.out.println(numerodowhile);
            numerodowhile++;
        }
        while (numerodowhile < 3);

        //Ciclo for
        System.out.println("Este es ciclo for");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Switch Case
        String estacion = "Otoño";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera :)");
                break;
            case "Verano":
                System.out.println("Estamos en verano D:");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño (:");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno :D");
                break;
            default:
                System.out.println("Este año por el cambio climatico no hubo ninguna estacion :¨(");
        }
    }
}

