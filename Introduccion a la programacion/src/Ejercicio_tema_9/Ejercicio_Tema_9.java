package Ejercicio_tema_9;

public class Ejercicio_Tema_9 {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(22);
        cliente.setNombre("Fabrizio");
        cliente.setTelefono (23423523);
        cliente.setCredito(7000000); ;

        trabajador.setEdad(35);
        trabajador.setNombre("Bergoglio");
        trabajador.setTelefono (2323523);
        trabajador.setSalario(12000000);

        System.out.println("El nombre del cliente es: "+cliente.getNombre());
        System.out.println("Su telefono para contactarlo es: "+cliente.getTelefono());
        System.out.println("Tiene una edad de: "+cliente.getEdad());
        System.out.println("Y tiene un credito aprobado por: "+cliente.getCredito());
        System.out.println("                            ");
        System.out.println("                            ");
        System.out.println("El nombre del cliente es: "+trabajador.getNombre());
        System.out.println("Su telefono para contactarlo es: "+trabajador.getTelefono());
        System.out.println("Tiene una edad de: "+trabajador.getEdad());
        System.out.println("Y tiene un salario de: "+trabajador.getSalario());

        //cliente.edad = 22;
        //cliente.telefono = 23423523;
        //cliente.nombre = "Fabrizio";
        //cliente.credito = 7000000;

        //trabajador.edad = 35;
        //trabajador.telefono = 2323523;
        //trabajador.nombre = "Bergoglio";
        // trabajador.salario = 12000000;

        //System.out.println("El nombre del cliente es: "+cliente.nombre);
        //System.out.println("Su telefono para contactarlo es: "+cliente.telefono);
        //System.out.println("Tiene una edad de: "+cliente.edad);
        //System.out.println("Y tiene un credito aprobado por: "+cliente.credito);
        //System.out.println("                            ");
        //System.out.println("                            ");
        //System.out.println("El nombre del cliente es: "+trabajador.nombre);
        //System.out.println("Su telefono para contactarlo es: "+trabajador.telefono);
        //System.out.println("Tiene una edad de: "+trabajador.edad);
        // System.out.println("Y tiene un salario de: "+trabajador.salario);

    }
}
class Personaa {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Personaa {

    private int  credito;

    public void  setEdad (int edad){
        this.edad = edad;
    }

    public  int getEdad (){
        return this.edad;
    }

    public void  setNombre (String nombre){
        this.nombre = nombre;
    }

    public  String getNombre (){
        return this.nombre;
    }

    public void  setTelefono (int telefono){
        this.telefono = telefono;
    }

    public  int getTelefono (){
        return this.telefono;
    }

    public void setCredito (int salario){
        this.credito = salario;
    }

    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends Personaa{
    private int salario;

    public void  setEdad (int edad){
        this.edad = edad;
    }

    public  int getEdad (){
        return this.edad;
    }

    public void  setNombre (String nombre){
        this.nombre = nombre;
    }

    public  String getNombre (){
        return this.nombre;
    }

    public void  setTelefono (int telefono){
        this.telefono = telefono;
    }

    public  int getTelefono (){
        return this.telefono;
    }

    public void setSalario (int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }

}

