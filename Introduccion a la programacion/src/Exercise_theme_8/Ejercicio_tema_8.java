package Exercise_theme_8;

public class Ejercicio_tema_8 {
    public static void main(String[] args) throws Exception {

        Persona persona= new Persona();
        persona.setEdad(22);
        persona.setNombre("Sebastián");
        persona.setTelefono (312456);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

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
}
