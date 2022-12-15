package pr2;
import java.lang.*;
public class BookTest {
    public static void main(String[] args)
    {
        Book b = new Book();
        String name = "Pride and Prejustice";
        String author = "Jane Austin";
        int year = 1813;
        b.setAuthor(author);
        b.setName(name);
        b.setDate(year);
        System.out.println(b.getAuthor() + ' ' + b.getName() + ' ' + b.getDate());

    }
}
