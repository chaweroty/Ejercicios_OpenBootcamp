package Exercise_theme_5;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

       cocheCrud.delete();
       cocheCrud.findAll();
       cocheCrud.save();

    }
}
