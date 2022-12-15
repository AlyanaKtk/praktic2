package pr2;
import java.lang.*;
import java.util.Scanner;
public class DogKennel {
    public static void main(String[] args)
    {
        Dog [] d = new Dog[3];
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Dog obj = new Dog(name, age);
        d[0] = obj;
        d[0].ToString();
        name = sc.next();
        age = sc.nextInt();
        Dog obj2 = new Dog(name, age);
        d[1] = obj2;
        d[1].ToString();
        name = sc.next();
        System.out.println("4");
        age = sc.nextInt();
        Dog obj3 = new Dog(name, age);
        d[2] = obj3;
        d[2].ToString();




    }
}
