package pr2;
import java.lang.*;
import java.util.Scanner;
public class massiv {

    public static void main(String[] args)
    {
        String[] massiv = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < 2; i++)
        {
            String temp = massiv[i];
            massiv[i] = massiv[4-i];
            massiv[4-i] = temp;


        }
        for (String s : massiv) {
            System.out.println(s);
        }

    }
}
