package Exercise_theme_7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string;

public class Exercise {

    public static void main(String[] args) {
/*
        ArrayUni();
        ArrayBidi();
        FuncionVector();
        Point5();
        Point6();
        Point7();
        Point8();
*/
        Point6();

    }
    private static void Point6() {

        ArrayList<Integer> arrayNum = new ArrayList<Integer>(10);

        int cont = 1;
        for(int contenido: arrayNum) {

            arrayNum.add(cont);
            cont++;

        }
        System.out.println(arrayNum);
    }

    private static void Point5() {
            ArrayList<String> lista = new ArrayList<String>();
            lista.add("ElementoA");
            lista.add("ElementoB");
            lista.add("ElementoC");
            lista.add("ElementoD");

            System.out.println("Contenido: " + lista);


        }

    }


    private static void FuncionVector() {
        Vector<String> vector = new Vector ();
        FuncionVector();

        vector.add("Perro");
        vector.add("Gato");
        vector.add("Hamster");
        vector.add("Gato");
        vector.add("Cabra");

        vector.trimToSize();

        System.out.println("Datos del vector: " + vector);

        vector.remove("Gato");
        vector.remove("Hamster");

        System.out.println("Con los datos eliminados: " );
        System.out.println("Datos del vector: " + vector);
    }

    private  static void ArrayBidi() {

        int arrayBidi[][] = {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };

        for (int i = 0; i < arrayBidi.length; i++) {

            System.out.println("valor de i: " + i);

            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Estoy en i =: " + i + ", j =" + j);
                System.out.println(arrayBidi[i][j]);

            }
        }

    }

    private static void ArrayUni() {
        String arrayUni[] = {"Sebastian", "Andrea", "Yuliana"};
        ArrayUni();
        for (String nombre : arrayUni) {
            System.out.println("Nombre actual" + nombre);
        }

    }
}
