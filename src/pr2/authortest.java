package pr2;
import java.lang.*;
import java.util.Scanner;
public class authortest {
    public static void main(String[] args)
    {
        String name = "Nora Sakavich";
        String email = "norasakavich@gmail.com";
        char gender = 'f';
        author ns = new author(name, email, gender);
        ns.setEmail("norafoxcourtauthor@gmail.com");
        System.out.println("Author's name = " + ns.getName());
        System.out.println("Author's email = " + ns.getEmail());
        System.out.println("Author's gender = " + ns.getGender());
        System.out.println(ns.toString());
    }
}
