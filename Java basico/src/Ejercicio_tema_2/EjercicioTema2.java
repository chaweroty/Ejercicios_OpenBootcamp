package Ejercicio_tema_2;

public class EjercicioTema2 {

    public static void main(String[] args) {

        double iva = 0.19;
        double precio = 1795;
        double resulado = FunctionIva(precio, iva);

        System.out.println("El precio con iva es:" + resulado + " COP");
    }

    public static double  FunctionIva(double precio, double iva) {

        double precioConIva = precio * iva;

        double total = precioConIva + precio;

        return total;
    }
}
