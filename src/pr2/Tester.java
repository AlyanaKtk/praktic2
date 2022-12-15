package pr2;

import java.lang.*;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args)
    {
        double x = 5.3, y = 4.7;
        Ball b = new Ball(x, y);
        System.out.println(b.ToString());
        x = 6.8;
        y = 2.0;
        b.move(x, y);
        System.out.println(b.ToString());

    }
}