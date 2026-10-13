import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account a = new Account("mybol");
        System.out.println(a.getUsername());
        a = new Account("Ethan-David");
        System.out.println(a.getUsername());
        Account b = new Account("mybol");
        System.out.println(b.getShortenedName());
        b = new Account("Ethan-David-Potato-Gravy");
        System.out.println(b.getShortenedName());
    }
}

