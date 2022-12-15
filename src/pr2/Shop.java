package pr2;

import java.util.Vector;
import java.util.Scanner;
public class Shop
{
    public Vector<String> computer = new Vector<String>();
    public void addcomputer(String comp)
    {
        computer.add(comp);
    }
    public void deletecomputer(String comp)
    {
        computer.remove(comp);
    }
    public void findcomputer(String comp)
    {
        int x = computer.indexOf(comp);
        if (x != -1)
        {
            System.out.println("Computer " + comp + " is available");
        }
        else
        {
            System.out.println("Computer " + comp + " isn't available");
        }

    }
}
