package Ejercicio_tema_3;

public class Ejercicio_tema3 {
    public static void main(String[] args) throws Exception {
        //ejercicio #1
        int dato1 = 10;
        int dato2 = 20;
        int dato3 = 30;

        var valor = suma (dato1, dato2, dato3);
        System.out.println("Ejercicio #1");
        System.out.println("El valor de la suma es:");
        System.out.println(valor);

        //ejercicio #2
        class Coche
        {
            int Puertas = 6;

            public void incremetarnumeropuertas()
            {
                this.Puertas ++;
            }
        }

        Coche micoche = new Coche();
        micoche.incremetarnumeropuertas();
        System.out.println("Ejercicio #2");
        System.out.println("El numero de puertas que tiene el coche son:");
        System.out.println(micoche.Puertas);
    }


    public static int suma (int a, int b, int c)
    {
        return a + b + c;
    }
}



