package Exercise_theme_7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Exercise_theme_7_8_9 {

    /*
        Escribe el código que devuelva una cadena al revés.
        Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */

    public static class CadenaReves {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Cadena al Reves\n--------------------");

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();

            System.out.println(texto);
        }
    }

    /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    */

    public static class ArrayUnidimensional {


        public static void main(String[] args) {


            System.out.println("-------------------- \n Array Unidimensional\n--------------------");

            String arrayUni[] = {"Sebastian", "Andrea", "Yuliana"};

            for (String nombre : arrayUni) {
                System.out.println("Nombre actual" + nombre);
            }

        }

    }


    /*
        Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        en ambas dimensiones.
    */

    public static class ArrayBidimensional {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Array Bidimensional\n--------------------");


            int arrayBidi[][] = {
                    {1, 2, 3, 4},
                    {10, 20, 30, 40}
            };

            for (int i = 0; i < arrayBidi.length; i++) {


                for (int j = 0; j < arrayBidi[i].length; j++) {
                    System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                            "\n El valor es: " + arrayBidi[i][j] + "\n");


                }
            }
        }
    }

    /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
    */

    public static class EjercicioVector {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Vector\n--------------------");

            Vector<String> vector = new Vector();
            vector.add("Perro");
            vector.add("Gato");
            vector.add("Hamster");
            vector.add("Gato");
            vector.add("Cabra");

            vector.trimToSize();

            System.out.println("Datos del vector antes de borrar: " + vector);

            vector.remove("Gato");
            vector.remove("Hamster");

            System.out.println("Vector despues de borrar algunos datos: " + vector + " -> Eliminados el 2 y 3");

            /*
                Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                1000 elementos para ser añadidos al mismo.
            */

            System.out.println("\n-------------------- \n Respuesta\n--------------------");

            System.out.println("Se desperdicia mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                    " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");
        }
    }


    /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
    */

    public static class ArrayString {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Array y LinkedList\n--------------------");
            ArrayList<String> lista = new ArrayList<String>();
            lista.add("ElementoA");
            lista.add("ElementoB");
            lista.add("ElementoC");
            lista.add("ElementoD");

            LinkedList<String> linkedlist = new LinkedList<String>();
            for (int i = 0; i < lista.size(); i++) {
                linkedlist.add(i, lista.get(i));
            }
            System.out.println("Contenido del Array:");
            for (String elementos : lista) {
                System.out.print(elementos + " ");
            }

            System.out.println("\n\nElementos de la LinkedList:");
            for (String elementos : linkedlist) {
                System.out.print(elementos + " ");

            }
        }
    }


    /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        el primer "for" de relleno.
    */

    public static class ArrayInt {

        public static void main(String[] args) {

            System.out.println("-------------------- \n ArrayInt\n--------------------");

            ArrayList<Integer> arrayNum = new ArrayList<Integer>(10);
            for (int i = 1; i < 11; i++) {
                arrayNum.add(i);

                for (int num = 0; num < arrayNum.size(); num++) {

                    if (arrayNum.get(num) % 2 == 0) {
                        arrayNum.remove(num);
                    }
                }
            }
            System.out.println(arrayNum);
        }
    }

    /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */

    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            System.out.println("-------------------- \n DividePorCero\n--------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros que quieres dividir: ");
            System.out.print("Numero 1: ");
            int a = scanner.nextInt();
            System.out.print("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }
        }
    }

    /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        dado en "fileOut".
    */

    public static class CopiarFicheros {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el fichero de origen: ");
            String fileIn = scanner.nextLine();
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scanner.nextLine();
            copiar(fileIn, fileOut);
        }

        private static void copiar(String fileIn, String fileOut) {
            try {
                InputStream in = new FileInputStream(fileIn);
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }
        }

    }
}


